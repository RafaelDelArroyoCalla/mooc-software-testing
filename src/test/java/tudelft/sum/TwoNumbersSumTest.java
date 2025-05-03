package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class TwoNumbersSumTest {
    @Test
    public void testAddTwoNumbers() {
        TwoNumbersSum sum = new TwoNumbersSum();

        // Caso de prueba 1: Suma normal
        ArrayList<Integer> first1 = new ArrayList<>();
        first1.add(1);
        first1.add(2);
        ArrayList<Integer> second1 = new ArrayList<>();
        second1.add(3);
        second1.add(4);
        ArrayList<Integer> result1 = sum.addTwoNumbers(first1, second1);
        ArrayList<Integer> expected1 = new ArrayList<>();
        expected1.add(4);
        expected1.add(6);
        Assertions.assertEquals(expected1, result1);

        // Caso de prueba 2: Suma con acarreo
        ArrayList<Integer> first2 = new ArrayList<>();
        first2.add(9);
        first2.add(9);
        ArrayList<Integer> second2 = new ArrayList<>();
        second2.add(1);
        ArrayList<Integer> result2 = sum.addTwoNumbers(first2, second2);
        ArrayList<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(0);
        expected2.add(0);
        Assertions.assertEquals(expected2, result2);

        // Caso de prueba 3: Diferentes longitudes
        ArrayList<Integer> first3 = new ArrayList<>();
        first3.add(1);
        ArrayList<Integer> second3 = new ArrayList<>();
        second3.add(9);
        second3.add(9);
        ArrayList<Integer> result3 = sum.addTwoNumbers(first3, second3);
        ArrayList<Integer> expected3 = new ArrayList<>();
        expected3.add(1);
        expected3.add(0);
        Assertions.assertEquals(expected3, result3);

        // Caso de prueba 4: Una lista vacia
        ArrayList<Integer> first4 = new ArrayList<>();
        ArrayList<Integer> second4 = new ArrayList<>();
        second4.add(5);
        second4.add(6);
        second4.add(7);
        ArrayList<Integer> result4 = sum.addTwoNumbers(first4, second4);
        ArrayList<Integer> expected4 = new ArrayList<>();
        expected4.add(5);
        expected4.add(6);
        expected4.add(7);
        Assertions.assertEquals(expected4, result4);
    }
}
