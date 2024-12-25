package org.example.lesson16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Элементы страницы
    private By cookieBanner = By.className("cookie__wrapper");
    private By closeButton = By.className("btn_black");
    private By headerText = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2");
    private By logo = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul");
    private By link = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a");

    // Элементы для теста "Продолжить"
    private By phoneField = By.id("connection-phone");
    private By sumField = By.id("connection-sum");
    private By continueButton = By.xpath("//*[@id='pay-connection']/button");

    // Проверка надписей в полях Услуги связи
    private By placeholderPhone = By.xpath("//*[@id=\"connection-phone\"]");
    private By placeholderSum = By.xpath("//*[@id=\"connection-sum\"]");
    private By placeholderEmail = By.xpath("//*[@id=\"connection-email\"]");

    // Проверка надписей в полях Домашний интернет
    private By placeholderPhone1 = By.xpath("//*[@id=\"internet-phone\"]");
    private By placeholderSum1 = By.xpath("//*[@id=\"internet-sum\"]");
    private By placeholderEmail1 = By.xpath("//*[@id=\"internet-email\"]");

    // Проверка надписей в полях Рассрочка
    private By placeholderNumber = By.xpath("//*[@id=\"score-instalment\"]");
    private By placeholderSum2 = By.xpath("//*[@id=\"instalment-sum\"]");
    private By placeholderEmail2 = By.xpath("//*[@id=\"instalment-email\"]");

    // Проверка надписей в полях Задолженность
    private By placeholderNumber1 = By.xpath("//*[@id=\"score-arrears\"]");
    private By placeholderSum3 = By.xpath("//*[@id=\"arrears-sum\"]");
    private By placeholderEmail3 = By.xpath("//*[@id=\"arrears-email\"]");

    // Конструктор
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Метод для закрытия баннера с куками
    public void closeCookieBanner() {
        try {
            WebElement banner = wait.until(ExpectedConditions.visibilityOfElementLocated(cookieBanner));
            WebElement button = banner.findElement(closeButton);
            button.click();
        } catch (Exception e) {
            System.out.println("Баннер с куки не найден или закрыт");
        }
    }

    // Метод для получения заголовка
    public String getHeaderText() {
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(headerText));
        return textElement.getText().trim();
    }
    // Новый метод для проверки наличия логотипа
    public boolean isLogoDisplayed() {
        WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
        return logoElement.isDisplayed();
    }
    // Новый метод для работы со ссылкой
    public String clickLinkAndGetUrl() {
        WebElement linkElement = wait.until(ExpectedConditions.visibilityOfElementLocated(link));
        String originalUrl = driver.getCurrentUrl(); // Сохраняем текущий URL
        linkElement.click(); // Клик по ссылке
        return originalUrl; // Возвращаем сохраненный URL
    }
    // Новый метод для заполнения поля телефона
    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneElement = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField));
        phoneElement.clear();
        phoneElement.sendKeys(phoneNumber);
    }

    // Новый метод для заполнения поля суммы
    public void enterSum(String sum) {
        WebElement sumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(sumField));
        sumElement.clear();
        sumElement.sendKeys(sum);
    }

    // Новый метод для нажатия кнопки "Продолжить"
    public void clickContinueButton() {
        WebElement continueElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueElement.click();
    }

    // Методы для "Услуги связи"

    public String getPlaceholderPhone() {
        return getPlaceholderText(placeholderPhone);
    }
    public String getPlaceholderSum() {
        return getPlaceholderText(placeholderSum);
    }
    public String getPlaceholderEmail() {
        return getPlaceholderText(placeholderEmail);
    }

    // Методы для "Домашний интернет"

    public String getPlaceholderPhone1() {
        return getPlaceholderText(placeholderPhone1);
    }
    public String getPlaceholderSum1() {
        return getPlaceholderText(placeholderSum1);
    }
    public String getPlaceholderEmail1() {
        return getPlaceholderText(placeholderEmail1);
    }

public void selectInternetTabAndVerifyPlaceholders() {
    By buttonLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");    // Локатор для кнопки, открывающей меню
    By menuItemLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");    // Локатор для элемента в меню
    WebElement button = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator)); // Ожидание, пока кнопка станет кликабельной и клик
    button.click();
    WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(menuItemLocator)); // Ожидание, пока нужный пункт меню станет кликабельным
    menuItem.click();
    // Проверка плейсхолдеров
    Assert.assertEquals("Номер абонента", getPlaceholderPhone1());
    Assert.assertEquals("Сумма", getPlaceholderSum1());
    Assert.assertEquals("E-mail для отправки чека", getPlaceholderEmail1());
}

// Методы для "Рассрочка"

    public String getPlaceholderNumber() {
        return getPlaceholderText(placeholderNumber);
    }
    public String getPlaceholderSum2() {
        return getPlaceholderText(placeholderSum2);
    }
    public String getPlaceholderEmail2() {
        return getPlaceholderText(placeholderEmail2);
    }

    public void selectInstallmentAndVerifyPlaceholders() {
        By buttonLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
        By menuItemLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p"); // Локатор для третьего элемента в меню
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
        button.click();
        WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(menuItemLocator));
        menuItem.click();
        // Проверка плейсхолдеров
        Assert.assertEquals("Номер счета на 44", getPlaceholderNumber());
        Assert.assertEquals("Сумма", getPlaceholderSum2());
        Assert.assertEquals("E-mail для отправки чека", getPlaceholderEmail2());
    }

    // Методы для "Задолженность"

    public String getPlaceholderNumber1() {
        return getPlaceholderText(placeholderNumber1);
    }
    public String getPlaceholderSum3() {
        return getPlaceholderText(placeholderSum3);
    }
    public String getPlaceholderEmail3() {
        return getPlaceholderText(placeholderEmail3);
    }

    public void selectDebitAndVerifyPlaceholders() {

        By buttonLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button");
        By menuItemLocator = By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p"); // Локатор для четвертого элемента в меню
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
        button.click();
        WebElement menuItem = wait.until(ExpectedConditions.elementToBeClickable(menuItemLocator));
        menuItem.click();
        // Проверка плейсхолдеров
        Assert.assertEquals("Номер счета на 2073", getPlaceholderNumber1());
        Assert.assertEquals("Сумма", getPlaceholderSum3());
        Assert.assertEquals("E-mail для отправки чека", getPlaceholderEmail3());
    }




    // Общий метод для получения текста плейсхолдера
    private String getPlaceholderText(By locator) {
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return textElement.getAttribute("placeholder").trim();
    }

}