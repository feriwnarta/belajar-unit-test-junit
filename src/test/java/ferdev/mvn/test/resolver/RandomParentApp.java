package ferdev.mvn.test.resolver;

import ferdev.mvn.test.Calculator;
import ferdev.mvn.test.parent.RandomParent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

@DisplayName("Sebuah random parent app")
public class RandomParentApp extends RandomParent {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("memiliki method test tambah dari hasil random")
    public void randomAdd(Random random){
        int a = random.nextInt();
        int b = random.nextInt();

        double expected = a + b;
        double result = calculator.tambah(a,b);
        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }
}
