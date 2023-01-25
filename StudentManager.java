public class StudentManager extends UserManager{
   private User user;
    public StudentManager(User user){
        this.user=user;
    }
    public void add(){
        System.out.println("ÖĞRENCİ EKLENDİ : "+user.getFirstName());
    }
}
