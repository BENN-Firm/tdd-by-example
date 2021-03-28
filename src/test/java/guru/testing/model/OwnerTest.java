package guru.testing.model;

import guru.testing.CustomArgsProvider;
import guru.testing.ModelTests;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {


    @Test
    void dependentAssertions(){

        Owner owner =  new Owner(1l,"Nabil", "Bensrhier");
        owner.setCity("15 rue colenel manhes");
        owner.setTel("123456789");

        assertAll("Properties tests",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Nabil", owner.getFirstName()),
                        () -> assertEquals("Bensrhier", owner.getLastName())),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("15 rue colenel manhes", owner.getCity()),
                        () -> assertEquals("123456789", owner.getTel()))
        );
    }

    //ENUM tests
    @DisplayName("ENUM Source Test ")
    @ParameterizedTest(name = "{displayName} | [{index}] {arguments}")
    @EnumSource(OwnerType.class)
    void parameterizedEnumTest(OwnerType val){
        System.out.println(val);
    }


    @DisplayName("Method Providor Test ")
    @ParameterizedTest(name = "{displayName} | [{index}] {arguments}")
    @MethodSource("getArgs")
    void fromMethodTest(String val, int a, int b){
        System.out.println(val + " = " + a + " : " + b);
    }

    static Stream<Arguments> getArgs(){
        return Stream.of(
                Arguments.of("Nabil", 1, 2),
                Arguments.of("Nabilo", 9, 4),
                Arguments.of("Nabilovsky", 7, 10)
        );
    }


    @DisplayName("Custom Args Providor Test ")
    @ParameterizedTest(name = "{displayName} | [{index}] {arguments}")
    @ArgumentsSource(CustomArgsProvider.class)
    void fromCustomArgsProviderTest(String val, int a, int b){
        System.out.println(val + " = " + a + " : " + b);
    }
}