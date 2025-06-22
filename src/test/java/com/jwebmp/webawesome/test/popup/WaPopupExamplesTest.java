package com.jwebmp.webawesome.test.popup;

import com.jwebmp.webawesome.components.popup.WaPopup;
import com.jwebmp.webawesome.components.popup.WaPopupPlacements;
import com.jwebmp.webawesome.components.popup.WaPopupArrowPlacements;
import com.jwebmp.webawesome.components.popup.WaPopupAutoSize;
import com.jwebmp.webawesome.components.popup.WaPopupFallbackStategy;
import com.jwebmp.webawesome.components.popup.WaPopupSync;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Button;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive examples for the WaPopup component
 * 
 * Popup is a utility that lets you declaratively anchor "popup" containers to another element.
 * It uses Floating UI under the hood to provide a well-tested, lightweight, and fully declarative 
 * positioning utility for tooltips, dropdowns, and more.
 * 
 * Popup doesn't provide any styles — just positioning! The popup's preferred placement, distance, 
 * and skidding (offset) can be configured using attributes. An arrow that points to the anchor can 
 * be shown and customized to your liking.
 */
public class WaPopupExamplesTest
{
    /**
     * Basic popup example with an anchor element
     * 
     * Popups are inactive and hidden until the active attribute is applied. Removing the attribute 
     * will tear down all positioning logic and listeners, meaning you can have many idle popups 
     * on the page without affecting performance.
     */
    @Test
    public void testBasicPopupExample()
    {
        var anchor = new Button<>().setID("popupAnchor").setText("Click me");
        var popup = new WaPopup<>(anchor)
                .add(new Div<>().setText("This is a basic popup"))
                .setActive(true);

        var html = popup.toString(true);
        System.out.println(html);

        assertTrue(html.contains("anchor=\"popupAnchor\""));
        assertTrue(html.contains("active"));
        assertTrue(html.contains("<div>This is a basic popup</div>"));
    }

    /**
     * Example showing different placement options
     * 
     * Use the placement attribute to tell the popup the preferred placement of the popup.
     * Note that the actual position will vary to ensure the panel remains in the viewport
     * if you're using positioning features such as flip and shift.
     */
    @Test
    public void testPopupPlacementExample()
    {
        var anchor = new Div<>().setID("placementAnchor");

        // Top placement
        var topPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .add(new Div<>().setText("Top Popup"));

        var topHtml = topPopup.toString(true);
        System.out.println("Top Placement: " + topHtml);
        assertTrue(topHtml.contains("placement=\"top\""));

        // Bottom placement
        var bottomPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Bottom)
                .add(new Div<>().setText("Bottom Popup"));

        var bottomHtml = bottomPopup.toString(true);
        System.out.println("Bottom Placement: " + bottomHtml);
        assertTrue(bottomHtml.contains("placement=\"bottom\""));

