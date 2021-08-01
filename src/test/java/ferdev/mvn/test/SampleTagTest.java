package ferdev.mvn.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

// penggunaan tags, dapat menggunakan lebih dari 1 tag
// @Tags({
//        @Tag("mengahadeh1"),
//        @Tag("Mengahadeh2")
// })

// tag dan tags, digunakan untuk penanda bagi class dan function untuk digunakan bagian mana
// yang perlu di tes, atau digunakan dalam bentuk lain

@Tag("belajar-test-bagian-tag") // pakai tag, hanya akan menggunakan 1 tag saja
public class SampleTagTest {

    @Test
    public void test1(){
        System.out.println("TEST 1");
    }

    @Test
    public void test2(){
        System.out.println("TEST 2");
    }
}
