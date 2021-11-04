package controller;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> list;

    public BaseController() {
        this.list = new ArrayList<T>();
    }

    public void create(T model){
        this.list.add(model);
    }


    public ArrayList<T> read(){
        return this.list;
    }

    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }
    }

    public void delete(T model){
        this.list.remove(model);
    }
}
