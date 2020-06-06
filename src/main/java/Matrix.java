import java.util.*;

public class Matrix {

    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int row, int column) {
        this.rows = row;
        this.columns = column;
        data = new int[rows][columns];
    }

    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public int[][] getData() {
        return data;
    }

    /** * fills matrix from data entered by user in console * * @param rows * @param columns */
    /*public void read(Scanner s) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = s.nextInt();
            }
        }
    }*/

    /** * fills matrix from data entered by user in console * * @param rows * @param columns */
    /*public void read(ArrayList<Integer> listN) {
        ArrayList<List<Integer>> otraList = listaDeListas(listN);

        int i = 0;
        for(List<Integer> ls : otraList){
            for (int j = 0; j < columns; j++) {
                data[i][j] = listN.get(j);
            }
            i++;
        }
    }*/

    public ArrayList<List<Integer>> listaDeListas(ArrayList<Integer> listN){
        ArrayList<List<Integer>> resList = new ArrayList<>();
        for(int i = 0; i < columns; i++){
            List<Integer> otraList = listN.subList(i*columns, (columns * (i + 1)));
            resList.add(otraList);
        }
        return resList;
    }

    public ArrayList<List<Integer>> transposeList(ArrayList<Integer> listN){
        ArrayList<List<Integer>> resList = new ArrayList<>();
        ArrayList<List<Integer>> listOfList = this.listaDeListas(listN);
        for(int i = 0; i < columns; i++){
            ArrayList<Integer> auxList = new ArrayList<>();
            for(List<Integer>lista : listOfList){
                int elem = lista.get(i);
                auxList.add(elem);
            }
            resList.add(auxList);
        }
        return resList;
    }

    /*public int sinRepetidos(ArrayList<Integer> list){
        Set<Integer> listToSet = new HashSet<>(list);
        System.out.println(listToSet);
        return listToSet.size();
    }*/



    /** * This method will transpose this matrix * * @return */
 /*   public void transpose() {
        int[][] temp = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[j][i] = data[i][j];
            }
        }
        data = temp;
    } /** * * @param matrix */
/*
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
             }
            System.out.println();
         }
    }
*/
}



