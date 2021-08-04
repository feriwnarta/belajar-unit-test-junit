package ferdev.mvn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT) // anotation ini yang akan membuat unit test menjadi parallel
public class TestSecaraParallel {

    // defaultnya junit tidak menggunakan konsep parallel, berarti unit test akan dijalankan secara
    // sequential. satu persatu, nunggu method 1 kelar, lalu method 2 dan seterusnya
    // untuk menggunakan parallel, bisa menambahkan junit-platform.propertis
    // lalu menggunakan @Execution(), dan merubahnya ke paralele // anotationya berada di kelas

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void test1() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void test2() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    public void test3() throws InterruptedException {
        Thread.sleep(4_000);
    }



}
