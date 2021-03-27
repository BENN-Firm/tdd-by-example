package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    private Greetings greeting;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll tests: Only called once.....\n");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each test.....");
        greeting  = new Greetings();

    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloName() {
        System.out.println(greeting.helloName("Nabil"));

    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test.....\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll tests: Only called once.....");
    }
}