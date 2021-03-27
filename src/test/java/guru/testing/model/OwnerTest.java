package guru.testing.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {


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

}