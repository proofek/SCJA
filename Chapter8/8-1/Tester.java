public class Tester {

    public static void main(String[] args) {
        new Tester();
    }

    public Tester() {
        Goat goat = new Goat("Bob");
        Box box = new Box(3, 5, 3);
        UrMum mum = new UrMum("awesome");
        System.out.println(description(goat));
        System.out.println(description(box));
        System.out.println(description(mum));
    }

    public String description(Describable d) {
        return d.getDescription();
    }
}