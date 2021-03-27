package guru.testing.model;


import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//@Disabled(value = "Disable until we learn mocking!!")
class PersonTest {

    //@Disabled(value = "Disable until we learn mocking!!")
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