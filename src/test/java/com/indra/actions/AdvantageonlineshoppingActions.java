package com.indra.actions;

import com.indra.pages.AdvantageonlineshoppingPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class AdvantageonlineshoppingActions extends AdvantageonlineshoppingPage {
    public AdvantageonlineshoppingActions(WebDriver driver) {
        super(driver);
    }

    public void esperarCargaCompletaDePagina() {
        getEsperaSeccionImagenes().waitUntilPresent();
    }

    public void mostrarTodasLasCategorias() {
        //List<WebElementFacade> categorias = getTodasLasCategorias();
        List<String> list = Arrays.asList(new String[]{"SPEAKERS", "TABLETS", "LAPTOPS", "MICE", "HEADPHONES"});
        int contador = 0 ;

        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < getTodasLasCategorias().size(); k++) {
                if (list.get(i).equals(getTodasLasCategorias().get(k).getText())) {
                    contador++;
                }


            }


        }
        MatcherAssert.assertThat("deben haber 5 coincidencias",
                contador, Matchers.is(5));

    }

    public void esperarCargaDelBanner() {
        getBannerDePublicidad().waitUntilPresent();
    }

    public void encontrarEspaciosDePublicidad() {


        getBannerDePublicidad().waitUntilPresent();
        MatcherAssert.assertThat("el banner deberia estar presente",
                getBannerDePublicidad().isPresent(), Matchers.is(true));

    }

    public void esperarCargaDeCabeceraDeLaPagina() {
        getBannerDePublicidad().waitUntilPresent();
    }

    public void encontrarOpcionesDelMenu() {

        List<String> listaDeOpcionesPredefinidas = Arrays.asList(new String[]{"CONTACT US", "POPULAR ITEMS", "SPECIAL OFFER", "OUR PRODUCTS"});
        int contador3 = 0;
        for (int i = 0; i < listaDeOpcionesPredefinidas.size(); i++) {

            for(int m=0; m<getListaOpcionesMenu().size(); m++){
                if(listaDeOpcionesPredefinidas.get(i).equals(getListaOpcionesMenu().get(m).getText())){
                    contador3++;
                }
            }

        }
        MatcherAssert.assertThat("deben haber 4 coincidencias ",
                listaDeOpcionesPredefinidas.size(), Matchers.is(contador3));
    }
}
