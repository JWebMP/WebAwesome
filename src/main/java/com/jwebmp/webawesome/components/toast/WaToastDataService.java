package com.jwebmp.webawesome.components.toast;

import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;

import java.util.ArrayList;
import java.util.List;

/**
 * Data service used to programmatically add/update/remove/clear toasts.
 * Components can depend on this service by declaring an @NgDataService-annotated subclass in their app/tests.
 * The underlying Angular service is generated from the metadata provided here.
 */
@NgDataTypeReference(value = WaToastItem.class, primary = false)
@NgImportReference(value = "TemplateRef", reference = "@angular/core")
public abstract class WaToastDataService<J extends WaToastDataService<J>> implements INgDataService<J>
{
    @Override
    public List<String> fields()
    {
        // Extend the default fields with a dataStore and a private _data subject used by helper methods
        List<String> fields = new ArrayList<>(INgDataService.super.fields());
        // Simple in-memory store shape used by the generated service methods
        fields.add("public dataStore: any = { datas: { out: [] as any[] } };");
        // Internal subject the helpers push updates to (kept separate from dataSubject for compatibility with existing generators)
        fields.add("protected _data: BehaviorSubject<DynamicData | undefined> = new BehaviorSubject<DynamicData | undefined>(undefined);");
        return fields;
    }

    @Override
    public String providedIn()
    {
        // Make service globally available by default
        return "any";
    }

    @Override
    public List<String> methods()
    {
        List<String> list = new ArrayList<>(INgDataService.super.methods());

        list.add("show(message: string, options: any = {}): string {\n" +
                "  const id = options.id || uuidv4();\n" +
                "  const item = { id, message, ...options };\n" +
                "  this.dataStore.datas.out?.push(item as any);\n" +
                "  this._data.next(Object.assign({}, this.dataStore).datas);\n" +
                "  return id;\n" +
                "}");

        list.add("update(id: string, changes: any = {}): void {\n" +
                "  const items = this.dataStore.datas.out as any[] | undefined;\n" +
                "  if (!items) { return; }\n" +
                "  const idx = items.findIndex(i => i?.id === id);\n" +
                "  if (idx >= 0) {\n" +
                "    items[idx] = { ...items[idx], ...changes };\n" +
                "    this._data.next(Object.assign({}, this.dataStore).datas);\n" +
                "  }\n" +
                "}");

        list.add("remove(id: string): void {\n" +
                "  const items = this.dataStore.datas.out as any[] | undefined;\n" +
                "  if (!items) { return; }\n" +
                "  const before = items.length;\n" +
                "  this.dataStore.datas.out = items.filter(i => i?.id !== id) as any;\n" +
                "  if ((this.dataStore.datas.out as any[]).length !== before) {\n" +
                "    this._data.next(Object.assign({}, this.dataStore).datas);\n" +
                "  }\n" +
                "}");

        list.add("clear(): void {\n" +
                "  const items = this.dataStore.datas.out as any[] | undefined;\n" +
                "  if (items && items.length) {\n" +
                "    items.splice(0, items.length);\n" +
                "    this._data.next(Object.assign({}, this.dataStore).datas);\n" +
                "  }\n" +
                "}");

        // Convenience helpers for common variants
        list.add("success(message: string, options: any = {}): string { return this.show(message, { variant: 'success', ...options }); }");
        list.add("warning(message: string, options: any = {}): string { return this.show(message, { variant: 'warning', ...options }); }");
        list.add("danger(message: string, options: any = {}): string { return this.show(message, { variant: 'danger', ...options }); }");
        list.add("brand(message: string, options: any = {}): string { return this.show(message, { variant: 'brand', ...options }); }");
        list.add("neutral(message: string, options: any = {}): string { return this.show(message, { variant: 'neutral', ...options }); }");

        return list;
    }
}
