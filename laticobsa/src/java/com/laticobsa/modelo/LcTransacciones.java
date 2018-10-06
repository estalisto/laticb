package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * LcTransacciones generated by hbm2java
 */
public class LcTransacciones  implements java.io.Serializable {


     private int idTransaccion;
     private LcClientes lcClientes;
     private LcDatosDeudores lcDatosDeudores;
     private LcEmpleados lcEmpleados;
     private Integer idEmpresa;
     private Integer idAgencia;
     private Integer idCartera;
     private Integer idSubCartera;
     private Integer idSegmento;
     private Integer idSubSegmento;
     private Integer idTipoIdentificacion;
     private String identificacion;
     private String numCuenta;
     private String numCuenta2;
     private BigDecimal montoAsignado;
     private BigDecimal ultimoPago;
     private Integer numeroPagos;
     private BigDecimal valorCuota;
     private Integer diasMora;
     private BigDecimal interesMora;
     private BigDecimal interesCapital;
     private BigDecimal interesAdicional;
     private BigDecimal interesOtros;
     private Integer diasVencidos;
     private BigDecimal totalVencidos;
     private String descripcionCarga;
     private Date fechaTransaccion;
     private String estado;

    public LcTransacciones() {
    }

	
    public LcTransacciones(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public LcTransacciones(int idTransaccion, LcClientes lcClientes, LcDatosDeudores lcDatosDeudores, LcEmpleados lcEmpleados, Integer idEmpresa, Integer idAgencia, Integer idCartera, Integer idSubCartera, Integer idSegmento, Integer idSubSegmento, Integer idTipoIdentificacion, String identificacion, String numCuenta, String numCuenta2, BigDecimal montoAsignado, BigDecimal ultimoPago, Integer numeroPagos, BigDecimal valorCuota, Integer diasMora, BigDecimal interesMora, BigDecimal interesCapital, BigDecimal interesAdicional, BigDecimal interesOtros, Integer diasVencidos, BigDecimal totalVencidos, String descripcionCarga, Date fechaTransaccion, String estado) {
       this.idTransaccion = idTransaccion;
       this.lcClientes = lcClientes;
       this.lcDatosDeudores = lcDatosDeudores;
       this.lcEmpleados = lcEmpleados;
       this.idEmpresa = idEmpresa;
       this.idAgencia = idAgencia;
       this.idCartera = idCartera;
       this.idSubCartera = idSubCartera;
       this.idSegmento = idSegmento;
       this.idSubSegmento = idSubSegmento;
       this.idTipoIdentificacion = idTipoIdentificacion;
       this.identificacion = identificacion;
       this.numCuenta = numCuenta;
       this.numCuenta2 = numCuenta2;
       this.montoAsignado = montoAsignado;
       this.ultimoPago = ultimoPago;
       this.numeroPagos = numeroPagos;
       this.valorCuota = valorCuota;
       this.diasMora = diasMora;
       this.interesMora = interesMora;
       this.interesCapital = interesCapital;
       this.interesAdicional = interesAdicional;
       this.interesOtros = interesOtros;
       this.diasVencidos = diasVencidos;
       this.totalVencidos = totalVencidos;
       this.descripcionCarga = descripcionCarga;
       this.fechaTransaccion = fechaTransaccion;
       this.estado = estado;
    }
   
    public int getIdTransaccion() {
        return this.idTransaccion;
    }
    
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public LcClientes getLcClientes() {
        return this.lcClientes;
    }
    
    public void setLcClientes(LcClientes lcClientes) {
        this.lcClientes = lcClientes;
    }
    public LcDatosDeudores getLcDatosDeudores() {
        return this.lcDatosDeudores;
    }
    
    public void setLcDatosDeudores(LcDatosDeudores lcDatosDeudores) {
        this.lcDatosDeudores = lcDatosDeudores;
    }
    public LcEmpleados getLcEmpleados() {
        return this.lcEmpleados;
    }
    
    public void setLcEmpleados(LcEmpleados lcEmpleados) {
        this.lcEmpleados = lcEmpleados;
    }
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Integer getIdAgencia() {
        return this.idAgencia;
    }
    
    public void setIdAgencia(Integer idAgencia) {
        this.idAgencia = idAgencia;
    }
    public Integer getIdCartera() {
        return this.idCartera;
    }
    
    public void setIdCartera(Integer idCartera) {
        this.idCartera = idCartera;
    }
    public Integer getIdSubCartera() {
        return this.idSubCartera;
    }
    
    public void setIdSubCartera(Integer idSubCartera) {
        this.idSubCartera = idSubCartera;
    }
    public Integer getIdSegmento() {
        return this.idSegmento;
    }
    
    public void setIdSegmento(Integer idSegmento) {
        this.idSegmento = idSegmento;
    }
    public Integer getIdSubSegmento() {
        return this.idSubSegmento;
    }
    
    public void setIdSubSegmento(Integer idSubSegmento) {
        this.idSubSegmento = idSubSegmento;
    }
    public Integer getIdTipoIdentificacion() {
        return this.idTipoIdentificacion;
    }
    
    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNumCuenta() {
        return this.numCuenta;
    }
    
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public String getNumCuenta2() {
        return this.numCuenta2;
    }
    
    public void setNumCuenta2(String numCuenta2) {
        this.numCuenta2 = numCuenta2;
    }
    public BigDecimal getMontoAsignado() {
        return this.montoAsignado;
    }
    
    public void setMontoAsignado(BigDecimal montoAsignado) {
        this.montoAsignado = montoAsignado;
    }
    public BigDecimal getUltimoPago() {
        return this.ultimoPago;
    }
    
    public void setUltimoPago(BigDecimal ultimoPago) {
        this.ultimoPago = ultimoPago;
    }
    public Integer getNumeroPagos() {
        return this.numeroPagos;
    }
    
    public void setNumeroPagos(Integer numeroPagos) {
        this.numeroPagos = numeroPagos;
    }
    public BigDecimal getValorCuota() {
        return this.valorCuota;
    }
    
    public void setValorCuota(BigDecimal valorCuota) {
        this.valorCuota = valorCuota;
    }
    public Integer getDiasMora() {
        return this.diasMora;
    }
    
    public void setDiasMora(Integer diasMora) {
        this.diasMora = diasMora;
    }
    public BigDecimal getInteresMora() {
        return this.interesMora;
    }
    
    public void setInteresMora(BigDecimal interesMora) {
        this.interesMora = interesMora;
    }
    public BigDecimal getInteresCapital() {
        return this.interesCapital;
    }
    
    public void setInteresCapital(BigDecimal interesCapital) {
        this.interesCapital = interesCapital;
    }
    public BigDecimal getInteresAdicional() {
        return this.interesAdicional;
    }
    
    public void setInteresAdicional(BigDecimal interesAdicional) {
        this.interesAdicional = interesAdicional;
    }
    public BigDecimal getInteresOtros() {
        return this.interesOtros;
    }
    
    public void setInteresOtros(BigDecimal interesOtros) {
        this.interesOtros = interesOtros;
    }
    public Integer getDiasVencidos() {
        return this.diasVencidos;
    }
    
    public void setDiasVencidos(Integer diasVencidos) {
        this.diasVencidos = diasVencidos;
    }
    public BigDecimal getTotalVencidos() {
        return this.totalVencidos;
    }
    
    public void setTotalVencidos(BigDecimal totalVencidos) {
        this.totalVencidos = totalVencidos;
    }
    public String getDescripcionCarga() {
        return this.descripcionCarga;
    }
    
    public void setDescripcionCarga(String descripcionCarga) {
        this.descripcionCarga = descripcionCarga;
    }
    public Date getFechaTransaccion() {
        return this.fechaTransaccion;
    }
    
    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }




}


