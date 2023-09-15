package simbir;

import Pages.RegPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegTest {
    @Test

    public void TestDemoqacom(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");

        new RegPage(driver)
                .firstName("John")
                .lastname( "Wick")
                .email("JohnWick5@Gmail.com")
                .gender()
                .mobile("9378888888")
                .dateofBirth()
                .subjects()
                .hobbies()
                .picture()
                .currentAddress()
                .state("Har")
                .city("Kar")
                .submit();
    }
}
