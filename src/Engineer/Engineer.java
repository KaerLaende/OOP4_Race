package Engineer;

import Driver.AutoService;
import Transport.Transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Engineer<T extends Transport> {
    private final String name;
    private String company;

    public Engineer(String name, String company) {
        this.name = name;
        this.company = company;
    }



    public void repair(Queue<T> queue){
        T transport =queue.poll();
        if (transport!=null){
            System.out.println(name+ " отремонтировал "+ transport.getBrand() + ", покинул очередь ремонта");
        }
    }

    public void service(Queue<T> queue){
        T transport =queue.peek();
        if (transport!=null){
            System.out.println(name+ " провел техобслуживание "+ transport.getBrand());
        }
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Механик:" + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer<?> engineer = (Engineer<?>) o;
        return name.equals(engineer.name) && Objects.equals(company, engineer.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}
