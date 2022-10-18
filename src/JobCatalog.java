import java.util.List;

public class JobCatalog {

    private List<Job> jobs;

    /**
     * Constructor for the class JobCatalog where fields
     * are initialized
     * @param jobs list of jobs
     */
    public JobCatalog(List<Job> jobs) {
        this.jobs = jobs;
    }

    /**
     * returns a human friendly string representation of
     * JobCatalog in the format <JobCatalog{jobs=JOBS}>
     * @return
     */
    @Override
    public String toString() {
        return "JobCatalog{" +
                "jobs=" + jobs +
                '}';
    }

    /**
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(other != null && this.getClass() == other.getClass()) {
            JobCatalog that = (JobCatalog) other;
            return this.jobs.equals(that.jobs);
        }
        return false;
    }


}
