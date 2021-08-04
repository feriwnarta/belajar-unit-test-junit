package ferdev.mvn.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTst {

    @RepeatedTest(
            name = "{displayName} dari perulangan {currentRepetition} ke {totalRepetitions}",
            value = 10
    )
    @DisplayName("a countingTestMethodSucces")
    public void countingTestSucces(){
        System.out.println("ini repeated test dari method 1");
    }

    @DisplayName("Method test 2")
    @RepeatedTest(name = "{displayName}",value = 10)
    public void counting2TestSucces(RepetitionInfo info){
        System.out.println("repetisi " + info.getCurrentRepetition() + " ke " + info.getTotalRepetitions());
        System.out.println("ini repeated test dari method 2");
    }
}
