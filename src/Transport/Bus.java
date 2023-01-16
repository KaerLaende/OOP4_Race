package Transport;

import Driver.Driver;
import Driver.DriverD;
import Transport.Type.PassengerCapacityV2;


public class Bus extends Transport<DriverD, PassengerCapacityV2> implements Competing {
    private Enum<PassengerCapacityV2> typeMin;
    private Enum<PassengerCapacityV2> typeMax;
    public static final char CATYGORY = 'D';

    public Bus(String brand, String model, double volumeEngine, PassengerCapacityV2 typeMin, PassengerCapacityV2 typeMax) {
        super(brand, model, volumeEngine, typeMin);
        this.typeMin = typeMin;
        this.typeMax = typeMax;
    }

    public char getCATYGORY() {
        return CATYGORY;
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine() + ", " + printPassengerCapacity();
    }


    @Override
    public void startMove() {
        System.out.println(getBrand() + " закончил посадку пассажиров и начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(getBrand() + " и закончил движение, все пассажиры вышли...");
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " отправился на Пит-Стоп и забрал с собой всех механиков");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга у " + getBrand() + " составило: " + ((int) ((45 - getVolumeEngine() / 2) + Math.random() * (20 - getVolumeEngine() * 2))));
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость у " + getBrand() + " составила: " + ((int) ((90 + getVolumeEngine() * 2) + Math.random() * (getVolumeEngine() * 3))));
    }

    @Override
    public void printType() {
        if (getType() == null) {
            System.out.println("Грузоподьемность не указана");
        } else {
            System.out.println(getType());
        }
    }

    public String printPassengerCapacity() {
        if (typeMin == null) {
            if (typeMax == null) {
                return "автобус - резиновый";
            } else if (typeMax == this.typeMax) {
                return "до" + this.typeMax;
            }
        } else {
            if (typeMax == null) {
                return "до бесконечности автобус - резиновый";
            } else {
                return "от " + this.typeMin + " до " + this.typeMax;
            }
        }
        return "этот текст никогда не напечатается?";
    }
    public<T extends Driver> void getDiagnosed(T t)throws CantDunDiagnosedException { //переопределение под Категорию С у Грузовиков
        System.out.println("Автобусы не проходят диагностику");
        }
    }