        // Left placement
        var leftPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Left)
                .add(new Div<>().setText("Left Popup"));

        var leftHtml = leftPopup.toString(true);
        System.out.println("Left Placement: " + leftHtml);
        assertTrue(leftHtml.contains("placement=\"left\""));

        // Right placement
        var rightPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Right)
                .add(new Div<>().setText("Right Popup"));

        var rightHtml = rightPopup.toString(true);
        System.out.println("Right Placement: " + rightHtml);
        assertTrue(rightHtml.contains("placement=\"right\""));

        // Top-start placement
        var topStartPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.TopStart)
                .add(new Div<>().setText("Top-Start Popup"));

        var topStartHtml = topStartPopup.toString(true);
        System.out.println("Top-Start Placement: " + topStartHtml);
        assertTrue(topStartHtml.contains("placement=\"top-start\""));
    }

    /**
     * Example showing distance and skidding options
     * 
     * Use the distance attribute to change the distance between the popup and its anchor.
     * A positive value will move the popup further away and a negative value will move it closer.
     * 
     * The skidding attribute is similar to distance, but instead allows you to offset the popup
     * along the anchor's axis. Both positive and negative values are allowed.
     */
    @Test
    public void testDistanceAndSkiddingExample()
    {
        var anchor = new Div<>().setID("distanceAnchor");

        // Distance example
        var distancePopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setDistance(20)
                .add(new Div<>().setText("Popup with distance"));

        var distanceHtml = distancePopup.toString(true);
        System.out.println("Distance Example: " + distanceHtml);
        assertTrue(distanceHtml.contains("distance=\"20\""));

        // Skidding example
        var skiddingPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setSkidding(15)
                .add(new Div<>().setText("Popup with skidding"));

        var skiddingHtml = skiddingPopup.toString(true);
        System.out.println("Skidding Example: " + skiddingHtml);
        assertTrue(skiddingHtml.contains("skidding=\"15\""));

        // Combined distance and skidding
        var combinedPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setDistance(20)
                .setSkidding(15)
                .add(new Div<>().setText("Popup with distance and skidding"));

        var combinedHtml = combinedPopup.toString(true);
        System.out.println("Combined Example: " + combinedHtml);
        assertTrue(combinedHtml.contains("distance=\"20\""));
        assertTrue(combinedHtml.contains("skidding=\"15\""));
    }

    /**
     * Example showing arrow customization
     * 
     * Add an arrow to your popup with the arrow attribute. It's usually a good idea to set
     * a distance to make room for the arrow. To adjust the arrow's color and size, use the
     * --arrow-color and --arrow-size custom properties, respectively.
     * 
     * By default, the arrow will be aligned as close to the center of the anchor as possible,
     * considering available space and arrow-padding. You can use the arrow-placement attribute
     * to force the arrow to align to the start, end, or center of the popup instead.
     */
    @Test
    public void testArrowExample()
    {
        var anchor = new Div<>().setID("arrowAnchor");

        // Basic arrow
        var basicArrowPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setArrow(true)
                .setDistance(8) // Make room for the arrow
                .add(new Div<>().setText("Popup with arrow"));

        var basicArrowHtml = basicArrowPopup.toString(true);
        System.out.println("Basic Arrow Example: " + basicArrowHtml);
        assertTrue(basicArrowHtml.contains("arrow"));
        assertTrue(basicArrowHtml.contains("distance=\"8\""));

        // Arrow with custom placement
        var customArrowPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Bottom)
                .setArrow(true)
                .setArrowPlacement(WaPopupArrowPlacements.Start)
                .setDistance(8)
                .add(new Div<>().setText("Popup with custom arrow placement"));

        var customArrowHtml = customArrowPopup.toString(true);
        System.out.println("Custom Arrow Example: " + customArrowHtml);
        assertTrue(customArrowHtml.contains("arrow"));
        assertTrue(customArrowHtml.contains("arrow-placement=\"start\""));

        // Arrow with custom styling - note: styling would be done via CSS in a real application
        var styledArrowPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Right)
                .setArrow(true)
                .setDistance(8)
                .add(new Div<>().setText("Popup with styled arrow"));

        var styledArrowHtml = styledArrowPopup.toString(true);
        System.out.println("Styled Arrow Example: " + styledArrowHtml);
        assertTrue(styledArrowHtml.contains("arrow"));
    }

    /**
     * Example showing sync with anchor dimensions
     * 
     * Note: In a real implementation, you would use the sync attribute to make the popup 
     * the same width or height as the anchor element. This is useful for controls that 
     * need the popup to stay the same width or height as the trigger.
     * 
     * This test is commented out as the current implementation doesn't support the sync attribute directly.
     */
    // @Test
    // public void testSyncExample()
    // {
    //     // This functionality would be implemented in a real application
    // }

    /**
     * Example showing flip behavior
     * 
     * When the popup doesn't have enough room in its preferred placement, it can automatically
     * flip to keep it in view and visually connected to its anchor. To enable this, use the
     * flip attribute.
     * 
     * By default, the popup will flip to the opposite placement, but you can configure preferred
     * fallback placements using flip-fallback-placement and flip-fallback-strategy.
     */
    @Test
    public void testFlipExample()
    {
        var anchor = new Div<>().setID("flipAnchor");

        // Basic flip
        var basicFlipPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setFlip(true)
                .add(new Div<>().setText("Popup with flip"));

        var basicFlipHtml = basicFlipPopup.toString(true);
        System.out.println("Basic Flip Example: " + basicFlipHtml);
        assertTrue(basicFlipHtml.contains("flip"));

        // Flip with fallback strategy
        var fallbackFlipPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setFlip(true)
                .setFlipFallbackStrategy(WaPopupFallbackStategy.BestFit)
                .setFlipPadding(5)
                .add(new Div<>().setText("Popup with flip fallback strategy"));

        var fallbackFlipHtml = fallbackFlipPopup.toString(true);
        System.out.println("Fallback Flip Example: " + fallbackFlipHtml);
        assertTrue(fallbackFlipHtml.contains("flip"));
        assertTrue(fallbackFlipHtml.contains("flip-fallback-strategy=\"best-fit\""));
        assertTrue(fallbackFlipHtml.contains("flip-padding=\"5\""));
    }

    /**
     * Example showing shift behavior
     * 
     * When a popup is longer than its anchor, it risks overflowing. In this case, use the
     * shift attribute to shift the popup along its axis and back into view.
     */
    @Test
    public void testShiftExample()
    {
        var anchor = new Div<>().setID("shiftAnchor");

        // Basic shift
        var shiftPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setShift(true)
                .add(new Div<>().setText("Popup with shift"));

        var shiftHtml = shiftPopup.toString(true);
        System.out.println("Shift Example: " + shiftHtml);
        assertTrue(shiftHtml.contains("shift"));

        // Shift with padding
        var paddingShiftPopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setShift(true)
                .setShiftPadding(10)
                .add(new Div<>().setText("Popup with shift padding"));

        var paddingShiftHtml = paddingShiftPopup.toString(true);
        System.out.println("Shift with Padding Example: " + paddingShiftHtml);
        assertTrue(paddingShiftHtml.contains("shift"));
        assertTrue(paddingShiftHtml.contains("shift-padding=\"10\""));
    }

    /**
     * Example showing auto-size behavior
     * 
     * Use the auto-size attribute to tell the popup to resize when necessary to prevent
     * it from overflowing. Possible values are horizontal, vertical, and both.
     */
    @Test
    public void testAutoSizeExample()
    {
        var anchor = new Div<>().setID("autoSizeAnchor");

        // Horizontal auto-size
        var horizontalAutoSizePopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setAutoSize(WaPopupAutoSize.Horizontal)
                .add(new Div<>().setText("Popup with horizontal auto-size"));

        var horizontalAutoSizeHtml = horizontalAutoSizePopup.toString(true);
        System.out.println("Horizontal Auto-Size Example: " + horizontalAutoSizeHtml);
        assertTrue(horizontalAutoSizeHtml.contains("auto-size=\"horizontal\""));

        // Vertical auto-size
        var verticalAutoSizePopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setAutoSize(WaPopupAutoSize.Vertical)
                .add(new Div<>().setText("Popup with vertical auto-size"));

        var verticalAutoSizeHtml = verticalAutoSizePopup.toString(true);
        System.out.println("Vertical Auto-Size Example: " + verticalAutoSizeHtml);
        assertTrue(verticalAutoSizeHtml.contains("auto-size=\"vertical\""));

        // Both auto-size
        var bothAutoSizePopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Top)
                .setAutoSize(WaPopupAutoSize.Both)
                .setAutoSizePadding(5)
                .add(new Div<>().setText("Popup with both auto-size"));

        var bothAutoSizeHtml = bothAutoSizePopup.toString(true);
        System.out.println("Both Auto-Size Example: " + bothAutoSizeHtml);
        assertTrue(bothAutoSizeHtml.contains("auto-size=\"both\""));
        assertTrue(bothAutoSizeHtml.contains("auto-size-padding=\"5\""));
    }

    /**
     * Example showing hover bridge
     * 
     * When a gap exists between the anchor and the popup element, this option will add a
     * "hover bridge" that fills the gap using an invisible element. This makes listening
     * for events such as mouseover and mouseout more sane because the pointer never
     * technically leaves the element.
     */
    @Test
    public void testHoverBridgeExample()
    {
        var anchor = new Div<>().setID("hoverBridgeAnchor");

        var hoverBridgePopup = new WaPopup<>(anchor)
                .setPlacement(WaPopupPlacements.Bottom)
                .setDistance(10)
                .setHoverBridge(true)
                .add(new Div<>().setText("Popup with hover bridge"));

        var hoverBridgeHtml = hoverBridgePopup.toString(true);
        System.out.println("Hover Bridge Example: " + hoverBridgeHtml);
        assertTrue(hoverBridgeHtml.contains("hover-bridge"));
        assertTrue(hoverBridgeHtml.contains("distance=\"10\""));
    }

    /**
     * Example showing combined features
     * 
     * This example demonstrates how multiple features can be combined to create a
     * fully-featured popup.
     */
    @Test
    public void testCombinedFeaturesExample()
    {
        var anchor = new Div<>().setID("combinedAnchor");

        var combinedPopup = new WaPopup(anchor)
                .setPlacement(WaPopupPlacements.Bottom)
                .setArrow(true)
                .setArrowPlacement(WaPopupArrowPlacements.Center)
                .setDistance(10)
                .setFlip(true)
                .setShift(true)
                .setAutoSize(WaPopupAutoSize.Both)
                .add(new Div<>().setText("Fully-featured popup"));

        var combinedHtml = combinedPopup.toString(true);
        System.out.println("Combined Features Example: " + combinedHtml);

        // Note: In a real application, you would also be able to style the arrow with CSS
        // using custom properties like --arrow-color and --arrow-size
    }
}
