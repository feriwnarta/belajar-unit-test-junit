package ferdev.mvn.test;

import org.junit.jupiter.api.*;

// MethodOrder.random - > random
// MethodOrderer.Orderanoation -> terprediksi harus menggunakan tambahan anotation Order di unit test mhetodnya
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AlurEkseskusiMethod {
    @Order(1)
    @Test
    public void test5(){}

    @Order(5)
    @Test
    public void test2(){}
    @Test

    @Order(2)
    public void test3(){}
    @Test

    @Order(3)
    public void test1(){}

    @Order(4)
    @Test
    public void test4(){}
}
