package ai.relational.orm.codegen;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class OrmCodeGenerator {
  public static String generate(final ORMModelType model) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder();
      final EList<EntityTypeType> entities = model.getObjects().getEntityType();
      final EList<FactTypeType> facts = model.getFacts().getFact();
      final EList<SubtypeFactTypeType> subtypeFacts = model.getFacts().getSubtypeFact();
      final EList<SubsetConstraintType> subsetConstraints = model.getConstraints().getSubsetConstraint();
      final EList<ValueTypeType> valueTypes = model.getObjects().getValueType();
      GeneratorHelper.storeDataTypeIds(model);
      final HashSet<EntityTypeType> registeredSubtypes = Sets.<EntityTypeType>newHashSet();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/*");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("* Subtype ICs");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("*/");
      _builder.newLine();
      builder.append(_builder);
      for (final SubtypeFactTypeType subtypeFact : subtypeFacts) {
        {
          final Function1<EntityTypeType, Boolean> _function = new Function1<EntityTypeType, Boolean>() {
            public Boolean apply(final EntityTypeType it) {
              String _id = it.getId();
              String _ref = subtypeFact.getFactRoles().getSubtypeMetaRole().getRolePlayer().getRef();
              return Boolean.valueOf(Objects.equal(_id, _ref));
            }
          };
          final EntityTypeType subtype = IterableExtensions.<EntityTypeType>findFirst(entities, _function);
          final Function1<EntityTypeType, Boolean> _function_1 = new Function1<EntityTypeType, Boolean>() {
            public Boolean apply(final EntityTypeType it) {
              String _id = it.getId();
              String _ref = subtypeFact.getFactRoles().getSupertypeMetaRole().getRolePlayer().getRef();
              return Boolean.valueOf(Objects.equal(_id, _ref));
            }
          };
          final EntityTypeType supertype = IterableExtensions.<EntityTypeType>findFirst(entities, _function_1);
          builder.append(OrmCodeGenerator.generateSubTypeIcs(subtype, supertype));
          registeredSubtypes.add(subtype);
        }
      }
      for (final EntityTypeType entity : entities) {
        boolean _contains = registeredSubtypes.contains(entity);
        boolean _not = (!_contains);
        if (_not) {
          builder.append(OrmCodeGenerator.generateTopLevelEntityIcs(entity));
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* Attribute type ICs");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      builder.append(_builder_1);
      for (final ValueTypeType valueType : valueTypes) {
        EList<RoleRef> _role = valueType.getPlayedRoles().getRole();
        for (final RoleRef roleRef : _role) {
          {
            final Function1<FactTypeType, Boolean> _function = new Function1<FactTypeType, Boolean>() {
              public Boolean apply(final FactTypeType it) {
                final Function1<RoleType, Boolean> _function = new Function1<RoleType, Boolean>() {
                  public Boolean apply(final RoleType it) {
                    String _id = it.getId();
                    String _ref = roleRef.getRef();
                    return Boolean.valueOf(Objects.equal(_id, _ref));
                  }
                };
                int _size = IterableExtensions.size(IterableExtensions.<RoleType>filter(it.getFactRoles().getRole(), _function));
                return Boolean.valueOf((_size > 0));
              }
            };
            final FactTypeType fact = IterableExtensions.<FactTypeType>findFirst(facts, _function);
            final Function1<RoleType, Boolean> _function_1 = new Function1<RoleType, Boolean>() {
              public Boolean apply(final RoleType it) {
                String _id = it.getId();
                String _ref = roleRef.getRef();
                return Boolean.valueOf((!Objects.equal(_id, _ref)));
              }
            };
            final RoleType entityRole = IterableExtensions.<RoleType>findFirst(fact.getFactRoles().getRole(), _function_1);
            final Function1<EntityTypeType, Boolean> _function_2 = new Function1<EntityTypeType, Boolean>() {
              public Boolean apply(final EntityTypeType it) {
                String _id = it.getId();
                String _ref = entityRole.getRolePlayer().getRef();
                return Boolean.valueOf(Objects.equal(_id, _ref));
              }
            };
            final EntityTypeType entity_1 = IterableExtensions.<EntityTypeType>findFirst(entities, _function_2);
            final String dataTypeName = GeneratorHelper.lookUpRelDataType(valueType.getConceptualDataType().getRef());
            builder.append(OrmCodeGenerator.generateAttributeTypeIcs(entity_1, valueType, fact, dataTypeName));
          }
        }
      }
      for (final FactTypeType fact : facts) {
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/*");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("* Subset ICs");
      _builder_2.newLine();
      _builder_2.append(" ");
      _builder_2.append("*/");
      _builder_2.newLine();
      builder.append(_builder_2);
      for (final SubsetConstraintType sc : subsetConstraints) {
        OrmCodeGenerator.generateSubsetIcs(sc);
      }
      _xblockexpression = InputOutput.<String>println(builder.toString());
    }
    return _xblockexpression;
  }
  
  public static CharSequence generateSubTypeIcs(final EntityTypeType subtype, final EntityTypeType supertype) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ic ");
    String _snakeCase = GeneratorHelper.toSnakeCase(subtype.getName());
    _builder.append(_snakeCase);
    _builder.append("_subtype(e) { ");
    String _name = subtype.getName();
    _builder.append(_name);
    _builder.append("(e) implies ");
    String _name_1 = supertype.getName();
    _builder.append(_name_1);
    _builder.append("(e) }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateTopLevelEntityIcs(final EntityTypeType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ic ");
    String _snakeCase = GeneratorHelper.toSnakeCase(type.getName());
    _builder.append(_snakeCase);
    _builder.append("_entity(e) { ");
    String _name = type.getName();
    _builder.append(_name);
    _builder.append("(e) implies Entity(e) }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateAttributeTypeIcs(final EntityTypeType entity, final ValueTypeType valueType, final FactTypeType fact, final String dataTypeName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ic ");
    String _snakeCase = GeneratorHelper.toSnakeCase(valueType.getName());
    _builder.append(_snakeCase);
    _builder.append("_types(e, v) { ");
    String _snakeCase_1 = GeneratorHelper.toSnakeCase(valueType.getName());
    _builder.append(_snakeCase_1);
    _builder.append("(e, v) implies ");
    String _name = entity.getName();
    _builder.append(_name);
    _builder.append("(e) and ");
    _builder.append(dataTypeName);
    _builder.append("(v) }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence generateSubsetIcs(final SubsetConstraintType sc) {
    StringConcatenation _builder = new StringConcatenation();
    ConstraintRoleSequencesType _roleSequences = sc.getRoleSequences();
    _builder.append(_roleSequences);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
