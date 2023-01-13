package Transport;
import Driver.DriverB;
import Driver.DriverC;
import Transport.Type.LoadCapacity;


public class Truck extends Transport<DriverC, LoadCapacity> implements Competing {
    public Truck(String brand, String model, double volumeEngine,LoadCapacity type) {
        super(brand, model, volumeEngine, type);
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine()+", "+ getType();
    }


    public void toAuto(DriverC c){
        System.out.println(c.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }


    @Override
    public void startMove() {
        System.out.println(getBrand()+" начал медленный разгон");
    }

    @Override
    public void finishMove() {
        System.out.println(getBrand()+" закончил движение долгим торможением");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand()+" опустошил весь Пит-Стоп!");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у "+getBrand()+" составило: "+((int)((40-getVolumeEngine()/2)+Math.random()*(20-getVolumeEngine()*2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у "+getBrand()+" составила: "+((int)((100+getVolumeEngine()*2)+Math.random()*(getVolumeEngine()*3))));
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
