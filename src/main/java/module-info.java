import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.webawesome.WebAwesomeInclusionModule;
import com.jwebmp.webawesome.WebAwesomePageConfigurator;

module com.jwebmp.webawesome {

    exports com.jwebmp.webawesome.components;
    exports com.jwebmp.webawesome.components.animatedimage;
    exports com.jwebmp.webawesome.components.animation;
    exports com.jwebmp.webawesome.components.avatar;
    exports com.jwebmp.webawesome.components.badge;
    exports com.jwebmp.webawesome.components.breadcrumb;
    exports com.jwebmp.webawesome.components.button;
    exports com.jwebmp.webawesome.components.callout;
    exports com.jwebmp.webawesome.components.card;
    exports com.jwebmp.webawesome.components.carousel;
    exports com.jwebmp.webawesome.components.checkbox;
    exports com.jwebmp.webawesome.components.colorpicker;
    exports com.jwebmp.webawesome.components.copybutton;
    exports com.jwebmp.webawesome.components.details;
    exports com.jwebmp.webawesome.components.dialog;
    exports com.jwebmp.webawesome.components.divider;
    exports com.jwebmp.webawesome.components.drawer;
    exports com.jwebmp.webawesome.components.icon;
    exports com.jwebmp.webawesome.components.imagecompare;
    exports com.jwebmp.webawesome.components.include;
    exports com.jwebmp.webawesome.components.menu;


    exports com.jwebmp.webawesome.components.text;

    requires transitive com.jwebmp.core;
    requires static lombok;

    requires com.jwebmp.plugins.easingeffects;

    provides IGuiceScanModuleInclusions with WebAwesomeInclusionModule;
    provides IPageConfigurator with WebAwesomePageConfigurator;

    opens com.jwebmp.webawesome to web.awesome.test;

    opens com.jwebmp.webawesome.components to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.animatedimage to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.animation to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.avatar to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.badge to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.breadcrumb to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.button to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.callout to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.card to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.carousel to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.checkbox to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.colorpicker to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.copybutton to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.details to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.dialog to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.divider to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.drawer to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.icon to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.imagecompare to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.include to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
    opens com.jwebmp.webawesome.components.menu to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;


    opens com.jwebmp.webawesome.components.text to com.google.guice, com.jwebmp.core, com.fasterxml.jackson.databind, com.jwebmp.core.angular;
}