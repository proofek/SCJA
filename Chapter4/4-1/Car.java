public class Car {
    int topSpeed;
    boolean running;

    Car(int topSpeed, boolean running) {
        this.running = running;
        this.topSpeed = topSpeed;
    }

    boolean isRunning() {
        return running;
    }

    int getTopSpeed()
    {
        return topSpeed;
    }
}