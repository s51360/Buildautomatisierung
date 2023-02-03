package org.campus02.ismani;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    // ALT + EINFG -> setup Method
    // @BeforeEach: wird ausgeführt bevor @Test ausgeführt wird
    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180, 1.8);
    }

    // jedes mal wenn ein test ausgeführt wird, wird bmicalculator mit erstellt/ausgeführt

    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor() {
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKG());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeters());
    }

    @Test
    void result() {
    }
}