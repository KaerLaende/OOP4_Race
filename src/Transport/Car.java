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

    public void toAuto(DriverB B){
        System.out.println(B.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }//вроде получилось..

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
        System.out.println("Лучшее время круга у "+brand+" составило: "+((int)((30-volumeEngine/2)+Math.random()*(20-volumeEngine*2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у "+brand+" составила: "+((int)((200+volumeEngine*10)+Math.random()*(volumeEngine*4))));
    }
}
