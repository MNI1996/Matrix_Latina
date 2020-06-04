import javafx.collections.transformation.SortedList;

public class OrderList {
    private SortedList matrixLatina;

public synchronized void add(int indice){
    this.matrixLatina.add(indice);
}


}


