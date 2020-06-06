import java.util.*;
import java.util.stream.Collectors;


class ParceMatrix implements Task{

    private int number;
    private String line;

    public ParceMatrix( String line){
        this.line = line;
        this.number = number;
    }

    public boolean execute(){
        List<Integer> numeritos = Arrays.stream(this.line.split(" "))
                .map(st -> Integer.parseInt(st))
                .collect(Collectors.toList());
        ArrayList<Integer> res2 = new ArrayList<>(numeritos);
        int dimension = res2.remove(0);
        this.number=dimension;
        System.out.println("Ejecutando: " + this.number);

        Matrix matriz = new Matrix(dimension, dimension);

      System.out.println(matriz.listaDeListas(res2));
      System.out.println(matriz.transposeList(res2));

        boolean noMayoresQue = res2.stream().anyMatch(n -> n > dimension);

        return  noMayoresQue &&
                cumpleMatrizNormal(matriz.listaDeListas(res2)) &&
                cumpleMatrizTranspuesta(matriz.transposeList(res2));
    }
    public boolean cumpleMatrizNormal(ArrayList<List<Integer>> lists){
        boolean res = true;
        for (List<Integer> i : lists){
            Set<Integer> listToSet = new HashSet<>(i);
            res= res && listToSet.size()==this.number;
        }
        return res;
    }

    public boolean cumpleMatrizTranspuesta(ArrayList<List<Integer>> lists){
        boolean res = true;
        for (List<Integer> i : lists){
            Set<Integer> listToSet = new HashSet<>(i);
            res= res && listToSet.size()==this.number;
        }
        return res;
    }
}
