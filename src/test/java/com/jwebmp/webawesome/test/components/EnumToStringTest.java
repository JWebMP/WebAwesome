package com.jwebmp.webawesome.test.components;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.Shapes;
import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.input.InputAppearance;
import com.jwebmp.webawesome.components.input.InputSize;
import com.jwebmp.webawesome.components.range.RangeTooltipPosition;
import com.jwebmp.webawesome.components.select.SelectAppearance;
import com.jwebmp.webawesome.components.select.SelectPlacement;
import com.jwebmp.webawesome.components.skeleton.SkeletonEffect;
import com.jwebmp.webawesome.components.tabgroup.TabActivation;
import com.jwebmp.webawesome.components.tabgroup.TabPlacement;
import com.jwebmp.webawesome.components.textarea.TextAreaAppearance;
import com.jwebmp.webawesome.components.textarea.TextAreaResize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumToStringTest
{
    @Test
    public void testSizeToString()
    {
        assertEquals("small", Size.Small.toString());
        assertEquals("medium", Size.Medium.toString());
        assertEquals("large", Size.Large.toString());
    }

    @Test
    public void testShapesToString()
    {
        assertEquals("square", Shapes.Square.toString());
        assertEquals("circle", Shapes.Circle.toString());
        assertEquals("rounded", Shapes.Rounded.toString());
    }

    @Test
    public void testInputAppearanceToString()
    {
        assertEquals("filled", InputAppearance.FILLED.toString());
        assertEquals("outlined", InputAppearance.OUTLINED.toString());
    }

    @Test
    public void testInputSizeToString()
    {
        assertEquals("small", InputSize.SMALL.toString());
        assertEquals("medium", InputSize.MEDIUM.toString());
        assertEquals("large", InputSize.LARGE.toString());
        assertEquals("inherit", InputSize.INHERIT.toString());
    }

    @Test
    public void testSelectAppearanceToString()
    {
        assertEquals("outlined", SelectAppearance.Outlined.toString());
        assertEquals("filled", SelectAppearance.Filled.toString());
    }

    @Test
    public void testSelectPlacementToString()
    {
        assertEquals("top", SelectPlacement.Top.toString());
        assertEquals("bottom", SelectPlacement.Bottom.toString());
    }

    @Test
    public void testTextAreaAppearanceToString()
    {
        assertEquals("filled", TextAreaAppearance.Filled.toString());
        assertEquals("outlined", TextAreaAppearance.Outlined.toString());
    }

    @Test
    public void testTextAreaResizeToString()
    {
        assertEquals("none", TextAreaResize.None.toString());
        assertEquals("vertical", TextAreaResize.Vertical.toString());
        assertEquals("horizontal", TextAreaResize.Horizontal.toString());
        assertEquals("both", TextAreaResize.Both.toString());
        assertEquals("auto", TextAreaResize.Auto.toString());
    }

    @Test
    public void testTabPlacementToString()
    {
        assertEquals("top", TabPlacement.Top.toString());
        assertEquals("start", TabPlacement.Start.toString());
        assertEquals("end", TabPlacement.End.toString());
        assertEquals("bottom", TabPlacement.Bottom.toString());
    }

    @Test
    public void testTabActivationToString()
    {
        assertEquals("auto", TabActivation.Auto.toString());
        assertEquals("manual", TabActivation.Manual.toString());
    }

    @Test
    public void testIconVariantToString()
    {
        assertEquals("thin", IconVariant.Thin.toString());
        assertEquals("light", IconVariant.Light.toString());
        assertEquals("regular", IconVariant.Regular.toString());
        assertEquals("solid", IconVariant.Solid.toString());
        assertEquals("sharp", IconVariant.Sharp.toString());
        assertEquals("duotone", IconVariant.DuoTone.toString());
    }

    @Test
    public void testRangeTooltipPositionToString()
    {
        assertEquals("top", RangeTooltipPosition.Top.toString());
        assertEquals("bottom", RangeTooltipPosition.Bottom.toString());
        assertEquals("none", RangeTooltipPosition.None.toString());
    }

    @Test
    public void testSkeletonEffectToString()
    {
        assertEquals("none", SkeletonEffect.None.toString());
        assertEquals("sheen", SkeletonEffect.Sheen.toString());
        assertEquals("pulse", SkeletonEffect.Pulse.toString());
    }
}
