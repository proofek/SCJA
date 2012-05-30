public class MapleTree extends Plant {
    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: The mapple tree is starting to grow leaves and new branches");
        System.out.println("\tCurrent age: " + getAge() + " Current Height: " + getHeight());
    }

    public void doSummer() {
        grow();
        System.out.println("Summer: The mapple tree is continuing to grow");
        System.out.println("\tCurrent age: " + getAge() + " Current Height: " + getHeight());
    }

    public void doFall() {
        System.out.println("Fall:   The mapple tree has stopped growing and is loosing its leaves");
        System.out.println("\tCurrent age: " + getAge() + " Current Height: " + getHeight());
    }

    public void doWinter() {
        System.out.println("Winter: The mapple tree is dormant");
        System.out.println("\tCurrent age: " + getAge() + " Current Height: " + getHeight());
    }
}