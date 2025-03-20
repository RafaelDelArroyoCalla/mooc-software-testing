package tudelft.roman;

public class RomanNumeralTest{
    public static void main(String[] args) {
        RomanNumeral romanNumeral = new RomanNumeral();

        //  No hay validacion de longitud debe convertir correctamente un numero largo
        String num1 = "MMMDCCCLXXXVIII";
        int result1 = romanNumeral.convert(num1);
        System.out.println("Conversión de " + num1 + " = " + result1);

        //  Numero romano invalido XVIIII sabiendo que deberia ser XIX
        String num = "XVIIII";
        int result2 = romanNumeral.convert(num);
        System.out.println("Conversión de " + num + " = " + result2);
    }
}