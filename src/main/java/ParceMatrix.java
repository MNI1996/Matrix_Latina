class ParceMatrix implements Task{

    private int number;
    private String line;

    public ParceMatrix(int number, String line){
        this.number = number;
        this.line = line;
    }

    public void execute(LatinWorker worker){
        System.out.println("Ejecutando: " + this.number);
        /* parcea */
        /* valida si es latina */
        /* si lo es, worker hace save index */
    }
}