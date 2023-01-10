package Transport;

import Transport.Transport;

public class Car extends Transport {


    public Car(String brand, String model, double volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public String toString() {
        return "brand= " + brand + " model=" + model + ", volumeEngine= " + volumeEngine;
    }

    @Override
    void startMove() {

    }

    @Override
    void finishMove() {

    }
}
