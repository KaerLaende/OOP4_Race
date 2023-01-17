import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;
import Transport.Type.*;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada", "2105-ВФТС", 1.6, BodyType.SEDAN);
        Car ferrari = new Car("Ferrari", "F40", 3.9,BodyType.COUPE);
        Car mcLaren = new Car("McLaren", "F1", 6.1,BodyType.HETCHBACK);
        Car lamborghini = new Car("Lamborghini", "Urus", 6.0,BodyType.CROSSOVER);

        Bus bus1 = new Bus("Автобус1", "модель 1", 3, PassengerCapacityV2.SMALL,PassengerCapacityV2.LARGE);
        Bus bus2 = new Bus("Автобус2", "модель 2", 4,PassengerCapacityV2.MEDIUM,null);
        Bus bus3 = new Bus("Автобус3", "модель 3", 5,PassengerCapacityV2.VERY_LARGE,PassengerCapacityV2.VERY_LARGE2);
        Bus bus4 = new Bus("Автобус4", "модель 4", 6,null,null);
        Bus bus5 = new Bus("Автобус1", "модель 1", 3,PassengerCapacity.VERY_LARGE);
        System.out.println(bus5);

        Truck truck1 = new Truck("Грузовик1", "модель1", 4, LoadCapacityV2.N1, LoadCapacityV2.N2);
        Truck truck2 = new Truck("Грузовик2", "модель2", 5,null,LoadCapacityV2.N1);
        Truck truck3 = new Truck("Грузовик3", "модель3", 6,LoadCapacityV2.N2,null);
        Truck truck4 = new Truck("Грузовик4", "модель4", 8,null,LoadCapacityV2.N2);

        DriverB ivanovIvan= new DriverB("Иванов Иван",10);
        DriverC petrovPetr= new DriverC("Петров Пётр",15);
        DriverD sunSunich=new DriverD("Сашков Александр",35);
        DriverC nullNullich=new DriverC("Null",0);

        System.out.println(bus3);
//     Проверка:

//        try { //ловим автобусов
//            bus1.getDiagnosed(ivanovIvan);
//        } catch (CantDunDiagnosed e) {
//            System.out.println("Произошла ошибка "+ivanovIvan.getCategoryLicense());;
//        }

        try {//проверяем - диагностика выполняется
            lada.getDiagnosed(ivanovIvan);
        } catch (CantDunDiagnosedException e) {
            System.out.println("Произошла ошибка "+ivanovIvan.getCategoryLicense());;
        }
        Main robotDiagnost =new Main();
        robotDiagnost.useDiagnostic(lada, sunSunich);
        robotDiagnost.useDiagnostic(bus1, petrovPetr);
        System.out.println(nullNullich);


//        lada.printType();
//        System.out.println(lada);
//        System.out.println(truck1);
//        System.out.println(bus1);
//        System.out.println(bus4);
//      Всё работает.


//        System.out.println("Гонка начинается!");
        ferrari.toAuto(ivanovIvan);
//        ivanovIvan.pressGaz(ferrari);
//        ivanovIvan.refuel(ferrari);
//        ivanovIvan.stop(ferrari);
//        ferrari.bestLapTime();
//        ferrari.maxSpeed();
//
//        System.out.println();
//        System.out.println();
//
        bus1.toAuto(sunSunich);
//        sunSunich.pressGaz(bus1);
//        sunSunich.refuel(bus1);
//        sunSunich.stop(bus1);
//        bus1.bestLapTime();
//        bus1.maxSpeed();
//
//        System.out.println();
//        System.out.println();
//
        truck4.toAuto(petrovPetr);
        //
        truck4.toAuto(ivanovIvan);
        // Все проверки успешны!

//        sunSunich.pressGaz(truck4);
//        sunSunich.refuel(truck4);
//        sunSunich.stop(truck4);
//        truck4.bestLapTime();
//        truck4.maxSpeed();
    }
    // Еще придумал вот такой вариант:
    public<T extends Transport,D extends Driver>  void useDiagnostic(T t, D d){
        try {
            t.getDiagnosed(d);
        } catch (CantDunDiagnosedException e) {
            System.out.println(e+"категория трансопрта "+t.getCATYGORY() + " не соответствует водительским правам "+ d.getFullName()+" "+d.getCategoryLicense());
        }
        finally {
            System.out.println("Проверка завершена");
        }
    }
}