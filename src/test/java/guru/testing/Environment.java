package guru.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Environment {

    @Test
    void envAssumption() {
        assumeTrue("BENN".equalsIgnoreCase("BENN"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS(){
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnMacWindows(){
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJre8(){
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJre11(){
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "Nabil")
    @Test
    void testIfUserBENN(){
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "Jack")
    @Test
    void testIfUserJack(){
    }
}
