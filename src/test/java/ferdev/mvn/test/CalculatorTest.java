package ferdev.mvn.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;

// @DisplayName("Calculator Kelas")

public class CalculatorTest {
    private Calculator calculator = new Calculator();

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
    
}