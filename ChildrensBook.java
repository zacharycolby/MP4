import java.lang.String;

public class ChildrensBook extends Book {
    private int recommendedAge;

    public ChildrensBook() {
        super();
        this.recommendedAge = recommendedAge;
    }

    public ChildrensBook(String title, int numPages, int year, String authorName, int recommendedAge) {
        super(title, numPages, year, authorName);
        this.recommendedAge = recommendedAge;
    }

    public int getRecommendedAge() {
        return this.recommendedAge;
    }

    String bookTypeDescription() {
        return "A children's book, good for early readers or parents to read to their kids.";
    }

    public String toString() {
        String str = "\nCHILDREN'S BOOK";
        str += super.toString();
        str += "\nRecommended Age: " + String.valueOf(this.recommendedAge);
        
        return str;
    }
}