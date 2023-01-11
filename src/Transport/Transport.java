package Transport;

import Driver.Driver;

import java.util.Objects;

public abstract class Transport<T extends Driver> { //Не понимаю как может транспорт наследоваться от водителя?
    //попросите, пожалуйста, руководство, что бы нам более подробно обьяснили по этим Джинерикам) На видио уроке как то по другому, чем у меня получилось.. в конспектах не понятно.
    protected final String brand;
    protected final String model;
    protected double volumeEngine;

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

    public Transport(String brand, String model, double volumeEngine) {
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

    abstract void startMove();
    abstract void finishMove();

}
