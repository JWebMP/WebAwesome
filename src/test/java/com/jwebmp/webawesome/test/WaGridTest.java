package com.jwebmp.webawesome.test;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaGrid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaGridTest
{

    @Test
    void rendersWaGridWithMinColumnSizeAndGap()
    {
        Page<?> p = new Page<>();

        WaGrid grid = new WaGrid<>()
                .setMinColumnSize("15rem")
                .setGap(PageSize.Small)
                .spanFullRow();

        p.getBody()
         .add(grid);

        String html = p.toString(true);
        System.out.println(html);

        // Assert the wa-grid class is present
        Assertions.assertTrue(html.contains("wa-grid"), "Grid should have wa-grid class");
        // Assert the gap utility class applied via PageSize
        Assertions.assertTrue(html.contains("wa-gap-s"), "Grid should have wa-gap-s class for Small gap");
        // Assert the CSS variable for min column size is set (allow without space)
        Assertions.assertTrue(
                html.contains("--min-column-size: 15rem") || html.contains("--min-column-size:15rem"),
                "Grid should set --min-column-size to 15rem");
        // Assert span full row utility class
        Assertions.assertTrue(html.contains("wa-span-grid"), "Grid should include wa-span-grid class to span full row");
    }
}
