package com.jwebmp.webawesome.components;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.base.angular.client.services.TypescriptIndexPageConfigurator;
import com.jwebmp.core.base.html.Script;
import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import lombok.Setter;

@PluginInformation(pluginName = "Web Awesome",
        pluginDescription = "Make something awesome with open-source web components",
        pluginUniqueName = "WebAwesome",
        pluginVersion = "0.0.1", // Note: Versions 1.0.0 to 1.0.3 match to web awesome 3.0.0-alpha.13
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
@TsDependency(value = "angular-awesome", version = "*")
public class WebAwesomePageConfigurator
        implements IPageConfigurator<WebAwesomePageConfigurator>, TypescriptIndexPageConfigurator<WebAwesomePageConfigurator>
{
    @Setter
    private static String basePath = "https://early.webawesome.com/webawesome@3.0.0-beta.4/dist/";
    @Setter
    private static String themePath = "https://early.webawesome.com/webawesome@3.0.0-beta.4/dist/styles/themes/default.css";
    @Setter
    private static String themeClassName = "wa-theme-default";
    @Setter
    private static String themePalletName = "wa-pallet-default";
    @Setter
    private static String themeBrandName = "wa-brand-blue";
    @Setter
    private static String faKitCode = "";

    @Override
    public IPage<?> configure(IPage<?> page)
    {
        CSSReference webAwesome = new CSSReference("WebAwesome", 0.1, basePath + "styles/webawesome.css");
        page.addCssReference(webAwesome
                .setPriority(RequirementsPriority.First));

        page.addCssReference(new CSSReference("WebAwesomeTheme", 0.1, themePath)
                .setPriority(RequirementsPriority.First)
                .addAttribute("id", "webawesome-theme"));

        page.addJavaScriptReference(new JavascriptReference("WebAwesome", 0.1, basePath + "webawesome.loader.js")
                .setPriority(RequirementsPriority.Top_Shelf)
                .setScriptType("module"));

        if (!Strings.isNullOrEmpty(themeClassName))
        {
            page.getBody()
                .addClass(themeClassName);
        }
        if (!Strings.isNullOrEmpty(themePalletName))
        {
            page.getBody()
                .addClass(themePalletName);
        }
        if (!Strings.isNullOrEmpty(themeBrandName))
        {
            page.getBody()
                .addClass(themeBrandName);
        }
        if (!Strings.isNullOrEmpty(faKitCode))
        {
            webAwesome
                    .addAttribute("data-fa-kit-code", faKitCode);
        }
        if (!Strings.isNullOrEmpty(basePath))
        {
            webAwesome
                    .addAttribute("data-webawesome", basePath);
        }

/*

        page.getHead()
            .add(new Script<>()
                    .addAttribute("type", "module")
                    .setText("""
                            import { setBasePath } from '%swebawesome.js';
                                        setBasePath('%s');""".formatted(basePath, basePath)));
*/


        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }

}
