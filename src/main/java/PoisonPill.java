class PoisonPill implements Task {

    private int number;

    public PoisonPill(int number){
        this.number = number;
    }

    public boolean execute(){
        throw new PoisonException("Se acabo lo que se daba");
    }

}