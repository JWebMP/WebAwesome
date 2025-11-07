package com.jwebmp.webawesome.components;

/**
 * Intensity levels used by Web Awesome color tokens (quiet, normal, loud).
 */
public enum ColourIntensity {
    Quiet,
    Normal,
    Loud;

    public String toToken() {
        return name().toLowerCase();
    }
}
