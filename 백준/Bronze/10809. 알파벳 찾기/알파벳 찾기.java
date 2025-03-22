import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';
            
            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}