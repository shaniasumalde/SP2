public class LibraryLoyaltyCalculator {

    public static void main (String[] args) {

        Author author1 = new Author("Olga Ravn");
        Author author2 = new Author("J.K Rowling");


        author2.addtitle(new PrintedBook("Harry Potter", "SKØN", 120, 670));
        author1.addtitle(new PrintedBook("The Subtle Art Of Not Giving a Fuck", "FAG", 340, 212));
        author1.addtitle(new PrintedBook("Yahya Hassan", "LYRIK", 70, 120));
        author1.addtitle(new PrintedBook("Naruto", "TE", 500, 230 ));






    }




}
