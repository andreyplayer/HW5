import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitEnterpriseHoverTest {
    String expectedRes = "Build like the best";

    @Test
    void gitEnterpriseHoverTest() {
        open("http://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".font-mktg").should(text(expectedRes));
        sleep(5000);
    }}
