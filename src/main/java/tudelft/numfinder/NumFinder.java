package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;
    //Error en la estructura de la condicional
    public void find(int[] nums) {
        for(int n : nums) {
            if(n < smallest)
                smallest = n;
            if (n > largest)
                largest = n;

        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
