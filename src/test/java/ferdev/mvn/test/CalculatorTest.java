package ferdev.mvn.test;

import ferdev.mvn.test.generator.GeneratorAplikasi;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@DisplayNameGeneration(GeneratorAplikasi.class)
// @DisplayName("Calculator Kelas")
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    // beforEach afterEach untuk permethod
    @BeforeEach
    public void sebelumPerMethod(){
        System.out.println("=================");
        System.out.println("Sebelum PerMethod");
        System.out.println("=================\n");
    }

    @AfterEach
    public void sesudahPerMethod(){
        System.out.println("\n=================");
        System.out.println("Sesudah Per Method");
        System.out.println("=================\n");
    }

    @BeforeAll // before all digunakan untuk menjalankannya sebelum semuaMethod
    public static void sebelumUntukSemuaMethod(){ // harus static
        System.out.println("********************");
        System.out.println("SEBELUM SEMUA METHOD");
        System.out.println("********************");
    }

    @AfterAll // after all digunakan untuk menjalankannya sebelum semuaMethod
    public static void sesudahUntukSemuaMethod(){ // harus static
        System.out.println("********************");
        System.out.println("SESUDAH SEMUA METHOD");
        System.out.println("********************");
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

    @Test
    public void testAborted(){ // tes aborted exception jika ingin kondisi tertentu method test di gagalkan
                               // Jika tes aborted yg terjadi, test result akan ignored, jika exception lain akan tes failed
        String profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("PROFILE DEV TIDAK ADA");
        }

        // isi test
    }

    @Test
    public void tesAsumption(){ // akan menggunakan assumption, dimana jika gagal akan melempar test aborted exception,
                                // tidak perlu manual bikin sendiri, cocok untuk test yang perlu cek kondisi terlebih dahulu baru dijalankan

        assumeTrue("DEV".equals(System.getenv("PROFILE"))); // pengecekan jika, system environment profile berisi true
                                                                  // kodisi harus true

        // assumeTrue("DEVELOPER".equals(System.getenv("PROFILE"))); // jika assume gaga, value env bukan developer
        // Lanjutan Tes
    }


    
}