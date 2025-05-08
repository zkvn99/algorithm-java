import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        int[] numArr = new int[numStr.length()];
        
        for (int i=0; i<numStr.length(); i++) {
            numArr[i] = numStr.charAt(i) - '0';
        }
        
        for (int i=0; i<numStr.length(); i++) {
            for (int j=i+1; j<numStr.length(); j++) {
                if (numArr[i] < numArr[j]) {
                    int temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
            System.out.print(numArr[i]);
        }
    }
}