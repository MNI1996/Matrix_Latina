import java.util.ArrayList;

    public class Utils {

        public static ArrayList<Integer> range(int empieza, int termina){
            ArrayList<Integer> rango = new ArrayList<Integer>();

            for(int i=empieza; i < termina; i++){
                rango.add(i);
            }
            return rango;
        }

    }

