import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideTest {

    @BeforeEach
    void Configuration() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void SearchSelenideTest() {
        open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$("a").click();
        $("[class='flex-auto min-width-0 width-fit mr-3']").shouldHave(text("selenide / selenide"));
    }
}
