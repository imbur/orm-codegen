package ai.relational.orm.codegen;

import static ai.relational.orm.codegen.GeneratorHelper.extractOrmModelRoot;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.junit.Test;

import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType;
import edu.neumont.schemas.orm._2006._04.orm.core.util.CoreResourceFactoryImpl;
import edu.neumont.schemas.orm._2006._04.orm.root.DocumentRoot;

public class GeneratorRunner {

	@Test
	public void run() throws IOException {

		Resource res = loadOrmModelXMLFile(
				GeneratorHelper.createPreprocessedModelFile("/Users/mbur/git/att-dispatch/dispatch_schema.orm"));
		DocumentRoot rootObj = (DocumentRoot) res.getContents().get(0);

		ORMModelType model = extractOrmModelRoot(rootObj);
		
		OrmCodeGenerator.generate(model);

	}

	public static Resource loadOrmModelXMLFile(File ormModelXMLFile) {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("orm", new CoreResourceFactoryImpl());
		// XML could be supported as follows, but for now we stick with the .orm extension only
		//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new CoreResourceFactoryImpl());

		// Disable DTD resolution since it fails for OrmModelXML files
		Map<String, Boolean> parserFeatures = new HashMap<>();
		parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		resourceSet.getLoadOptions().put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);

		return resourceSet.getResource(URI.createFileURI(ormModelXMLFile.getAbsolutePath()), true);
	}

}
