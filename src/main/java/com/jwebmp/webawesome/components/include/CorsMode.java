package com.jwebmp.webawesome.components.include;

public enum CorsMode
{
    CORS,
    NO_CORS,
    SAME_ORIGIN;

    @Override
    public String toString()
    {
        return super.toString().replace('_', '-').toLowerCase();
    }
}
