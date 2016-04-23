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
        String sb = "";
        int leastIndex = 26;
        for (String l : s.split("")) {
            if (counts.get(l) == 0) {
                // cant remove, shd add to final

            } else {
                // this is a repeated thing, shd we remove it?
                // find least index
                // this isnt as easy as I thought
                // need to think from scratch :D

            }
        }

    }
}
