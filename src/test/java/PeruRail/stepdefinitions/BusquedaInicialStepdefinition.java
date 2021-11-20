package PeruRail.stepdefinitions;

import PeruRail.steps.BusquedaInicialStep;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import net.thucydides.core.annotations.Steps;

public class BusquedaInicialStepdefinition {

    @Steps
    BusquedaInicialStep busquedaInicialStep;

    @Cuando("^realizo busqueda de viaje solo ida$")
    public void realizo_busqueda_de_viaje_solo_ida(DataTable dataTable) {
        busquedaInicialStep.RealizarBusquedaIda(dataTable);
        busquedaInicialStep.Buscar();
    }

    @Cuando("^realizo busqueda de viaje de ida y vuelta$")
    public void realizo_busqueda_de_viaje_de_ida_y_vuelta(DataTable dataTable) {
        busquedaInicialStep.RealizarBusquedaIdaVuelta(dataTable);
        busquedaInicialStep.Buscar();
    }

}
