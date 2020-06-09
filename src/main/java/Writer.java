import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private String path;
    private File out;
    private FileWriter fw;
    private BufferedWriter bw;

    public Writer(String path){
        this.path = path;
        this.out = new File(this.path);
    }

    public void open(){
        try{
            fw = new FileWriter(this.out);
            bw = new BufferedWriter(fw);
        }catch (IOException e){
            e.printStackTrace();
            this.close();
        }
    }

    public void write(String st){
        try{
            bw.write(st);
        }catch (IOException e){
            e.printStackTrace();
            this.close();
        }
    }

    public void close(){
        try{
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
