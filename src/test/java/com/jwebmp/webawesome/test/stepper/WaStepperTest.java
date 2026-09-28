package com.jwebmp.webawesome.test.stepper;

import com.jwebmp.webawesome.components.stepper.WaStepper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WaStepperTest
{
    @Test void rendersCancelableEvent()
    {
        assertTrue(new WaStepper<>().setBeforeStepChangeEvent("guard($event)").toString(true)
                .contains("(wa-before-step-change)=\"guard($event)\""));
    }
}
