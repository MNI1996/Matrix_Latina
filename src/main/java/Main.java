import java.io.*;
public class Main {


    public static void main(String[] args){
        Matrix matrix = new Matrix(2, 2);
        matrix.print();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {

            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("INSERTAR PATH");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine()) != null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}


/*
*
* 1 2 3
* 3 1 2
* 2 3 1
*
* 3 2 1
* 2 1 3
* 1 3 2
*
*
*
* */
