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
public class Partidas {

    Integer id;
    String oficina;
    Integer pedimento;
    Integer numero;
    String paisdeorigen;
    String paisvendcomp;
    String fraccion;
    String descripcion;
    Decimal valorcomercial;
    Decimal valorenaduana;
    Decimal valorcomercialpesos;
    Decimal valorcomercialdlls;
    Decimal valorenaduanapesos;
    Decimal valorenaduanadlls;
    Decimal cantidadcomercial;
    Integer unidadcomercial;
    Decimal cantidadtarifa;
    Integer unidadtarifa;
    Decimal valoragregado;
    Decimal factormonedaextranj;
    String monedafactor;
    String paisfactor;
    Decimal peso;
    String factura;
    Integer facturaid;
    Integer numerodeparteid;
    String marca;
    String modelo;
    String uso;
    String estado;
    Integer vinculacion;
    Integer metododevaloracion;
    Decimal kilosdeazucar;
    Integer esazucar;
    Decimal montoacompensaradv;
    String aplicarcuotaa;
    Decimal montoacompensarcc;
    Integer iepscuota;
    Decimal iepspemex;
    Integer anoisan;
    Integer pesoisancamiones;
    Decimal montoigi;
    Decimal valormciasnoorig;
    Integer fianza;
    Integer desgravaciontigi;
    Decimal preferenciaporc;
    String paisprocedencia;
    Integer seaplicotlc;
    Integer seaplicoarancelcuota;
    Integer fraccion6digitos;
    Integer aplicartcenexport;
    Integer impresionfactorvc;
    Integer calculardiferdtar1;
    Integer mciarevisada;
    Integer trafico;
    Integer cdetalletrafico;
    Integer cmnumeroretorno;
    Decimal cmtotalarancelusacan;
    Decimal cmmontoexcento;
    Decimal cmimporte;
    Integer cmfpimporte;
    Integer cmfpdta;
    Integer remesadetalleid;
    String usuario;
    Decimal preferenciaporcce;
    String observaciones;
    String numerodeparte;
    Integer pagadta;
    Integer envasereutilizable;
    Decimal cuotaespecifica;
    Decimal montocompensaradv;
    Decimal compensarcc;
    Decimal garantiaadv;
    Decimal garantiadta;
    Decimal garantiaiva;
    Decimal garantiacc;
    Decimal garantiaieps;
    Decimal garantiaisan;
    Decimal montodta;
    String subdivisionfraccion;
    Integer fpcuotaespecifica;
    String criteriotratoprefere;
    String productor;
    String costoneto;
    Integer medidatransicion;
    Decimal compensarmt;
    String aplicarcuotaa_mt;
    Decimal valorbaseunitario;
    Integer articulo8;
    Decimal pesoocantidadieps;
    Integer aplicariepsa;
    Decimal cuotaparaieps;
    Integer tipomercanciaieps;
    Integer todoimporteca;
    Decimal importeca;
    Integer aplicofpdetasacero;
    String umf;
    Decimal cantidadfactura;
    String monedacove;
    Decimal factorcove;
    String fraccioncorrelacion;
    Decimal cantoriginalcomerc;
    Decimal cantoriginaltarifa;
    String descripcioncove;
    Integer altadensidadcalorica;
    Decimal tasapromedioieps;
    Decimal importeiepspromedio;
    Decimal pesobruto;
    Decimal cantidadaplicaracc;
    Integer precioestimadoum;
    Decimal precioestimado;
    Decimal valordereferenciacc;
    Integer umreferenciacc;
    Decimal valoraduanag5;
    Integer ccsoloparaiva;
    Integer tasaiepsenctvs;
    Decimal pagoefectuadoigi;
    Decimal pagoefectuadoiva;
    Decimal pagoefectuadoieps;
    Integer aplicaaap;
    String claveprodserv;
    String claveunidad;
    Decimal estimuloieps;
    Integer tipoestimuloieps;
    Decimal valordolarescove;
    Decimal preciounitario;

