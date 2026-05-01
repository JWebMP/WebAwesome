package com.jwebmp.webawesome.tokens;

/**
 * Web Awesome color design tokens.
 * Covers surfaces, text, overlays, interactions, and semantic variant colors.
 */
public enum WaColorToken
{
    // ── Surface ──
    /** Raised surface color. */
    SurfaceRaised("--wa-color-surface-raised"),
    /** Default surface color. */
    SurfaceDefault("--wa-color-surface-default"),
    /** Lowered surface color. */
    SurfaceLowered("--wa-color-surface-lowered"),
    /** Surface border color. */
    SurfaceBorder("--wa-color-surface-border"),

    // ── Text ──
    /** Normal text color. */
    TextNormal("--wa-color-text-normal"),
    /** De-emphasized text color. */
    TextQuiet("--wa-color-text-quiet"),
    /** Text link color. */
    TextLink("--wa-color-text-link"),

    // ── Overlay ──
    /** Modal overlay color. */
    OverlayModal("--wa-color-overlay-modal"),
    /** Inline overlay color. */
    OverlayInline("--wa-color-overlay-inline"),

    // ── Shadow ──
    /** Base shadow color. */
    Shadow("--wa-color-shadow"),

    // ── Interactions ──
    /** Accessibility focus color. */
    Focus("--wa-color-focus"),
    /** Hover state mix color. */
    MixHover("--wa-color-mix-hover"),
    /** Active state mix color. */
    MixActive("--wa-color-mix-active"),

    // ── Palette core colors ──
    /** Red color. */
    Red("--wa-color-red"),
    /** High-contrast text color on red. */
    RedOn("--wa-color-red-on"),
    /** Orange color. */
    Orange("--wa-color-orange"),
    /** High-contrast text color on orange. */
    OrangeOn("--wa-color-orange-on"),
    /** Yellow color. */
    Yellow("--wa-color-yellow"),
    /** High-contrast text color on yellow. */
    YellowOn("--wa-color-yellow-on"),
    /** Green color. */
    Green("--wa-color-green"),
    /** High-contrast text color on green. */
    GreenOn("--wa-color-green-on"),
    /** Cyan color. */
    Cyan("--wa-color-cyan"),
    /** High-contrast text color on cyan. */
    CyanOn("--wa-color-cyan-on"),
    /** Blue color. */
    Blue("--wa-color-blue"),
    /** High-contrast text color on blue. */
    BlueOn("--wa-color-blue-on"),
    /** Indigo color. */
    Indigo("--wa-color-indigo"),
    /** High-contrast text color on indigo. */
    IndigoOn("--wa-color-indigo-on"),
    /** Purple color. */
    Purple("--wa-color-purple"),
    /** High-contrast text color on purple. */
    PurpleOn("--wa-color-purple-on"),
    /** Pink color. */
    Pink("--wa-color-pink"),
    /** High-contrast text color on pink. */
    PinkOn("--wa-color-pink-on"),
    /** Gray color. */
    Gray("--wa-color-gray"),
    /** High-contrast text color on gray. */
    GrayOn("--wa-color-gray-on"),

    // ── Variant core colors ──
    /** Primary brand color. */
    Brand("--wa-color-brand"),
    /** High-contrast text color on brand. */
    BrandOn("--wa-color-brand-on"),
    /** Neutral color. */
    Neutral("--wa-color-neutral"),
    /** High-contrast text color on neutral. */
    NeutralOn("--wa-color-neutral-on"),
    /** Success (positive) color. */
    Success("--wa-color-success"),
    /** High-contrast text color on success. */
    SuccessOn("--wa-color-success-on"),
    /** Warning (caution) color. */
    Warning("--wa-color-warning"),
    /** High-contrast text color on warning. */
    WarningOn("--wa-color-warning-on"),
    /** Danger (error/critical) color. */
    Danger("--wa-color-danger"),
    /** High-contrast text color on danger. */
    DangerOn("--wa-color-danger-on"),

    // ── Semantic variant fills ──
    /** Subtle brand fill color. */
    BrandFillQuiet("--wa-color-brand-fill-quiet"),
    /** Standard brand fill color. */
    BrandFillNormal("--wa-color-brand-fill-normal"),
    /** Prominent brand fill color. */
    BrandFillLoud("--wa-color-brand-fill-loud"),
    /** Subtle neutral fill color. */
    NeutralFillQuiet("--wa-color-neutral-fill-quiet"),
    /** Standard neutral fill color. */
    NeutralFillNormal("--wa-color-neutral-fill-normal"),
    /** Prominent neutral fill color. */
    NeutralFillLoud("--wa-color-neutral-fill-loud"),
    /** Subtle success fill color. */
    SuccessFillQuiet("--wa-color-success-fill-quiet"),
    /** Standard success fill color. */
    SuccessFillNormal("--wa-color-success-fill-normal"),
    /** Prominent success fill color. */
    SuccessFillLoud("--wa-color-success-fill-loud"),
    /** Subtle warning fill color. */
    WarningFillQuiet("--wa-color-warning-fill-quiet"),
    /** Standard warning fill color. */
    WarningFillNormal("--wa-color-warning-fill-normal"),
    /** Prominent warning fill color. */
    WarningFillLoud("--wa-color-warning-fill-loud"),
    /** Subtle danger fill color. */
    DangerFillQuiet("--wa-color-danger-fill-quiet"),
    /** Standard danger fill color. */
    DangerFillNormal("--wa-color-danger-fill-normal"),
    /** Prominent danger fill color. */
    DangerFillLoud("--wa-color-danger-fill-loud"),

