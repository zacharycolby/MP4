public class AudioBook extends Book {
    private int minutes;

    public AudioBook() {
        super();
        this.minutes = 0;
    }

    public AudioBook(String title, int numPages, int year, String authorName, int minutes) {
        super(title, numPages, year, authorName);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return this.minutes;
    }

    String bookTypeDescription() {
        return "Good for readers who want to read in the background and multitask.";
    }

    public String toString() {
        String str = "\nAUDIOBOOK";
        str += super.toString();
        str += "\nMinutes: " + String.valueOf(this.minutes);

        return str;
    }

}