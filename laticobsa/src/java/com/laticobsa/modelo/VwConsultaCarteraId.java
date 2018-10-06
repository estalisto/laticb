package com.laticobsa.modelo;
// Generated 14-ene-2018 19:02:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * VwConsultaCarteraId generated by hbm2java
 */
public class VwConsultaCarteraId  implements java.io.Serializable {


     private Integer idEmpleado;
     private Integer idDatosDeudor;
     private Integer idCliente;
     private Integer idCartera;
     private Integer idSubCartera;
     private Integer idSegmento;
     private Integer idSubSegmento;
     private String identificacion;
     private String nombresCompleto;
     private Integer diasMora;
     private BigDecimal totalVencidos;
     private BigDecimal pagos;
     private String fechaUltPagos;
     private BigDecimal saldo;
     private BigDecimal valorCompro;
     private String fechaComp;
     private String fechUltimaGestion;
     private String ultimaGestion;
     private String resultadoGestion;
     private String estado;

    public VwConsultaCarteraId() {
    }

    public VwConsultaCarteraId(Integer idEmpleado, Integer idDatosDeudor, Integer idCliente, Integer idCartera, Integer idSubCartera, Integer idSegmento, Integer idSubSegmento, String identificacion, String nombresCompleto, Integer diasMora, BigDecimal totalVencidos, BigDecimal pagos, String fechaUltPagos, BigDecimal saldo, BigDecimal valorCompro, String fechaComp, String fechUltimaGestion, String ultimaGestion, String resultadoGestion, String estado) {
       this.idEmpleado = idEmpleado;
       this.idDatosDeudor = idDatosDeudor;
       this.idCliente = idCliente;
       this.idCartera = idCartera;
       this.idSubCartera = idSubCartera;
       this.idSegmento = idSegmento;
       this.idSubSegmento = idSubSegmento;
       this.identificacion = identificacion;
       this.nombresCompleto = nombresCompleto;
       this.diasMora = diasMora;
       this.totalVencidos = totalVencidos;
       this.pagos = pagos;
       this.fechaUltPagos = fechaUltPagos;
       this.saldo = saldo;
       this.valorCompro = valorCompro;
       this.fechaComp = fechaComp;
       this.fechUltimaGestion = fechUltimaGestion;
       this.ultimaGestion = ultimaGestion;
       this.resultadoGestion = resultadoGestion;
       this.estado = estado;
    }
   
    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Integer getIdDatosDeudor() {
        return this.idDatosDeudor;
    }
    
    public void setIdDatosDeudor(Integer idDatosDeudor) {
        this.idDatosDeudor = idDatosDeudor;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
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
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombresCompleto() {
        return this.nombresCompleto;
    }
    
    public void setNombresCompleto(String nombresCompleto) {
        this.nombresCompleto = nombresCompleto;
    }
    public Integer getDiasMora() {
        return this.diasMora;
    }
    
    public void setDiasMora(Integer diasMora) {
        this.diasMora = diasMora;
    }
    public BigDecimal getTotalVencidos() {
        return this.totalVencidos;
    }
    
    public void setTotalVencidos(BigDecimal totalVencidos) {
        this.totalVencidos = totalVencidos;
    }
    public BigDecimal getPagos() {
        return this.pagos;
    }
    
    public void setPagos(BigDecimal pagos) {
        this.pagos = pagos;
    }
    public String getFechaUltPagos() {
        return this.fechaUltPagos;
    }
    
    public void setFechaUltPagos(String fechaUltPagos) {
        this.fechaUltPagos = fechaUltPagos;
    }
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public BigDecimal getValorCompro() {
        return this.valorCompro;
    }
    
    public void setValorCompro(BigDecimal valorCompro) {
        this.valorCompro = valorCompro;
    }
    public String getFechaComp() {
        return this.fechaComp;
    }
    
    public void setFechaComp(String fechaComp) {
        this.fechaComp = fechaComp;
    }
    public String getFechUltimaGestion() {
        return this.fechUltimaGestion;
    }
    
    public void setFechUltimaGestion(String fechUltimaGestion) {
        this.fechUltimaGestion = fechUltimaGestion;
    }
    public String getUltimaGestion() {
        return this.ultimaGestion;
    }
    
    public void setUltimaGestion(String ultimaGestion) {
        this.ultimaGestion = ultimaGestion;
    }
    public String getResultadoGestion() {
        return this.resultadoGestion;
    }
    
    public void setResultadoGestion(String resultadoGestion) {
        this.resultadoGestion = resultadoGestion;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VwConsultaCarteraId) ) return false;
		 VwConsultaCarteraId castOther = ( VwConsultaCarteraId ) other; 
         
