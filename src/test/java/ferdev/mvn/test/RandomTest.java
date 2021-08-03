package ferdev.mvn.test;

import ferdev.mvn.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Random;

@DisplayName("A random test use manually parameter resolver")
@ExtendWith(RandomParameterResolver.class) // jika ingin menggunakan parameter resolver buatan kita sendiri
                                           // hrus menggunakan anotation ini
public class RandomTest {
    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Have a test random integer, with object dependency injection" +
            "from dependency injection")
    // @DisplayName("Have a test random check random with no object")
    public void testRandom(Random random){
        random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();

        double result = calculator.tambah(a, b);
        double expected = a + b;

        Assertions.assertEquals(expected, result);
        System.out.println(result);
    }

}
