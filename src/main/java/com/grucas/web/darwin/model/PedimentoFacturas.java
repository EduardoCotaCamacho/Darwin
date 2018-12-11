/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.darwin.model;

import com.informix.lang.Decimal;
import java.sql.Date;

/**
 *
 * @author EduardoC
 */
public class PedimentoFacturas {

    Integer id;
    String oficina;
    Integer pedimento;
    String numero;
    Date fecha;
    String terminodefacturacion;
    String monedadefacturacion;
    Decimal valorendolares;
    Decimal valorunidadmonetaria;
    Integer proveedor;
    Decimal factor;
    Integer trafico;
    Integer remesa;
    Integer vinculacion;
    Integer subdividida;
    Integer cfactura;
    String clavepaisme;
    String ipdeclarationnumber;
    Integer factor8digitos;
    String edocument;
    String observaciones;
    Integer subdivision;
    Date fechaexpedicioncove;
    Integer certificadodeorigen;
    Integer apoderadocove;
    Integer selladoxtipofigura;
    String firmacove;
    String numerodecertificado;
    String monedacove;
    Decimal factorcove;
    Integer estatusdescargo;
    String observacionescove;
    Integer nexportadorconfiable;
    Integer nectomadode;
    String archivodigital;
    String feacove;
    String uuid;
    Integer noenajenacion14cff;
    Integer omitirvaliddefactura;
    Integer encontingencia;
    String archivoconuuid_adp;
    Date fechatransmisioncove;
    Integer fabricante;

