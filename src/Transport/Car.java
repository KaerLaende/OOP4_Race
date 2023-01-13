package Transport;

import Driver.DriverB;
import Driver.DriverC;
import Transport.Transport;

public class Car extends Transport <DriverB>  implements Competing {


    public Car(String brand, String model, double volumeEngine) {
        super(brand, model, volumeEngine);
    }
//      Подскажите как сделать такой метод?
//    public void toCar(DriverB/*тут подчеркивается*/){
//        System.out.println(DriverB.fullName/*и тут*/+" сел за руль "+getBrand()+" "+getModel());
//    }

    public void toAuto(DriverB b){
        System.out.println(b.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }//вроде получилось..

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine();
    }

    @Override
    public void startMove() {
        System.out.println(getBrand()+" начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(getBrand()+" закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+" отправился на Пит-Стоп!");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у "+getBrand()+" составило: "+((int)((30-getVolumeEngine()/2)+Math.random()*(20-getVolumeEngine()*2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у "+getBrand()+" составила: "+((int)((200+getVolumeEngine()*10)+Math.random()*(getVolumeEngine()*4))));
    }
}
