package PeruRail.steps;

import PeruRail.pages.BusquedaInicialPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BusquedaInicialStep extends BaseStep{

    BusquedaInicialPage busquedaInicialPage;

    @Step("Realizo busqueda de viaje solo ida")
    public void RealizarBusquedaIda(DataTable dataTable) {

        List<Map<String, String>> keys = dataTable.asMaps(String.class, String.class);
        Iterator iterator = keys.iterator();

        String destino = null, ruta = null, tren = null;

        while (iterator.hasNext()) {
            Map<String, String> stringStringMap = (Map) iterator.next();
            destino = (String) stringStringMap.get("destino");
            ruta = (String) stringStringMap.get("ruta");
            tren = (String) stringStringMap.get("tren");
        }

        ClickElement(busquedaInicialPage.rbSoloIda);
        SelectCombo(busquedaInicialPage.cboDestino, destino);
        SelectComboTextByXpath(busquedaInicialPage.xpathCboRuta, ruta);

        if (!tren.equals(""))
            SelectComboTextByXpath(busquedaInicialPage.xpathCboTren, tren);

        ClickElement(busquedaInicialPage.txtFechaSalida);
        ClickElementByXpath(busquedaInicialPage.xpathFechaSalida);
    }

    @Step("Realizo busqueda de viaje ida y vuelta")
    public void RealizarBusquedaIdaVuelta(DataTable dataTable) {

        List<Map<String, String>> keys = dataTable.asMaps(String.class, String.class);
        Iterator iterator = keys.iterator();

        String destino = null, ruta = null;

        while (iterator.hasNext()) {
            Map<String, String> stringStringMap = (Map) iterator.next();
            destino = (String) stringStringMap.get("destino");
            ruta = (String) stringStringMap.get("ruta");
        }

        ClickElement(busquedaInicialPage.rbIdaVuelta);
        SelectCombo(busquedaInicialPage.cboDestino, destino);
        SelectComboTextByXpath(busquedaInicialPage.xpathCboRuta, ruta);

        ClickElement(busquedaInicialPage.txtFechaSalida);
        ClickElementByXpath(busquedaInicialPage.xpathFechaIdaVueltaSalida);

        ClickElement(busquedaInicialPage.txtFechaRegreso);
        ClickElementByXpath(busquedaInicialPage.xpathFechaIdaVueltaRegreso);

    }

    @Step("Doy click a Buscar")
    public void Buscar() {
        ClickElement(busquedaInicialPage.btnBuscar);
    }

}
