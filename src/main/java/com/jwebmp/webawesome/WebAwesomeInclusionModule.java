package com.jwebmp.webawesome;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;

import java.util.HashSet;
import java.util.Set;

public class WebAwesomeInclusionModule implements IGuiceScanModuleInclusions<WebAwesomeInclusionModule> {
    @Override
    public Set<String> includeModules() {
        Set<String> set = new HashSet<>();
        set.add("com.jwebmp.webawesome");
        return set;
    }
}
