package com.jwebmp.webawesome;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;

@PluginInformation(pluginName = "Web Awesome",
        pluginDescription = "Make something awesome with open-source web components",
        pluginUniqueName = "WebAwesome",
        pluginVersion = "0.0.1",
        pluginCategories = "ui,web ui, framework,kit",
        pluginSubtitle = "Web Awesome is the biggest open-source library of meticulously designed, highly customizable, and framework-agnostic UI components.",
        pluginSourceUrl = "https://github.com/JWebMP/WebAwesome",
        pluginWikiUrl = "https://github.com/JWebMP/WebAwesome/wiki",
        pluginGitUrl = "https://github.com/JWebMP/WebAwesome",
/*        pluginIconUrl = "bower_components/waypoints/waypointsicon.jpg",
        pluginIconImageUrl = "bower_components/waypoints/waypointslogo.jpg",*/
        pluginOriginalHomepage = "https://backers.webawesome.com/docs/installation",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/webawesome",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "web-awesome",
        pluginModuleName = "com.jwebmp.webawesome",
        pluginStatus = PluginStatus.DevelopmentStarted
)
public class WebAwesomePageConfigurator
        implements IPageConfigurator<WebAwesomePageConfigurator> {

    @Override
    public IPage<?> configure(IPage<?> page) {
        page.addCssReference(new CSSReference("WebAwesome", 0.1, "https://early.webawesome.com/webawesome@3.0.0-alpha.5/dist/themes/default.css")
                .setPriority(RequirementsPriority.First));
        page.addJavaScriptReference(new JavascriptReference("WebAwesome", 0.1, "https://early.webawesome.com/webawesome@3.0.0-alpha.5/dist/webawesome.loader.js")
                .setPriority(RequirementsPriority.Top_Shelf)
                .setScriptType("module"));
        
        return page;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}
