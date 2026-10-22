public class AudioBook extends Title{

    private int durationiInMinutes;
    private int copies;

   public AudioBook(String title, String literatureType,int copies, int durationiInMinutes) {
       super(title, literatureType);
       this.copies = copies;
       this.durationiInMinutes = durationiInMinutes;
   }

    @Override
    protected double calculatePoints() {
        return (durationiInMinutes * 0.5) * convertLiteratureType() * copies ;
    }

}
