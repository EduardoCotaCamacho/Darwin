/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.darwin.model;

import java.sql.Time;

/**
 *
 * @author GrucasDev
 */
public class Proveedores {
 
    Integer id;
    String oficina;
    String clave;
    String irs;
    String nombre;
    String calle;
    String numerointerior;
    String numeroexterior;
    String cp;
    String ciudad;
    String pais;
    String entidad;
    Integer vinculacion;
    Integer desactivado;
    String colonia;
    String imagenlogo;
    Integer vincinfluyoenvalor;
    String telefono;
    String correoelectronico;
    String apellidopaterno;
    String apellidomaterno;
    String nombreindividual;
    String referencia;
    String municipio;
    String municipiocove;
    String estadocove;
    String nexportadorconfiable;
    String coloniasagarpa;
    String municipiosagarpa;
    Time fecharegistrado;
    Integer habilitarprvenmodulo;

    public Proveedores() {
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIrs() {
        return irs;
    }

    public void setIrs(String irs) {
        this.irs = irs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumerointerior() {
        return numerointerior;
    }

    public void setNumerointerior(String numerointerior) {
        this.numerointerior = numerointerior;
    }

    public String getNumeroexterior() {
        return numeroexterior;
    }

    public void setNumeroexterior(String numeroexterior) {
        this.numeroexterior = numeroexterior;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Integer getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Integer vinculacion) {
        this.vinculacion = vinculacion;
    }

    public Integer getDesactivado() {
        return desactivado;
    }

    public void setDesactivado(Integer desactivado) {
        this.desactivado = desactivado;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getImagenlogo() {
        return imagenlogo;
    }

    public void setImagenlogo(String imagenlogo) {
        this.imagenlogo = imagenlogo;
    }

    public Integer getVincinfluyoenvalor() {
        return vincinfluyoenvalor;
    }

    public void setVincinfluyoenvalor(Integer vincinfluyoenvalor) {
        this.vincinfluyoenvalor = vincinfluyoenvalor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getNombreindividual() {
        return nombreindividual;
    }

    public void setNombreindividual(String nombreindividual) {
        this.nombreindividual = nombreindividual;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipiocove() {
        return municipiocove;
    }

    public void setMunicipiocove(String municipiocove) {
        this.municipiocove = municipiocove;
    }

    public String getEstadocove() {
        return estadocove;
    }

    public void setEstadocove(String estadocove) {
        this.estadocove = estadocove;
    }

    public String getNexportadorconfiable() {
        return nexportadorconfiable;
    }

    public void setNexportadorconfiable(String nexportadorconfiable) {
        this.nexportadorconfiable = nexportadorconfiable;
    }

    public String getColoniasagarpa() {
        return coloniasagarpa;
    }

    public void setColoniasagarpa(String coloniasagarpa) {
        this.coloniasagarpa = coloniasagarpa;
    }

    public String getMunicipiosagarpa() {
        return municipiosagarpa;
    }

    public void setMunicipiosagarpa(String municipiosagarpa) {
        this.municipiosagarpa = municipiosagarpa;
    }

    public Time getFecharegistrado() {
        return fecharegistrado;
    }

    public void setFecharegistrado(Time fecharegistrado) {
        this.fecharegistrado = fecharegistrado;
    }

    public Integer getHabilitarprvenmodulo() {
        return habilitarprvenmodulo;
    }

    public void setHabilitarprvenmodulo(Integer habilitarprvenmodulo) {
        this.habilitarprvenmodulo = habilitarprvenmodulo;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "id=" + id + ", oficina=" + oficina + ", clave=" + clave + ", irs=" + irs + ", nombre=" + nombre + ", calle=" + calle + ", numerointerior=" + numerointerior + ", numeroexterior=" + numeroexterior + ", cp=" + cp + ", ciudad=" + ciudad + ", pais=" + pais + ", entidad=" + entidad + ", vinculacion=" + vinculacion + ", desactivado=" + desactivado + ", colonia=" + colonia + ", imagenlogo=" + imagenlogo + ", vincinfluyoenvalor=" + vincinfluyoenvalor + ", telefono=" + telefono + ", correoelectronico=" + correoelectronico + ", apellidopaterno=" + apellidopaterno + ", apellidomaterno=" + apellidomaterno + ", nombreindividual=" + nombreindividual + ", referencia=" + referencia + ", municipio=" + municipio + ", municipiocove=" + municipiocove + ", estadocove=" + estadocove + ", nexportadorconfiable=" + nexportadorconfiable + ", coloniasagarpa=" + coloniasagarpa + ", municipiosagarpa=" + municipiosagarpa + ", fecharegistrado=" + fecharegistrado + ", habilitarprvenmodulo=" + habilitarprvenmodulo + '}';
    }

    
    
    
}