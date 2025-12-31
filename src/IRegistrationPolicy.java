public interface IRegistrationPolicy {
    // dersi alabilr mi diye kontrol eden metod
    boolean canRegister(User user, Course course);
}
