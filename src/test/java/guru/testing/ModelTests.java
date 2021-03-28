package guru.testing;


import org.junit.jupiter.api.*;

@Tag("model")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ModelTests {

    //Using @TestInstance(TestInstance.Lifecycle.PER_CLASS) or define the method as static
    @BeforeAll
//    static void beforeAll(){
    default void beforeAll(){
        System.out.println("Before each class test in Model Tests");
    }

    @BeforeEach
    default void beforeEach(TestInfo testInfo){
        System.out.println("Before each method : " + testInfo.getDisplayName());
    }
}
