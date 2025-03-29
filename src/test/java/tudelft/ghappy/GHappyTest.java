package tudelft.ghappy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void pruebaGsFelices() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx")); // Caso esperado: verdadero
    }

    @Test
    public void pruebaGIndividual() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx")); // Caso esperado: falso
    }

    @Test
    public void pruebaGsSeparadas() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx")); // Caso esperado: falso
    }

    @Test
    public void pruebaTodasGsFelices() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("gggg")); // Caso esperado: verdadero
    }

    @Test
    public void pruebaCadenaVacia() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("")); // Caso esperado: verdadero (sin 'g' no hay problema)
    }

    @Test
    public void pruebaSinGs() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("abcdef")); // Caso esperado: verdadero
    }

    @Test
    public void pruebaGAlInicioYFin() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("gabcdefg")); // Caso esperado: falso
    }

    @Test
    public void pruebaGMayuscula() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxGgGxx")); // No cuenta como 'g' feliz
    }
}
