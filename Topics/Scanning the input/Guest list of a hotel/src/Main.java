//put imports you need here

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (scanner.hasNext()) {
            names.add(scanner.next());
        }

        Collections.reverse(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}