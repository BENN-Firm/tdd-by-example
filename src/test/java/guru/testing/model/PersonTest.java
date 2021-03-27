package guru.testing.model;

<<<<<<< HEAD
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
=======
>>>>>>> origin/assertions
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

<<<<<<< HEAD
//@Disabled(value = "Disable until we learn mocking!!")
class PersonTest {

    //@Disabled(value = "Disable until we learn mocking!!")
    @DisplayName("Person test properties")
=======
class PersonTest {

>>>>>>> origin/assertions
    @Test
    void groupAssertions(){
        //given
        Person person = new Person(1l,"Nabil", "Bensrhier");

        //then
        assertAll("Test group tests",
                () -> assertEquals(person.getFirstName(), "Nabil"),
                () -> assertEquals(person.getLastName(), "Bensrhier"));
    }

<<<<<<< HEAD
    @DisplayName("Person test properties 2")
=======
>>>>>>> origin/assertions
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