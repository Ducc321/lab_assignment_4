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

        assertEquals("Job{jobNumber=1, location=Address{street='Wederik', number=34, zipCode='2811 RK', city='Reeuwijk'}, description='do the work for me', requiredEquipment=[requirements: is big], plannedDate=Date{day=17, month=9, year=2003}}", test.toString());
    }


    @Test
    void testEqualsTrue() {
        List<Equipment> testList = new LinkedList<>();
        testList.add(new ConcreteMixer("is big"));
        Job test = new Job(new Address("Wederik", 34, "2811 RK", "Reeuwijk"), "do the work for me", testList, new Date(17, 9, 2003));

        Job test1 = new Job(new Address("Wederik", 34, "2811 RK", "Reeuwijk"), "do the work for me", testList, new Date(17, 9, 2003));

        assertTrue(test.equals(test1));
    }

    @Test
    void testEqualsFalse() {
        List<Equipment> testList = new LinkedList<>();
        testList.add(new ConcreteMixer("is big"));
        Job test = new Job(new Address("Wederik", 34, "2811 RK", "Reeuwijk"), "do the work for me", testList, new Date(17, 9, 2003));

        Job test1 = new Job(new Address("Street", 34, "2811 RB", "Reeuwijk"), "do the work for me", testList, new Date(17, 9, 2003));

        assertFalse(test.equals(test1));
    }




}