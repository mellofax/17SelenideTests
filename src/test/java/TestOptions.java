import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestOptions {
    public void open(String url)
    {
        Selenide.open(url);
    }
    public void login(String Login, String Password)
    {
        $("#ContentPlaceHolderContent_TextBoxEmail").val(Login);
        $("#ContentPlaceHolderContent_TextBoxPassword").val(Password).pressEnter();
    }
    public void register(String name, String initial, String email, String password)
    {
        $("#ContentPlaceHolderContent_TextBoxFirstName").val(name);
        $("#ContentPlaceHolderContent_TextBoxSurname").val(initial);
        $("#ContentPlaceHolderContent_DropDownListYearOfBirth").selectOption(10);
        $("#ContentPlaceHolderContent_TextBoxEmail").val(email);
        $("#ContentPlaceHolderContent_TextBoxPassword").val(password);
        $("#ContentPlaceHolderContent_TextBoxPasswordConfirm").val(password).pressEnter();
        open("https://moodpanda.com/");
        $("#LinkUpdate").shouldHave(text("Update mood"));
    }
}
