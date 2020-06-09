import java.util.List;

public class Main {


    public static void main(String[] args) {

        Reader re = new Reader("C:\\Users\\usuario\\Desktop\\Matrix_Latina\\inputs-ejemplo");
        Writer wr = new Writer("C:\\Users\\usuario\\Desktop\\Matrix_Latina\\outputs-ejemplo");

        re.open();
        wr.open();
        int cantCuadrados = Integer.parseInt(re.readLine());
        CountDown cd = new CountDown(cantCuadrados);
        ThreadPool th = new ThreadPool(5, 5, cd);
        for(int i = 0; i < cantCuadrados; i++){
            String cuadrado = re.readLine();
            th.launch(new ParceMatrix(cuadrado, i));
        }
        re.close();
        th.stop();
        OrderList orderList = th.getOrderList();
        cd.zero();

        List<Integer > outputList = orderList.getOrderList();

        System.out.println(outputList);

        wr.write(outputList.toString());
        wr.close();
    }
}
