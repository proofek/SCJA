
import java.io.IOException;
import java.util.ArrayList;

public class Fishing {
    public static void main(String[] args) throws IOException {
        ArrayList<Float> fishLengthList = new ArrayList<Float>();
        fishLengthList.add(new Float(10.0));
        fishLengthList.add(new Float(15.5));
        fishLengthList.add(new Float(18.0));
        fishLengthList.add(new Float(29.5));
        fishLengthList.add(new Float(45.5));

        for (Float length : fishLengthList) {
            if (length  > 28.0) {
                System.out.println("Length: " + length);
            }
        }
    }
}