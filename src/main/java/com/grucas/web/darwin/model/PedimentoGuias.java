/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grucas.web.darwin.model;

/**
 *
 * @author EduardoC
 */
public class PedimentoGuias {
    Integer id;
    String oficina;
    Integer pedimento;
    String numero;
    String id2;
    Integer tabla;
    Integer bguiasid;

    public PedimentoGuias(Integer id, String oficina, Integer pedimento, String numero, String id2, Integer tabla, Integer bguiasid) {
        this.id = id;
        this.oficina = oficina;
        this.pedimento = pedimento;
        this.numero = numero;
        this.id2 = id2;
        this.tabla = tabla;
        this.bguiasid = bguiasid;
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

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public Integer getTabla() {
        return tabla;
    }

    public void setTabla(Integer tabla) {
        this.tabla = tabla;
    }

    public Integer getBguiasid() {
        return bguiasid;
    }

    public void setBguiasid(Integer bguiasid) {
        this.bguiasid = bguiasid;
    }

    @Override
    public String toString() {
        return "Guias{" + "id=" + id + ", oficina=" + oficina + ", pedimento=" + pedimento + ", numero=" + numero + ", id2=" + id2 + ", tabla=" + tabla + ", bguiasid=" + bguiasid + '}';
    }
    
}
