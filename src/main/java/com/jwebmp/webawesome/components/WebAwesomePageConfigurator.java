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
        pluginVersion = "3.10.0",
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
@TsDependency(value = "angular-awesome", version = "^3.10.0")
public class WebAwesomePageConfigurator
        implements IPageConfigurator<WebAwesomePageConfigurator>, TypescriptIndexPageConfigurator<WebAwesomePageConfigurator> {
    @Setter
    private static String basePath = "";
    @Setter
    private static String themePath = "";
    @Setter
    private static String paletesPath = "";
    @Setter
    private static String themeClassName = "";
    @Setter
    private static String themePalletName = "";
    @Setter
    private static String themeBrandName = "";
    @Setter
    private static String faKitCode = "";
    @Setter
    private static String waKitCode = "";

    @Override
    public IPage<?> configure(IPage<?> page) {

        JavascriptReference javascriptReference;
        page.addJavaScriptReference(javascriptReference = new JavascriptReference("WebAwesome", 0.1, basePath + "webawesome.loader.js")
                .setPriority(RequirementsPriority.Top_Shelf)
                .setScriptType("module"));

        if (!Strings.isNullOrEmpty(faKitCode)) {
            javascriptReference
                    .addAttribute("data-fa-kit-code", faKitCode);
        }
        if (!Strings.isNullOrEmpty(basePath)) {
            javascriptReference
                    .addAttribute("data-webawesome", basePath);
        }

        if (Strings.isNullOrEmpty(waKitCode) && !Strings.isNullOrEmpty(basePath) && !Strings.isNullOrEmpty(themePath) && !Strings.isNullOrEmpty(paletesPath)) {
            CSSReference webAwesome = new CSSReference("WebAwesome", 0.1, basePath + "styles/webawesome.css");
            page.addCssReference(webAwesome
                    .setPriority(RequirementsPriority.First));


            page.addCssReference(new CSSReference("WebAwesomeTheme", 0.1, basePath + themePath)
                    .setPriority(RequirementsPriority.First)
                    .setSortOrder(Integer.MAX_VALUE - 100)
                    .addAttribute("id", "webawesome-theme"));

            page.addCssReference(new CSSReference("WebAwesomePalettesTheme", 0.1, basePath + paletesPath)
                    .setPriority(RequirementsPriority.First)
                    .setSortOrder(Integer.MAX_VALUE - 99)
                    .addAttribute("id", "wa-pallets-theme")
                    .addAttribute("data-wa-pallets-theme", "true"));


            if (!Strings.isNullOrEmpty(themeClassName)) {
                page
                        .getBody()
                        .addClass(themeClassName);
            }
            if (!Strings.isNullOrEmpty(themePalletName)) {
                page
                        .getBody()
                        .addClass(themePalletName);
            }
            if (!Strings.isNullOrEmpty(themeBrandName)) {
                page
                        .getBody()
                        .addClass(themeBrandName);
            }
        } else if (!Strings.isNullOrEmpty(waKitCode)) {
            page
                    .getHead()
                    .add(new Script<>("https://kit.webawesome.com/" + waKitCode + ".js").addAttribute("crossorigin", "anonymous"));
        }


        return page;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}
