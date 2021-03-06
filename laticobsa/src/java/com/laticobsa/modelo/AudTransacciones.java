package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * AudTransacciones generated by hbm2java
 */
public class AudTransacciones  implements java.io.Serializable {


     private int idTransacciones;
     private String usuario;
     private Serializable ip;
     private String proceso;
     private String datos;
     private Date fechaRegistro;
     private Character estado;

    public AudTransacciones() {
    }

	
    public AudTransacciones(int idTransacciones) {
        this.idTransacciones = idTransacciones;
    }
    public AudTransacciones(int idTransacciones, String usuario, Serializable ip, String proceso, String datos, Date fechaRegistro, Character estado) {
       this.idTransacciones = idTransacciones;
       this.usuario = usuario;
       this.ip = ip;
       this.proceso = proceso;
       this.datos = datos;
       this.fechaRegistro = fechaRegistro;
       this.estado = estado;
    }
   
    public int getIdTransacciones() {
        return this.idTransacciones;
    }
    
    public void setIdTransacciones(int idTransacciones) {
        this.idTransacciones = idTransacciones;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Serializable getIp() {
        return this.ip;
    }
    
    public void setIp(Serializable ip) {
        this.ip = ip;
    }
    public String getProceso() {
        return this.proceso;
    }
    
    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    public String getDatos() {
        return this.datos;
    }
    
    public void setDatos(String datos) {
        this.datos = datos;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }




}


