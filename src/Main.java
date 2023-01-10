import Transport.Bus;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "2105-ВФТС", 1.6);
        Car ferrari = new Car("Ferrari", "F40", 2.9);
        Car mcLaren = new Car("McLaren", "F1", 6.1);
        Car lamborghini = new Car("Lamborghini", "Diablo", 6.0);

        Bus bus1 = new Bus("Автобус1", "модель 1", 2);
        Bus bus2 = new Bus("Автобус2", "модель 2", 3);
        Bus bus3 = new Bus("Автобус3", "модель 3", 4);
        Bus bus4 = new Bus("Автобус4", "модель 4", 5);

        Truck truck1 = new Truck("Грузовик1", "модель1", 4);
        Truck truck2 = new Truck("Грузовик2", "модель2", 5);
        Truck truck3 = new Truck("Грузовик3", "модель3", 6);
        Truck truck4 = new Truck("Грузовик4", "модель4", 8);


    }
}