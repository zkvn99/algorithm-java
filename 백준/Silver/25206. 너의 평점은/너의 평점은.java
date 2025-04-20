import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];

            double score = 0.0;

            switch (grade) {
                case "A+": score = 4.5; break;
                case "A0": score = 4.0; break;
                case "B+": score = 3.5; break;
                case "B0": score = 3.0; break;
                case "C+": score = 2.5; break;
                case "C0": score = 2.0; break;
                case "D+": score = 1.5; break;
                case "D0": score = 1.0; break;
                case "F":  score = 0.0; break;
                case "P":  continue;
            }

            totalScore += credit * score;
            totalCredit += credit;
        }

        double avg = totalScore / totalCredit;
        System.out.printf("%.6f", avg);
    }
}
