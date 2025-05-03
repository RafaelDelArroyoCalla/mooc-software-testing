package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";
        int begin = 0;
        int end = string.length() - 1;
        // Recorrer hasta que los caracteres coincidan desde el principio y el final
        while (begin <= end && string.charAt(begin) == string.charAt(end)) {
            mirror += string.charAt(begin);  // Agregar el caracter al resultado
            begin++;
            end--;
        }
        if (begin == end) {
            mirror += string.charAt(begin);
        }
        return mirror;  // Devuelve el extremo reflejado
    }
}
