import java.util.*;
import java.io.*;

public class Main {
    static class Person {
        int age;
        String name;
        int order;
        
        Person(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Person(age, name, i));
        }
        
        list.sort((a, b) -> {
            if (a.age == b.age) return Integer.compare(a.order, b.order);
            return Integer.compare(a.age, b.age);
        });
            
        for (Person p : list) {
            System.out.println(p.age + " " + p.name);
        }
    }
}