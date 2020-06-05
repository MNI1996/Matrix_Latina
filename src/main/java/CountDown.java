public class CountDown {

    private int cont;

    public CountDown(int inicial) {
        this.cont = inicial;
    }

    public synchronized void dec(){
        this.cont--;
    }

    public synchronized void zero() {
        while(this.cont != 0){
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
    }

}
