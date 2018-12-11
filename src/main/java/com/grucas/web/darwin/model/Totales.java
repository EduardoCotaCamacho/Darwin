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
public class Totales {

    Integer id;
    Integer pedimento;
    Integer clavecontribucion;
    Integer fp;
    Decimal importe;
    String oficina;

    public Totales(Integer id, Integer pedimento, Integer clavecontribucion, Integer fp, Decimal importe, String oficina) {
        this.id = id;
        this.pedimento = pedimento;
        this.clavecontribucion = clavecontribucion;
        this.fp = fp;
        this.importe = importe;
        this.oficina = oficina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPedimento() {
        return pedimento;
    }

    public void setPedimento(Integer pedimento) {
        this.pedimento = pedimento;
    }

    public Integer getClavecontribucion() {
        return clavecontribucion;
    }

    public void setClavecontribucion(Integer clavecontribucion) {
        this.clavecontribucion = clavecontribucion;
    }

    public Integer getFp() {
        return fp;
    }

    public void setFp(Integer fp) {
        this.fp = fp;
    }

    public Decimal getImporte() {
        return importe;
    }

    public void setImporte(Decimal importe) {
        this.importe = importe;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

}
