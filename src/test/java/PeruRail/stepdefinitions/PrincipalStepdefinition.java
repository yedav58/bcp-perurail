package PeruRail.stepdefinitions;

import PeruRail.steps.PrincipalStep;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class PrincipalStepdefinition {

    @Steps
    PrincipalStep principalStep;

    @Dado("^ingreso a la pagina de PeruRail$")
    public void ingreso_a_la_pagina_de_PeruRail() {
        principalStep.AbrirUrl();
    }

}
