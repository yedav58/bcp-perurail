package PeruRail.steps;

import PeruRail.model.MontosBoletoModel;
import PeruRail.pages.SeleccionarTrenPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SeleccionarTrenStep extends BaseStep {

    SeleccionarTrenPage seleccionarTrenPage;

    @Step("Selecciono el tren de ida")
    public void SeleccionarTrenIda(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> keys = dataTable.asMaps(String.class, String.class);
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Map<String, String> stringStringMap = (Map) iterator.next();
            String trenIda = (String) stringStringMap.get("tren_ida");
            System.out.println("Tren de ida: "+seleccionarTrenPage.xpathLblTrainIda.replace("[TREN]", trenIda));
            ClickElementByXpath(seleccionarTrenPage.xpathLblTrainIda.replace("[TREN]", trenIda));
        }

        Thread.sleep(7000);
        String montoTotalTrain = GetTextFromElement(seleccionarTrenPage.lblMontoTotalTrain).replace("USD", "").trim();
        MontosBoletoModel.set_montoTotalEnProcesoUSD(montoTotalTrain);
        System.out.println("El monto capturado es: "+montoTotalTrain);
        ClickElement(seleccionarTrenPage.btnContinuar);
    }

    @Step("Selecciono el tren de ida y vuelta")
    public void SeleccionarTrenIdaVuelta(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> keys = dataTable.asMaps(String.class, String.class);
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Map<String, String> stringStringMap = (Map) iterator.next();
            String trenIda = (String) stringStringMap.get("tren_ida");
            String trenVuelta = (String) stringStringMap.get("tren_vuelta");
            System.out.println("Tren ida: "+trenIda);
            System.out.println("Tren vuelta: "+trenVuelta);
            ClickElementByXpath(seleccionarTrenPage.xpathLblTrainIda);
            ClickElementByXpath(seleccionarTrenPage.xpathLblTrainVuelta);
        }

        Thread.sleep(7000);
        String montoTotalTrain = GetTextFromElement(seleccionarTrenPage.lblMontoTotalTrain).replace("USD", "").trim();
        MontosBoletoModel.set_montoTotalEnProcesoUSD(montoTotalTrain);
        System.out.println("El monto capturado es: "+montoTotalTrain);
        ClickElement(seleccionarTrenPage.btnContinuar);
    }

}
