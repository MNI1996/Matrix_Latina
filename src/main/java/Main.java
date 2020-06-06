import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args){
/*
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {

            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("C:\\Users\\gonzo\\Desktop\\Concurrente\\TP\\Matrix_Latina\\inputs-ejemplo");
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
        */

        //String st2 = "5 1 2 3 4 5 2 3 4 5 1 3 4 5 1 2 4 5 1 3 2 5 1 2 3 4";
          String st2 = "5 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8";
//        List<Integer> numeritos = Arrays.stream(st2.split(" "))
//                .map(st -> Integer.parseInt(st))
//                .collect(Collectors.toList());
//        ArrayList<Integer> res2 = new ArrayList<>(numeritos);
//
//        Matrix matriz = new Matrix(res2.get(0), res2.get(0));
//        int elCinco = res2.remove(0);
//
//        System.out.println(matriz.listaDeListas(res2));
//        System.out.println(matriz.transposeList(res2));
//
//        int noLatino = res2.stream().filter(n -> n > elCinco).toArray().length;
//
//        if(noLatino > 0){
//            System.out.println("No es latino");
//        }else{
//            System.out.println("Es latino");
//        }
//        matriz.sinRepetidos(res2);
//
//    }
       ParceMatrix pm= new ParceMatrix(st2);
        System.out.println(pm.execute());

}
}
