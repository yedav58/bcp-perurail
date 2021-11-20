package PeruRail.steps;

import PeruRail.pages.DatoPasajeroPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DatoPasajeroStep extends BaseStep{

    DatoPasajeroPage datoPasajeroPage;

    @Step("completo datos del pasajero")
    public void CompletarDatosCabina(DataTable dataTable) {

        List<Map<String, String>> keys = dataTable.asMaps(String.class, String.class);
        Iterator iterator = keys.iterator();
        int contador = 1;
        while (iterator.hasNext()) {

            if (contador != 1)
                ClickElementByXpath(
                        datoPasajeroPage.xpathTituloPasajero.replace("[INDICE]", String.valueOf(contador)));

            Map<String, String> stringStringMap = (Map) iterator.next();
            String nombre = (String) stringStringMap.get("nombre");
            String apellido = (String) stringStringMap.get("apellido");
            String fechaNacimiento = (String) stringStringMap.get("fec_nac");
            String nacionalidad = (String) stringStringMap.get("nacionalidad");
            String tipoDocumento = (String) stringStringMap.get("tipo_doc");
            String numeroDocumento = (String) stringStringMap.get("numero_doc");
            String sexo = (String) stringStringMap.get("sexo");
            String telefono = (String) stringStringMap.get("telefono");
            String email = (String) stringStringMap.get("email");
            String recieveOffers = (String) stringStringMap.get("recieve_offers");

            SendKeysByXpath(datoPasajeroPage.xpathTxtNombre.replace("[INDICE]", String.valueOf(contador)), nombre);
            SendKeysByXpath(datoPasajeroPage.xpathTxtApellido.replace("[INDICE]", String.valueOf(contador)),
                    apellido);

            ClickElementByXpath(datoPasajeroPage.xpathTxtFecNac.replace("[INDICE]", String.valueOf(contador)));
            ClickElementByXpath(datoPasajeroPage.xpathFecNacOpcion1);

            SelectComboTextByXpath(
                    datoPasajeroPage.xpathCboNacionalidad.replace("[INDICE]", String.valueOf(contador)),
                    nacionalidad);
            SelectComboTextByXpath(datoPasajeroPage.xpathCboTipoDoc.replace("[INDICE]", String.valueOf(contador)),
                    tipoDocumento);

            SendKeysByXpath(datoPasajeroPage.xpathTxtNumeroDoc.replace("[INDICE]", String.valueOf(contador)),
                    numeroDocumento);

            SelectComboTextByXpath(datoPasajeroPage.xpathCboSexo.replace("[INDICE]", String.valueOf(contador)), sexo);
            SendKeysByXpath(datoPasajeroPage.xpathTxtTelefono.replace("[INDICE]", String.valueOf(contador)),
                    telefono);
            SendKeysByXpath(datoPasajeroPage.xpathTxtEmail.replace("[INDICE]", String.valueOf(contador)), email);
            SendKeysByXpath(datoPasajeroPage.xpathTxtConfirmEmail.replace("[INDICE]", String.valueOf(contador)),
                    email);

            if (recieveOffers.equals("true")) {
                ClickElementByXpath(
                        datoPasajeroPage.xpathChkRecieveOffers.replace("[INDICE]", String.valueOf(contador)));
            }

            contador++;
        }

    }

    @Step("Doy click a Continue")
    public void Continuar() {
        ClickElement(datoPasajeroPage.btnContinuar);
    }

}
