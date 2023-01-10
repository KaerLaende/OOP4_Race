import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "2105-ВФТС", 1.6);
        Car ferrari = new Car("Ferrari", "F40", 3.9);
        Car mcLaren = new Car("McLaren", "F1", 6.1);
        Car lamborghini = new Car("Lamborghini", "Diablo", 6.0);

        Bus bus1 = new Bus("Автобус1", "модель 1", 3);
        Bus bus2 = new Bus("Автобус2", "модель 2", 4);
        Bus bus3 = new Bus("Автобус3", "модель 3", 5);
        Bus bus4 = new Bus("Автобус4", "модель 4", 6);

        Truck truck1 = new Truck("Грузовик1", "модель1", 4);
        Truck truck2 = new Truck("Грузовик2", "модель2", 5);
        Truck truck3 = new Truck("Грузовик3", "модель3", 6);
        Truck truck4 = new Truck("Грузовик4", "модель4", 8);
        System.out.println("Гонка начинается!");
        lada.startMove();
        lada.pitStop();
        lada.finishMove();
        lada.BestLapTime();
        lada.maxSpeed();

        ferrari.startMove();
        ferrari.pitStop();
        ferrari.finishMove();
        ferrari.BestLapTime();
        ferrari.maxSpeed();

        mcLaren.startMove();
        mcLaren.pitStop();
        mcLaren.finishMove();
        mcLaren.BestLapTime();
        mcLaren.maxSpeed();

        lamborghini.startMove();
        lamborghini.pitStop();
        lamborghini.finishMove();
        lamborghini.BestLapTime();
        lamborghini.maxSpeed();
        System.out.println();
        System.out.println();
        bus1.startMove();
        bus1.pitStop();
        bus1.finishMove();
        bus1.BestLapTime();
        bus1.maxSpeed();

        bus4.startMove();
        bus4.pitStop();
        bus4.finishMove();
        bus4.BestLapTime();
        bus4.maxSpeed();
        System.out.println();
        System.out.println();

        truck1.startMove();
        truck1.pitStop();
        truck1.finishMove();
        truck1.BestLapTime();
        truck1.maxSpeed();

        truck4.startMove();
        truck4.pitStop();
        truck4.finishMove();
        truck4.BestLapTime();
        truck4.maxSpeed();
    }
}