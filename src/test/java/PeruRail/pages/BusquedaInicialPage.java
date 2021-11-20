package PeruRail.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusquedaInicialPage extends PageObject {

    @FindBy(id = "destinoSelect")
    public WebElement cboDestino;

    @FindBy(id = "salida")
    public WebElement txtFechaSalida;

    @FindBy(id = "regreso")
    public WebElement txtFechaRegreso;

    @FindBy(id = "rutaSelect")
    public WebElement cboRuta;

    @FindBy(id = "cbTrenSelect")
    public WebElement cboTren;

    @FindBy(id = "btn_search")
    public WebElement btnBuscar;

    @FindBy(xpath = "//input[@name='tipo-de-viaje']/../label")
    public WebElement rbOpcionTipoViaje;

    @FindBy(xpath = "//label[@for='oneway']")
    public WebElement rbSoloIda;

    @FindBy(xpath = "//label[@for='roundtrip']")
    public WebElement rbIdaVuelta;

    public String xpathCboRuta = "//select[@id='rutaSelect']";
    public String xpathCboTren = "//select[@id='cbTrenSelect']";
    public String xpathFechaSalida = "//td[@data-handler='selectDay']/a[text()='29']";
    public String xpathFechaIdaVueltaSalida = "//td[@data-handler='selectDay']/a[text()='29']";
    public String xpathFechaIdaVueltaRegreso = "//td[@data-handler='selectDay']/a[text()='30']";
}
