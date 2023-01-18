package Engineer;

import Transport.Transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Engineer<T extends Transport> {
    private final String name;
    private String company;
    private Queue<T> queue = new LinkedList<T>();

    public Engineer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void addTransport(T transport){
        queue.offer(transport);
        System.out.println("Транспорт "+transport.getBrand()+ " добавлен к механику "+getName());
    }

    public void repair(){
        T transport =queue.poll();
        if (transport!=null){
            System.out.println(name+ " отремонтировал "+ transport.getBrand() + ", покинул очередь ремонта");
        }
    }

    public void service(){
        T transport =queue.peek();
        if (transport!=null){
            System.out.println(name+ " провел техобслуживание "+ transport.getBrand());
        }
    }


    public String getName() {
        return name;
    }

    public void getSizeQueue(){
        System.out.println("Количество авто в очереди: "+queue.size());
    }

}