    public Partidas(Integer id, String oficina, Integer pedimento, Integer numero, String paisdeorigen, String paisvendcomp, String fraccion, String descripcion, Decimal valorcomercial, Decimal valorenaduana, Decimal valorcomercialpesos, Decimal valorcomercialdlls, Decimal valorenaduanapesos, Decimal valorenaduanadlls, Decimal cantidadcomercial, Integer unidadcomercial, Decimal cantidadtarifa, Integer unidadtarifa, Decimal valoragregado, Decimal factormonedaextranj, String monedafactor, String paisfactor, Decimal peso, String factura, Integer facturaid, Integer numerodeparteid, String marca, String modelo, String uso, String estado, Integer vinculacion, Integer metododevaloracion, Decimal kilosdeazucar, Integer esazucar, Decimal montoacompensaradv, String aplicarcuotaa, Decimal montoacompensarcc, Integer iepscuota, Decimal iepspemex, Integer anoisan, Integer pesoisancamiones, Decimal montoigi, Decimal valormciasnoorig, Integer fianza, Integer desgravaciontigi, Decimal preferenciaporc, String paisprocedencia, Integer seaplicotlc, Integer seaplicoarancelcuota, Integer fraccion6digitos, Integer aplicartcenexport, Integer impresionfactorvc, Integer calculardiferdtar1, Integer mciarevisada, Integer trafico, Integer cdetalletrafico, Integer cmnumeroretorno, Decimal cmtotalarancelusacan, Decimal cmmontoexcento, Decimal cmimporte, Integer cmfpimporte, Integer cmfpdta, Integer remesadetalleid, String usuario, Decimal preferenciaporcce, String observaciones, String numerodeparte, Integer pagadta, Integer envasereutilizable, Decimal cuotaespecifica, Decimal montocompensaradv, Decimal compensarcc, Decimal garantiaadv, Decimal garantiadta, Decimal garantiaiva, Decimal garantiacc, Decimal garantiaieps, Decimal garantiaisan, Decimal montodta, String subdivisionfraccion, Integer fpcuotaespecifica, String criteriotratoprefere, String productor, String costoneto, Integer medidatransicion, Decimal compensarmt, String aplicarcuotaa_mt, Decimal valorbaseunitario, Integer articulo8, Decimal pesoocantidadieps, Integer aplicariepsa, Decimal cuotaparaieps, Integer tipomercanciaieps, Integer todoimporteca, Decimal importeca, Integer aplicofpdetasacero, String umf, Decimal cantidadfactura, String monedacove, Decimal factorcove, String fraccioncorrelacion, Decimal cantoriginalcomerc, Decimal cantoriginaltarifa, String descripcioncove, Integer altadensidadcalorica, Decimal tasapromedioieps, Decimal importeiepspromedio, Decimal pesobruto, Decimal cantidadaplicaracc, Integer precioestimadoum, Decimal precioestimado, Decimal valordereferenciacc, Integer umreferenciacc, Decimal valoraduanag5, Integer ccsoloparaiva, Integer tasaiepsenctvs, Decimal pagoefectuadoigi, Decimal pagoefectuadoiva, Decimal pagoefectuadoieps, Integer aplicaaap, String claveprodserv, String claveunidad, Decimal estimuloieps, Integer tipoestimuloieps, Decimal valordolarescove, Decimal preciounitario) {
        this.id = id;
        this.oficina = oficina;
        this.pedimento = pedimento;
        this.numero = numero;
        this.paisdeorigen = paisdeorigen;
        this.paisvendcomp = paisvendcomp;
        this.fraccion = fraccion;
        this.descripcion = descripcion;
        this.valorcomercial = valorcomercial;
        this.valorenaduana = valorenaduana;
        this.valorcomercialpesos = valorcomercialpesos;
        this.valorcomercialdlls = valorcomercialdlls;
        this.valorenaduanapesos = valorenaduanapesos;
        this.valorenaduanadlls = valorenaduanadlls;
        this.cantidadcomercial = cantidadcomercial;
        this.unidadcomercial = unidadcomercial;
        this.cantidadtarifa = cantidadtarifa;
        this.unidadtarifa = unidadtarifa;
        this.valoragregado = valoragregado;
        this.factormonedaextranj = factormonedaextranj;
        this.monedafactor = monedafactor;
        this.paisfactor = paisfactor;
        this.peso = peso;
        this.factura = factura;
        this.facturaid = facturaid;
        this.numerodeparteid = numerodeparteid;
        this.marca = marca;
        this.modelo = modelo;
        this.uso = uso;
        this.estado = estado;
        this.vinculacion = vinculacion;
        this.metododevaloracion = metododevaloracion;
        this.kilosdeazucar = kilosdeazucar;
        this.esazucar = esazucar;
        this.montoacompensaradv = montoacompensaradv;
        this.aplicarcuotaa = aplicarcuotaa;
        this.montoacompensarcc = montoacompensarcc;
        this.iepscuota = iepscuota;
        this.iepspemex = iepspemex;
        this.anoisan = anoisan;
        this.pesoisancamiones = pesoisancamiones;
        this.montoigi = montoigi;
        this.valormciasnoorig = valormciasnoorig;
        this.fianza = fianza;
        this.desgravaciontigi = desgravaciontigi;
        this.preferenciaporc = preferenciaporc;
        this.paisprocedencia = paisprocedencia;
        this.seaplicotlc = seaplicotlc;
        this.seaplicoarancelcuota = seaplicoarancelcuota;
        this.fraccion6digitos = fraccion6digitos;
        this.aplicartcenexport = aplicartcenexport;
        this.impresionfactorvc = impresionfactorvc;
        this.calculardiferdtar1 = calculardiferdtar1;
        this.mciarevisada = mciarevisada;
        this.trafico = trafico;
        this.cdetalletrafico = cdetalletrafico;
        this.cmnumeroretorno = cmnumeroretorno;
        this.cmtotalarancelusacan = cmtotalarancelusacan;
        this.cmmontoexcento = cmmontoexcento;
        this.cmimporte = cmimporte;
        this.cmfpimporte = cmfpimporte;
        this.cmfpdta = cmfpdta;
        this.remesadetalleid = remesadetalleid;
        this.usuario = usuario;
        this.preferenciaporcce = preferenciaporcce;
        this.observaciones = observaciones;
        this.numerodeparte = numerodeparte;
        this.pagadta = pagadta;
        this.envasereutilizable = envasereutilizable;
        this.cuotaespecifica = cuotaespecifica;
        this.montocompensaradv = montocompensaradv;
        this.compensarcc = compensarcc;
        this.garantiaadv = garantiaadv;
        this.garantiadta = garantiadta;
        this.garantiaiva = garantiaiva;
        this.garantiacc = garantiacc;
        this.garantiaieps = garantiaieps;
        this.garantiaisan = garantiaisan;
        this.montodta = montodta;
        this.subdivisionfraccion = subdivisionfraccion;
        this.fpcuotaespecifica = fpcuotaespecifica;
        this.criteriotratoprefere = criteriotratoprefere;
        this.productor = productor;
        this.costoneto = costoneto;
        this.medidatransicion = medidatransicion;
        this.compensarmt = compensarmt;
        this.aplicarcuotaa_mt = aplicarcuotaa_mt;
        this.valorbaseunitario = valorbaseunitario;
        this.articulo8 = articulo8;
        this.pesoocantidadieps = pesoocantidadieps;
        this.aplicariepsa = aplicariepsa;
        this.cuotaparaieps = cuotaparaieps;
        this.tipomercanciaieps = tipomercanciaieps;
        this.todoimporteca = todoimporteca;
        this.importeca = importeca;
        this.aplicofpdetasacero = aplicofpdetasacero;
        this.umf = umf;
        this.cantidadfactura = cantidadfactura;
        this.monedacove = monedacove;
        this.factorcove = factorcove;
        this.fraccioncorrelacion = fraccioncorrelacion;
        this.cantoriginalcomerc = cantoriginalcomerc;
        this.cantoriginaltarifa = cantoriginaltarifa;
        this.descripcioncove = descripcioncove;
        this.altadensidadcalorica = altadensidadcalorica;
        this.tasapromedioieps = tasapromedioieps;
        this.importeiepspromedio = importeiepspromedio;
        this.pesobruto = pesobruto;
        this.cantidadaplicaracc = cantidadaplicaracc;
        this.precioestimadoum = precioestimadoum;
        this.precioestimado = precioestimado;
        this.valordereferenciacc = valordereferenciacc;
        this.umreferenciacc = umreferenciacc;
        this.valoraduanag5 = valoraduanag5;
        this.ccsoloparaiva = ccsoloparaiva;
        this.tasaiepsenctvs = tasaiepsenctvs;
        this.pagoefectuadoigi = pagoefectuadoigi;
        this.pagoefectuadoiva = pagoefectuadoiva;
        this.pagoefectuadoieps = pagoefectuadoieps;
        this.aplicaaap = aplicaaap;
        this.claveprodserv = claveprodserv;
        this.claveunidad = claveunidad;
        this.estimuloieps = estimuloieps;
        this.tipoestimuloieps = tipoestimuloieps;
        this.valordolarescove = valordolarescove;
        this.preciounitario = preciounitario;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPaisdeorigen() {
        return paisdeorigen;
    }

    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }

