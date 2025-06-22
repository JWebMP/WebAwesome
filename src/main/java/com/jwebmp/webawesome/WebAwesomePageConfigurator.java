package com.jwebmp.webawesome;

import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.base.html.Script;
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
@TsDependency(value = "angular-awesome",version = "*")
public class WebAwesomePageConfigurator
        implements IPageConfigurator<WebAwesomePageConfigurator>
{

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        page.addCssReference(new CSSReference("WebAwesome", 0.1, "https://backers.webawesome.com/dist/styles/webawesome.css")
                .setPriority(RequirementsPriority.First));
        page.addCssReference(new CSSReference("WebAwesomeTheme", 0.1, "https://backers.webawesome.com/dist/styles/themes/default.css")
                .setPriority(RequirementsPriority.First).addAttribute("id", "webawesome-theme"));
        page.addJavaScriptReference(new JavascriptReference("WebAwesome", 0.1, "https://backers.webawesome.com/dist/webawesome.loader.js")
                .setPriority(RequirementsPriority.Top_Shelf)
                .setScriptType("module"));


        page.getHead().add(new Script<>()
                .addAttribute("type", "module")
                .setText("""
                        import { setBasePath } from 'https://backers.webawesome.com/dist/webawesome.js';
                                    setBasePath('https://backers.webawesome.com/dist/');"""));


        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }

}
