package tudelft.mirror;

import static org.junit.Assert.*;
import org.junit.Test;

public class MirrorTest {

    @Test
    public void testMirrorEnds() {
        Mirror mirror = new Mirror();

        // Casos de prueba
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
        assertEquals("a", mirror.mirrorEnds("abca"));
        assertEquals("", mirror.mirrorEnds("abcde"));
        assertEquals("x", mirror.mirrorEnds("x"));
        assertEquals("", mirror.mirrorEnds("xyz"));
    }
}
