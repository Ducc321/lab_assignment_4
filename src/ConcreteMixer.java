public class ConcreteMixer extends Equipment{

    public ConcreteMixer(String requirements) {
        super(requirements);
    }

    public String toString() {
        return "requirements: " + getRequirements();
    }
}
