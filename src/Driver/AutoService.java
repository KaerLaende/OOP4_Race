package Driver;

import Engineer.Engineer;
import Transport.Transport;

import java.util.LinkedList;
import java.util.Queue;

public class AutoService<T extends Transport, E extends Engineer>  {
    public Queue<T> queue = new LinkedList<T>();
    public void addTransport(T transport, E engineer){
        queue.offer(transport);
        System.out.println("Транспорт "+transport.getBrand()+ " добавлен к механику "+engineer.getName());
    }

    public void getSizeQueue(){
        System.out.println("Количество авто в очереди: "+queue.size());
    }
}
