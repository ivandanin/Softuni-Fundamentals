import java.util.*;
import java.util.stream.Collectors;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            articleList.add(article);

        }
        String dataType = scanner.nextLine();
if (dataType.equals("title")) {
    articleList.stream().sorted((article1, article2) -> article1.getTitle().compareTo(article2.getTitle()))
            .forEach(article -> System.out.println(article.toString()));
} else if (dataType.equals("content")) {
    articleList.stream().sorted((article1, article2) -> article1.getContent().compareTo(article2.getContent()))
            .forEach(article -> System.out.println(article.toString()));
}else if (dataType.equals("author")) {
    articleList.stream().sorted((article1, article2) -> article1.getAuthor().compareTo(article2.getAuthor()))
            .forEach(article -> System.out.println(article.toString()));
}
        }

    }
class Article {
       String title;
       String content;
       String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
    }
    }
