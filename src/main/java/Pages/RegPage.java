package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.qameta.allure.Step;

public class RegPage {
    public final ChromeDriver driver;

    public RegPage(ChromeDriver driver) {
        this.driver = driver;
    }

    @Step("Entering a first name")
    public RegPage firstName(String text) {
        WebElement selectFirstName = driver.findElement(By.id("firstName"));
        selectFirstName.sendKeys(text);
        return this;
    }
    @Step("Entering a last name")
    public RegPage lastname(String text) {
        WebElement selectLastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        selectLastName.sendKeys(text);
        return this;
    }
    @Step("Entering a email")
    public RegPage email(String text) {
        WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys(text);
        return this;
    }
    @Step("Gender selection")
    public RegPage gender() {
        WebElement clickGender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
        clickGender.click();
        return this;
    }
    @Step("Entering a mobile number")
    public RegPage mobile(String text) {
        WebElement mobile = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
        mobile.sendKeys(text);
        return this;
    }
    @Step("Entering a date of birth")
    public RegPage dateofBirth() {
        WebElement DateofBirth = driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
        DateofBirth.click();
        WebElement DateofBirthM = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[7]"));
        DateofBirthM.click();
        WebElement DateofBirthY = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[90]"));
        DateofBirthY.click();
        WebElement DateofBirthD = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[4]"));
        DateofBirthD.click();
        return this;
    }
    @Step("Subject selection")
    public RegPage subjects() {
        WebElement subjects = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
        subjects.sendKeys("Engli");
        subjects.sendKeys(Keys.ENTER);
        return this;
    }
    @Step("Hobby selection")
    public RegPage hobbies() {
        WebElement clickHobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
        clickHobbies.click();
        return this;
    }
    @Step("Selecting a picture")
    public RegPage picture() {
        WebElement pictures = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));
        pictures.sendKeys("C:\\Users\\Работа\\IdeaProjects\\SimbirTest\\src\\main\\resources\\img.jpg");
        return this;
    }
    @Step("Entering a address")
    public RegPage currentAddress() {
        WebElement currentaddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentaddress.sendKeys("Penza, Lermontova st., 28");
        return this;
    }
    @Step("State selection")
    public RegPage state(String text) {
        WebElement state = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
        state.sendKeys(text);
        state.sendKeys(Keys.ENTER);
        return this;
    }
    @Step("Select city")
    public RegPage city(String text) {
        WebElement city = driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
        city.sendKeys(text);
        city.sendKeys(Keys.ENTER);
        return this;
    }
    @Step("Enter submit")
    public RegPage submit() {
        WebElement submit = driver.findElement(By.cssSelector("#submit"));
        submit.sendKeys(Keys.ENTER);
        return this;
    }
}