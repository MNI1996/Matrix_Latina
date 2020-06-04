class PoisonPill implements Task{

    private int number;

    public PoisonPill(int number){
        this.number = number;
    }

    public void run(){
        throw new PoisonException("Me muero :(");
    }
}