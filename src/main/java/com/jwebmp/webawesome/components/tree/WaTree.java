package com.jwebmp.webawesome.components.tree;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaTree component displays hierarchical data in a tree structure.
 * It supports different selection modes and customizable indent guides.
 * <p>
 * This component renders as a wa-tree HTML element and contains wa-tree-item elements.
 */
@Getter
@Setter
@NgImportReference(value = "WaTreeDirective", reference = "angular-awesome")
@NgImportModule("WaTreeDirective")
public class WaTree<J extends WaTree<J>> extends DivSimple<J>
{
    /**
     * Controls selection mode: single, multiple, or only leaf nodes selectable
     */
    private TreeSelectionMode selection;

    /**
     * Width of the indent guide
     */
    private String indentGuideWidth;

    /**
     * Color of the indent guide
     */
    private String indentGuideColor;

    /**
     * Style of the indent guide (solid, dashed, dotted, etc.)
     */
    private String indentGuideStyle;

    /**
     * Offset of the indent guide
     */
    private String indentGuideOffset;

    /**
     * Size of the indentation
     */
    private String indentSize;

    /**
     * Creates a new WaTree with the tag "wa-tree"
     */
    public WaTree()
    {
        setTag("wa-tree");
    }

    /**
     * Adds a WaTreeItem to this WaTree
     *
     * @param item The WaTreeItem to add
     * @return This component
     */
    public J add(WaTreeItem<?> item)
    {
        super.add(item);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (selection != null)
            {
                addAttribute("selection", selection.toString()
                                                   .toLowerCase());
            }
            if (!Strings.isNullOrEmpty(indentGuideWidth))
            {
                addStyle("--indent-guide-width", indentGuideWidth);
            }
            if (!Strings.isNullOrEmpty(indentGuideColor))
            {
                addStyle("--indent-guide-color", indentGuideColor);
            }
            if (!Strings.isNullOrEmpty(indentGuideStyle))
            {
                addStyle("--indent-guide-style", indentGuideStyle);
            }
            if (!Strings.isNullOrEmpty(indentGuideOffset))
            {
                addStyle("--indent-guide-offset", indentGuideOffset);
            }
            if (!Strings.isNullOrEmpty(indentSize))
            {
                addStyle("--indent-size", indentSize);
            }
        }
        super.init();
    }

    /**
     * Binds the selection attribute to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindSelection(String variableName)
    {
        addAttribute("[selection]", variableName);
        return (J) this;
    }

    /**
     * Binds the indent-size style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndentSize(String variableName)
    {
        addAttribute("[style.--indent-size]", variableName);
        return (J) this;
    }

    /**
     * Binds the indent-guide-color style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndentGuideColor(String variableName)
    {
        addAttribute("[style.--indent-guide-color]", variableName);
        return (J) this;
    }

    /**
     * Binds the indent-guide-offset style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndentGuideOffset(String variableName)
    {
        addAttribute("[style.--indent-guide-offset]", variableName);
        return (J) this;
    }

    /**
     * Binds the indent-guide-style style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndentGuideStyle(String variableName)
    {
        addAttribute("[style.--indent-guide-style]", variableName);
        return (J) this;
    }

    /**
     * Binds the indent-guide-width style to an Angular variable
     *
     * @param variableName The name of the variable to bind to
     * @return This component
     */
    public J bindIndentGuideWidth(String variableName)
    {
        addAttribute("[style.--indent-guide-width]", variableName);
        return (J) this;
    }

    /**
     * Adds a handler for the selectionChange event
     *
     * @param handlerScript The JavaScript to execute when a tree item is selected or deselected
     * @return This component
     */
    public J onSelectionChange(String handlerScript)
    {
        addAttribute("(selectionChange)", handlerScript);
        return (J) this;
    }

    /**
     * Overrides the bind method to support two-way binding with ngModel.
     * This allows the radio group to be used with [(ngModel)] in Angular templates.
     *
     * @param variableName The name of the variable to bind to.
     * @return The current instance of WaRadioGroup for method chaining.
     */
    @Override
    public J bind(String variableName)
    {
        addAttribute("[(ngModel)]", variableName);
        addConfiguration(AnnotationUtils.getNgImportReference("FormsModule", "@angular/forms"));
        addConfiguration(AnnotationUtils.getNgImportModule("FormsModule"));
        return (J) this;
    }

}
