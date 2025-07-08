public class toUpperCase {
    public static void main(String[] args) {
        String input = "HeLLo NiTraJ";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }

        System.out.println(result); 
    }
}
