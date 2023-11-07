package sdm.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResult {

    @Test
    void string_0_is_0() {
        assertEquals(0, new Calculator().compute("0"));
    }

    @Test
    void string_4_is_4() {
        assertEquals(4, new Calculator().compute("4"));
    }
}
