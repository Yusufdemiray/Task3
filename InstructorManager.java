public class InstructorManager extends UserManager{
   private User user;
    public InstructorManager(User user){
        this.user=user;
    }
    public void add(){
        System.out.println("EĞİTMEN EKLENDİ : "+user.getFirstName());

    }

}
