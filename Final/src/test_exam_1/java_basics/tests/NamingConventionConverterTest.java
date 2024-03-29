package test_exam_1.java_basics.tests;

import org.junit.jupiter.api.Test;
import test_exam_1.java_basics.NamingConventionConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamingConventionConverterTest {

    @Test
    public void testToSnakeCase_1() {
        String expected = "hello_world";
        String actual = NamingConventionConverter.toSnakeCase("hello world", false);

        assertEquals(expected, actual);
    }

    @Test
    public void testToSnakeCase_2() {
        String expected = "HELLO_WORLD";
        String actual = NamingConventionConverter.toSnakeCase("hello world", true);

        assertEquals(expected, actual);
    }

    @Test
    public void testToKebabCase() {
        String expected = "hello-world";
        String actual = NamingConventionConverter.toKebabCase("hello world");

        assertEquals(expected, actual);
    }

    @Test
    public void testToCamelCase() {
        String expected = "helloWorld";
        String actual = NamingConventionConverter.toCamelCase("hello world");

        assertEquals(expected, actual);
    }

    @Test
    public void testToPascalCase() {
        String expected = "HelloWorld";
        String actual = NamingConventionConverter.toPascalCase("hello world");

        assertEquals(expected, actual);
    }

}
