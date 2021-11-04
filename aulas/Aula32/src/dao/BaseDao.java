package dao;
import java.io.FileWriter;
import java.io.IOException;

public class BaseDao<T> {
    private String filename;

    public BaseDao(String filename){
        this.filename = "src/dados/pessoa.txt";
    }
    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void list(){

    }

    public void update(){

    }

    public void remove(){

    }
}
