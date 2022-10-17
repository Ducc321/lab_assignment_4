public class ScaffoldingTower extends Equipment{
    @Override
    public String toString() {
        return "ScaffoldingTower{requirement: " + getRequirements() + "}";
    }

    public ScaffoldingTower(String requirements) {
        super(requirements);
    }
}
