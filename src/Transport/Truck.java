package Transport;
import Driver.DriverB;
import Driver.DriverC;


public class Truck extends Transport<DriverC> implements Competing {
    public Truck(String brand, String model, double volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine();
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
}
