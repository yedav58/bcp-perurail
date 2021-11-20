package PeruRail.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmarPagarPage extends PageObject {
    @FindBy(xpath = "//section[@id='compra']/a")
    public WebElement btnResumenCompra;

    @FindBy(xpath = "//div[@class='price-dolar']/span[2]")
    public WebElement lblMontoTotalUSD;

    @FindBy(id = "visa")
    public WebElement rbVisa;
}
