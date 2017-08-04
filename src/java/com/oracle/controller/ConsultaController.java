package com.oracle.controller;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ConsultaController {
    
    private String email;
    
    
    private String entry;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntry() {
        return "Eduardo Castillo Mendoza";
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
    
    
    
    
    public String validarProceso(){     
        switch (email) {
            case "uno@gmail.com":
                return "completo";
            case "dos@gmail.com":
                return "incompleto";
            default:
                return "noexiste";
        }
    }
    
    public String skipOutCome(){
       return "skipCome";
    }
}
