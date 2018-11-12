package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("===> @BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("---> @BeforeEach");
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

    @AfterEach
    void tearDown() {
        System.out.println("---> @AfterEach");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("===> @AfterAll");
    }
}
