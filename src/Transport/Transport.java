package Transport;

import Driver.Driver;
import Driver.DriverD;
import Driver.DriverB;
import Driver.DriverC;

import java.util.Objects;

public abstract class Transport<T extends Driver, B extends Enum> { //Не понимаю как может транспорт наследоваться от водителя?
    //попросите, пожалуйста, руководство, что бы нам более подробно обьяснили по этим Джинерикам) На видио уроке как то по другому, чем у меня получилось.. в конспектах не понятно.
    private final String brand;
    private final String model;
    private double volumeEngine;
    private Enum type;
    static char CATYGORY;

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

    public Transport(String brand, String model, double volumeEngine, Enum type) {
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
        this.type = type;

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

    public char getCATYGORY() {
        return CATYGORY;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }
    public void toAuto(Driver b) throws CantClassCompatibleException {
        tryСompatibleClass(b);
        System.out.println(b.getFullName()+" сел за руль "+getBrand()+" "+getModel()+" и будет участвовать в заезде");
    }

    public <T extends Driver> void getDiagnosed(T t) throws CantDunDiagnosedException {
        if (t.isDriveLicense()/*если есть права*/ && !t.getClass().equals(DriverD.class)/*и если Категория не D (по условию кроме автобусов)*/) {
            System.out.println("Диагностика пройдена");
        } else {
            System.out.println("Диагностика не пройдена");
        }
        throw new UnsupportedOperationException("Автобусы не могут проходить диагностику");
    }

    // второй способ проверки.
    public < D extends Driver> void tryСompatibleClass( D d) throws CantClassCompatibleException {
        System.out.print(getCATYGORY() +" и "+d.getCategoryLicense());
        if (getCATYGORY()!= d.getCategoryLicense()/*если категории не одинаковы*/) {

            throw new CantClassCompatibleException();
        } else {
            System.out.println("классы совместимы");
        }
    }

}
