package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageonlineshoppingPage extends PageObject {
    public AdvantageonlineshoppingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='hrefUserIcon']")
    private WebElementFacade esperaSeccionImagenes;

    @FindBy(xpath = "//span[@class='shop_now roboto-bold ng-binding']")
    private List<WebElement> todasLasCategorias;
    @FindBy(xpath = "//div[@class='slider']//div[@class='imgContainer']")
    private List<WebElement> espacioPublicidad;
    @FindBy(xpath = "//article[@id='slider_explore_now']")
    private WebElementFacade espacioDelBanner;

    @FindBy(xpath = "//article[@id='slider_explore_now']//button[@class='ng-scope']")
    private WebElementFacade textoDelBanner;



    @FindBy(xpath = "//li[@class='nav-li-Links']//a")
    private  List<WebElement> listaOpcionesMenu;

    public List<WebElement> getListaOpcionesMenu() {
        return listaOpcionesMenu;
    }

    public WebElementFacade getBannerDePublicidad() {
        return bannerDePublicidad;
    }

    @FindBy(xpath = "//article[@id='slider_explore_now']")
    private WebElementFacade bannerDePublicidad;



    public WebElementFacade getTextoDelBanner() {
        return textoDelBanner;
    }

    public WebElementFacade getEspacioDelBanner() {
        return espacioDelBanner;
    }




    public List<WebElement> getEspacioPublicidad() {
        return espacioPublicidad;
    }



    public List<WebElement> getTodasLasCategorias() {
        return todasLasCategorias;
    }

    public WebElementFacade getEsperaSeccionImagenes() {
        return esperaSeccionImagenes;
    }

}
