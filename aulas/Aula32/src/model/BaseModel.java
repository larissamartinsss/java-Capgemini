package model;

public class BaseModel {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BaseModel) {
            BaseModel outro = (BaseModel) obj;
            if (outro.id == this.id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                '}';
    }
}

