package ReflectionBasics;

import java.lang.reflect.Field;

/**
 * Implement getNumberOfFieldsClassDeclares method to count the number of fields declared in a class.
 * You should count public, protected, default (package) access, and private fields, excluding inherited fields.
 */

public class FieldGetter {
    public int getNumberOfFieldsClassDeclares(Class<?> clazz) throws ClassNotFoundException {
        // Add implementation here
        return clazz.getFields().length;
    }
}
