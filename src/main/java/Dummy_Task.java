class Dummy_Task implements Task{

    private int number;

    public Dummy_Task(int number){// aca recibiria una linea del input
        this.number = number;//aca se parsea la linea para crear la matriz
    }

    public boolean calculate(){
    return true;
    }



    public void run(){
        System.out.println("Ejecutando: " + this.number);
    }
}