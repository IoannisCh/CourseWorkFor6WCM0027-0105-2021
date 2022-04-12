public class Review extends LoanItem
{
  private final String review;
  
  public Review (String title, int id, boolean onLoan, String targetDate, String review, String type) {
      super(title, id, onLoan, targetDate, type);
      this.review = review;
  }
  
  public String getReview (){
      return review;
  }  
}