import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void testToString() {
        List<Equipment> testList = new LinkedList<>();
        testList.add(new ConcreteMixer("is big"));
        Job test = new Job(new Address("Wederik", 34, "2811 RK", "Reeuwijk"), "do the work for me", testList, new Date(17, 9, 2003));

        assertEquals("Job{jobNumber=1, location=Address{street=Wederik, number=34, zipCode=2811 RK, city=Reeuwijk}, description=do the work for me, requiredEquipment=" + testList.toString() + ", plannedDate=Date{day=17, month=9, year=2003}", test.toString());
    }


    @Test
    void testEquals() {
    }
}