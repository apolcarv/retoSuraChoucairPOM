package StepDefinition;

import co.com.choucair.proyecto.sura.businessControllerQuestions.BusinessControllerComparation;
import co.com.choucair.proyecto.sura.businessControllerWeb.BusinessControllerWeb;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroStep {

    @Steps
    BusinessControllerWeb businessControllerWeb;
    BusinessControllerComparation businessControllerComparation;

    @Given("^que el usuario ingresa a la pagina web para la creacion de una cuenta en automationpractice \"([^\"]*)\" \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPaginaWebParaLaCreacionDeUnaCuentaEnAutomationpractice(String escenario, String funcionalidad) {
        businessControllerWeb.abrirBrowser(escenario, funcionalidad);
        businessControllerComparation.validarHomeUI();
    }


    @When("^ingresa el modulo de registro y llena todo el formulario de datos personas y direccion$")
    public void ingresaElModuloDeRegistroYLlenaTodoElFormularioDeDatosPersonasYDireccion() {
        businessControllerWeb.abrirModuloRegistrarse();
        businessControllerComparation.validartextoCrearCuentaUI();
        businessControllerWeb.ingresarCorreoElectronico();
        businessControllerComparation.validartextoCrearRegistroUI();
        businessControllerWeb.llenarFormularioInformacionPersonal();
        businessControllerWeb.llenarFormularioDireccion();
        businessControllerWeb.crearCuenta();
    }

    @Then("^el usuario crea su cuenta automationpractice con exito$")
    public void elUsuarioCreaSuCuentaAutomationpracticeConExito() {
     businessControllerComparation.validarCuentaCreadaConExitoUI();
    }

    @After
    public void finalizar() {
        businessControllerWeb.cerrarBrowser();
    }
}
