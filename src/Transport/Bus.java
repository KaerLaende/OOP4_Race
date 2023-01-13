package Transport;

import Driver.DriverB;
import Driver.DriverD;
import Transport.Type.PassengerCapacity;


public class Bus extends Transport<DriverD, PassengerCapacity> implements Competing {

    public Bus(String brand, String model, double volumeEngine, PassengerCapacity type) {
        super(brand, model, volumeEngine, type);
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine()+", "+ getType();
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
        System.out.println(getBrand()+" и закончил движение, все пассажиры вышли...");
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

    @Override
    public void printType() {
        if (getType()==null){
            System.out.println("Грузоподьемность не указана");
        }
        else {
            System.out.println(getType());
        }
    }
}
