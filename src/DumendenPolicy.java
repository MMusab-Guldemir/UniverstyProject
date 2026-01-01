public class DumendenPolicy implements IRegistrationPolicy{

    @Override
    public boolean canRegister(User user, Course course){
        System.out.println("Dumenden bir ders alma politikasi ben uydurdum");
        return true;
    }
    
}
