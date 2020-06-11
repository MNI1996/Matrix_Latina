public class ThreadPool {

    private Buffer task_buffer;

    private int cantWork;

    public ThreadPool(int dimTaskBuffer, int cantWork){
        this.task_buffer = new Buffer(dimTaskBuffer);
        this.cantWork = cantWork;

        for(int i = 0; i != cantWork; i++){
            new LatinWorker(task_buffer).start();
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
        for(int i=0; i < cantWork; i++){
            task_buffer.write(new PoisonPill(i));
        }
    }
}
