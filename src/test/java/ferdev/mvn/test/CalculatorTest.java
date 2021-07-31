package ferdev.mvn.test;

import ferdev.mvn.test.generator.GeneratorAplikasi;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(GeneratorAplikasi.class)
// @DisplayName("Calculator Kelas")
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    // beforEach afterEach untuk permethod
    @BeforeEach
    public void sebelum(){
        System.out.println("=================");
        System.out.println("Sebelum PerMethod");
        System.out.println("=================\n");
    }

    @AfterEach
    public void sesudah(){
        System.out.println("\n=================");
        System.out.println("Sesudah Per Method");
        System.out.println("=================\n");
    }

    @Test
   // @DisplayName("Test tambah ini harus berhasil")
    public void tambahTestSucces(){
        double result = calculator.tambah(100,20);
        assertEquals(120, result);
    }

    //@DisplayName("Test bagi ingin terjadi error")
    @Test
    public void bagiTestExceptionSucces(){ // method assertThrows Jika ingin method ini
                                           // terjadi Exception
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.bagi(10,0);
        });
    }

    @Test
    public void methodNormal(){
        System.out.println("NORMAL TEST");
    }

    // memcoba unit test untuk digunakan disable
    // jika ingin disabled / menonaktifkan test dapat menggunakan anotation disabled
    @Disabled
    @Test
    public void testForDisabled(){
        System.out.println("Method ini akan disabled");
    }
    
}