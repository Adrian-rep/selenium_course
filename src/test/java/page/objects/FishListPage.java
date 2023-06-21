package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage {
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")
    private WebElement AngelfishLink;

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishId(){
        AngelfishLink.click();
    }
}
