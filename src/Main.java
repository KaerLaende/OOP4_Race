import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Engineer.Engineer;
import Transport.*;
import Transport.Type.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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


        Truck truck1 = new Truck("Грузовик1", "модель1", 4, LoadCapacityV2.N1, LoadCapacityV2.N2);
        Truck truck2 = new Truck("Грузовик2", "модель2", 5,null,LoadCapacityV2.N1);
        Truck truck3 = new Truck("Грузовик3", "модель3", 6,LoadCapacityV2.N2,null);
        Truck truck4 = new Truck("Грузовик4", "модель4", 8,null,LoadCapacityV2.N2);

        DriverB ivanovIvan= new DriverB("Иванов Иван",10);
        DriverC petrovPetr= new DriverC("Петров Пётр",15);
        DriverD sunSunich=new DriverD("Сашков Александр",35);
        DriverC nullNullich=new DriverC("Null",0);

        //Коллекции. Часть1.

        Engineer firstE = new Engineer<Car>("Первый механик Б","Первая компания Б");
        Engineer secondE= new Engineer<Truck>("Второй механик С", "Вторая компания С");
        Engineer thirdE= new Engineer<Bus>("Третий механик Д", "Вторая компания Д");

        // создаем лист и добавляем все авто:
        List<Transport> allTransportList = new ArrayList<>();
        allTransportList.add(lada)  ;//allTransportList.add(ferrari);allTransportList.add(mcLaren);allTransportList.add(lamborghini);
        allTransportList.add(truck1);//allTransportList.add(truck2);allTransportList.add(truck3);allTransportList.add(truck4);
        allTransportList.add(bus1)  ;//allTransportList.add(bus2);allTransportList.add(bus3);allTransportList.add(bus4);

        // создаем список водителей:
        List<Driver> allDriverList= new ArrayList<>();
        allDriverList.add(ivanovIvan);allDriverList.add(petrovPetr);allDriverList.add(sunSunich);

        // создаем список механиков:
        List<Engineer> allEngineerList = new ArrayList<>();
        allEngineerList.add(firstE);allEngineerList.add(secondE);allEngineerList.add(thirdE);

        //печатаем авто ее водителя и ее маханика:
        for (int i = 0; i < 3; i++) {
            allTransportList.get(i).toAuto(allDriverList.get(i));
            allEngineerList.get(i).addTransport(allTransportList.get(i));
            System.out.println();
        }
        // добавляем еще по машине к очереди на ремонт механиков:
        firstE.addTransport(ferrari);
        secondE.addTransport(truck2);
        thirdE.addTransport(bus4);
        // ремонтируем технику:

        for (int i = 0; i < allEngineerList.size(); i++) {
            allEngineerList.get(i).getSizeQueue(); //= 2
            allEngineerList.get(i).service(); // не удалаем из очереди
            allEngineerList.get(i).repair(); // удаляем отремонтированную
            allEngineerList.get(i).getSizeQueue();// осталась =1
            System.out.println();
        }








//     Проверки:

//        try { //ловим автобусов
//            bus1.getDiagnosed(ivanovIvan);
//        } catch (CantDunDiagnosedException e) {
//            System.out.println("Произошла ошибка "+ivanovIvan.getCategoryLicense());;
//        }

//        try {//проверяем - диагностика выполняется
//            lada.getDiagnosed(ivanovIvan);
//        } catch (CantDunDiagnosedException e) {
//            System.out.println("Произошла ошибка "+ivanovIvan.getCategoryLicense());;
//        }
//        Main robotDiagnost =new Main();
//        robotDiagnost.useDiagnostic(lada, sunSunich);
//        robotDiagnost.useDiagnostic(lada, ivanovIvan);
//        robotDiagnost.useDiagnostic(truck1, ivanovIvan);



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