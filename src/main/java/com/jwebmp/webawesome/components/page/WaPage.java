package com.jwebmp.webawesome.components.page;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.BreakpointCapable;
import lombok.Getter;
import lombok.experimental.Accessors;

/**
 * Represents a Web Awesome page component.
 * This class provides methods to configure the page's attributes and child components.
 */
@Getter
@Accessors(chain = true)
@NgImportReference(value = "WaPageComponent", reference = "angular-awesome")
@NgImportModule("WaPageComponent")
public class WaPage<J extends WaPage<J>> extends DivSimple<J> implements BreakpointCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The banner component of the page.
     * This can be null if not set.
     */
    private WaPageBanner<?> banner;

    /**
     * The header component of the page.
     * This can be null if not set.
     */
    private WaPageHeader<?> header;

    /**
     * The sub-header component of the page.
     * This can be null if not set.
     */
    private WaPageSubHeader<?> subHeader;

    /**
     * The navigation header component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigationHeader<?> navigationHeader;

    /**
     * The navigation component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigation<?> navigation;

    /**
     * The navigation footer component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigationFooter<?> navigationFooter;

    /**
     * The main header component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMainHeader<?> mainHeader;

    /**
     * The main content component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMain<?> main;

    /**
     * The main footer component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMainFooter<?> mainFooter;

    /**
     * The aside component of the page.
     * This can be null if not set.
     */
    private WaPageContentsAside<?> aside;

    /**
     * The footer component of the page.
     * This can be null if not set.
     */
    private WaPageFooter<?> footer;

    /**
     * Controls mobile nav drawer state.
     */
    private boolean navOpen;

    /**
     * Read-only view mode based on mobileBreakpoint.
     * Can be 'mobile' or 'desktop'.
     */
    private String view;

    /**
     * Space-separated list of sticky sections to disable.
     */
    private String disableSticky;

    /**
     * Placement of mobile nav drawer.
     * Can be 'start' or 'end'.
     */
    private String navigationPlacement;

    /**
     * Width of the navigation/menu column.
     */
    private String menuWidth;

    /**
     * Width of the main content area.
     */
    private String mainWidth;

    /**
     * Width of the aside column.
     */
    private String asideWidth;

    /**
     * Height of the banner area.
     */
    private String bannerHeight;

    /**
     * Height of the header.
     */
    private String headerHeight;

    /**
     * Height of the subheader.
     */
    private String subheaderHeight;

    /**
     * The skip to content component of the page.
     * This can be null if not set.
     */
    private WaPageSkipToContent<?> skipToContent;

    /**
     * The menu component of the page.
     * This can be null if not set.
     */
    private WaPageMenu<?> menu;

    /**
     * The navigation toggle component of the page.
     * This can be null if not set.
     */
    private WaPageNavigationToggle<?> navigationToggle;

    /**
     * The navigation toggle icon component of the page.
     * This can be null if not set.
     */
    private WaPageNavigationToggleIcon<?> navigationToggleIcon;

    /**
     * The dialog wrapper component of the page.
     * This can be null if not set.
     */
    private WaPageDialogWrapper<?> dialogWrapper;

    /**
     * Whether to disable the navigation toggle button.
     */
    private Boolean disableNavigationToggle;

    /**
     * Default constructor for the WaPage class.
     * Initializes the component with a default tag of `wa-page`.
     */
    public WaPage()
    {
        setTag("wa-page");
    }

    /**
     * Sets the banner component of the page.
     *
     * @param banner The banner component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setBanner(WaPageBanner<?> banner)
    {
        this.banner = banner;
        return (J) this;
    }

    /**
     * Sets the header component of the page.
     *
     * @param header The header component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setHeader(WaPageHeader<?> header)
    {
        this.header = header;
        return (J) this;
    }

    /**
     * Sets the sub-header component of the page.
     *
     * @param subHeader The sub-header component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setSubHeader(WaPageSubHeader<?> subHeader)
    {
        this.subHeader = subHeader;
        return (J) this;
    }

    /**
     * Sets the navigation header component of the page.
     *
     * @param navigationHeader The navigation header component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigationHeader(WaPageContentsNavigationHeader<?> navigationHeader)
    {
        this.navigationHeader = navigationHeader;
        return (J) this;
    }

    /**
     * Sets the navigation component of the page.
     *
     * @param navigation The navigation component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigation(WaPageContentsNavigation<?> navigation)
    {
        this.navigation = navigation;
        return (J) this;
    }

    /**
     * Sets the navigation footer component of the page.
     *
     * @param navigationFooter The navigation footer component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigationFooter(WaPageContentsNavigationFooter<?> navigationFooter)
    {
        this.navigationFooter = navigationFooter;
        return (J) this;
    }

    /**
     * Sets the main header component of the page.
     *
     * @param mainHeader The main header component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMainHeader(WaPageContentsMainHeader<?> mainHeader)
    {
        this.mainHeader = mainHeader;
        return (J) this;
    }

    /**
     * Sets the main content component of the page.
     *
     * @param main The main content component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMain(WaPageContentsMain<?> main)
    {
        this.main = main;
        return (J) this;
    }

    /**
     * Sets the main footer component of the page.
     *
     * @param mainFooter The main footer component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMainFooter(WaPageContentsMainFooter<?> mainFooter)
    {
        this.mainFooter = mainFooter;
        return (J) this;
    }

    /**
     * Sets the aside component of the page.
     *
     * @param aside The aside component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setAside(WaPageContentsAside<?> aside)
    {
        this.aside = aside;
        return (J) this;
    }

    /**
     * Sets the footer component of the page.
     *
     * @param footer The footer component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setFooter(WaPageFooter<?> footer)
    {
        this.footer = footer;
        return (J) this;
    }

    /**
     * Sets the skip to content component of the page.
     *
     * @param skipToContent The skip to content component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setSkipToContent(WaPageSkipToContent<?> skipToContent)
    {
        this.skipToContent = skipToContent;
        return (J) this;
    }

    /**
     * Sets the menu component of the page.
     *
     * @param menu The menu component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMenu(WaPageMenu<?> menu)
    {
        this.menu = menu;
        return (J) this;
    }

    /**
     * Sets the navigation toggle component of the page.
     *
     * @param navigationToggle The navigation toggle component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigationToggle(WaPageNavigationToggle<?> navigationToggle)
    {
        this.navigationToggle = navigationToggle;
        return (J) this;
    }

    /**
     * Sets the navigation toggle icon component of the page.
     *
     * @param navigationToggleIcon The navigation toggle icon component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigationToggleIcon(WaPageNavigationToggleIcon<?> navigationToggleIcon)
    {
        this.navigationToggleIcon = navigationToggleIcon;
        return (J) this;
    }

    /**
     * Sets the dialog wrapper component of the page.
     *
     * @param dialogWrapper The dialog wrapper component.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setDialogWrapper(WaPageDialogWrapper<?> dialogWrapper)
    {
        this.dialogWrapper = dialogWrapper;
        return (J) this;
    }

    /**
     * Sets whether to disable the navigation toggle button.
     *
     * @param disableNavigationToggle True to disable.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setDisableNavigationToggle(Boolean disableNavigationToggle)
    {
        this.disableNavigationToggle = disableNavigationToggle;
        return (J) this;
    }

    /**
     * Initializes the component.
     * Adds the child components to the page.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (skipToContent != null)
            {
                add(skipToContent);
            }
            if (banner != null)
            {
                add(banner);
            }
            if (header != null)
            {
                add(header);
            }
            if (subHeader != null)
            {
                add(subHeader);
            }
            if (navigationHeader != null)
            {
                add(navigationHeader);
            }
            if (navigation != null)
            {
                add(navigation);
            }
            if (navigationFooter != null)
            {
                add(navigationFooter);
            }
            if (mainHeader != null)
            {
                add(mainHeader);
            }
            if (main != null)
            {
                add(main);
            }
            if (mainFooter != null)
            {
                add(mainFooter);
            }
            if (aside != null)
            {
                add(aside);
            }
            if (menu != null)
            {
                add(menu);
            }
            if (navigationToggle != null)
            {
                add(navigationToggle);
            }
            if (navigationToggleIcon != null)
            {
                add(navigationToggleIcon);
            }
            if (dialogWrapper != null)
            {
                add(dialogWrapper);
            }
            if (footer != null)
            {
                add(footer);
            }
            if (disableNavigationToggle != null && disableNavigationToggle)
            {
                addAttribute("disable-navigation-toggle", "");
            }
        }
        super.init();
    }

    /**
     * Gets the banner component of the page.
     * Initializes it if not already set.
     *
     * @return The banner component.
     */
    public WaPageBanner<?> getBanner()
    {
        if (banner == null)
        {
            banner = new WaPageBanner();
            add(banner);
        }
        return banner;
    }

    /**
     * Gets the header component of the page.
     * Initializes it if not already set.
     *
     * @return The header component.
     */
    public WaPageHeader<?> getHeader()
    {
        if (header == null)
        {
            header = new WaPageHeader();
            add(header);
        }
        return header;
    }

    /**
     * Gets the sub-header component of the page.
     * Initializes it if not already set.
     *
     * @return The sub-header component.
     */
    public WaPageSubHeader<?> getSubHeader()
    {
        if (subHeader == null)
        {
            subHeader = new WaPageSubHeader();
            add(subHeader);
        }
        return subHeader;
    }

    /**
     * Gets the navigation component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation component.
     */
    public WaPageContentsNavigation<?> getNavigation()
    {
        if (navigation == null)
        {
            navigation = new WaPageContentsNavigation();
            add(navigation);
        }
        return navigation;
    }

    /**
     * Gets the navigation footer component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation footer component.
     */
    public WaPageContentsNavigationFooter<?> getNavigationFooter()
    {
        if (navigationFooter == null)
        {
            navigationFooter = new WaPageContentsNavigationFooter();
            add(navigationFooter);
        }
        return navigationFooter;
    }

    /**
     * Gets the main content component of the page.
     * Initializes it if not already set.
     *
     * @return The main content component.
     */
    public WaPageContentsMain<?> getMain()
    {
        if (main == null)
        {
            main = new WaPageContentsMain();
            add(main);
        }
        return main;
    }

    /**
     * Gets the main footer component of the page.
     * Initializes it if not already set.
     *
     * @return The main footer component.
     */
    public WaPageContentsMainFooter getMainFooter()
    {
        if (mainFooter == null)
        {
            mainFooter = new WaPageContentsMainFooter();
            add(mainFooter);
        }
        return mainFooter;
    }

    /**
     * Gets the aside component of the page.
     * Initializes it if not already set.
     *
     * @return The aside component.
     */
    public WaPageContentsAside<?> getAside()
    {
        if (aside == null)
        {
            aside = new WaPageContentsAside();
            add(aside);
        }
        return aside;
    }

    /**
     * Gets the footer component of the page.
     * Initializes it if not already set.
     *
     * @return The footer component.
     */
    public WaPageFooter<?> getFooter()
    {
        if (footer == null)
        {
            footer = new WaPageFooter();
            add(footer);
        }
        return footer;
    }

    /**
     * Gets the navigation header component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation header component.
     */
    public WaPageContentsNavigationHeader<?> getNavigationHeader()
    {
        if (navigationHeader == null)
        {
            navigationHeader = new WaPageContentsNavigationHeader();
            add(navigationHeader);
        }
        return navigationHeader;
    }

    /**
     * Gets the main header component of the page.
     * Initializes it if not already set.
     *
     * @return The main header component.
     */
    public WaPageContentsMainHeader<?> getMainHeader()
    {
        if (mainHeader == null)
        {
            mainHeader = new WaPageContentsMainHeader();
            add(mainHeader);
        }
        return mainHeader;
    }

    /**
     * Gets the skip to content component of the page.
     * Initializes it if not already set.
     *
     * @return The skip to content component.
     */
    public WaPageSkipToContent<?> getSkipToContent()
    {
        if (skipToContent == null)
        {
            skipToContent = new WaPageSkipToContent();
            add(skipToContent);
        }
        return skipToContent;
    }

    /**
     * Gets the menu component of the page.
     * Initializes it if not already set.
     *
     * @return The menu component.
     */
    public WaPageMenu<?> getMenu()
    {
        if (menu == null)
        {
            menu = new WaPageMenu();
            add(menu);
        }
        return menu;
    }

    /**
     * Gets the navigation toggle component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation toggle component.
     */
    public WaPageNavigationToggle<?> getNavigationToggle()
    {
        if (navigationToggle == null)
        {
            navigationToggle = new WaPageNavigationToggle();
            add(navigationToggle);
        }
        return navigationToggle;
    }

    /**
     * Gets the navigation toggle icon component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation toggle icon component.
     */
    public WaPageNavigationToggleIcon<?> getNavigationToggleIcon()
    {
        if (navigationToggleIcon == null)
        {
            navigationToggleIcon = new WaPageNavigationToggleIcon();
            add(navigationToggleIcon);
        }
        return navigationToggleIcon;
    }

    /**
     * Gets the dialog wrapper component of the page.
     * Initializes it if not already set.
     *
     * @return The dialog wrapper component.
     */
    public WaPageDialogWrapper<?> getDialogWrapper()
    {
        if (dialogWrapper == null)
        {
            dialogWrapper = new WaPageDialogWrapper();
            add(dialogWrapper);
        }
        return dialogWrapper;
    }

    /**
     * Sets the value of the navOpen property.
     * This controls the mobile nav drawer state.
     *
     * @param navOpen The new value for the navOpen property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavOpen(boolean navOpen)
    {
        this.navOpen = navOpen;
        addAttribute("nav-open", Boolean.toString(navOpen));
        return (J) this;
    }

    /**
     * Sets the read-only view mode.
     *
     * @param view The view mode ('mobile' or 'desktop').
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setView(String view)
    {
        this.view = view;
        return (J) this;
    }

    /**
     * Sets the value of the disableSticky property.
     * This is a space-separated list of sticky sections to disable.
     *
     * @param disableSticky The new value for the disableSticky property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setDisableSticky(String disableSticky)
    {
        this.disableSticky = disableSticky;
        addAttribute("disable-sticky", disableSticky);
        return (J) this;
    }

    /**
     * Sets the value of the navigationPlacement property.
     * This is the placement of the mobile nav drawer.
     *
     * @param navigationPlacement The new value for the navigationPlacement property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setNavigationPlacement(String navigationPlacement)
    {
        this.navigationPlacement = navigationPlacement;
        addAttribute("navigation-placement", navigationPlacement);
        return (J) this;
    }

    /**
     * Sets the value of the menuWidth property.
     * This is the width of the navigation/menu column.
     *
     * @param menuWidth The new value for the menuWidth property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMenuWidth(String menuWidth)
    {
        this.menuWidth = menuWidth;
        addStyle("--menu-width", menuWidth);
        return (J) this;
    }

    /**
     * Sets the value of the mainWidth property.
     * This is the width of the main content area.
     *
     * @param mainWidth The new value for the mainWidth property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setMainWidth(String mainWidth)
    {
        this.mainWidth = mainWidth;
        addStyle("--main-width", mainWidth);
        return (J) this;
    }

    /**
     * Sets the value of the asideWidth property.
     * This is the width of the aside column.
     *
     * @param asideWidth The new value for the asideWidth property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setAsideWidth(String asideWidth)
    {
        this.asideWidth = asideWidth;
        addStyle("--aside-width", asideWidth);
        return (J) this;
    }

    /**
     * Sets the value of the bannerHeight property.
     * This is the height of the banner area.
     *
     * @param bannerHeight The new value for the bannerHeight property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setBannerHeight(String bannerHeight)
    {
        this.bannerHeight = bannerHeight;
        addStyle("--banner-height", bannerHeight);
        return (J) this;
    }

    /**
     * Sets the value of the headerHeight property.
     * This is the height of the header.
     *
     * @param headerHeight The new value for the headerHeight property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setHeaderHeight(String headerHeight)
    {
        this.headerHeight = headerHeight;
        addStyle("--header-height", headerHeight);
        return (J) this;
    }

    /**
     * Sets the value of the subheaderHeight property.
     * This is the height of the subheader.
     *
     * @param subheaderHeight The new value for the subheaderHeight property.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J setSubheaderHeight(String subheaderHeight)
    {
        this.subheaderHeight = subheaderHeight;
        addStyle("--subheader-height", subheaderHeight);
        return (J) this;
    }

    /**
     * Shows the mobile navigation drawer.
     */
    public void showNavigation()
    {
        setNavOpen(true);
    }

    /**
     * Hides the mobile navigation drawer.
     */
    public void hideNavigation()
    {
        setNavOpen(false);
    }

    /**
     * Toggles the mobile navigation drawer.
     */
    public void toggleNavigation()
    {
        setNavOpen(!navOpen);
    }

    /**
     * Binds the mobileBreakpoint attribute to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindMobileBreakpoint(String variableName)
    {
        addAttribute("[mobile-breakpoint]", variableName);
        return (J) this;
    }

    /**
     * Binds the navOpen attribute to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindNavOpen(String variableName)
    {
        addAttribute("[nav-open]", variableName);
        return (J) this;
    }

    /**
     * Binds the disableSticky attribute to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindDisableSticky(String variableName)
    {
        addAttribute("[disable-sticky]", variableName);
        return (J) this;
    }

    /**
     * Binds the navigationPlacement attribute to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindNavigationPlacement(String variableName)
    {
        addAttribute("[navigation-placement]", variableName);
        return (J) this;
    }

    /**
     * Binds the menuWidth style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindMenuWidth(String variableName)
    {
        addAttribute("[style.--menu-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the mainWidth style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindMainWidth(String variableName)
    {
        addAttribute("[style.--main-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the asideWidth style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindAsideWidth(String variableName)
    {
        addAttribute("[style.--aside-width]", variableName);
        return (J) this;
    }

    /**
     * Binds the bannerHeight style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindBannerHeight(String variableName)
    {
        addAttribute("[style.--banner-height]", variableName);
        return (J) this;
    }

    /**
     * Binds the headerHeight style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindHeaderHeight(String variableName)
    {
        addAttribute("[style.--header-height]", variableName);
        return (J) this;
    }

    /**
     * Binds the subheaderHeight style to an Angular variable.
     *
     * @param variableName The name of the variable to bind to.
     * @return This component for method chaining.
     */
    @SuppressWarnings("unchecked")
    public J bindSubheaderHeight(String variableName)
    {
        addAttribute("[style.--subheader-height]", variableName);
        return (J) this;
    }
}