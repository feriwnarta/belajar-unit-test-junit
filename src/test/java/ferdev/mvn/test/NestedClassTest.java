package ferdev.mvn.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@DisplayName("Sebuah Nested Class")
public class NestedClassTest {

    @DisplayName("Memiliki tst1, untuk inisialisasi")
    @Test
    public void test1(){

    }

    @Nested
    @DisplayName("Dilanjutkan ke inner kelas")
    public class Iner {

        @DisplayName("Memiliki tst2, dari Inner")
        @Test
        public void test2(){

        }

        @DisplayName("Cetak kesimpulan dari Inner class")
        @Test
        public void test3(){

        }
    }


}
