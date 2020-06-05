class PoisonPill implements Task {

    private int number;

    public PoisonPill(int number){
        this.number = number;
    }

    public void execute(LatinWorker worker){
        throw new PoisonException("Se acabo lo que se daba");
    }

}