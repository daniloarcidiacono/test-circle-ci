package io.github.daniloarcidiacono.test.ci;

import io.github.daniloarcidiacono.test.ci.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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
}