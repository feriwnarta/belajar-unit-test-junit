package ferdev.mvn.test.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

public class GeneratorAplikasi implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> aClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> aClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> aClass, Method method) {
        return null;
    }
}
