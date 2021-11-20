package PeruRail.steps;

import PeruRail.pages.PrincipalPage;
import net.thucydides.core.annotations.Step;

public class PrincipalStep {

    PrincipalPage principalPage;

    @Step("Abrir pagina PeruRail")
    public void AbrirUrl(){
        principalPage.open();
    }
}
