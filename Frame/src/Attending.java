public class Attending extends LoanItem
{
  private final String lesson;
  
  public Attending (String title, int id, boolean onLoan, String targetDate, String lesson, String type) {
      super(title, id, onLoan, targetDate, type);
      this.lesson = lesson;
  }
  
  public String getAttending (){
      return lesson;
  }
}