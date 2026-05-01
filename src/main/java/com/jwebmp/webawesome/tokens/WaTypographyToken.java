package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome typography design tokens.
 * Controls font families, sizes, weights, and line heights.
 */
public enum WaTypographyToken
{
    // ── Font Family ──
    /** Default body font family. */
    FontFamilyBody("--wa-font-family-body"),
    /** Font family for headings. */
    FontFamilyHeading("--wa-font-family-heading"),
    /** Monospace font family for code. */
    FontFamilyCode("--wa-font-family-code"),
    /** Font family optimized for longform reading. */
    FontFamilyLongform("--wa-font-family-longform"),

    // ── Font Size ──
    /** Font size scale factor. */
    FontSizeScale("--wa-font-size-scale"),
    /** Extra extra extra small font size. */
    FontSize3XS("--wa-font-size-3xs"),
    /** Extra extra small font size. */
    FontSize2XS("--wa-font-size-2xs"),
    /** Extra small font size. */
    FontSizeXS("--wa-font-size-xs"),
    /** Small font size. */
    FontSizeS("--wa-font-size-s"),
    /** Medium (base) font size. */
    FontSizeM("--wa-font-size-m"),
    /** Large font size. */
    FontSizeL("--wa-font-size-l"),
    /** Extra large font size. */
    FontSizeXL("--wa-font-size-xl"),
    /** Extra extra large font size. */
    FontSize2XL("--wa-font-size-2xl"),
    /** Extra extra extra large font size. */
    FontSize3XL("--wa-font-size-3xl"),
    /** Extra extra extra extra large font size. */
    FontSize4XL("--wa-font-size-4xl"),
    /** Extra extra extra extra extra large font size. */
    FontSize5XL("--wa-font-size-5xl"),
    /** One step smaller than the current font size. */
    FontSizeSmaller("--wa-font-size-smaller"),
    /** One step larger than the current font size. */
    FontSizeLarger("--wa-font-size-larger"),

    // ── Font Weight ──
    /** Light font weight. */
    FontWeightLight("--wa-font-weight-light"),
    /** Normal (regular) font weight. */
    FontWeightNormal("--wa-font-weight-normal"),
    /** Semibold font weight. */
    FontWeightSemibold("--wa-font-weight-semibold"),
    /** Bold font weight. */
    FontWeightBold("--wa-font-weight-bold"),
    /** Default font weight for body text. */
    FontWeightBody("--wa-font-weight-body"),
    /** Default font weight for headings. */
    FontWeightHeading("--wa-font-weight-heading"),
    /** Default font weight for code. */
    FontWeightCode("--wa-font-weight-code"),
    /** Default font weight for longform text. */
    FontWeightLongform("--wa-font-weight-longform"),
    /** Default font weight for interactive elements. */
    FontWeightAction("--wa-font-weight-action"),

    // ── Line Height ──
    /** Condensed line height for tight spaces. */
    LineHeightCondensed("--wa-line-height-condensed"),
    /** Normal line height. */
    LineHeightNormal("--wa-line-height-normal"),
    /** Expanded line height for readability. */
    LineHeightExpanded("--wa-line-height-expanded");

    private final String token;

    WaTypographyToken(String token)
    {
        this.token = token;
    }

    @Override
    public String toString()
    {
        return token;
    }

    /**
     * Returns the token wrapped as a CSS {@code var()} reference.
     */
    public String var()
    {
        return "var(" + token + ")";
    }
}
