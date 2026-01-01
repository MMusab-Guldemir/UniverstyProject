public class RegistrationService {
    private IRegistrationPolicy registrationPolicy;

    //constructor ile politika belirlenir
    public RegistrationService(IRegistrationPolicy registrationPolicy) {
        this.registrationPolicy = registrationPolicy;
    }

    public void register(Student student, Course course) {
        if(registrationPolicy.canRegister(student, course)){
            course.enroll(student);
        }
    }
}
