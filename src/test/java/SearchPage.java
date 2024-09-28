import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private final ElementsCollection articleTitle = $$x("//h2//a");

    /*
        Returns href from first article
     */
    public String getHrefFromFirstArticle() {
        return articleTitle.first().getAttribute("href");
    }
}
