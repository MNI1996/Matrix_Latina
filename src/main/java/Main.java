import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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

        String st2 = "5 1 2 3 4 5 2 3 4 5 1 3 4 5 1 2 4 5 1 3 2 5 1 2 3 4";
        char[] chars = st2.toCharArray();
        String[] res = parseListString(chars,count(st2) + 1);
        ArrayList<Integer> res2 = parseListInteger(res);
        System.out.println(res2.get(0));
        Matrix matriz = new Matrix(res2.get(0), res2.get(0));
        int elCinco = res2.remove(0);
        Scanner myObj = new Scanner(System.in);

        matriz.listaDeListas(res2);

        int noLatino = res2.stream().filter(n -> n > elCinco).toArray().length;

        if(noLatino > 0){
            System.out.println("No es latino");
        }else{
            System.out.println("Es latino");
        }

        matriz.print();
        //System.out.println(res2);

    }

    public static int count(String st){
        int cont = 0;
        for (char c : st.toCharArray()){
            if(c == ' '){
                cont++;
            }
        }
        return cont;
    }

    public static String[] parseListString(char[] chars, int dim){
        String[] res = new String[dim];
        initilizeArray(res);
        int index = 0;
        for(int i=0; i < chars.length; i++){
            if(chars[i] != ' '){
                res[index] = res[index] + chars[i];
            }else{
                index++;
            }
        }
        return res;
    }

    public static ArrayList<Integer> parseListInteger(String[] listS) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i < listS.length; i++) {
            res.add(Integer.parseInt(listS[i]));
        }
        return res;
    }

    public static void initilizeArray(String[] listS){
        for(int i=0; i < listS.length; i++) {
            listS[i] = "";
        }
    }

}
