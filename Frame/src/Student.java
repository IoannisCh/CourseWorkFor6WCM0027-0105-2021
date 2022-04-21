public class Student
{
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
  
  public Student (String fisrtName, String gender, int DOB, String address, 
          int contactNumber, int courses, int toutionBalance, int costOfCourse, 
          int id, String studentID, int review, String title){
      this.title = title;
      this.id = id;
      
     
  }
  
  public String getTitle () {
      return title;
  }
  
  public int getId () {
      return id;
  }

    boolean getOnLoan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
 
}
