package org.example.lesson16;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsCheck {
    private WebDriver driver;
    private HomePage homePage; // Объявление переменной

    @Before
    public void driverSetUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        homePage = new HomePage(driver);
        homePage.closeCookieBanner(); // Закрываем баннер с куками
    }

    @Test
    @Description("Проверка текста в блоке")
    public void testOpen() {
        String actualText = homePage.getHeaderText();
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", actualText);
    }
    @Test
    @Description("Проверяем наличие логотипов на странице")
    public void testLogo() {
        Assert.assertTrue("Логотип не найден!", homePage.isLogoDisplayed());
    }
    @Test
    @Description("Проверяем работу ссылки на странице")
    public void testLink() {
        String originalUrl = homePage.clickLinkAndGetUrl();
    }
    @Test
    @Description("Заполняем поля и проверяем работу кнопки Продолжить")
    public void testContinue() {
        homePage.enterPhoneNumber("297777777");
        homePage.enterSum("10");
        homePage.clickContinueButton(); // Нажимаем кнопку "Продолжить"
    }

    @Test
    @Description("Проверить надписи в незаполненных полях в Услуги связи")
    public void testEmptyField() {
        Assert.assertEquals("Номер телефона", homePage.getPlaceholderPhone());
        Assert.assertEquals("Сумма", homePage.getPlaceholderSum());
        Assert.assertEquals("E-mail для отправки чека", homePage.getPlaceholderEmail());
    }

    @Test
    @Description("Проверить надписи в незаполненных полях в Домашний интернет")
    public void testSelectInternetTabAndVerifyPlaceholders() {
        homePage.selectInternetTabAndVerifyPlaceholders();
    }
    @Test
    @Description("Проверить надписи в незаполненных полях в Рассрочка")
    public void testSelectInstallmentAndVerifyPlaceholders() {
        homePage.selectInstallmentAndVerifyPlaceholders();
    }
    @Test
    @Description("Проверить надписи в незаполненных полях в Задолженность")
    public void testSelectDebitAndVerifyPlaceholders() {
        homePage.selectDebitAndVerifyPlaceholders();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закрытие драйвера
        }
        }
    }