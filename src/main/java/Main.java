public class Main {


    public static void main(String[] args) {

        Reader re = new Reader("path" + "/inputs-ejemplo");
        Writer wr = new Writer("path" + "/latin_squares");

        re.open();
        int numberOfSquares = Integer.parseInt(re.readLine());

        CountDown countDown = new CountDown(numberOfSquares);

        OrderList oList = new OrderList();

        ThreadPool th = new ThreadPool(4, 5);

        for(int i = 0; i < numberOfSquares; i++){
            String square = re.readLine();
            th.launch(new ParseMatrix(square, i, oList, countDown));
        }
        re.close();


        th.stop();

        countDown.zero();

        System.out.println(oList.getOrderList());

        wr.open();
        wr.write(oList.getOrderList().toString());
        wr.close();
    }
}
