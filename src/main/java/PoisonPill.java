class PoisonPill implements Task {

    private int number;

    public PoisonPill(int number){
        this.number = number;
    }

    public boolean execute(){
        throw new PoisonException("Ya terminé mi work");
    }

    public int getTaskNumber() { return number;}

}