public class Bus extends Transport{

    public Bus(String brand, String model, double volumeEngine) {
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
