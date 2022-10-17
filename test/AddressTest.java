import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class AddressTest {

    @org.junit.jupiter.api.Test
    void testConstructor() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertNotNull(test);
    }


    @Test
    void testToString() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals("<Address: <Street: Wederik> <Number: 34> <Zip Code: 2811 RK> <City: Reeuwijk>>", test.toString());
    }

    @Test
    void testEqualsTrue() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");
        Address test1 = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals(test, test1);
    }

    @Test
    void testEqualsFalse() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");
        Address test1 = new Address("Street", 123, "1234 HS", "Town");

        assertNotEquals(test, test1);
    }


    @Test
    void getStreet() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals("Wederik", test.getStreet());
    }

    @Test
    void getNumber() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals(34, test.getNumber());
    }

    @Test
    void getZipCode() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals("2811 RK", test.getZipCode());
    }

    @Test
    void getCity() {
        Address test = new Address("Wederik", 34, "2811 RK", "Reeuwijk");

        assertEquals("Reeuwijk", test.getCity());
    }
}
