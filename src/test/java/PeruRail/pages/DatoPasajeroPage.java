package PeruRail.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatoPasajeroPage extends PageObject {

    @FindBy(id = "enviarPago")
    public WebElement btnContinuar;

    public String xpathTxtNombre = "//input[@id='formPasajero[INDICE]-nomPasajero']";
    public String xpathTxtApellido = "//input[@id='formPasajero[INDICE]-apePasajero']";
    public String xpathTxtFecNac = "//input[@id='formPasajero[INDICE]-fecNacimiento']";
    public String xpathFecNacOpcion1 = "//table[@id='tlb_calendario']/tbody/tr/td/a[text()='1']";

    public String xpathCboNacionalidad = "//select[@id='formPasajero[INDICE]-idPais']";
    public String xpathCboTipoDoc = "//select[@id='formPasajero[INDICE]-idDocumentoIdentidad']";
    public String xpathTxtNumeroDoc = "//input[@id='formPasajero[INDICE]-numDocumentoIdentidad']";
    public String xpathCboSexo = "//select[@id='formPasajero[INDICE]-idSexo']";
    public String xpathTxtTelefono = "//input[@id='formPasajero[INDICE]-numTelefono']";
    public String xpathTxtEmail = "//input[@id='formPasajero[INDICE]-desEmail']";
    public String xpathTxtConfirmEmail = "//input[@id='formPasajero[INDICE]-desEmailConfirmacion']";
    public String xpathChkRecieveOffers = "//input[@id='formPasajero[INDICE]-recibirNovedades']";

    public String xpathTituloPasajero = "//span[text()='ADULT']/../span[text()=' [INDICE]']";

}
