import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

public class OrderList {
    private ArrayList<Integer> list;

    public OrderList(){
        list = new ArrayList();
    }

    public int addFlag = 0;

    public synchronized void add(int indice){
        if (addFlag == 1){
            try {
                wait();
            }catch (InterruptedException e){
                    e.printStackTrace();
            }
        } else{
            addFlag = 1;
            this.list.add(indice);
            addFlag = 0;
            notify();
        }
        Collections.sort(this.list);
    }
}


