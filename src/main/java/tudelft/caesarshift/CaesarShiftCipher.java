package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String applyShift(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        int length = message.length();
        shift = shift % 26; // Asegurar que el desplazamiento esta dentro del rango del alfabeto
        for (int i = 0; i < length; i++) {
            char currentChar = message.charAt(i);
            // Si hay un caracter invalido (ni letra minuscula ni espacio), devolver "invalid"
            if (currentChar != ' ' && (currentChar < 'a' || currentChar > 'z')) {
                return "invalid";
            }
            if (currentChar == ' ') {
                sb.append(' '); // Mantener los espacios sin cambios
            } else {
                // Aplicar el desplazamiento
                char newChar = (char) (currentChar + shift);
                if (newChar > 'z') {
                    newChar = (char) (newChar - 26);
                } else if (newChar < 'a') {
                    newChar = (char) (newChar + 26);
                }
                sb.append(newChar);
            }
        }
        return sb.toString();
    }
}
