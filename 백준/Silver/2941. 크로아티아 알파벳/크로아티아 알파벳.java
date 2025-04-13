import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == 'c') {
                if (i + 1 < line.length()) {
                    if (line.charAt(i + 1) == '=' || line.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            } else if (ch == 'd') {
                if (i + 1 < line.length() && line.charAt(i + 1) == '-') {
                    i++;
                } else if (i + 2 < line.length() && line.charAt(i + 1) == 'z' && line.charAt(i + 2) == '=') {
                    i += 2;
                }
            } else if (ch == 'l') {
                if (i + 1 < line.length() && line.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (ch == 'n') {
                if (i + 1 < line.length() && line.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (ch == 's') {
                if (i + 1 < line.length() && line.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (ch == 'z') {
                if (i + 1 < line.length() && line.charAt(i + 1) == '=') {
                    i++;
                }
            }

            count++;
        }

        System.out.println(count);
    }
}