		 return ( (this.getIdEmpleado()==castOther.getIdEmpleado()) || ( this.getIdEmpleado()!=null && castOther.getIdEmpleado()!=null && this.getIdEmpleado().equals(castOther.getIdEmpleado()) ) )
 && ( (this.getIdDatosDeudor()==castOther.getIdDatosDeudor()) || ( this.getIdDatosDeudor()!=null && castOther.getIdDatosDeudor()!=null && this.getIdDatosDeudor().equals(castOther.getIdDatosDeudor()) ) )
 && ( (this.getIdCliente()==castOther.getIdCliente()) || ( this.getIdCliente()!=null && castOther.getIdCliente()!=null && this.getIdCliente().equals(castOther.getIdCliente()) ) )
 && ( (this.getIdCartera()==castOther.getIdCartera()) || ( this.getIdCartera()!=null && castOther.getIdCartera()!=null && this.getIdCartera().equals(castOther.getIdCartera()) ) )
 && ( (this.getIdSubCartera()==castOther.getIdSubCartera()) || ( this.getIdSubCartera()!=null && castOther.getIdSubCartera()!=null && this.getIdSubCartera().equals(castOther.getIdSubCartera()) ) )
 && ( (this.getIdSegmento()==castOther.getIdSegmento()) || ( this.getIdSegmento()!=null && castOther.getIdSegmento()!=null && this.getIdSegmento().equals(castOther.getIdSegmento()) ) )
 && ( (this.getIdSubSegmento()==castOther.getIdSubSegmento()) || ( this.getIdSubSegmento()!=null && castOther.getIdSubSegmento()!=null && this.getIdSubSegmento().equals(castOther.getIdSubSegmento()) ) )
 && ( (this.getIdentificacion()==castOther.getIdentificacion()) || ( this.getIdentificacion()!=null && castOther.getIdentificacion()!=null && this.getIdentificacion().equals(castOther.getIdentificacion()) ) )
 && ( (this.getNombresCompleto()==castOther.getNombresCompleto()) || ( this.getNombresCompleto()!=null && castOther.getNombresCompleto()!=null && this.getNombresCompleto().equals(castOther.getNombresCompleto()) ) )
 && ( (this.getDiasMora()==castOther.getDiasMora()) || ( this.getDiasMora()!=null && castOther.getDiasMora()!=null && this.getDiasMora().equals(castOther.getDiasMora()) ) )
 && ( (this.getTotalVencidos()==castOther.getTotalVencidos()) || ( this.getTotalVencidos()!=null && castOther.getTotalVencidos()!=null && this.getTotalVencidos().equals(castOther.getTotalVencidos()) ) )
 && ( (this.getPagos()==castOther.getPagos()) || ( this.getPagos()!=null && castOther.getPagos()!=null && this.getPagos().equals(castOther.getPagos()) ) )
 && ( (this.getFechaUltPagos()==castOther.getFechaUltPagos()) || ( this.getFechaUltPagos()!=null && castOther.getFechaUltPagos()!=null && this.getFechaUltPagos().equals(castOther.getFechaUltPagos()) ) )
 && ( (this.getSaldo()==castOther.getSaldo()) || ( this.getSaldo()!=null && castOther.getSaldo()!=null && this.getSaldo().equals(castOther.getSaldo()) ) )
 && ( (this.getValorCompro()==castOther.getValorCompro()) || ( this.getValorCompro()!=null && castOther.getValorCompro()!=null && this.getValorCompro().equals(castOther.getValorCompro()) ) )
 && ( (this.getFechaComp()==castOther.getFechaComp()) || ( this.getFechaComp()!=null && castOther.getFechaComp()!=null && this.getFechaComp().equals(castOther.getFechaComp()) ) )
 && ( (this.getFechUltimaGestion()==castOther.getFechUltimaGestion()) || ( this.getFechUltimaGestion()!=null && castOther.getFechUltimaGestion()!=null && this.getFechUltimaGestion().equals(castOther.getFechUltimaGestion()) ) )
 && ( (this.getUltimaGestion()==castOther.getUltimaGestion()) || ( this.getUltimaGestion()!=null && castOther.getUltimaGestion()!=null && this.getUltimaGestion().equals(castOther.getUltimaGestion()) ) )
 && ( (this.getResultadoGestion()==castOther.getResultadoGestion()) || ( this.getResultadoGestion()!=null && castOther.getResultadoGestion()!=null && this.getResultadoGestion().equals(castOther.getResultadoGestion()) ) )
 && ( (this.getEstado()==castOther.getEstado()) || ( this.getEstado()!=null && castOther.getEstado()!=null && this.getEstado().equals(castOther.getEstado()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdEmpleado() == null ? 0 : this.getIdEmpleado().hashCode() );
         result = 37 * result + ( getIdDatosDeudor() == null ? 0 : this.getIdDatosDeudor().hashCode() );
         result = 37 * result + ( getIdCliente() == null ? 0 : this.getIdCliente().hashCode() );
         result = 37 * result + ( getIdCartera() == null ? 0 : this.getIdCartera().hashCode() );
         result = 37 * result + ( getIdSubCartera() == null ? 0 : this.getIdSubCartera().hashCode() );
         result = 37 * result + ( getIdSegmento() == null ? 0 : this.getIdSegmento().hashCode() );
         result = 37 * result + ( getIdSubSegmento() == null ? 0 : this.getIdSubSegmento().hashCode() );
         result = 37 * result + ( getIdentificacion() == null ? 0 : this.getIdentificacion().hashCode() );
         result = 37 * result + ( getNombresCompleto() == null ? 0 : this.getNombresCompleto().hashCode() );
         result = 37 * result + ( getDiasMora() == null ? 0 : this.getDiasMora().hashCode() );
         result = 37 * result + ( getTotalVencidos() == null ? 0 : this.getTotalVencidos().hashCode() );
         result = 37 * result + ( getPagos() == null ? 0 : this.getPagos().hashCode() );
         result = 37 * result + ( getFechaUltPagos() == null ? 0 : this.getFechaUltPagos().hashCode() );
         result = 37 * result + ( getSaldo() == null ? 0 : this.getSaldo().hashCode() );
         result = 37 * result + ( getValorCompro() == null ? 0 : this.getValorCompro().hashCode() );
         result = 37 * result + ( getFechaComp() == null ? 0 : this.getFechaComp().hashCode() );
         result = 37 * result + ( getFechUltimaGestion() == null ? 0 : this.getFechUltimaGestion().hashCode() );
         result = 37 * result + ( getUltimaGestion() == null ? 0 : this.getUltimaGestion().hashCode() );
         result = 37 * result + ( getResultadoGestion() == null ? 0 : this.getResultadoGestion().hashCode() );
         result = 37 * result + ( getEstado() == null ? 0 : this.getEstado().hashCode() );
         return result;
   }   


}


