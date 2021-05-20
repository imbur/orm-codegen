package ai.relational.orm.codegen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;

import com.google.common.collect.Maps;

import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType;
import edu.neumont.schemas.orm._2006._04.orm.root.DocumentRoot;

public class GeneratorHelper {

	private static Map<String, String> dataTypeIdToDataTypeName;

	public static void storeDataTypeIds(ORMModelType model) {
		// TODO add mapping for each data type found in the ORM xsd
		// @formatter:off
		dataTypeIdToDataTypeName = Maps.newHashMap();
		// <orm:VariableLengthTextDataType id="_0C6B9635-5505-4ECF-890E-4D30957865F0" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getVariableLengthTextDataType().get(0).getId(), "String");
		// <orm:SignedIntegerNumericDataType id="_70B232AA-07AC-458F-B29C-249F1CF3989B" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getSignedIntegerNumericDataType().get(0).getId(), "Int");
		// <orm:AutoCounterNumericDataType id="_7552A452-5835-4240-AEAC-D412533AAEB9" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getAutoCounterNumericDataType().get(0).getId(), "Int");
		// <orm:DateTemporalDataType id="_933BD4F8-AED3-42B9-BDEA-D360D9F36A98" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getDateTemporalDataType().get(0).getId(), "Date");
		// <orm:DateAndTimeTemporalDataType id="_DA187D43-01CF-4B95-A014-9169229D29C1" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getDateAndTimeTemporalDataType().get(0).getId(), "DateTime");
		// <orm:TrueOrFalseLogicalDataType id="_3F7C15A3-029F-491A-B350-45470070C68D" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getTrueOrFalseLogicalDataType().get(0).getId(), "String");
		// <orm:UnsignedSmallIntegerNumericDataType id="_6950324C-3FC4-409F-B500-A33DF0461451" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getUnsignedSmallIntegerNumericDataType().get(0).getId(), "Int");
		// <orm:UnsignedIntegerNumericDataType id="_D5E7E23C-C335-4309-A0B9-23EC8B6D4B09" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getUnsignedIntegerNumericDataType().get(0).getId(), "Int");
		// <orm:FixedLengthTextDataType id="_4ADA1061-2449-43BE-929F-67BEDE4473EB" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getFixedLengthTextDataType().get(0).getId(), "String");
		// <orm:TimeTemporalDataType id="_FCB6A973-D8CF-4229-94E3-CA86583AA17E" />
		dataTypeIdToDataTypeName.put(
				model.getDataTypes().getTimeTemporalDataType().get(0).getId(), "Int");
		// @formatter:on
	}

	public static String lookUpRelDataType(String dataTypeId) {

		String dataTypeName = dataTypeIdToDataTypeName.get(dataTypeId);
		if (dataTypeName != null) {
			return dataTypeName;
		}

		throw new RuntimeException("Unknown data type ID encountered: " + dataTypeId
				+ ". Did you forget to call storeDataTypeIds(model)?");
	}

	public static String toSnakeCase(String camelCase) {
		if (camelCase == null || camelCase == "") {
			return camelCase;
		}
		String lowerCase = camelCase.toLowerCase().trim();
		// Using charAt would only set the size of the StringBuilder
		StringBuilder builder = new StringBuilder(lowerCase.substring(0, 1));

		for (int i = 1; i < lowerCase.length(); i++) {
			if (Character.isUpperCase(camelCase.charAt(i))) {
				builder.append('_');
			}
			if(lowerCase.charAt(i) == ' ') {
				builder.append('_');
			} else {
				builder.append(lowerCase.charAt(i));				
			}
		}

		return builder.toString();
	}

	// TODO extract hard-coded strings to constants
	public static boolean isBooleanAttributeName(String name) {
		return name.startsWith("is") || name.startsWith("Is");
	}

	// TODO extract hard-coded strings to constants
	public static String purgeAuxiliaryVerbsFromBeginning(String name) {
		// @formatter:off
		return name.trim()
				.replaceFirst("^has","")
				.replaceFirst("^Has","")
				.replaceFirst("^is","")
				.replaceFirst("^Is","")
				;
		//@formatter:on
	}

	// TODO this method is surely not complete in this form
	public static String purgeNonAlphaChars(String name) {
		return name.trim().replaceAll("[^a-zA-Z]", " ").trim().replaceAll(" ", "_");
	}

	/**
	 * It is necessary to remove the diagram display information from the model
	 * file, otherwise the XML model cannot be loaded. This method takes care of
	 * that and creates a stripped file next to the original one.
	 */
	public static File createPreprocessedModelFile(String modelFilePath) throws IOException {
		File modelFile = new File(modelFilePath);
		String strippedFilePath = modelFilePath.replace(".orm", "_stripped.orm");
		File strippedFile = new File(strippedFilePath);
		StringBuilder builder = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(modelFile))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				if (!line.contains("diagramDisplay:Diagram")) {
					builder.append(line);
					builder.append(System.lineSeparator());
				}
			}
		}
		try (PrintWriter pw = new PrintWriter(strippedFile)) {
			pw.write(builder.toString());
		}

		return strippedFile;
	}

	public static ORMModelType extractOrmModelRoot(DocumentRoot rootObj) {
		ORMModelType model = null;
		FeatureMap containments = rootObj.getORM2().getAny();
		for (Entry entry : containments) {
			Object value = entry.getValue();
			if (value instanceof ORMModelType) {
				model = (ORMModelType) value;
			} else {
				// It is an ORMDiagramType, do nothing
			}
		}
		return model;
	}

}
