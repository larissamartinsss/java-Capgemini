package dao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while (sc.hasNextLine()){
                String linha = sc.nextLine();

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void update(){

    }

    public void remove(){

    }
}
