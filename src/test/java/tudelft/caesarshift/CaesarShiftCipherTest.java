package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CaesarShiftCipherTest {

    @Test
    public void cifradoBasico() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "abc" con un desplazamiento de 3 deberia convertirse en "def"
        String resultado = cifrador.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", resultado);
    }

    @Test
    public void cifradoConDesplazamientoNegativo() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "def" con un desplazamiento de -3 deberia volver a "abc"
        String resultado = cifrador.CaesarShiftCipher("def", -3);
        Assertions.assertEquals("abc", resultado);
    }

    @Test
    public void cifradoConRetornoAlInicio() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "xyz" con un desplazamiento de 3 deberia regresar al inicio del alfabeto y convertirse en "abc"
        String resultado = cifrador.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", resultado);
    }

    @Test
    public void cifradoConRetornoAlFinal() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "abc" con un desplazamiento de -3 deberia ir al final del alfabeto y convertirse en "xyz"
        String resultado = cifrador.CaesarShiftCipher("abc", -3);
        Assertions.assertEquals("xyz", resultado);
    }

    @Test
    public void cifradoConEspacios() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "hola mundo" con un desplazamiento de 5 deberia convertirse en "mtqf rzsiht"
        String resultado = cifrador.CaesarShiftCipher("hola mundo", 5);
        Assertions.assertEquals("mtqf rzsiht", resultado);
    }

    @Test
    public void cifradoConCaracterInvalido() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        // "hola!" contiene un caracter invalido, por lo que deberia devolver "invalid"
        String resultado = cifrador.CaesarShiftCipher("hola!", 2);
        Assertions.assertEquals("invalid", resultado);
    }
}