    // ── Semantic variant borders ──
    /** Subtle brand border color. */
    BrandBorderQuiet("--wa-color-brand-border-quiet"),
    /** Standard brand border color. */
    BrandBorderNormal("--wa-color-brand-border-normal"),
    /** Prominent brand border color. */
    BrandBorderLoud("--wa-color-brand-border-loud"),
    /** Subtle neutral border color. */
    NeutralBorderQuiet("--wa-color-neutral-border-quiet"),
    /** Standard neutral border color. */
    NeutralBorderNormal("--wa-color-neutral-border-normal"),
    /** Prominent neutral border color. */
    NeutralBorderLoud("--wa-color-neutral-border-loud"),
    /** Subtle success border color. */
    SuccessBorderQuiet("--wa-color-success-border-quiet"),
    /** Standard success border color. */
    SuccessBorderNormal("--wa-color-success-border-normal"),
    /** Prominent success border color. */
    SuccessBorderLoud("--wa-color-success-border-loud"),
    /** Subtle warning border color. */
    WarningBorderQuiet("--wa-color-warning-border-quiet"),
    /** Standard warning border color. */
    WarningBorderNormal("--wa-color-warning-border-normal"),
    /** Prominent warning border color. */
    WarningBorderLoud("--wa-color-warning-border-loud"),
    /** Subtle danger border color. */
    DangerBorderQuiet("--wa-color-danger-border-quiet"),
    /** Standard danger border color. */
    DangerBorderNormal("--wa-color-danger-border-normal"),
    /** Prominent danger border color. */
    DangerBorderLoud("--wa-color-danger-border-loud"),

    // ── Semantic variant on-colors ──
    /** Text color on quiet brand fill. */
    BrandOnQuiet("--wa-color-brand-on-quiet"),
    /** Text color on normal brand fill. */
    BrandOnNormal("--wa-color-brand-on-normal"),
    /** Text color on loud brand fill. */
    BrandOnLoud("--wa-color-brand-on-loud"),
    /** Text color on quiet neutral fill. */
    NeutralOnQuiet("--wa-color-neutral-on-quiet"),
    /** Text color on normal neutral fill. */
    NeutralOnNormal("--wa-color-neutral-on-normal"),
    /** Text color on loud neutral fill. */
    NeutralOnLoud("--wa-color-neutral-on-loud"),
    /** Text color on quiet success fill. */
    SuccessOnQuiet("--wa-color-success-on-quiet"),
    /** Text color on normal success fill. */
    SuccessOnNormal("--wa-color-success-on-normal"),
    /** Text color on loud success fill. */
    SuccessOnLoud("--wa-color-success-on-loud"),
    /** Text color on quiet warning fill. */
    WarningOnQuiet("--wa-color-warning-on-quiet"),
    /** Text color on normal warning fill. */
    WarningOnNormal("--wa-color-warning-on-normal"),
    /** Text color on loud warning fill. */
    WarningOnLoud("--wa-color-warning-on-loud"),
    /** Text color on quiet danger fill. */
    DangerOnQuiet("--wa-color-danger-on-quiet"),
    /** Text color on normal danger fill. */
    DangerOnNormal("--wa-color-danger-on-normal"),
    /** Text color on loud danger fill. */
    DangerOnLoud("--wa-color-danger-on-loud");

    private final String token;

    WaColorToken(String token)
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

    /**
     * Returns a palette tint token for a given hue and tint number (10–100, step 10).
     * E.g. {@code WaColorToken.paletteTint("red", 50)} returns {@code "--wa-color-red-50"}.
     */
    public static String paletteTint(String hue, int tint)
    {
        return "--wa-color-" + hue + "-" + tint;
    }

    /**
     * Returns a palette tint token wrapped as a CSS {@code var()} reference.
     */
    public static String paletteTintVar(String hue, int tint)
    {
        return "var(--wa-color-" + hue + "-" + tint + ")";
    }

    /**
     * Returns a variant tint token for a given variant and tint number.
     * E.g. {@code WaColorToken.variantTint("brand", 50)} returns {@code "--wa-color-brand-50"}.
     */
    public static String variantTint(String variant, int tint)
    {
        return "--wa-color-" + variant + "-" + tint;
    }

    /**
     * Returns a variant tint token wrapped as a CSS {@code var()} reference.
     */
    public static String variantTintVar(String variant, int tint)
    {
        return "var(--wa-color-" + variant + "-" + tint + ")";
    }
}
