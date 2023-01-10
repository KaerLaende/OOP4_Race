package Transport;

import Transport.Transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public String toString() {
        return "brand= " + brand + " model=" + model + ", volumeEngine= " + volumeEngine;
    }

    @Override
    public void startMove() {
        System.out.println(brand+" начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(brand+" закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(brand+" отправился на Пит-Стоп!");

    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшее время круга у "+brand+" составило: "+((int)((45-volumeEngine/2)+Math.random()*(20-volumeEngine*2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у "+brand+" составила: "+((int)((90+volumeEngine*2)+Math.random()*(volumeEngine*3))));
    }
}
