public class Lesson extends LoanItem
{
  private String lesson;
  
  public Lesson (String title, int id, boolean onLoan, String targetDate, String lesson, String type) {
      super(title, id, onLoan, targetDate, type);
      this.lesson = lesson;
  }
  
  public String getLesson (){
      return lesson;
  }
}