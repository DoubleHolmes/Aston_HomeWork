package org.example.lesson15;

import jdk.jfr.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsCheck {
    WebDriver driver;

    @Before
    public void driverSetUp() {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Закрыть всплывающее окно, если оно существует
        try {
            // Ждем появления баннера
            WebElement cookieBanner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cookie__wrapper")));

            // Закрываем баннер
            WebElement closeButton = cookieBanner.findElement(By.className("btn_black"));
            closeButton.click();
        } catch (Exception e) {
            // Игнорируем, если баннер не найден
            System.out.println("Баннер с куки не найден или закрыт");
        }
    }

    @Test
    @Description("Открываем страницу в браузере и ищем заголовок")
    public void testOpen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2")));
        String actualText = text.getText().trim();  // Удаляем лишние пробелы
        Assert.assertEquals("Онлайн пополнение\nбез комиссии", actualText);
    }

    @Test
    @Description("Проверяем наличие логотипа на странице")
    public void testLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")));
        Assert.assertTrue("Логотип не найден!", logo.isDisplayed());
    }

    @Test
    @Description("Проверяем работу ссылки на странице")
    public void testLink() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Находим ссылку
        WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a")));
        String originalUrl = driver.getCurrentUrl(); // Сохраняем URL
        // Клик по ссылке
        link.click();
    }

    @Test
    @Description("Заполняем поля и проверяем работу кнопки Продолжить")
    public void testContinue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Заполнение поля номера телефона
        WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        phoneField.clear(); // Очищаем поле перед вводом
        phoneField.sendKeys("297777777"); // Вводим номер телефона

        // Заполнение поля суммы
        WebElement sumField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-sum")));
        sumField.clear(); // Очищаем поле перед вводом
        sumField.sendKeys("10"); // Вводим сумму

        // Нажатие кнопки "Продолжить"
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pay-connection']/button")));
        continueButton.click();
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Закрытие драйвера
        }
    }
}