import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ShouldHaveText {

    @BeforeEach
    void Configuration() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void ShouldHaveText() {
        open("https://github.com/selenide/selenide");
        $("[class='list-style-none d-flex flex-wrap mb-n2']").$$("li").first().hover();
        $("[class='d-flex flex-column width-fit']").shouldHave(text("Andrei Solntsev")).shouldHave(text("Tallinn, Estonia"));
    }
}
