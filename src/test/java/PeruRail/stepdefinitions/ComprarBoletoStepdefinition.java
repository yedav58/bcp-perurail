package PeruRail.stepdefinitions;

import PeruRail.model.MontosBoletoModel;
import PeruRail.pages.DatoPasajeroPage;
import PeruRail.steps.ConfirmarPagarStep;
import PeruRail.steps.DatoPasajeroStep;
import PeruRail.steps.SeleccionarTrenStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComprarBoletoStepdefinition {

    @Steps
    SeleccionarTrenStep seleccionarTrenStep;

    @Steps
    DatoPasajeroStep datoPasajeroStep;

    @Steps
    ConfirmarPagarStep confirmarPagarStep;

    @Cuando("^selecciono tren de ida$")
    public void selecciono_tren_de_ida(DataTable dataTable) throws InterruptedException{
        seleccionarTrenStep.SeleccionarTrenIda(dataTable);
    }

    @Cuando("^selecciono tren de ida y vuelta$")
    public void selecciono_tren_de_ida_y_vuelta(DataTable dataTable) throws InterruptedException{
        seleccionarTrenStep.SeleccionarTrenIdaVuelta(dataTable);
    }

    @Cuando("^completo los datos de los pasajeros$")
    public void completo_los_datos_de_los_pasajeros(DataTable dataTable) throws InterruptedException {
        datoPasajeroStep.CompletarDatosCabina(dataTable);
        datoPasajeroStep.Continuar();
    }

    @Entonces("^verifico los montos obtenidos$")
    public void verifico_los_montos_obtenidos() throws InterruptedException{
        String montoTotalUSDResumenCompra = confirmarPagarStep.ObtenerMontoResumenCompra();
        System.out.println("Monto 01: "+MontosBoletoModel.get_montoTotalEnProcesoUSD());
        System.out.println("Monto 02: "+montoTotalUSDResumenCompra);
//        assertTrue("Los montos son diferentes", MontosBoletoModel.get_montoTotalEnProcesoUSD()==montoTotalUSDResumenCompra);
//        assertTrue("Los montos son iguales",MontosBoletoModel.get_montoTotalEnProcesoUSD()==montoTotalUSDResumenCompra);
        assertEquals(MontosBoletoModel.get_montoTotalEnProcesoUSD(),montoTotalUSDResumenCompra);
    }

}
