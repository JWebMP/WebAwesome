import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.webawesome.WebAwesomeInclusionModule;
import com.jwebmp.webawesome.WebAwesomePageConfigurator;

module com.jwebmp.webawesome {

    exports com.jwebmp.webawesome.components;

    requires transitive com.jwebmp.core;
    requires static lombok;

    requires com.jwebmp.plugins.easingeffects;

    provides IGuiceScanModuleInclusions with WebAwesomeInclusionModule;
    provides IPageConfigurator with WebAwesomePageConfigurator;

    opens com.jwebmp.webawesome to web.awesome.test;

    opens com.jwebmp.webawesome.components to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
}