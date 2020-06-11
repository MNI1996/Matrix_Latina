class PoisonPill implements Task {

    private int taskNumber;

    public PoisonPill(int number){
        this.taskNumber = number;
    }

    public void run() {
        throw new PoisonException("Finished");
    }

}