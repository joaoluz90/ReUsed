package pt.iade.reused.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="escala")  //nome real da tabela no SQL
public class Escala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //atributos todos com letra minusculas!!!!
    private int Esc_ID;
    private String Esc_Descricao;
    public Escala() {}

    public Escala(int esc_ID, String esc_Descricao) {
        Esc_ID = esc_ID;
        Esc_Descricao = esc_Descricao;
    }

    public int getEsc_ID() {
        return Esc_ID;
    }

    public String getEsc_Descricao() {
        return Esc_Descricao;
    }

}    // poi