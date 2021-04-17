package org.junit.operations;

import org.junit.Database;
import org.junit.jupiter.api.*;

@Tag("Operations")
@Tag("Basics")
public class BasicOperationsTest {

    BasicOperations bo;
    static Database db;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
        db = new Database();
        db.connect();
    }

    @BeforeEach
    void setUp() {
        System.out.println("setup");
        bo = new BasicOperations(2, 3);
    }

    @Test
    @Tag("kommutativ")
    void testAdd() {
        System.out.println("testAdd()");
        Assertions.assertEquals(5, bo.add());
    }

    @Test
    void testSub() {
        System.out.println("testSub()");
        Assertions.assertEquals(-1, bo.sub());
    }

    @Test
    @Disabled
    @Tag("kommutativ")
    void testMult() {
        System.out.println("testMult()");
        Assertions.assertEquals(6, bo.mult());
    }

    @Test
    void testDiv() {
        System.out.println("testDiv()");
        Assertions.assertEquals(0, bo.div());

        bo.setOperand2(0);
        if (bo.operand2 == 0) {
            Assertions.assertThrows(ArithmeticException.class, () -> bo.div());
        } else {
            Assertions.fail("wrong operand");
        }
    }

    @AfterEach
    void tearDown() {
        bo = null;
        System.out.println("teardown");
    }

    @AfterAll
    static void afterAll() {
        db.disconnect();
        System.out.println("AfterAll");
    }
}
