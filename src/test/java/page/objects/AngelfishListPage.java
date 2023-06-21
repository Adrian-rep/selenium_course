package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelfishListPage {
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(5) > a")
    private WebElement smallAngelfishAddToCartButton;

    public AngelfishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAddToCartSmallAngelfish(){
        smallAngelfishAddToCartButton.click();
    }
}
