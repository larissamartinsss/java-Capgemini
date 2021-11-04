package controller;

import dao.BaseDao;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> list;
    private BaseDao<T> dao;

    public BaseController(String filename) {
        this.list = new ArrayList<T>();
        this.dao = new BaseDao<>(filename);
    }

    public void create(T model){
        this.list.add(model);
        this.dao.save(model);
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
