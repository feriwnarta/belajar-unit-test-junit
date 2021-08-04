package ferdev.mvn.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class RepeatedTst {

    @RepeatedTest(
            name = "{displayName} dari perulangan {currentRepetition} ke {totalRepetitions}",
            value = 10
    )
    @DisplayName("a countingTestMethodSucces")
    public void countingTestSucces() {
        System.out.println("ini repeated test dari method 1");
    }

    @DisplayName("Method test 2")
    @RepeatedTest(name = "{displayName}", value = 10)
    public void counting2TestSucces(RepetitionInfo info) {
        System.out.println("repetisi " + info.getCurrentRepetition() + " ke " + info.getTotalRepetitions());
        System.out.println("ini repeated test dari method 2");
    }

    @DisplayName("Method parameterized with value source")
    @ParameterizedTest(name = "{displayName}")
    @ValueSource(floats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    public void valueSourceWithParameterized(float value) {
        System.out.println(value);
    }

    static List<Integer> parameterRized() { // untuk digunakan parameterized metod source
        return List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
    }

    @DisplayName("Method parameterized with method static")
    @ParameterizedTest(name = "{displayName}")
    @MethodSource("parameterRized")
    public void methodWithParameterized(Integer value) {
        double realData = value + value;
        double result = new Calculator().tambah(value, value);
        Assertions.assertEquals(realData, result);
        System.out.println("semuanya berhasil");
    }
}
