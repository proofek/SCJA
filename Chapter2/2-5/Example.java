
import java.io.IOException;

/**
 * Pseudo-code:
 * IF waterTemperature greater than or equal to 69 THEN
 *   isStripersMostActive := false // Stripers are less active
 * ELSEIF waterTemperature less than but greater than 47 THEN
 *   isStripersMostActive := true // Stripers are most active
 * ELSEIF waterTemperature less than or equal to 47 THEN
 *   isStripersMostActive := false // Stripers are less active
 */
public class Example {
    public static void main(String[] args) throws IOException {
        boolean isStripersMostActive = false;
        int waterTemperature;
        if (args.length > 0) {
            try {
                waterTemperature = Integer.parseInt(args[0]);
                if (waterTemperature <= 47 || waterTemperature >= 69) {
                    isStripersMostActive = false;
                    System.out.println("Stripers are less active");
                } else {
                    isStripersMostActive = true;
                    System.out.println("Stripers are most active");
                }
            } catch (NumberFormatException e) {
                System.err.println("Argument" + " must be an integer");
                System.exit(1);
            }
        } else {
            System.err.println("You must provide one numeric argument");
            System.exit(1);
        }
    }
}