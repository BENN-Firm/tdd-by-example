package guru.testing.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupAssertions(){
        //given
        Person person = new Person(1l,"Nabil", "Bensrhier");

        //then
        assertAll("Test group tests",
                () -> assertEquals(person.getFirstName(), "Nabil"),
                () -> assertEquals(person.getLastName(), "Bensrhier"));
    }

    @Test
    void groupAssertions2(){
        //given
        Person person = new Person(1l,"Nabil", "Bensrhier");

        //then
        assertAll("Test group tests",
                () -> assertEquals(person.getFirstName(), "Nabil", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Bensrhier", "Last Name Failed"));
    }
}