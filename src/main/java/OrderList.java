import java.util.ArrayList;
import java.util.Collections;

public class OrderList {
    private ArrayList<Integer> list;

    public OrderList(){
        list = new ArrayList();
    }


    public synchronized void add(int indice){
        this.list.add(indice);
        Collections.sort(this.list);
    }

    public ArrayList<Integer> getOrderList(){
        return list;
    }
}


