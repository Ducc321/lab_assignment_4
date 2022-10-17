public class Torch extends Equipment{
    public Torch(String requirements) {
        super(requirements);
    }

    @Override
    public String toString() {
        return "Torch{requirement: " + getRequirements() + "}";
    }

}
