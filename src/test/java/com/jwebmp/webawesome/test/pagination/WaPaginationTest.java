package com.jwebmp.webawesome.test.pagination;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.icon.WaIcon;
import com.jwebmp.webawesome.components.pagination.PaginationAppearance;
import com.jwebmp.webawesome.components.pagination.PaginationFormat;
import com.jwebmp.webawesome.components.pagination.WaPagination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaPaginationTest
{
    @Test
    void rendersBasicPaginationTag()
    {
        var s = new WaPagination<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-pagination"), "Should render wa-pagination tag");
        assertTrue(s.contains("</wa-pagination>"), "Should have a closing tag");
    }

    @Test
    void rendersNumericAttributes()
    {
        var s = new WaPagination<>()
                .setTotal(237)
                .setPageSize(10)
                .setPage(3)
                .setSiblingCount(2)
                .setBoundaryCount(1)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("total=\"237\""), "Total expected");
        assertTrue(s.contains("page-size=\"10\""), "Page size expected");
        assertTrue(s.contains("page=\"3\""), "Page expected");
        assertTrue(s.contains("sibling-count=\"2\""), "Sibling count expected");
        assertTrue(s.contains("boundary-count=\"1\""), "Boundary count expected");
    }

    @Test
    void rendersConstructorTotalAndPageSize()
    {
        var s = new WaPagination<>(50, 5).toString(true);
        System.out.println(s);

        assertTrue(s.contains("total=\"50\""), "Total expected");
        assertTrue(s.contains("page-size=\"5\""), "Page size expected");
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaPagination<>()
                .setWithoutNav(true)
                .setWithEdges(true)
                .setWithSummary(true)
                .setHideSinglePage(true)
                .setDisabled(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("without-nav"), "without-nav expected");
        assertTrue(s.contains("with-edges"), "with-edges expected");
        assertTrue(s.contains("with-summary"), "with-summary expected");
        assertTrue(s.contains("hide-single-page"), "hide-single-page expected");
        assertTrue(s.contains("disabled"), "disabled expected");
    }

    @Test
    void omitsFalseBooleans()
    {
        var s = new WaPagination<>()
                .setWithEdges(false)
                .setWithSummary(false)
                .setDisabled(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("with-edges"), "with-edges should not render when false");
        assertFalse(s.contains("with-summary"), "with-summary should not render when false");
        assertFalse(s.contains("disabled"), "disabled should not render when false");
    }

    @Test
    void rendersFormatAppearanceAndSize()
    {
        var s = new WaPagination<>()
                .setFormat(PaginationFormat.Compact)
                .setAppearance(PaginationAppearance.Filled)
                .setSize(Size.Small)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("format=\"compact\""), "Compact format expected");
        assertTrue(s.contains("appearance=\"filled\""), "Filled appearance expected");
        assertTrue(s.contains("size=\"small\""), "Small size expected");
    }

    @Test
    void rendersLabelAndHrefTemplate()
    {
        var s = new WaPagination<>()
                .setLabel("Product pages")
                .setHrefTemplate("/products?page={page}")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Product pages\""), "Label expected");
        assertTrue(s.contains("href-template=\"/products?page={page}\""), "Href template expected");
    }

    @Test
    void rendersEvents()
    {
        var s = new WaPagination<>()
                .setPageChangeEvent("onPageChange($event)")
                .setBeforePageChangeEvent("onBeforePageChange($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("(wa-page-change)=\"onPageChange($event)\""), "Page change event expected");
        assertTrue(s.contains("(wa-before-page-change)=\"onBeforePageChange($event)\""), "Before page change event expected");
    }

    @Test
    void rendersPropertyBindings()
    {
        var s = new WaPagination<>()
                .bindTotal("total")
                .bindPageSize("pageSize")
                .bindPage("page")
                .bindHrefTemplate("buildHref")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[total]=\"total\""), "Total binding expected");
        assertTrue(s.contains("[pageSize]=\"pageSize\""), "Page size binding expected");
        assertTrue(s.contains("[page]=\"page\""), "Page binding expected");
        assertTrue(s.contains("[hrefTemplate]=\"buildHref\""), "Href template binding expected");
    }

    @Test
    void rendersIconSlots()
    {
        var s = new WaPagination<>()
                .setPreviousIcon(new WaIcon<>("chevron-left"))
                .setNextIcon(new WaIcon<>("chevron-right"))
                .setFirstIcon(new WaIcon<>("angles-left"))
                .setLastIcon(new WaIcon<>("angles-right"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("slot=\"previous-icon\""), "Previous icon slot expected");
        assertTrue(s.contains("slot=\"next-icon\""), "Next icon slot expected");
        assertTrue(s.contains("slot=\"first-icon\""), "First icon slot expected");
        assertTrue(s.contains("slot=\"last-icon\""), "Last icon slot expected");
    }
}

