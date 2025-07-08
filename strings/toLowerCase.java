public class toLowerCase {
    public static void main(String[] args) {
        String input = "HeLLo NiTraJ";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);  
            } else {
                result += ch; 
            }
        }

        System.out.println(result); 
    }
}
