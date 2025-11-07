module web.awesome.test {
    requires com.jwebmp.webawesome;

    requires org.junit.jupiter.api;
    requires com.jwebmp.core;
    requires com.jwebmp.core.base.angular.client;


    opens com.jwebmp.webawesome.test to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.components to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.avatar to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.animatedimage to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.animation to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.popup to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.badge to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.breadcrumb to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.button to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.callout to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.card to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.carousel to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.checkbox to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.colorpicker to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.copybutton to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.details to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.dialog to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.divider to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.drawer to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.formatbytes to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.formatdate to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.formatnumber to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.icon to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.imagecompare to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.comparison to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.include to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.input to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    //opens com.jwebmp.webawesome.test.menu to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.popover to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.progressbar to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.progressring to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.qrcode to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.radio to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.range to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.rating to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.relativetime to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.select to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.skeleton to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.spinner to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.splitpanel to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.tabgroup to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.tag to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.textarea to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.tooltip to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.tree to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.waswitch to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.text to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.toast to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.scroller to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.zoom to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
}
