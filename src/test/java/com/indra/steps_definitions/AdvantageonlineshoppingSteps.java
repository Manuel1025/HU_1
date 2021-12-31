package com.indra.steps_definitions;

import com.indra.actions.AdvantageonlineshoppingActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AdvantageonlineshoppingSteps {
    @Managed
    WebDriver driver;

    AdvantageonlineshoppingActions advantageonlineshoppingActions = new AdvantageonlineshoppingActions(driver);

    @Given("^que el usuario ingresa a la pagina de inicio$")
    public void queElUsuarioIngresaALaPaginaDeInicio() {
        advantageonlineshoppingActions.open();

    }


    @When("^carga el contenido$")
    public void cargaElContenido() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();


    }

    @Then("^deberia poder ver las diferentes categoria$")
    public void deberiaPoderVerLasDiferentesCategoria() {
        advantageonlineshoppingActions.mostrarTodasLasCategorias();

    }


    //________________________________________________________________//


    @Given("^que el usuario esta en la seccion home de la pagina$")
    public void queElUsuarioEstaEnLaSeccionHomeDeLaPagina() {
        advantageonlineshoppingActions.open();
    }

    @When("^carga el cuerpo  de la pagina$")
    public void cargaElCuerpoDeLaPagina() {
        advantageonlineshoppingActions.esperarCargaDelBanner();

    }

    @Then("^deberia poder ver espacios de publicidad$")
    public void deberiaPoderVerEspaciosDePublicidad() {
        advantageonlineshoppingActions.encontrarEspaciosDePublicidad();
    }


    //------------------------------------------------------//
    @Given("^que el usuario esta en el inicio del portal$")
    public void queElUsuarioEstaEnElInicioDelPortal() {
        advantageonlineshoppingActions.open();
    }

    @When("^carga la cabecera de la pagina$")
    public void cargaLaCabeceraDeLaPagina() {
        advantageonlineshoppingActions.esperarCargaDelBanner();

    }

    @Then("^el usuario deberia poder ver diferentes opciones en el menu$")
    public void elUsuarioDeberiaPoderVerDiferentesOpcionesEnElMenu() {
        advantageonlineshoppingActions.encontrarOpcionesDelMenu();
    }


}
