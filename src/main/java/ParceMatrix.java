import java.util.*;
import java.util.stream.Collectors;

class ParceMatrix implements Task {

    private int number;
    private String line;

    public ParceMatrix(String line) {
        this.line = line;
        this.number = number;
    }

    public boolean execute() {
        List<Integer> numeritos = Arrays.stream(this.line.split(" "))
                .map(st -> Integer.parseInt(st))
                .collect(Collectors.toList());
        ArrayList<Integer> res2 = new ArrayList<>(numeritos);
        int dimension = res2.remove(0);
        this.number = dimension;
        System.out.println("Ejecutando: " + this.number);

        Matrix matriz = new Matrix(dimension);

        System.out.println(matriz.listaDeListas(res2));
        System.out.println(matriz.transposeList(res2));

        boolean noMayoresQue = res2.stream().anyMatch(n -> n > dimension);

        return !noMayoresQue &&
               cumpleCondiciónDeLatino(matriz.listaDeListas(res2), dimension) &&
               cumpleCondiciónDeLatino(matriz.transposeList(res2), dimension) ;
    }

    public int sinRepetidos(List<Integer> list) {
        Set<Integer> listToSet = new HashSet<>(list);
        return listToSet.size();
    }

    public boolean cumpleCondiciónDeLatino(ArrayList<List<Integer>> lists, int dimension){
        boolean res = false;
        res = lists.stream().
                reduce(true, (acum, list) -> acum && (this.sinRepetidos(list) == dimension),
                        Boolean::logicalAnd);

        return res;
    }




    /*public boolean cumpleMatrizNormal(ArrayList<List<Integer>> lists, int dimension) {
        boolean res = false;
        *//*for (List<Integer> i : lists){
            Set<Integer> listToSet = new HashSet<>(i);
            res= res && listToSet.size()==this.number;
        }*//*

        *//*boolean result = lists
                .stream()
                .reduce(false, (list, acum) -> acum && (this.sinRepetidos(list) == dimension));*//*

        res = lists.stream().
                reduce(true, (acum, list) -> acum && (this.sinRepetidos(list) == dimension),
                        Boolean::logicalAnd);

        return res;
    }*/

    /*public boolean cumpleMatrizTranspuesta(ArrayList<List<Integer>> lists, int dimension) {
        boolean res = true;
        *//*for (List<Integer> i : lists) {
            Set<Integer> listToSet = new HashSet<>(i);
            res = res && listToSet.size() == this.number;
        }*//*
        res = lists.stream().
                reduce(true, (acum, list) -> acum && (this.sinRepetidos(list) == dimension),
                        Boolean::logicalAnd);
        return res;
    }*/








}




