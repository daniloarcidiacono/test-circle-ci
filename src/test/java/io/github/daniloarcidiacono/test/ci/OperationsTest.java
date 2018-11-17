package io.github.daniloarcidiacono.test.ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationsTest {
    @Test
    void sum() {
        assertEquals(4, Operations.sum(2, 2), "Sum works");
    }

    @Test
    void sub() {
        assertEquals(4, Operations.sub(2, -2), "Sub works");
    }

    @Test
    void mul() {
        assertEquals(42, Operations.mul(7, 6), "Mul works");
    }

    @Test
    void div() {
        assertEquals(2, Operations.div(8, 4), "Div works");
    }
}