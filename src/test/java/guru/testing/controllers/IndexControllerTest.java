package guru.testing.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Tag("controllers")
class IndexControllerTest {

    IndexController controller;
    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    @DisplayName("Test Index")
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong view returned");
        assertEquals("index", controller.index(), () -> "Using"+
                " Lambda expression" +
                " to implement Supplier<String>" +
                " Functional Interface");

        assertThat(controller.index()).isEqualTo("index");
    }

    @DisplayName("Oups")
    @Test
    void oupsHandler() {
        assertTrue("notImplemented".equals(controller.oupsHandler()), () -> "Using"+
                " Lambda expression" +
                " to implement Supplier<String>" +
                " Functional Interface");
    }

    @DisplayName("Handling exceptions")
    @Test
    void oupsHandler2() {
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oops();
        });

    }


    // Simple Time out executes codes even after exceeding limited time.
    @Test
    @DisplayName("Test Timeout")
    void indexTimeout() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            Thread.sleep(200);
            System.out.println("main Thread should write this");
        });
    }

    // Preemptively timeout quit just after exceeding limited time
    @Test
    @DisplayName("Test Timeout Preemptively")
    void indexTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(1000), () -> {
            Thread.sleep(200);
            System.out.println("A child thread should not write this");
        });
    }


}