    public String getPaisvendcomp() {
        return paisvendcomp;
    }

    public void setPaisvendcomp(String paisvendcomp) {
        this.paisvendcomp = paisvendcomp;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Decimal getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(Decimal valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public Decimal getValorenaduana() {
        return valorenaduana;
    }

    public void setValorenaduana(Decimal valorenaduana) {
        this.valorenaduana = valorenaduana;
    }

    public Decimal getValorcomercialpesos() {
        return valorcomercialpesos;
    }

    public void setValorcomercialpesos(Decimal valorcomercialpesos) {
        this.valorcomercialpesos = valorcomercialpesos;
    }

    public Decimal getValorcomercialdlls() {
        return valorcomercialdlls;
    }

    public void setValorcomercialdlls(Decimal valorcomercialdlls) {
        this.valorcomercialdlls = valorcomercialdlls;
    }

    public Decimal getValorenaduanapesos() {
        return valorenaduanapesos;
    }

    public void setValorenaduanapesos(Decimal valorenaduanapesos) {
        this.valorenaduanapesos = valorenaduanapesos;
    }

    public Decimal getValorenaduanadlls() {
        return valorenaduanadlls;
    }

    public void setValorenaduanadlls(Decimal valorenaduanadlls) {
        this.valorenaduanadlls = valorenaduanadlls;
    }

    public Decimal getCantidadcomercial() {
        return cantidadcomercial;
    }

    public void setCantidadcomercial(Decimal cantidadcomercial) {
        this.cantidadcomercial = cantidadcomercial;
    }

    public Integer getUnidadcomercial() {
        return unidadcomercial;
    }

    public void setUnidadcomercial(Integer unidadcomercial) {
        this.unidadcomercial = unidadcomercial;
    }

    public Decimal getCantidadtarifa() {
        return cantidadtarifa;
    }

    public void setCantidadtarifa(Decimal cantidadtarifa) {
        this.cantidadtarifa = cantidadtarifa;
    }

    public Integer getUnidadtarifa() {
        return unidadtarifa;
    }

    public void setUnidadtarifa(Integer unidadtarifa) {
        this.unidadtarifa = unidadtarifa;
    }

    public Decimal getValoragregado() {
        return valoragregado;
    }

    public void setValoragregado(Decimal valoragregado) {
        this.valoragregado = valoragregado;
    }

    public Decimal getFactormonedaextranj() {
        return factormonedaextranj;
    }

    public void setFactormonedaextranj(Decimal factormonedaextranj) {
        this.factormonedaextranj = factormonedaextranj;
    }

    public String getMonedafactor() {
        return monedafactor;
    }

    public void setMonedafactor(String monedafactor) {
        this.monedafactor = monedafactor;
    }

    public String getPaisfactor() {
        return paisfactor;
    }

    public void setPaisfactor(String paisfactor) {
        this.paisfactor = paisfactor;
    }

    public Decimal getPeso() {
        return peso;
    }

    public void setPeso(Decimal peso) {
        this.peso = peso;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Integer getFacturaid() {
        return facturaid;
    }

    public void setFacturaid(Integer facturaid) {
        this.facturaid = facturaid;
    }

    public Integer getNumerodeparteid() {
        return numerodeparteid;
    }

    public void setNumerodeparteid(Integer numerodeparteid) {
        this.numerodeparteid = numerodeparteid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Integer vinculacion) {
        this.vinculacion = vinculacion;
    }

    public Integer getMetododevaloracion() {
        return metododevaloracion;
    }

    public void setMetododevaloracion(Integer metododevaloracion) {
        this.metododevaloracion = metododevaloracion;
    }

    public Decimal getKilosdeazucar() {
        return kilosdeazucar;
    }

    public void setKilosdeazucar(Decimal kilosdeazucar) {
        this.kilosdeazucar = kilosdeazucar;
    }

    public Integer getEsazucar() {
        return esazucar;
    }

    public void setEsazucar(Integer esazucar) {
        this.esazucar = esazucar;
    }

    public Decimal getMontoacompensaradv() {
        return montoacompensaradv;
    }

    public void setMontoacompensaradv(Decimal montoacompensaradv) {
        this.montoacompensaradv = montoacompensaradv;
    }

    public String getAplicarcuotaa() {
        return aplicarcuotaa;
    }

    public void setAplicarcuotaa(String aplicarcuotaa) {
        this.aplicarcuotaa = aplicarcuotaa;
    }

    public Decimal getMontoacompensarcc() {
        return montoacompensarcc;
    }

    public void setMontoacompensarcc(Decimal montoacompensarcc) {
        this.montoacompensarcc = montoacompensarcc;
    }

    public Integer getIepscuota() {
        return iepscuota;
    }

    public void setIepscuota(Integer iepscuota) {
        this.iepscuota = iepscuota;
    }

    public Decimal getIepspemex() {
        return iepspemex;
    }

    public void setIepspemex(Decimal iepspemex) {
        this.iepspemex = iepspemex;
    }

    public Integer getAnoisan() {
        return anoisan;
    }

    public void setAnoisan(Integer anoisan) {
        this.anoisan = anoisan;
    }

    public Integer getPesoisancamiones() {
        return pesoisancamiones;
    }

    public void setPesoisancamiones(Integer pesoisancamiones) {
        this.pesoisancamiones = pesoisancamiones;
    }

    public Decimal getMontoigi() {
        return montoigi;
    }

    public void setMontoigi(Decimal montoigi) {
        this.montoigi = montoigi;
    }

    public Decimal getValormciasnoorig() {
        return valormciasnoorig;
    }

    public void setValormciasnoorig(Decimal valormciasnoorig) {
        this.valormciasnoorig = valormciasnoorig;
    }

    public Integer getFianza() {
        return fianza;
    }

    public void setFianza(Integer fianza) {
        this.fianza = fianza;
    }

    public Integer getDesgravaciontigi() {
        return desgravaciontigi;
    }

    public void setDesgravaciontigi(Integer desgravaciontigi) {
        this.desgravaciontigi = desgravaciontigi;
    }

    public Decimal getPreferenciaporc() {
        return preferenciaporc;
    }

    public void setPreferenciaporc(Decimal preferenciaporc) {
        this.preferenciaporc = preferenciaporc;
    }

    public String getPaisprocedencia() {
        return paisprocedencia;
    }

    public void setPaisprocedencia(String paisprocedencia) {
        this.paisprocedencia = paisprocedencia;
    }

    public Integer getSeaplicotlc() {
        return seaplicotlc;
    }

    public void setSeaplicotlc(Integer seaplicotlc) {
        this.seaplicotlc = seaplicotlc;
    }

    public Integer getSeaplicoarancelcuota() {
        return seaplicoarancelcuota;
    }

    public void setSeaplicoarancelcuota(Integer seaplicoarancelcuota) {
        this.seaplicoarancelcuota = seaplicoarancelcuota;
    }

    public Integer getFraccion6digitos() {
        return fraccion6digitos;
    }

    public void setFraccion6digitos(Integer fraccion6digitos) {
        this.fraccion6digitos = fraccion6digitos;
    }

    public Integer getAplicartcenexport() {
        return aplicartcenexport;
    }

    public void setAplicartcenexport(Integer aplicartcenexport) {
        this.aplicartcenexport = aplicartcenexport;
    }

    public Integer getImpresionfactorvc() {
        return impresionfactorvc;
    }

    public void setImpresionfactorvc(Integer impresionfactorvc) {
        this.impresionfactorvc = impresionfactorvc;
    }

    public Integer getCalculardiferdtar1() {
        return calculardiferdtar1;
    }

    public void setCalculardiferdtar1(Integer calculardiferdtar1) {
        this.calculardiferdtar1 = calculardiferdtar1;
    }

    public Integer getMciarevisada() {
        return mciarevisada;
    }

    public void setMciarevisada(Integer mciarevisada) {
        this.mciarevisada = mciarevisada;
    }

    public Integer getTrafico() {
        return trafico;
    }

    public void setTrafico(Integer trafico) {
        this.trafico = trafico;
    }

    public Integer getCdetalletrafico() {
        return cdetalletrafico;
    }

    public void setCdetalletrafico(Integer cdetalletrafico) {
        this.cdetalletrafico = cdetalletrafico;
    }

    public Integer getCmnumeroretorno() {
        return cmnumeroretorno;
    }

    public void setCmnumeroretorno(Integer cmnumeroretorno) {
        this.cmnumeroretorno = cmnumeroretorno;
    }

    public Decimal getCmtotalarancelusacan() {
        return cmtotalarancelusacan;
    }

    public void setCmtotalarancelusacan(Decimal cmtotalarancelusacan) {
        this.cmtotalarancelusacan = cmtotalarancelusacan;
    }

    public Decimal getCmmontoexcento() {
        return cmmontoexcento;
    }

    public void setCmmontoexcento(Decimal cmmontoexcento) {
        this.cmmontoexcento = cmmontoexcento;
    }

    public Decimal getCmimporte() {
        return cmimporte;
    }

    public void setCmimporte(Decimal cmimporte) {
        this.cmimporte = cmimporte;
    }

    public Integer getCmfpimporte() {
        return cmfpimporte;
    }

    public void setCmfpimporte(Integer cmfpimporte) {
        this.cmfpimporte = cmfpimporte;
    }

    public Integer getCmfpdta() {
        return cmfpdta;
    }

    public void setCmfpdta(Integer cmfpdta) {
        this.cmfpdta = cmfpdta;
    }

    public Integer getRemesadetalleid() {
        return remesadetalleid;
    }

    public void setRemesadetalleid(Integer remesadetalleid) {
        this.remesadetalleid = remesadetalleid;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Decimal getPreferenciaporcce() {
        return preferenciaporcce;
    }

    public void setPreferenciaporcce(Decimal preferenciaporcce) {
        this.preferenciaporcce = preferenciaporcce;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNumerodeparte() {
        return numerodeparte;
    }

    public void setNumerodeparte(String numerodeparte) {
        this.numerodeparte = numerodeparte;
    }

    public Integer getPagadta() {
        return pagadta;
    }

    public void setPagadta(Integer pagadta) {
        this.pagadta = pagadta;
    }

    public Integer getEnvasereutilizable() {
        return envasereutilizable;
    }

    public void setEnvasereutilizable(Integer envasereutilizable) {
        this.envasereutilizable = envasereutilizable;
    }

    public Decimal getCuotaespecifica() {
        return cuotaespecifica;
    }

    public void setCuotaespecifica(Decimal cuotaespecifica) {
        this.cuotaespecifica = cuotaespecifica;
    }

    public Decimal getMontocompensaradv() {
        return montocompensaradv;
    }

    public void setMontocompensaradv(Decimal montocompensaradv) {
        this.montocompensaradv = montocompensaradv;
    }

    public Decimal getCompensarcc() {
        return compensarcc;
    }

    public void setCompensarcc(Decimal compensarcc) {
        this.compensarcc = compensarcc;
    }

    public Decimal getGarantiaadv() {
        return garantiaadv;
    }

    public void setGarantiaadv(Decimal garantiaadv) {
        this.garantiaadv = garantiaadv;
    }

    public Decimal getGarantiadta() {
        return garantiadta;
    }

    public void setGarantiadta(Decimal garantiadta) {
        this.garantiadta = garantiadta;
    }

    public Decimal getGarantiaiva() {
        return garantiaiva;
    }

    public void setGarantiaiva(Decimal garantiaiva) {
        this.garantiaiva = garantiaiva;
    }

    public Decimal getGarantiacc() {
        return garantiacc;
    }

    public void setGarantiacc(Decimal garantiacc) {
        this.garantiacc = garantiacc;
    }

    public Decimal getGarantiaieps() {
        return garantiaieps;
    }

    public void setGarantiaieps(Decimal garantiaieps) {
        this.garantiaieps = garantiaieps;
    }

    public Decimal getGarantiaisan() {
        return garantiaisan;
    }

    public void setGarantiaisan(Decimal garantiaisan) {
        this.garantiaisan = garantiaisan;
    }

    public Decimal getMontodta() {
        return montodta;
    }

    public void setMontodta(Decimal montodta) {
        this.montodta = montodta;
    }

    public String getSubdivisionfraccion() {
        return subdivisionfraccion;
    }

    public void setSubdivisionfraccion(String subdivisionfraccion) {
        this.subdivisionfraccion = subdivisionfraccion;
    }

    public Integer getFpcuotaespecifica() {
        return fpcuotaespecifica;
    }

    public void setFpcuotaespecifica(Integer fpcuotaespecifica) {
        this.fpcuotaespecifica = fpcuotaespecifica;
    }

    public String getCriteriotratoprefere() {
        return criteriotratoprefere;
    }

    public void setCriteriotratoprefere(String criteriotratoprefere) {
        this.criteriotratoprefere = criteriotratoprefere;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getCostoneto() {
        return costoneto;
    }

    public void setCostoneto(String costoneto) {
        this.costoneto = costoneto;
    }

    public Integer getMedidatransicion() {
        return medidatransicion;
    }

    public void setMedidatransicion(Integer medidatransicion) {
        this.medidatransicion = medidatransicion;
    }

    public Decimal getCompensarmt() {
        return compensarmt;
    }

    public void setCompensarmt(Decimal compensarmt) {
        this.compensarmt = compensarmt;
    }

    public String getAplicarcuotaa_mt() {
        return aplicarcuotaa_mt;
    }

    public void setAplicarcuotaa_mt(String aplicarcuotaa_mt) {
        this.aplicarcuotaa_mt = aplicarcuotaa_mt;
    }

    public Decimal getValorbaseunitario() {
        return valorbaseunitario;
    }

    public void setValorbaseunitario(Decimal valorbaseunitario) {
        this.valorbaseunitario = valorbaseunitario;
    }

    public Integer getArticulo8() {
        return articulo8;
    }

    public void setArticulo8(Integer articulo8) {
        this.articulo8 = articulo8;
    }

    public Decimal getPesoocantidadieps() {
        return pesoocantidadieps;
    }

    public void setPesoocantidadieps(Decimal pesoocantidadieps) {
        this.pesoocantidadieps = pesoocantidadieps;
    }

    public Integer getAplicariepsa() {
        return aplicariepsa;
    }

    public void setAplicariepsa(Integer aplicariepsa) {
        this.aplicariepsa = aplicariepsa;
    }

    public Decimal getCuotaparaieps() {
        return cuotaparaieps;
    }

    public void setCuotaparaieps(Decimal cuotaparaieps) {
        this.cuotaparaieps = cuotaparaieps;
    }

    public Integer getTipomercanciaieps() {
        return tipomercanciaieps;
    }

    public void setTipomercanciaieps(Integer tipomercanciaieps) {
        this.tipomercanciaieps = tipomercanciaieps;
    }

    public Integer getTodoimporteca() {
        return todoimporteca;
    }

    public void setTodoimporteca(Integer todoimporteca) {
        this.todoimporteca = todoimporteca;
    }

    public Decimal getImporteca() {
        return importeca;
    }

    public void setImporteca(Decimal importeca) {
        this.importeca = importeca;
    }

    public Integer getAplicofpdetasacero() {
        return aplicofpdetasacero;
    }

    public void setAplicofpdetasacero(Integer aplicofpdetasacero) {
        this.aplicofpdetasacero = aplicofpdetasacero;
    }

    public String getUmf() {
        return umf;
    }

    public void setUmf(String umf) {
        this.umf = umf;
    }

    public Decimal getCantidadfactura() {
        return cantidadfactura;
    }

    public void setCantidadfactura(Decimal cantidadfactura) {
        this.cantidadfactura = cantidadfactura;
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

    public String getFraccioncorrelacion() {
        return fraccioncorrelacion;
    }

    public void setFraccioncorrelacion(String fraccioncorrelacion) {
        this.fraccioncorrelacion = fraccioncorrelacion;
    }

    public Decimal getCantoriginalcomerc() {
        return cantoriginalcomerc;
    }

    public void setCantoriginalcomerc(Decimal cantoriginalcomerc) {
        this.cantoriginalcomerc = cantoriginalcomerc;
    }

    public Decimal getCantoriginaltarifa() {
        return cantoriginaltarifa;
    }

    public void setCantoriginaltarifa(Decimal cantoriginaltarifa) {
        this.cantoriginaltarifa = cantoriginaltarifa;
    }

    public String getDescripcioncove() {
        return descripcioncove;
    }

    public void setDescripcioncove(String descripcioncove) {
        this.descripcioncove = descripcioncove;
    }

    public Integer getAltadensidadcalorica() {
        return altadensidadcalorica;
    }

    public void setAltadensidadcalorica(Integer altadensidadcalorica) {
        this.altadensidadcalorica = altadensidadcalorica;
    }

    public Decimal getTasapromedioieps() {
        return tasapromedioieps;
    }

    public void setTasapromedioieps(Decimal tasapromedioieps) {
        this.tasapromedioieps = tasapromedioieps;
    }

    public Decimal getImporteiepspromedio() {
        return importeiepspromedio;
    }

    public void setImporteiepspromedio(Decimal importeiepspromedio) {
        this.importeiepspromedio = importeiepspromedio;
    }

    public Decimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Decimal pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Decimal getCantidadaplicaracc() {
        return cantidadaplicaracc;
    }

    public void setCantidadaplicaracc(Decimal cantidadaplicaracc) {
        this.cantidadaplicaracc = cantidadaplicaracc;
    }

    public Integer getPrecioestimadoum() {
        return precioestimadoum;
    }

    public void setPrecioestimadoum(Integer precioestimadoum) {
        this.precioestimadoum = precioestimadoum;
    }

    public Decimal getPrecioestimado() {
        return precioestimado;
    }

    public void setPrecioestimado(Decimal precioestimado) {
        this.precioestimado = precioestimado;
    }

    public Decimal getValordereferenciacc() {
        return valordereferenciacc;
    }

    public void setValordereferenciacc(Decimal valordereferenciacc) {
        this.valordereferenciacc = valordereferenciacc;
    }

    public Integer getUmreferenciacc() {
        return umreferenciacc;
    }

    public void setUmreferenciacc(Integer umreferenciacc) {
        this.umreferenciacc = umreferenciacc;
    }

    public Decimal getValoraduanag5() {
        return valoraduanag5;
    }

    public void setValoraduanag5(Decimal valoraduanag5) {
        this.valoraduanag5 = valoraduanag5;
    }

    public Integer getCcsoloparaiva() {
        return ccsoloparaiva;
    }

    public void setCcsoloparaiva(Integer ccsoloparaiva) {
        this.ccsoloparaiva = ccsoloparaiva;
    }

    public Integer getTasaiepsenctvs() {
        return tasaiepsenctvs;
    }

    public void setTasaiepsenctvs(Integer tasaiepsenctvs) {
        this.tasaiepsenctvs = tasaiepsenctvs;
    }

    public Decimal getPagoefectuadoigi() {
        return pagoefectuadoigi;
    }

    public void setPagoefectuadoigi(Decimal pagoefectuadoigi) {
        this.pagoefectuadoigi = pagoefectuadoigi;
    }

    public Decimal getPagoefectuadoiva() {
        return pagoefectuadoiva;
    }

    public void setPagoefectuadoiva(Decimal pagoefectuadoiva) {
        this.pagoefectuadoiva = pagoefectuadoiva;
    }

    public Decimal getPagoefectuadoieps() {
        return pagoefectuadoieps;
    }

    public void setPagoefectuadoieps(Decimal pagoefectuadoieps) {
        this.pagoefectuadoieps = pagoefectuadoieps;
    }

    public Integer getAplicaaap() {
        return aplicaaap;
    }

    public void setAplicaaap(Integer aplicaaap) {
        this.aplicaaap = aplicaaap;
    }

    public String getClaveprodserv() {
        return claveprodserv;
    }

    public void setClaveprodserv(String claveprodserv) {
        this.claveprodserv = claveprodserv;
    }

    public String getClaveunidad() {
        return claveunidad;
    }

    public void setClaveunidad(String claveunidad) {
        this.claveunidad = claveunidad;
    }

    public Decimal getEstimuloieps() {
        return estimuloieps;
    }

    public void setEstimuloieps(Decimal estimuloieps) {
        this.estimuloieps = estimuloieps;
    }

    public Integer getTipoestimuloieps() {
        return tipoestimuloieps;
    }

    public void setTipoestimuloieps(Integer tipoestimuloieps) {
        this.tipoestimuloieps = tipoestimuloieps;
    }

    public Decimal getValordolarescove() {
        return valordolarescove;
    }

    public void setValordolarescove(Decimal valordolarescove) {
        this.valordolarescove = valordolarescove;
    }

    public Decimal getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(Decimal preciounitario) {
        this.preciounitario = preciounitario;
    }
    
    

}
