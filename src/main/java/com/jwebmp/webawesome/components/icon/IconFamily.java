package com.jwebmp.webawesome.components.icon;

/**
 * Defines the possible icon families available in Font Awesome.
 * <p>
 * <strong>Pro Styles:</strong> Classic, Duotone, Sharp, Sharp_Duotone, Brands
 * <p>
 * <strong>Pro+ Styles:</strong> Chisel, Etch, Graphite, Jelly, Jelly_Duo, Jelly_Fill,
 * Notdog, Notdog_Duo, Slab, Slab_Press, Thumbprint, Utility, Utility_Duo, Utility_Fill, Whiteboard
 */
public enum IconFamily
{
    // ── Pro Styles ──────────────────────────────────────────
    /**
     * Classic family — supports Solid, Regular, Light, Thin
     */
    Classic,

    /**
     * Duotone family — supports Solid, Regular, Light, Thin
     */
    Duotone,

    /**
     * Sharp family — supports Solid, Regular, Light, Thin
     */
    Sharp,

    /**
     * Sharp Duotone family — supports Solid, Regular, Light, Thin
     */
    Sharp_Duotone,

    /**
     * Brands family
     */
    Brands,

    // ── Pro+ Styles ─────────────────────────────────────────
    /**
     * Chisel family — supports Regular
     */
    Chisel,

    /**
     * Etch family — supports Solid
     */
    Etch,

    /**
     * Graphite family — supports Thin
     */
    Graphite,

    /**
     * Jelly family — supports Regular
     */
    Jelly,

    /**
     * Jelly Duo family — supports Regular
     */
    Jelly_Duo,

    /**
     * Jelly Fill family — supports Regular
     */
    Jelly_Fill,

    /**
     * Notdog family — supports Solid
     */
    Notdog,

    /**
     * Notdog Duo family — supports Solid
     */
    Notdog_Duo,

    /**
     * Slab family — supports Regular
     */
    Slab,

    /**
     * Slab Press family — supports Regular
     */
    Slab_Press,

    /**
     * Thumbprint family — supports Light
     */
    Thumbprint,

    /**
     * Utility family — supports Semibold
     */
    Utility,

    /**
     * Utility Duo family — supports Semibold
     */
    Utility_Duo,

    /**
     * Utility Fill family — supports Semibold
     */
    Utility_Fill,

    /**
     * Whiteboard family — supports Semibold
     */
    Whiteboard;

    @Override
    public String toString()
    {
        return name().replace('_', '-')
                     .toLowerCase();
    }
}
