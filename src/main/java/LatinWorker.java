import java.util.List;

public class LatinWorker extends Thread {

    private Buffer task_buffer;

    public LatinWorker(Buffer buff){
        this.task_buffer = buff;
    }

    public void run(){
         try{
            while(true){
                Task task = task_buffer.read();
                task.run();
            }
         }catch(PoisonException e){
            System.out.println(e.getMessage());
        }
    }

}
