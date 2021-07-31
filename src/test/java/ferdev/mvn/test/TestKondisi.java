package ferdev.mvn.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
}
