package Transport;
import Driver.Driver;
import Driver.DriverC;
import Transport.Type.LoadCapacityV2;


public class Truck<d> extends Transport<DriverC, LoadCapacityV2> implements Competing {
    private static final char CATYGORY = 'C';
    private Enum<LoadCapacityV2> typeMin;
    private Enum<LoadCapacityV2> typeMax;

    public Truck(String brand, String model, double volumeEngine, LoadCapacityV2 typeMin, LoadCapacityV2 typeMax) {
        super(brand, model, volumeEngine, typeMin);
        this.typeMin=typeMin;
        this.typeMax=typeMax;
    }

    @Override
    public String toString() {
        return "brand= " + getBrand() + " model=" + getModel() + ", volumeEngine= " + getVolumeEngine()+", "+/*дальше идет обработать null в toString.с помощью отдельного метода*/ "с полной массой "+printLoadCapacity();
    }

    public char getCATYGORY() {
        return CATYGORY;
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
    public void printType() {
        if (getType()==null){
            System.out.println("Грузоподьемность не указана");
        }
        else {
            System.out.println(getType());
        }
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


    public String printLoadCapacity() {
        if (typeMin==null&&typeMax==LoadCapacityV2.N1){
            return  " до 3.5 тонн";
        } else if (typeMin==LoadCapacityV2.N1&&typeMax==LoadCapacityV2.N2) {
            return " от 3.5 до 12 тонн";
        } else if (typeMin==LoadCapacityV2.N2&&typeMax==null){
            return " свыше 12 тонн";
        }
        else return "...";
    }
    
    public<T extends Driver> void getDiagnosed(T t)throws CantDunDiagnosedException { //переопределение под Категорию С у Грузовиков
        if ( !t.getClass().equals(DriverC.class)){
            throw new CantDunDiagnosedException();
        }else if (!t.isDriveLicense()){
            System.out.println("Необходимо указать тип прав!");
        }
        else {
            System.out.println("Диагностика пройдена");
        }
    }

}
