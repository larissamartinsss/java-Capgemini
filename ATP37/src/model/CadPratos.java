package model;

public class CadPratos extends Base{
    public String nome;
    public String descricao;
    public double valor;
    public Categoria categoria;

    public CadPratos(){
        this.categoria = new Categoria();
    }

    @Override
    public boolean equals (Object obj) {
        if(obj instanceof CadPratos) {
            CadPratos outro = (CadPratos)obj;
            if(this.id == outro.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CadPratos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria +
                '}';
    }
}
