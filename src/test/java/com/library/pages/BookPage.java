package com.library.pages;

import org.openqa.selenium.support.PageFactory;
import com.library.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage {
    public BookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-book']")
    public WebElement books;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement toastMessage;

    public WebElement borrowBookBtn(String book) {
      String xpath = "//td[3][.='" + book + "']";
      //String xpath = "//td[3][.='"+ book +"']/../td/a";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

}
