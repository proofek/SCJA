public class Simulator {
    public static void main(String[] args) {
        System.out.println("Creating a maple tree and tulip...");
        MapleTree mapleTree = new MapleTree();
        Tulip tulip = new Tulip();
        System.out.println("Entering a loop to simulate 3 years");
        for (int i = 0; i < 3; i++) {
            mapleTree.doSpring();
            tulip.doSpring();
            mapleTree.doSummer();
            tulip.doSummer();
            mapleTree.doFall();
            tulip.doFall();
            mapleTree.doWinter();
            tulip.doWinter();
        }
    }
}