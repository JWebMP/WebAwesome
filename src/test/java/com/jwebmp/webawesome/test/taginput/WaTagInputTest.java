package com.jwebmp.webawesome.test.taginput;

import com.jwebmp.webawesome.components.taginput.WaTagInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WaTagInputTest
{
    @Test void rendersLiveValueBinding()
    {
        assertTrue(new WaTagInput<>().bindValue("tags").toString(true).contains("[value]=\"tags\""));
    }

    @Test void rendersEmptyDelimiterForEnterOnlyMode()
    {
        assertTrue(new WaTagInput<>().setDelimiter("").toString(true).contains("[delimiter]=\"''\""));
    }
}
