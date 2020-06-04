public class LatinWorker extends Thread {

    private Buffer task_buffer;
    private OrderList output= new OrderList();
    public LatinWorker(Buffer buff){
        this.task_buffer = buff;
    }

    public void run(){
        int i=0;
        try{
            while(true){
                Task task = task_buffer.read();
                if (task.calculate()){
                    saveIndex(i);
                }
            }
        }catch(PoisonException e){
            System.out.println(e.getMessage());
        }
    }

    public void saveIndex(int index){
        this.output.add(index);

    }
}
