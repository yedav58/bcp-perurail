package PeruRail.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleccionarTrenPage extends PageObject {
    @FindBy(id = "text_btn_search")
    public WebElement btnBuscar;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement btnContinuar;

    @FindBy(xpath = "//div[@class='price-dolar']/span[2]")
    public WebElement lblMontoTotalTrain;


    public String xpathLblTrainIda = "//div[contains(@class,'servicioIdaTripPR') and contains(text(),'[TREN]')]";
    public String xpathLblTrainSalida = "//div[contains(text(),'Expedition 32 (Poroy)')]";
    public String xpathLblTrainSalida01 = "//html/body/section/section[2]/div[2]/div[1]/div[4]/div[1]/div/div[2]/div[3]/div[1]";
    public String xpathLblTrainVuelta = "((//div[@indTramo='RET']/div[1][text()='[TREN]  ']/../div[3])[last()])";

}
