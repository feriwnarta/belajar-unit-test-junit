package ferdev.mvn.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTst {

    @Test
    @DisplayName("Menggunakan mockito")
    public void test1() {
        // membuat mock / object tiruan
        List<String> list = Mockito.mock(List.class);

        // melihat isi mock
//        for(int i = 0; i < 10; i++) {
//            System.out.println(list.get(0));
//        }

        // mengubah behavior, inisialisasi method, atau manipulai method sesuai yg kita inginkan
        Mockito.when(list.get(0)).thenReturn("Feri");
        Mockito.when(list.get(9)).thenReturn("Winarta");

        System.out.println(list.get(0));
        System.out.println(list.get(9));
        // System.out.println(list.get(0)); - > akan eror jika diverify
        // System.out.println(list.get(9)); - > akan eror jika diverify

        // verifikasi mockito, ingin mengecek berapa banyak method dipanggil / atau yg lainnya
        Mockito.verify(list, Mockito.times(1)).get(0);
        Mockito.verify(list, Mockito.times(1)).get(9);


    }
}
