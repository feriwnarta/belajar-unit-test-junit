package ferdev.mvn.test;

import org.junit.jupiter.api.*;


@DisplayName("Bljr bagian test info")
@Tags({
        @Tag("A"),
        @Tag("B"),
        @Tag("C")
})
public class TstInfo {

    @Test
    @DisplayName("Ini berisi method 1")
    public void method1(TestInfo testInfo){ // TestInfo digunakan untuk mengambil informasi dari unit test
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getClass());
    }

}
