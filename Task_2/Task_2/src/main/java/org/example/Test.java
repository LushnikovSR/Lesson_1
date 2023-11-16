package org.example;
import org.assertj.core.condition.Negative;

import static org.assertj.core.api.Assertions.*;
import static org.example.Calculator.*;

public class Test {
    public static void checkCalculationDiscount() {
        assertThat(calculatingDiscount(1000, 10)).isEqualTo(900);
        assertThat(calculatingDiscount(0, 12)).isEqualTo(0);
        assertThat(calculatingDiscount(1100, 0)).isEqualTo(1100);
        assertThatThrownBy(() ->
                calculatingDiscount(-1000, 10)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() ->
                calculatingDiscount(1000, -10)).isInstanceOf(IllegalArgumentException.class);

    }
}
