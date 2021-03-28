package guru.testing.model;


import guru.testing.ModelTests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


//@Disabled(value = "Disable until we learn mocking!!")

class PersonTest implements ModelTests {

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

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("Repeated Test 1 ")
    void repeatedTest(){
        // TODO
    }

    @RepeatedTest(value = 5)
    @DisplayName("Repeated Test 2")
    void repeatedTest(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @ParameterizedTest
    @ValueSource(strings = {"spring", "JUnit", "Mockito"})
    void parameterizedTest(String val){

    }


    @DisplayName("Value Source Test ")
    @ParameterizedTest(name = "{displayName} | [{index}] {arguments}")
    @ValueSource(strings = {"spring", "JUnit", "Mockito"})
    void parameterizedTest1(String val){
        System.out.println(val);
    }

}