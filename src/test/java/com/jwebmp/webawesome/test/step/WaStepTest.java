package com.jwebmp.webawesome.test.step;

import com.jwebmp.webawesome.components.step.WaStep;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WaStepTest
{
    @Test void rendersStatus()
    {
        assertTrue(new WaStep<>("review").setCompleted(true).toString(true).contains("completed"));
    }
}
