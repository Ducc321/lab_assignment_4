import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteMixerTest {


    @Test
    void testConstructor() {
        ConcreteMixer test = new ConcreteMixer("must contain concrete");

        assertNotNull(test);
    }

    @Test
    void testToString() {
        ConcreteMixer test = new ConcreteMixer("has to be round");

        assertEquals("requirements: has to be round", test.toString());
    }

    @Test
    void testGetRequirements() {
        ConcreteMixer test = new ConcreteMixer("must be big");

        assertEquals("must be big", test.getRequirements());
    }
}