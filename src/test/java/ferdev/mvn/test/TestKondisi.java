package ferdev.mvn.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

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

    // system property
    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "os.name", matches = "Linux")
    })
    public void enabledOnPoperty(){}

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "os.name", matches = "Linux")
    })
    public void DisabledOnPoperty(){}

    // sistem environment variabel with antotation
    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void enableSystemEnvironment(){}

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    public void DisabledSystemEnvironmet(){}


}
