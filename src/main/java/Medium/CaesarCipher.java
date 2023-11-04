package Medium;

class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(CaesarCipher("coderBYTE", 2));
    }

    //todo nieskończone - do zrobienia przesuwanie w linii 14

    public static String CaesarCipher(String str, int num) {
        StringBuilder sb = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (Character.isLetter(character) || Character.isDigit(character)) {
                char cipherChar = (char) (character + num);
                sb.append(cipherChar);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
