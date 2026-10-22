public class PrintedBook extends Title{

private int pages;
private int copies;

public PrintedBook(String title, String literatureType, int copies, int pages) {
    super(title, literatureType) ;
    this.pages = pages;
    this.copies = copies;
}

    @Override
    protected double calculatePoints() {
        return pages * convertLiteratureType() * copies ;
    }

}
