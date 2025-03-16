import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> modSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            modSet.add(num % 42); 
        }

        System.out.println(modSet.size());
    }
}
