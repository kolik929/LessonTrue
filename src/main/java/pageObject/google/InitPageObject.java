package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base {
    public InitPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//form//input[@title='Поиск' and @aria-label]")
    private WebElement searchText;

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;

    /**
     * Вводим текст в строку поиска.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(searchText, text);
    }

    public void clickSubmitSearch() {
        click(submitSearch);
    }

    public void setAndClick(String text){
        setSearchText(text);
        clickSubmitSearch();
    }
}
