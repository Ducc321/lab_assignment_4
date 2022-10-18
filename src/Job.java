import java.util.List;

public class Job {
    private int jobNumber;
    private Address location;
    private String description;
    private List<Equipment> requiredEquipment;
    private Date plannedDate;
    private static int jobTotal = 0;

    public Job(Address location, String description, List<Equipment> requiredEquipment, Date plannedDate) {
        this.location = location;
        this.description = description;
        this.requiredEquipment = requiredEquipment;
        this.plannedDate = plannedDate;
        ++jobTotal;
        jobNumber = jobTotal;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobNumber=" + jobNumber +
                ", location=" + location +
                ", description='" + description + '\'' +
                ", requiredEquipment=" + requiredEquipment +
                ", plannedDate=" + plannedDate +
                '}';
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public Address getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public List<Equipment> getRequiredEquipment() {
        return requiredEquipment;
    }

    public Date getPlannedDate() {
        return plannedDate;
    }

    public static int getJobTotal() {
        return jobTotal;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(other != null && this.getClass() == other.getClass()) {
            Job that = (Job) other;
            return this.location.equals(that.location) && this.description.equals(that.description) &&
                    this.requiredEquipment.equals(that.requiredEquipment) && this.plannedDate.equals(that.plannedDate);
        }
        return false;
    }
}
