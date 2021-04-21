package com.octavio.jsfproject.bean.estudante;

import com.octavio.jsfproject.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Octavio", "Augusto", "Pereira"};
    private Map<String, String> map = new HashMap<>();

    {
        map.put("Octavio", "Augusto");
        map.put("Valquiria", "Lisboa");
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
