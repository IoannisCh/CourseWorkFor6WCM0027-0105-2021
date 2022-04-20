public class LoanItem
{
  private boolean onLoan;
  private String targetDate;
  private String type;
  private String firstName;
  private String gender;
  private int DOB;
  private String address;
  private int contactNumber;
  private int courses;
  private static int tuitionBalance = 0;
  private static int costOfCourse = 100;
  private static int id = 1000;
  private String studentID;
  private int review;
  private String title;
  
  public LoanItem (String title, int id, boolean onLoan, String targetDate, String type){
      this.title = title;
      this.id = id;
      this.onLoan = onLoan;
      this.targetDate = targetDate;
      this.type = type;
  }
  
  public String getTitle () {
      return title;
  }
  
  public int getId () {
      return id;
  }
  
  public boolean getOnLoan (){
      return onLoan;
  }
  
  public String getTargetDate () {
      return targetDate;
  }
  
  public String getType() {
      return type;
  }
}
