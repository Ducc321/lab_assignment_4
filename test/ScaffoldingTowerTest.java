import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScaffoldingTowerTest {

    @Test
    public void testConstructor() {
        ScaffoldingTower test = new ScaffoldingTower("is high");

        assertNotNull(test);
    }

    @Test
    public void testToString() {
        ScaffoldingTower test = new ScaffoldingTower("is high");

        assertEquals("ScaffoldingTower{requirement: is high}", test.toString());
    }

}