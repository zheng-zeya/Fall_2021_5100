package edu.northeastern.zeyao;

public class TrafficLight {
    public TrafficLight() {

    }

    boolean lightA = true;

    public void carArrived(int carId, int roadId, int direction, Runnable turnGreen, Runnable crossCar) {
        synchronized (this) {
            if (roadId == 1) {
                if (!lightA) {
                    turnGreen.run();
                    lightA = true;
                }
                crossCar.run();
            } else {
                if (lightA) {
                    turnGreen.run();
                    lightA = false;
                }
                crossCar.run();
            }
        }
    }
}
