package pt.iade.reused.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tipo_doacao")  //nome real da tabela no SQL
public class Tipo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipodoa_id;
    private String tipodoa_nome;
    public Tipo() {}

    public Tipo(int tipodoa_id, String tipoDoa_nome) {
        this.tipodoa_id = tipodoa_id;
        this.tipodoa_nome = tipoDoa_nome;
    }

    public int getTipodoa_id() {
        return tipodoa_id;
    }

    public String getTipoDoa_nome() {
        return tipodoa_nome;
    }

}