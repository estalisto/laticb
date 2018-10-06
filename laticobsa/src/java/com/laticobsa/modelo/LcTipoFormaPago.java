package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcTipoFormaPago generated by hbm2java
 */
public class LcTipoFormaPago  implements java.io.Serializable {


     private int idTipoFp;
     private String tipoPago;
     private String descripcion;
     private Date fechaRegistro;
     private String estado;
     private Set lcFormapagoRecaudacions = new HashSet(0);

    public LcTipoFormaPago() {
    }

	
    public LcTipoFormaPago(int idTipoFp) {
        this.idTipoFp = idTipoFp;
    }
    public LcTipoFormaPago(int idTipoFp, String tipoPago, String descripcion, Date fechaRegistro, String estado, Set lcFormapagoRecaudacions) {
       this.idTipoFp = idTipoFp;
       this.tipoPago = tipoPago;
       this.descripcion = descripcion;
       this.fechaRegistro = fechaRegistro;
       this.estado = estado;
       this.lcFormapagoRecaudacions = lcFormapagoRecaudacions;
    }
   
    public int getIdTipoFp() {
        return this.idTipoFp;
    }
    
    public void setIdTipoFp(int idTipoFp) {
        this.idTipoFp = idTipoFp;
    }
    public String getTipoPago() {
        return this.tipoPago;
    }
    
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
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
    public Set getLcFormapagoRecaudacions() {
        return this.lcFormapagoRecaudacions;
    }
    
    public void setLcFormapagoRecaudacions(Set lcFormapagoRecaudacions) {
        this.lcFormapagoRecaudacions = lcFormapagoRecaudacions;
    }




}


