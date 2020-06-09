public class Main {


    public static void main(String[] args) {

        Reader re = new Reader("C:\\Users\\usuario\\Desktop\\Matrix_Latina\\inputs-ejemplo");
        Writer wr = new Writer("C:\\Users\\usuario\\Desktop\\Matrix_Latina\\outputs-ejemplo");

        re.open();
        wr.open();
        int cantCuadrados = Integer.parseInt(re.readLine());
        for(int i = 0; i < cantCuadrados; i++){
            String cuadrado = re.readLine();
            ParceMatrix pm= new ParceMatrix(cuadrado, i);
            if(pm.execute()){
                //(wr.write("El cuadrado " + (i + 1) + " es latino.\n");
                System.out.println("El cuadrado " + (i + 1) + " es latino.\n");
            }
        }
        re.close();
        wr.close();
    }
}
