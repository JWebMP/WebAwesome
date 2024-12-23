module web.awesome.test {
    requires com.jwebmp.webawesome;

    requires org.junit.jupiter.api;
    requires com.jwebmp.core;


    opens com.jwebmp.webawesome.test to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
    opens com.jwebmp.webawesome.test.avatar to com.fasterxml.jackson.databind, com.jwebmp.core, org.junit.platform.commons;
}