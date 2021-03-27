package guru.testing.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController controller;
    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong view returned");
        assertEquals("index", controller.index(), () -> "Using"+
                " Lambda expression" +
                " to implement Supplier<String>" +
                " Functional Interface");
    }

    @Test
    void oupsHandler() {
        assertTrue("notImplemented".equals(controller.oupsHandler()), () -> "Using"+
                " Lambda expression" +
                " to implement Supplier<String>" +
                " Functional Interface");
    }
}