package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals(greeting.helloWorld(), "Hello, World");
    }

    @Test
    void helloWorld1() {
        assertEquals(greeting.helloWorld("John"), "Hello, John");
    }
}
