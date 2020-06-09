import java.util.List;

public class LatinWorker extends Thread {

    private Buffer task_buffer;
    private OrderList oList;
    private CountDown countDown;


    public LatinWorker(Buffer buff, OrderList oList, CountDown countDown){
        this.oList = oList;
        this.task_buffer = buff;
        this.countDown = countDown;
    }



    public void run(){
         try{
            while(true){
                Task task = task_buffer.read();
                boolean latino = task.execute();
                if (latino){
                    int index = task.getTaskNumber() + 1;
                    saveIndex(index);
                    System.out.println("El cuadrado " + index + " es latino.\n");
                }
                countDown.dec();
            }
         }catch(PoisonException e){
            System.out.println(e.getMessage());
        }

    }

    public void saveIndex(int index){
        this.oList.add(index);
    }
}
