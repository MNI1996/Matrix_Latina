import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLMessage;

import java.util.*;
import java.util.stream.Collectors;

class ParceMatrix implements Task {

    private int taskNumber;
    private String line;

    public ParceMatrix(String line, int number) {
        this.line = line;
        this.taskNumber = number;
    }

    public int getTaskNumber(){
        return taskNumber;
    }

    public boolean execute() {
        List<Integer> numeritos = Arrays.stream(this.line.split(" "))
                .map(st -> Integer.parseInt(st))
                .collect(Collectors.toList());
        ArrayList<Integer> res2 = new ArrayList<>(numeritos);
        int dimension = res2.remove(0);

        //System.out.println("Ejecutando: " + this.taskNumber);

        Matrix matriz = new Matrix(dimension, res2);

        //System.out.println(matriz.getMatrix());
        //System.out.println(matriz.getTransposedMatrix());

        return !this.noMayoresQue(res2, dimension) &&
               cumpleCondiciónDeLatino(matriz.getMatrix(), dimension) &&
               cumpleCondiciónDeLatino(matriz.getTransposedMatrix(), dimension);
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

    public boolean noMayoresQue(ArrayList<Integer> list, int dimension){
        return list.stream().anyMatch(n -> n > dimension);
    }
    
}




