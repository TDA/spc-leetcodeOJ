import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by schandramouli on 4/18/16.
 */
public class removeduplicateletters {
    // given an input
//    Given "bcabc"
//    Return "abc"
//
//    Given "cbacdcbc"
//    Return "acdb"
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        HashMap<String, Integer> counts = new HashMap<>();

        for (String l : s.split("")) {
            if (counts.containsKey(l)) {
                // increment
                counts.put(l, counts.get(l) + 1);
            } else {
                counts.put(l, 1);
            }
        }
        System.out.println(counts);
        String sb = new String();
        for (String l : s.split("")) {
            if (counts.get(l) == 0) {
                // cant remove, add to final

                counts.put(l, counts.get(l) + 1);
            } else {
                counts.put(l, 1);
            }
        }

    }
}
