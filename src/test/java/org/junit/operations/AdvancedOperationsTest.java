package org.junit.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

//@Tag("Operations")
//@Tag("Advanced")
@Tags({@Tag("Operations"), @Tag("Advanced")})
class AdvancedOperationsTest {

    @Test
    void modulo() {
        Assertions.assertEquals(1, AdvancedOperations.modulo(5, 4));
    }

    @Test
    void power() {
        Assertions.assertEquals(Math.pow(2, 30), AdvancedOperations.power(2, 30));
    }
}