package Transport;

import Driver.DriverB;
import Driver.DriverD;


public class Bus extends Transport<DriverD> implements Competing {

    public Bus(String brand, String model, double volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine();
    }
    public void toAuto(DriverD d){
        System.out.println(d.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }
    @Override
    public void startMove() {
        System.out.println(getBrand()+" закончил посадку пассажиров и начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(getBrand()+" попутно развез всех пассажиров и закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+" отправился на Пит-Стоп и забрал с собой всех механиков");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у "+getBrand()+" составило: "+((int)((45-getVolumeEngine()/2)+Math.random()*(20-getVolumeEngine()*2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у "+getBrand()+" составила: "+((int)((90+getVolumeEngine()*2)+Math.random()*(getVolumeEngine()*3))));
    }
}
