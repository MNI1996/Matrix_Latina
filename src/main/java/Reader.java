import java.io.*;

public class Reader {

    private String path;
    private File in;
    private FileReader fr;
    private BufferedReader br;
    private String nextLine;

    public Reader(String path){
        this.path = path;
        this.in = new File(this.path);
    }

    public void open(){
        try{
            this.fr = new FileReader(this.in);
            this.br = new BufferedReader(fr);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            this.close();
        }
    }

    public String readLine(){
        try{
            this.nextLine = this.br.readLine();
        }catch (IOException e){
            e.printStackTrace();
            this.close();
        }
        return this.nextLine;
    }

    public void close(){
        try {
            this.br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
