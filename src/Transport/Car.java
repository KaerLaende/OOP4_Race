package Transport;

import Driver.Driver;
import Driver.DriverB;
import Transport.Type.BodyType;

public class Car extends Transport <DriverB, BodyType>  implements Competing {
    public static final char CATYGORY = 'B';

    public char getCATYGORY() {
        return CATYGORY;
    }

    public Car(String brand, String model, double volumeEngine, BodyType type) {
        super(brand, model, volumeEngine,type);
    }

    public void toAuto(Driver b) throws CantClassCompatibleException {
        tryСompatibleClass(b);
        System.out.println(b.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + getModel();
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

    @Override
    public void printType() {
        if (getType()==null){ //В Задании 2 написано если тип не указан.. Как его можно не указать в моём случае?
            System.out.println("тип кузова машины не указан");
        }
        else {
            System.out.println(getType());
        }
    }

    public<T extends Driver> void getDiagnosed(T t)throws CantDunDiagnosedException {
        if (!t.isDriveLicense()|| !t.getClass().equals(DriverB.class)){
            throw new CantDunDiagnosedException();
        }else {
            System.out.println("Диагностика пройдена");
        }
    }
}
