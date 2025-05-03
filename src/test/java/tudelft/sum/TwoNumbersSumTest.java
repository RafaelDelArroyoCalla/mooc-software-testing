package tudelft.sum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class TwoNumbersSumTest {

    @Test
    void testAddTwoNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();

        // Caso 1: Sumar 12 + 34
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(3);
        second.add(4);

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(6);

        assertEquals(expected, result);

        // Caso 2: Sumar 9 + 1 (con acarreo)
        first.clear();
        second.clear();

        first.add(9);
        second.add(1);

        result = sum.addTwoNumbers(first, second);
        expected.clear();
        expected.add(1);
        expected.add(0);

        assertEquals(expected, result);
    }
}
