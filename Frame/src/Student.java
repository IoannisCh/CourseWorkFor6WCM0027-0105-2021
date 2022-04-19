
public class Student extends LoanItem {
  private final String student;
  
  public Student (String title, int id, boolean onLoan, String targetDate, String student, String type) {
      super(title, id, onLoan, targetDate, type);
      this.student = student;
  }
  
  public String getStudent (){
      return student;
  }
} 

