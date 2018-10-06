package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcParametros generated by hbm2java
 */
public class LcParametros  implements java.io.Serializable {


     private int id;
     private Integer idParametro;
     private String parametro;
     private String valor;
     private String descripcion;
     private Date fechaRegistro;
     private String estado;

    public LcParametros() {
    }

	
    public LcParametros(int id) {
        this.id = id;
    }
    public LcParametros(int id, Integer idParametro, String parametro, String valor, String descripcion, Date fechaRegistro, String estado) {
       this.id = id;
       this.idParametro = idParametro;
       this.parametro = parametro;
       this.valor = valor;
       this.descripcion = descripcion;
       this.fechaRegistro = fechaRegistro;
       this.estado = estado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Integer getIdParametro() {
        return this.idParametro;
    }
    
    public void setIdParametro(Integer idParametro) {
        this.idParametro = idParametro;
    }
    public String getParametro() {
        return this.parametro;
    }
    
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}

