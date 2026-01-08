package cw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeCaseToCamelCaseTest {

    @Test
    void simpleSnakeCase() {
        assertEquals(
                "helloWorld",
                SnakeCaseToCamelCase.toCamelCase("hello_world")
        );
    }

    @Test
    void multipleUnderscores() {
        assertEquals(
                "helloBigWorld",
                SnakeCaseToCamelCase.toCamelCase("hello_big_world")
        );
    }

    @Test
    void noUnderscore() {
        assertEquals(
                "hello",
                SnakeCaseToCamelCase.toCamelCase("hello")
        );
    }

    @Test
    void leadingUnderscore() {
        assertEquals(
                "helloWorld",
                SnakeCaseToCamelCase.toCamelCase("_hello_world")
        );
    }

    @Test
    void trailingUnderscore() {
        assertEquals(
                "helloWorld",
                SnakeCaseToCamelCase.toCamelCase("hello_world_").toString()
        );
    }

    @Test
    void emptyString() {
        assertEquals(
                "",
                SnakeCaseToCamelCase.toCamelCase("").toString()
        );
    }

    @Test
    void snakeToCamel() {
        assertEquals("asvFghIop", SnakeCaseToCamelCase.toCamelCase("asv_fgh_iop"));
        assertEquals("asvFghIop", SnakeCaseToCamelCase.toCamelCase("_asv_fgh_iop"));
        assertEquals("asvFghIop", SnakeCaseToCamelCase.toCamelCase("asv_fgh_iop_"));
        assertEquals("asvFghIop", SnakeCaseToCamelCase.toCamelCase("asv__fgh_iop_"));
        assertEquals("asvFghIop", SnakeCaseToCamelCase.toCamelCase("ASV_FGH_IOP_"));

    }


}