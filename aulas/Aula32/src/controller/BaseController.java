package controller;

import dao.BaseDao;
import dao.PessoaDao;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> list;
    private BaseDao<T> dao;

    public BaseController(PessoaDao filename) {
        this.list = new ArrayList<T>();
        this.dao = dao;
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
        dao.update();
    }

    public void delete(T model){
        this.list.remove(model);
        dao.remove(model);
    }
}
