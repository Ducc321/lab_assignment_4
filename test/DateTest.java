import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testToString() {
        Date testDate = new Date(17, 9, 2003);

        assertEquals("Date{day=17, month=9, year=2003}", testDate.toString());
    }

    @Test
    void testEqualsTrue() {
        Date testDate = new Date(17, 9, 2003);
        Date testDate1 = new Date(17, 9, 2003);

        assertTrue(testDate.equals(testDate1));
    }

    @Test
    void testEqualsFalse() {
        Date testDate = new Date(17, 9, 2003);
        Date testDate1 = new Date(16, 9, 2003);

        assertFalse(testDate.equals(testDate1));
    }
}