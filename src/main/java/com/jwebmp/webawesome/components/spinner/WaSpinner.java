package com.jwebmp.webawesome.components.spinner;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaSpinner extends DivSimple<WaSpinner>
{
    private String size;
    private String trackWidth;
    private String trackColour;
    private String indicatorColour;
    private Number speed;

    public WaSpinner()
    {
        setTag("wa-spinner");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (!Strings.isNullOrEmpty(size))
            {
                addStyle("font-size", size);
            }

            if (!Strings.isNullOrEmpty(trackWidth))
            {
                addStyle("--track-width", trackWidth);
            }
            if (!Strings.isNullOrEmpty(trackColour))
            {
                addStyle("--track-color", trackColour);
            }
            if (!Strings.isNullOrEmpty(indicatorColour))
            {
                addStyle("--indicator-color", indicatorColour);
            }
            if (speed != null)
            {
                addStyle("--speed", String.valueOf(speed));
            }
        }
        super.init();
    }

}
