import java.util.*;

public class Matrix {

    private int dimension;
    private ArrayList<Integer> list;

    public Matrix(int dim, ArrayList<Integer> listN) {
        this.dimension = dim;
        this.list = listN;
    }

    public ArrayList<List<Integer>> getMatrix(){
        ArrayList<List<Integer>> resList = new ArrayList<>();
        for(int i = 0; i < dimension; i++){
            List<Integer> otraList = this.list.subList(i* dimension, (dimension * (i + 1)));
            resList.add(otraList);
        }
        return resList;
    }

    public ArrayList<List<Integer>> getTransposedMatrix(){
        ArrayList<List<Integer>> resList = new ArrayList<>();
        ArrayList<List<Integer>> listOfList = this.getMatrix();
        for(int i = 0; i < dimension; i++){
            ArrayList<Integer> auxList = new ArrayList<>();
            for(List<Integer>lista : listOfList){
                int elem = lista.get(i);
                auxList.add(elem);
            }
            resList.add(auxList);
        }
        return resList;
    }

}



