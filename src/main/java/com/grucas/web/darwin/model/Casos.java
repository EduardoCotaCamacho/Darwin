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
public class Casos {
    Integer id;
    Integer pedimento;
    Integer partida;
    String caso;
    String complemento;
    String complemento2;
    String complemento3;
    String oficina;
    Integer permisoscliente;
    Integer facturaid;
    Decimal valorcomercial;
    Integer automatico;
    Integer fabricante;

    public Casos(Integer id, Integer pedimento, Integer partida, String caso, String complemento, String complemento2, String complemento3, String oficina, Integer permisoscliente, Integer facturaid, Decimal valorcomercial, Integer automatico, Integer fabricante) {
        this.id = id;
        this.pedimento = pedimento;
        this.partida = partida;
        this.caso = caso;
        this.complemento = complemento;
        this.complemento2 = complemento2;
        this.complemento3 = complemento3;
        this.oficina = oficina;
        this.permisoscliente = permisoscliente;
        this.facturaid = facturaid;
        this.valorcomercial = valorcomercial;
        this.automatico = automatico;
        this.fabricante = fabricante;
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

    public Integer getPartida() {
        return partida;
    }

    public void setPartida(Integer partida) {
        this.partida = partida;
    }

    public String getCaso() {
        return caso;
    }

    public void setCaso(String caso) {
        this.caso = caso;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    public String getComplemento3() {
        return complemento3;
    }

    public void setComplemento3(String complemento3) {
        this.complemento3 = complemento3;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Integer getPermisoscliente() {
        return permisoscliente;
    }

    public void setPermisoscliente(Integer permisoscliente) {
        this.permisoscliente = permisoscliente;
    }

    public Integer getFacturaid() {
        return facturaid;
    }

    public void setFacturaid(Integer facturaid) {
        this.facturaid = facturaid;
    }

    public Decimal getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(Decimal valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public Integer getAutomatico() {
        return automatico;
    }

    public void setAutomatico(Integer automatico) {
        this.automatico = automatico;
    }

    public Integer getFabricante() {
        return fabricante;
    }

    public void setFabricante(Integer fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Casos{" + "id=" + id + ", pedimento=" + pedimento + ", partida=" + partida + ", caso=" + caso + ", complemento=" + complemento + ", complemento2=" + complemento2 + ", complemento3=" + complemento3 + ", oficina=" + oficina + ", permisoscliente=" + permisoscliente + ", facturaid=" + facturaid + ", valorcomercial=" + valorcomercial + ", automatico=" + automatico + ", fabricante=" + fabricante + '}';
    }
    
    

}
