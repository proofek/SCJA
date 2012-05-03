
import java.io.IOException;

/**
 * Pseudo-code:
 * location := Corson's Inlet
 * IF location != NULL THEN
 *   print "Fishing spot: " + location
 * ENDIF
 */
public class Example {
    public static void main(String[] args) throws IOException {
        String location = "Corson's Inlet";
        if (location != null) {
            System.out.println("Fishing spot: " + location);
        }
    }
}