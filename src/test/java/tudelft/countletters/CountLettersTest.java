package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void testCountLettersBranchCoverage() {
        CountLetters countLetters = new CountLetters();

        // Rama 1: Cuando no es una letra y la ultima letra es 'r' o 's'
        int result = countLetters.count("cats!");
        Assertions.assertEquals(1, result);  // cats debe ser contada

        // Rama 2: Cuando no es una letra y la ultima letra no es 'r' ni 's'
        result = countLetters.count("dog");
        Assertions.assertEquals(0, result);  // No se debe contar ninguna palabra
    }
    @Test
    public void testCountLettersConditionCoverage() {
        CountLetters countLetters = new CountLetters();

        // cuando la letra no es una letra (Character.isLetter es falso) y la ultima letra es 'r'
        int result = countLetters.count("cats!");
        Assertions.assertEquals(1, result);  // cats debe ser contada

        // cuando la letra es una letra y la ultima letra es 'r' o 's'
        result = countLetters.count("cat!");
        Assertions.assertEquals(0, result);  // No se debe contar ninguna palabra
    }

    @Test
    public void testMCDC() {
        CountLetters countLetters = new CountLetters();

        // Caso donde A es verdadero, B es falso
        int result = countLetters.count("cats!");
        Assertions.assertEquals(1, result);

        // Caso donde A es falso, B es verdadero
        result = countLetters.count("dog");
        Assertions.assertEquals(0, result);
    }

}