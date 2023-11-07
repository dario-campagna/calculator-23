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

    @Test
    void three_plus_zero_is_three() {
        assertEquals(3, new Calculator().compute("3", "+", "0"));
    }

    @Test
    void one_plus_one_is_2() {
        assertEquals(2, new Calculator().compute("1", "+", "1"));
    }
}
