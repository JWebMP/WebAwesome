package com.jwebmp.webawesome.test.toast;

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.client.DynamicData;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataService;
import com.jwebmp.webawesome.components.toast.WaToastDataService;
import com.jwebmp.webawesome.components.toast.WaToastItem;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@NgDataService(value = "WaToastDataServiceTest", listenerName = "WaToastDataServiceTest")
public class WaToastDataServiceTest extends WaToastDataService<WaToastDataServiceTest>
{
    @Override
    public DynamicData getData(AjaxCall<?> call, AjaxResponse<?> response)
    {
        // Seed with a sample toast item
        return new DynamicData().addData(new WaToastItem()
                .setId("seed-1")
                .setMessage("Seed message")
                .setVariant("success")
                .setDuration(3000)
                .setClosable(true));
    }

    @Test
    public void verifiesServiceMethodsAreExposed()
    {
        List<String> methods = methods();
        String all = String.join("\n\n", methods);
        assertTrue(all.contains("show(message: string"), "show() should be included in generated methods");
        assertTrue(all.contains("update(id: string"), "update() should be included in generated methods");
        assertTrue(all.contains("remove(id: string"), "remove() should be included in generated methods");
        assertTrue(all.contains("clear(): void"), "clear() should be included in generated methods");
        assertEquals("any", providedIn(), "Service should be provided in 'any' scope by default");
    }
}
