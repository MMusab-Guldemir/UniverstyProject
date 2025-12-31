import java.lang.classfile.Signature.ThrowableSig;
import java.security.PublicKey;

public class RegistrationService {
    private IRegistrationPolicy registrationPolicy;

    // constructor ile politika belirlenir.
    public RegistrationService(IRegistrationPolicy registrationPolicy){
        this.registrationPolicy = registrationPolicy;
    }

    public Void register(Student student, Course course){
        if(registrationPolicy.canRegister(student, course)){
            course.enroll(student);
        }
    }
}
