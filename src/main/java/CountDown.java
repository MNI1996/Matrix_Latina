public class CountDown {

    private int cont;

    public CountDown(int inicial) {
        this.cont = inicial;
    }

    public synchronized void dec(){
        this.cont--;
        if(cont == 0){
            notifyAll();
        }
    }

    public synchronized void zero() {
        while(this.cont != 0){
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
