package ferdev.mvn.test.parent;

import ferdev.mvn.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@DisplayName("Sebuah Random parent")
@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomParent {

    @Test
    @BeforeAll
    public static void beforeAll(){
        System.out.println("*************");
        System.out.println("Random parent");
        System.out.println("*************");
    }

    @Test
    @AfterAll
    public static void afterAll(){
        System.out.println("*************");
    }




}
