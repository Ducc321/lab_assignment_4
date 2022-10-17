import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JackHammerTest {

    @Test
    void testToString() {
        JackHammer test = new JackHammer("must hit hard");

        assertEquals("requirement: must hit hard", test.toString());
    }

    @Test
    void testConstructor() {
        JackHammer test = new JackHammer("must hit hard");

        assertNotNull(test);
    }
}