import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int result = 0;
        
        for (int i=0; i<line.length(); i++) {
            char ch = line.charAt(i);
            int num = 0;
            
            switch (ch) {
                case 'A' :
                case 'B' :
                case 'C' :
                    num = 2;
                    break;
                case 'D' :
                case 'E' :
                case 'F' :
                    num = 3;
                    break;
                case 'G' :
                case 'H' :
                case 'I' :
                    num = 4;
                    break;
                case 'J' :
                case 'K' :
                case 'L' :
                    num = 5;
                    break;
                case 'M' :
                case 'N' :
                case 'O' :
                    num = 6;
                    break;
                case 'P' :
                case 'Q' :
                case 'R' :
                case 'S' :
                    num = 7;
                    break;
                case 'T' :
                case 'U' :
                case 'V' :
                    num = 8;
                    break;
                case 'W' :
                case 'X' :
                case 'Y' :
                case 'Z' :
                    num = 9;
                    break;
            }
            
            result += (num + 1);
        }
        
        System.out.println(result);
    }
}