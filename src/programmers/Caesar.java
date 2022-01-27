package programmers;

public class Caesar {
    
    public static void main(String[] args) {
        
        String answer = "";
        String s = "a B z"; // e F d
        int n = 4;

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char character = arr[i];
            
            if (65 <= character && character <= 90) {
                if ((character + n) > 90) answer += (char) ((character + n) - 26);
                else answer += (char) (character + n);
            } else if (97 <= character && character <= 122) {
               if ((character + n) > 122) answer += (char) ((character + n) - 26);
               else answer += (char) (character + n);
            } else {
                answer += character;
            }
        }
        System.out.println(answer);
    }
}