    public PedimentoFacturas(Integer id, String oficina, Integer pedimento, String numero, Date fecha, String terminodefacturacion, String monedadefacturacion, Decimal valorendolares, Decimal valorunidadmonetaria, Integer proveedor, Decimal factor, Integer trafico, Integer remesa, Integer vinculacion, Integer subdividida, Integer cfactura, String clavepaisme, String ipdeclarationnumber, Integer factor8digitos, String edocument, String observaciones, Integer subdivision, Date fechaexpedicioncove, Integer certificadodeorigen, Integer apoderadocove, Integer selladoxtipofigura, String firmacove, String numerodecertificado, String monedacove, Decimal factorcove, Integer estatusdescargo, String observacionescove, Integer nexportadorconfiable, Integer nectomadode, String archivodigital, String feacove, String uuid, Integer noenajenacion14cff, Integer omitirvaliddefactura, Integer encontingencia, String archivoconuuid_adp, Date fechatransmisioncove, Integer fabricante) {
        this.id = id;
        this.oficina = oficina;
        this.pedimento = pedimento;
        this.numero = numero;
        this.fecha = fecha;
        this.terminodefacturacion = terminodefacturacion;
        this.monedadefacturacion = monedadefacturacion;
        this.valorendolares = valorendolares;
        this.valorunidadmonetaria = valorunidadmonetaria;
        this.proveedor = proveedor;
        this.factor = factor;
        this.trafico = trafico;
        this.remesa = remesa;
        this.vinculacion = vinculacion;
        this.subdividida = subdividida;
        this.cfactura = cfactura;
        this.clavepaisme = clavepaisme;
        this.ipdeclarationnumber = ipdeclarationnumber;
        this.factor8digitos = factor8digitos;
        this.edocument = edocument;
        this.observaciones = observaciones;
        this.subdivision = subdivision;
        this.fechaexpedicioncove = fechaexpedicioncove;
        this.certificadodeorigen = certificadodeorigen;
        this.apoderadocove = apoderadocove;
        this.selladoxtipofigura = selladoxtipofigura;
        this.firmacove = firmacove;
        this.numerodecertificado = numerodecertificado;
        this.monedacove = monedacove;
        this.factorcove = factorcove;
        this.estatusdescargo = estatusdescargo;
        this.observacionescove = observacionescove;
        this.nexportadorconfiable = nexportadorconfiable;
        this.nectomadode = nectomadode;
        this.archivodigital = archivodigital;
        this.feacove = feacove;
        this.uuid = uuid;
        this.noenajenacion14cff = noenajenacion14cff;
        this.omitirvaliddefactura = omitirvaliddefactura;
        this.encontingencia = encontingencia;
        this.archivoconuuid_adp = archivoconuuid_adp;
        this.fechatransmisioncove = fechatransmisioncove;
        this.fabricante = fabricante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Integer getPedimento() {
        return pedimento;
    }

    public void setPedimento(Integer pedimento) {
        this.pedimento = pedimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTerminodefacturacion() {
        return terminodefacturacion;
    }

    public void setTerminodefacturacion(String terminodefacturacion) {
        this.terminodefacturacion = terminodefacturacion;
    }

    public String getMonedadefacturacion() {
        return monedadefacturacion;
    }

    public void setMonedadefacturacion(String monedadefacturacion) {
        this.monedadefacturacion = monedadefacturacion;
    }

    public Decimal getValorendolares() {
        return valorendolares;
    }

    public void setValorendolares(Decimal valorendolares) {
        this.valorendolares = valorendolares;
    }

    public Decimal getValorunidadmonetaria() {
        return valorunidadmonetaria;
    }

    public void setValorunidadmonetaria(Decimal valorunidadmonetaria) {
        this.valorunidadmonetaria = valorunidadmonetaria;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }

    public Decimal getFactor() {
        return factor;
    }

    public void setFactor(Decimal factor) {
        this.factor = factor;
    }

    public Integer getTrafico() {
        return trafico;
    }

    public void setTrafico(Integer trafico) {
        this.trafico = trafico;
    }

    public Integer getRemesa() {
        return remesa;
    }

    public void setRemesa(Integer remesa) {
        this.remesa = remesa;
    }

    public Integer getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Integer vinculacion) {
        this.vinculacion = vinculacion;
    }

    public Integer getSubdividida() {
        return subdividida;
    }

    public void setSubdividida(Integer subdividida) {
        this.subdividida = subdividida;
    }

    public Integer getCfactura() {
        return cfactura;
    }

    public void setCfactura(Integer cfactura) {
        this.cfactura = cfactura;
    }

    public String getClavepaisme() {
        return clavepaisme;
    }

    public void setClavepaisme(String clavepaisme) {
        this.clavepaisme = clavepaisme;
    }

    public String getIpdeclarationnumber() {
        return ipdeclarationnumber;
    }

    public void setIpdeclarationnumber(String ipdeclarationnumber) {
        this.ipdeclarationnumber = ipdeclarationnumber;
    }

    public Integer getFactor8digitos() {
        return factor8digitos;
    }

    public void setFactor8digitos(Integer factor8digitos) {
        this.factor8digitos = factor8digitos;
    }

    public String getEdocument() {
        return edocument;
    }

    public void setEdocument(String edocument) {
        this.edocument = edocument;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(Integer subdivision) {
        this.subdivision = subdivision;
    }

    public Date getFechaexpedicioncove() {
        return fechaexpedicioncove;
    }

    public void setFechaexpedicioncove(Date fechaexpedicioncove) {
        this.fechaexpedicioncove = fechaexpedicioncove;
    }

    public Integer getCertificadodeorigen() {
        return certificadodeorigen;
    }

    public void setCertificadodeorigen(Integer certificadodeorigen) {
        this.certificadodeorigen = certificadodeorigen;
    }

    public Integer getApoderadocove() {
        return apoderadocove;
    }

    public void setApoderadocove(Integer apoderadocove) {
        this.apoderadocove = apoderadocove;
    }

    public Integer getSelladoxtipofigura() {
        return selladoxtipofigura;
    }

    public void setSelladoxtipofigura(Integer selladoxtipofigura) {
        this.selladoxtipofigura = selladoxtipofigura;
    }

    public String getFirmacove() {
        return firmacove;
    }

    public void setFirmacove(String firmacove) {
        this.firmacove = firmacove;
    }

    public String getNumerodecertificado() {
        return numerodecertificado;
    }

    public void setNumerodecertificado(String numerodecertificado) {
        this.numerodecertificado = numerodecertificado;
    }

    public String getMonedacove() {
        return monedacove;
    }

    public void setMonedacove(String monedacove) {
        this.monedacove = monedacove;
    }

    public Decimal getFactorcove() {
        return factorcove;
    }

    public void setFactorcove(Decimal factorcove) {
        this.factorcove = factorcove;
    }

    public Integer getEstatusdescargo() {
        return estatusdescargo;
    }

    public void setEstatusdescargo(Integer estatusdescargo) {
        this.estatusdescargo = estatusdescargo;
    }

    public String getObservacionescove() {
        return observacionescove;
    }

    public void setObservacionescove(String observacionescove) {
        this.observacionescove = observacionescove;
    }

    public Integer getNexportadorconfiable() {
        return nexportadorconfiable;
    }

    public void setNexportadorconfiable(Integer nexportadorconfiable) {
        this.nexportadorconfiable = nexportadorconfiable;
    }

    public Integer getNectomadode() {
        return nectomadode;
    }

    public void setNectomadode(Integer nectomadode) {
        this.nectomadode = nectomadode;
    }

    public String getArchivodigital() {
        return archivodigital;
    }

    public void setArchivodigital(String archivodigital) {
        this.archivodigital = archivodigital;
    }

    public String getFeacove() {
        return feacove;
    }

    public void setFeacove(String feacove) {
        this.feacove = feacove;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getNoenajenacion14cff() {
        return noenajenacion14cff;
    }

    public void setNoenajenacion14cff(Integer noenajenacion14cff) {
        this.noenajenacion14cff = noenajenacion14cff;
    }

    public Integer getOmitirvaliddefactura() {
        return omitirvaliddefactura;
    }

    public void setOmitirvaliddefactura(Integer omitirvaliddefactura) {
        this.omitirvaliddefactura = omitirvaliddefactura;
    }

    public Integer getEncontingencia() {
        return encontingencia;
    }

    public void setEncontingencia(Integer encontingencia) {
        this.encontingencia = encontingencia;
    }

    public String getArchivoconuuid_adp() {
        return archivoconuuid_adp;
    }

    public void setArchivoconuuid_adp(String archivoconuuid_adp) {
        this.archivoconuuid_adp = archivoconuuid_adp;
    }

    public Date getFechatransmisioncove() {
        return fechatransmisioncove;
    }

    public void setFechatransmisioncove(Date fechatransmisioncove) {
        this.fechatransmisioncove = fechatransmisioncove;
    }

    public Integer getFabricante() {
        return fabricante;
    }

    public void setFabricante(Integer fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Facturas{" + "id=" + id + ", oficina=" + oficina + ", pedimento=" + pedimento + ", numero=" + numero + ", fecha=" + fecha + ", terminodefacturacion=" + terminodefacturacion + ", monedadefacturacion=" + monedadefacturacion + ", valorendolares=" + valorendolares + ", valorunidadmonetaria=" + valorunidadmonetaria + ", proveedor=" + proveedor + ", factor=" + factor + ", trafico=" + trafico + ", remesa=" + remesa + ", vinculacion=" + vinculacion + ", subdividida=" + subdividida + ", cfactura=" + cfactura + ", clavepaisme=" + clavepaisme + ", ipdeclarationnumber=" + ipdeclarationnumber + ", factor8digitos=" + factor8digitos + ", edocument=" + edocument + ", observaciones=" + observaciones + ", subdivision=" + subdivision + ", fechaexpedicioncove=" + fechaexpedicioncove + ", certificadodeorigen=" + certificadodeorigen + ", apoderadocove=" + apoderadocove + ", selladoxtipofigura=" + selladoxtipofigura + ", firmacove=" + firmacove + ", numerodecertificado=" + numerodecertificado + ", monedacove=" + monedacove + ", factorcove=" + factorcove + ", estatusdescargo=" + estatusdescargo + ", observacionescove=" + observacionescove + ", nexportadorconfiable=" + nexportadorconfiable + ", nectomadode=" + nectomadode + ", archivodigital=" + archivodigital + ", feacove=" + feacove + ", uuid=" + uuid + ", noenajenacion14cff=" + noenajenacion14cff + ", omitirvaliddefactura=" + omitirvaliddefactura + ", encontingencia=" + encontingencia + ", archivoconuuid_adp=" + archivoconuuid_adp + ", fechatransmisioncove=" + fechatransmisioncove + ", fabricante=" + fabricante + '}';
    }
    
   

}
