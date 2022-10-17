import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TorchTest {

    @Test
    void testConstructor() {
        Torch test = new Torch("must give light");

        assertNotNull(test);
    }

    @Test
    void testToString() {
        Torch test = new Torch("must give light");

        assertEquals("Torch{requirement: must give light}", test.toString());
    }


}