import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Tests extends TestOptions {

    String Login = "asgasghjd";
    String Password = "1234567890";

    @Description("Loggin test with wrong information")
    @Test()
    public void Test1() {
        open("https://moodpanda.com/Login/");
        login("fasfasf", "fasgsd");
        $("#ContentPlaceHolderContent_MessageError").shouldHave(text("Error:"));
    }

    @Description("Register Account Test")
    @Test()
    public void Test2() {
        open("https://moodpanda.com/Register/");
        register("asgsag", "A", Login, Password);
    }

    @Description("Delete Account")
    @Test
    public void Test3()
    {
        open("https://moodpanda.com/Login/");
        login(Login, Password);
        $("#LinkUpdate").shouldHave(text("Update mood"));
        open("https://moodpanda.com/Account/Delete/");
        $("#ContentPlaceHolderContent_TextBoxPassword").val(Password).pressEnter();
        Test1();
    }
}
