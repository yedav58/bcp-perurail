package PeruRail.steps;

import PeruRail.pages.ConfirmarPagarPage;
import net.thucydides.core.annotations.Step;

public class ConfirmarPagarStep extends BaseStep{

    ConfirmarPagarPage confirmarPagarPage;

    @Step("obtener monto en resumen de compra")
    public String ObtenerMontoResumenCompra() {
        WaitForElement(confirmarPagarPage.rbVisa);
        String montoTotalUSD = GetTextFromElement(confirmarPagarPage.lblMontoTotalUSD);
        montoTotalUSD=montoTotalUSD.replace("USD", "").trim();
        System.out.println("MontoTOTAL2: "+ montoTotalUSD);
        return montoTotalUSD;
    }



    @Step("comparando montos, Anterior: {0} - Actual: {1}")
    public boolean CompararMontosObtenidos(String montoTotalCabinas, String montoTotalResumenCompra) {

        return montoTotalCabinas.equals(montoTotalResumenCompra);
    }
}
