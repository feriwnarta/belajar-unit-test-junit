package ferdev.mvn.test;

import org.junit.jupiter.api.*;

// MethodOrder.random - > random
// MethodOrderer.Orderanoation -> terprediksi harus menggunakan tambahan anotation Order di unit test mhetodnya
// @TestInstance(TestInstance.Lifecycle.PER_METHOD) // default lifecycle unit test
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // mengubah lifecycle test menjadi kelas sehingga objek akan terus hidup
                                                // dan dapat menggunakan 1 objek untuk seluruh method unit test
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AlurEkseskusiMethod {
    private int counter; // variabel akan terus hidup di 1 objek

    @BeforeAll // dengan menggunakan test istance per class, before all dan after all dapat tidak menggunakan method static
    public void beforeAll(){
        System.out.println("Before tanpa static");
    }


    @AfterAll
    public void afterAll(){
        System.out.println("After tanpa static");
    }

    @Order(1)
    @Test
    public void test5(){
        counter++;
        System.out.println(counter);
    }

    @Order(5)
    @Test
    public void test2(){
        counter++;
        System.out.println(counter);
    }
    @Test

    @Order(2)
    public void test3(){
        counter++;
        System.out.println(counter);
    }
    @Test

    @Order(3)
    public void test1(){
        counter++;
        System.out.println(counter);
    }

    @Order(4)
    @Test
    public void test4(){
        counter++;
        System.out.println(counter);
    }
}
