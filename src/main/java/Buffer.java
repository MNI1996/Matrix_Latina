public class Buffer {

    private Task[] data;
    private int tamano;
    private int begin=0;
    private int end  =0;

    public Buffer(int tamano) {
        this.tamano = tamano;
        this.data = new Task[this.tamano + 1];
    }

    public synchronized void write ( Task o ) {
        while (isFull())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        data[begin] = o ;
        begin = next ( begin );
        notifyAll ();
    }

    public synchronized Task read () {
        while ( isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        Task result = data[end];
        end = next( end );
        notifyAll();
        return result;
    }

    private boolean isEmpty() { return begin == end; }
    private boolean isFull() { return next(begin) == end; }
    private int next(int i) { return (i + 1) % (this.tamano + 1); }
}

