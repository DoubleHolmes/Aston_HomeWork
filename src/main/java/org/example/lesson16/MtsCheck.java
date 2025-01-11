package org.example.lesson16;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
//    @Test
//    @Description("Заполняем поля и проверяем работу кнопки Продолжить")
//    public void testContinue() {
//        homePage.enterPhoneNumber("297777777");
//        homePage.enterSum("10");
//        homePage.clickContinueButton(); // Нажимаем кнопку "Продолжить"
//    }

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


    // 2 часть задания.
    // Для "Услуги связи" заполнить поля в соответствии с реквизитами, нажать кнопку "Продолжить"
    // и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке)
    // номер телефона, а так же надписи в незаполненных полях для ввода реквизитов карты, наличие иконок платежных систем.

    @Test
    @Description("Заполняем поля и проверяем работу кнопки Продолжить")
    public void testContinue() {
        homePage.enterPhoneNumber("297777777");
        homePage.enterSum("10");
        homePage.clickContinueButton(); // Нажимаем кнопку "Продолжить"

        // Переключаемся на фрейм
        homePage.setFrame(); // Вызов метода для переключения на iframe

        // Проверки внутри фрейма
        String expectedAmount = "10.00 BYN";
        String expectedPhoneNumber = "Оплата: Услуги связи Номер:375297777777";

        homePage.verifyDisplayedAmount(expectedAmount);
        homePage.verifyButtonText("Оплатить " + expectedAmount);
        homePage.verifyPaymentNumber(expectedPhoneNumber);

        homePage.verifyLabel("cardNumber", "Номер карты");
        homePage.verifyLabel("period", "Срок действия");
        homePage.verifyLabel("cvc", "CVC");
        homePage.verifyLabel("name", "Имя держателя (как на карте)");

        homePage.verifyLogosPresent();

        // Возвращаемся к основному контенту, если это необходимо
        driver.switchTo().defaultContent();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закрытие драйвера
        }
        }
    }