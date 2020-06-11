import java.util.*;
import java.util.stream.Collectors;

class ParseMatrix implements Task {

    private int taskNumber;
    private String line;
    private OrderList oList;
    private CountDown countDown;

    public ParseMatrix(String line, int number, OrderList oList, CountDown countDown) {
        this.line = line;
        this.taskNumber = number;
        this.oList = oList;
        this.countDown = countDown;
    }

    public void run(){
        List<Integer> numeritos = Arrays.stream(this.line.split(" "))
                .map(st -> Integer.parseInt(st))
                .collect(Collectors.toList());
        ArrayList<Integer> res2 = new ArrayList<>(numeritos);

        int matrixDimension = res2.remove(0);

        Matrix matrix = new Matrix(matrixDimension, res2);

        this.addIfItMeets(
                !this.noGreaterThan(res2, matrixDimension),
                this.meetsLatinCondition(matrix.getMatrix(), matrixDimension),
                this.meetsLatinCondition(matrix.getTransposedMatrix(), matrixDimension)
        );

        this.countDown.dec();
    }

    public int numbersWithoutRepeats(List<Integer> list) {
        Set<Integer> listToSet = new HashSet<>(list);
        return listToSet.size();
    }

    public boolean meetsLatinCondition(ArrayList<List<Integer>> lists, int dimension){

        return lists.stream().
                reduce(true, (acum, list) -> acum && (this.numbersWithoutRepeats(list) == dimension),
                        Boolean::logicalAnd);
    }

    public boolean noGreaterThan(ArrayList<Integer> list, int dimension){
        return list.stream().anyMatch(n -> n > dimension);
    }

    public void addIfItMeets(Boolean b1, Boolean b2, Boolean b3){
        if(b1 && b2 && b3){
            this.oList.add(this.taskNumber + 1);
        }
    }
    
}




