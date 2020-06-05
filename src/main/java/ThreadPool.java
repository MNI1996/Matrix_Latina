public class ThreadPool {

    private Buffer task_buffer;

    private OrderList oList;

    private int cantWork;

    public ThreadPool(int dimTaskBuffer, int cantWork){
        this.oList = new OrderList();
        this.task_buffer = new Buffer(dimTaskBuffer);
        this.cantWork = cantWork;

        for(Integer i : Utils.range(0, cantWork)){
            new LatinWorker(task_buffer, oList).start();
        }
    }

    public void launch(Task task){
        try{
            task_buffer.write(task);
        } catch (PoisonException e) {
            System.out.println(e.getMessage());
        }
    }

    public void stop(){
        for(int i=0; i<cantWork; i++){
            task_buffer.write(new PoisonPill(i));
        }
    }
}
