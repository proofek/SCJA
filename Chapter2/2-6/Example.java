
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

/**
 * Pseudo-code:
 * fishingList = rods, reels, bait, lunch
 * FOR EACH variable in fishingList
 *  print variable
 * ENDFOR
 */
public class Example {
    public static void main(String[] args) throws IOException {
        List<String> fishingList = Arrays.asList("rods", "reels", "bait", "lunch");
        for (String elem : fishingList) {
            System.out.println(elem);
        }
    }
}