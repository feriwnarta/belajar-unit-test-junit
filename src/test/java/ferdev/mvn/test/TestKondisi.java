package ferdev.mvn.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class TestKondisi {

    @Test
    @EnabledOnOs({
            OS.LINUX
    })
    public void tesEnableUntukOsLinux(){}  // tes akan berjalan untuk os yg kita tentukan

    @Test
    @DisabledOnOs({
            OS.LINUX
    })
    public void testDisableUntukOsLinux(){} // tes akan disable untuk os tertentu

    @Test
    @EnabledOnJre(JRE.JAVA_16)
    public void testEnableUntukJre16(){} // tes berhasil hanya untuk jre 16

    @Test
    @DisabledOnJre(JRE.JAVA_16)
    public void testDisableUntukJre16(){} // tes gagal untuk jre 16

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    public void testEnableOnJreRange8to16(){} // enable jre range 8-16

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    public void testDisableOnJreRange8to16(){} // disable jre range 8-16

}
