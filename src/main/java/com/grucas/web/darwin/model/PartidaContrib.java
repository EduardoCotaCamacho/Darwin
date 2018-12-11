/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.darwin.model;

import com.informix.lang.Decimal;

/**
 *
 * @author EduardoC
 */
public class PartidaContrib {
    
    Integer id;
    String oficina;
    Integer partida;
    Integer contribucion;
    Integer numerodeorden;
    Decimal tasa;
    Integer tipodetasa;
    Integer fp;
    Decimal monto;
    Integer reflejar;
    Decimal porcentajeaplicar;

    public PartidaContrib(Integer id, String oficina, Integer partida, Integer contribucion, Integer numerodeorden, Decimal tasa, Integer tipodetasa, Integer fp, Decimal monto, Integer reflejar, Decimal porcentajeaplicar) {
        this.id = id;
        this.oficina = oficina;
        this.partida = partida;
        this.contribucion = contribucion;
        this.numerodeorden = numerodeorden;
        this.tasa = tasa;
        this.tipodetasa = tipodetasa;
        this.fp = fp;
        this.monto = monto;
        this.reflejar = reflejar;
        this.porcentajeaplicar = porcentajeaplicar;
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

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    public Integer getContribucion() {
        return contribucion;
    }

    public void setContribucion(Integer contribucion) {
        this.contribucion = contribucion;
    }

    public Integer getNumerodeorden() {
        return numerodeorden;
    }

    public void setNumerodeorden(Integer numerodeorden) {
        this.numerodeorden = numerodeorden;
    }

    public Decimal getTasa() {
        return tasa;
    }

    public void setTasa(Decimal tasa) {
        this.tasa = tasa;
    }

    public Integer getTipodetasa() {
        return tipodetasa;
    }

    public void setTipodetasa(Integer tipodetasa) {
        this.tipodetasa = tipodetasa;
    }

    public Integer getFp() {
        return fp;
    }

    public void setFp(Integer fp) {
        this.fp = fp;
    }

    public Decimal getMonto() {
        return monto;
    }

    public void setMonto(Decimal monto) {
        this.monto = monto;
    }

    public Integer getReflejar() {
        return reflejar;
    }

    public void setReflejar(Integer reflejar) {
        this.reflejar = reflejar;
    }

    public Decimal getPorcentajeaplicar() {
        return porcentajeaplicar;
    }

    public void setPorcentajeaplicar(Decimal porcentajeaplicar) {
        this.porcentajeaplicar = porcentajeaplicar;
    }

    
}
