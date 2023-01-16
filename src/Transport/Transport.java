package Transport;

import Driver.Driver;
import Driver.DriverC;
import Driver.DriverB;
import Driver.DriverD;

import java.util.Objects;

public abstract class Transport<T extends Driver, B extends Enum> { //Не понимаю как может транспорт наследоваться от водителя?
    //попросите, пожалуйста, руководство, что бы нам более подробно обьяснили по этим Джинерикам) На видио уроке как то по другому, чем у меня получилось.. в конспектах не понятно.
    private final String brand;
    private final String model;
    private double volumeEngine;
    private Enum type;

//      ___________________________________________________________________________
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        if (volumeEngine <= 0) {
            this.volumeEngine = 1.6;
        } else {
            this.volumeEngine = volumeEngine;
        }
    }

    public Transport(String brand, String model, double volumeEngine,Enum type) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "brand";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "model";
        }
        setVolumeEngine(volumeEngine);
        this.type=type;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.volumeEngine, volumeEngine) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, volumeEngine);
    }
//_____________________________________________________________________________________

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void printType();

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }
    public<T extends Driver> void getDiagnosed(T t){
        if (t.isDriveLicense()/*если есть права*/&& !t.getClass().equals(DriverD.class)/*и если Категория не D (по условию кроме автобусов)*/){
            System.out.println("Диагностика пройдена");
        }else {
            System.out.println("Автобусы диагностику проходить не могут");
        }
    }

}
