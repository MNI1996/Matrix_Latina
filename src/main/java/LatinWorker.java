public class LatinWorker extends Thread {

    private Buffer task_buffer;
    private OrderList oList;

    public LatinWorker(Buffer buff, OrderList oList){
        this.oList = oList;
        this.task_buffer = buff;
    }

    public void run(){
        int i=0;
        try{
            while(true){
                Task task = task_buffer.read();
                task.execute();
            }
        }catch(PoisonException e){
            System.out.println(e.getMessage());
        }
    }

    public void saveIndex(int index){
        this.oList.add(index);
    }
}
