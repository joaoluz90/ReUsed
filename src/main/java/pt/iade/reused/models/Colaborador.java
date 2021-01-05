package pt.iade.reused.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="colaborador")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int C_ID;
    private String C_nomeP;
    private String C_nomeU;
    private String C_genero;
    //private String C_data;

    public Colaborador() {
    }

    public Colaborador(int c_ID, String c_nomeP, String c_nomeU, String c_genero/*, String c_data*/) {
        C_ID = c_ID;
        C_nomeP = c_nomeP;
        C_nomeU = c_nomeU;
        C_genero = c_genero;
        //C_data = c_data;
    }

    public int getC_ID() {
        return C_ID;
    }

    public String getC_nomeP() {
        return C_nomeP;
    }

    public String getC_nomeU() {
        return C_nomeU;
    }

    public String getC_genero() {
        return C_genero;
    }

    //public String getC_data() {
    //    return C_data;
    //}
}