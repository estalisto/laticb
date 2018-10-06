package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LcSubsegmento generated by hbm2java
 */
public class LcSubsegmento  implements java.io.Serializable {


     private int idSubsegmento;
     private LcSegmento lcSegmento;
     private String nombreSubsegmento;
     private Date fechaCreacion;
     private String estado;

    public LcSubsegmento() {
    }

	
    public LcSubsegmento(int idSubsegmento) {
        this.idSubsegmento = idSubsegmento;
    }
    public LcSubsegmento(int idSubsegmento, LcSegmento lcSegmento, String nombreSubsegmento, Date fechaCreacion, String estado) {
       this.idSubsegmento = idSubsegmento;
       this.lcSegmento = lcSegmento;
       this.nombreSubsegmento = nombreSubsegmento;
       this.fechaCreacion = fechaCreacion;
       this.estado = estado;
    }
   
    public int getIdSubsegmento() {
        return this.idSubsegmento;
    }
    
    public void setIdSubsegmento(int idSubsegmento) {
        this.idSubsegmento = idSubsegmento;
    }
    public LcSegmento getLcSegmento() {
        return this.lcSegmento;
    }
    
    public void setLcSegmento(LcSegmento lcSegmento) {
        this.lcSegmento = lcSegmento;
    }
    public String getNombreSubsegmento() {
        return this.nombreSubsegmento;
    }
    
    public void setNombreSubsegmento(String nombreSubsegmento) {
        this.nombreSubsegmento = nombreSubsegmento;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


