package guru.testing.model;

import guru.testing.ModelTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NestedTest implements ModelTests {


    @BeforeEach
    void setUp(){
        System.out.println("Before each test");
    }

    @Nested
    class NestedClassTest{

        @BeforeEach
        void setUp(){
            System.out.println("Before each nested test");
        }

        @DisplayName("Person test properties")
        @Test
        void groupAssertions(){
            //given
            Person person = new Person(1l,"Nabil", "Bensrhier");

            //then
            assertAll("Test group tests",
                    () -> assertEquals(person.getFirstName(), "Nabil"),
                    () -> assertEquals(person.getLastName(), "Bensrhier"));
        }
    }

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
