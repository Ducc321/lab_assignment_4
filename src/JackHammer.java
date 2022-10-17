public class JackHammer extends Equipment {

    public JackHammer(String requirements) {
        super(requirements);
    }

    @Override
    public String toString() {
        return "requirement: " + getRequirements();
    }
}
