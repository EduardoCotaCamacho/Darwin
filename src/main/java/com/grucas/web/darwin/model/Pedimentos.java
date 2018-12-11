/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. ecc
 */
package com.grucas.web.darwin.model;

import com.informix.lang.Decimal;
import java.sql.Date;

/**
 *
 * @author GrucasDev
 */
public class Pedimentos {

    Integer id;
    String oficina;
    String patente;
    String aduana;
    String pedimento;
    Integer proforma;
    Integer cliente;
    Integer tipo;
    String clave;
    Integer regimen;
    Integer clasificaciontemp;
    Integer zona;
    Integer pesos;
    Integer tipomovimiento;
    String referencia;
    Decimal tipodecambio;
    Decimal pesobruto;
    Integer bultos;
    String subdbultos;
    Integer cantidaddefacturas;
    Integer contenedores;
    Date fechadeentrada;
    Date fechadepago;
    Date fechadearribo;
    Date fechadepresentacion;
    Date fechadeextraccion;
    Date fechadepagor1;
    Date fechadeimpeuacan;
    Date fechadeentradaorig;
    Date fechadepagooriginal;
    Date fechadearriboorig;
    Date fechadepresentorig;
    Date fechadeextracorig;
    Date fechacambioregorig;
    Date fechareportes;
    Integer transportearribo;
    Integer transportesalida;
    Integer transporteterritorio;
    Integer tipodedecreto;
    Decimal valorcomercial;
    Decimal factorvalorcomercial;
    String paisfactor;
    Decimal fletes;
    Integer incfletes;
    Decimal factorfletes;
    String paisfactorfletes;
    Decimal estibas;
    Integer incestibas;
    Decimal factorestibas;
    String paisfactorestibas;
    Decimal seguros;
    Integer incseguros;
    Decimal factorseguros;
    String paisfactorseguros;
    Decimal otros;
    Integer incotros;
    Decimal factorotros;
    String paisfactorotros;
    Decimal deducibles;
    Decimal factordeducibles;
    String paisfactordeduc;
    Decimal vasegurado;
    Integer tipodtavalidacion;
    Integer dtaadicional;
    Integer tipodta;
    Decimal dtacompensado;
    Decimal tasadta;
    Integer fpdta;
    Decimal tasaderec;
    Integer fprec;
    Decimal tasaotros;
    Integer fpotros;
    Decimal tasadti;
    Integer fpdti;
    Decimal tasamultas;
    Integer fpmultas;
    Decimal tasarec303;
    Integer fprec303;
    Decimal tasaprev;
    Integer fpprev;
    Decimal tasareu;
    Integer fpreu;
    Decimal tasaeci;
    Integer fpeci;
    Integer actualizardta;
    Integer actualizarcc;
    Integer actualizariva;
    Integer actualizarisan;
    Integer actualizarieps;
    Integer actualizaradval;
    Integer actualizarrec;
    Integer actualizarotros;
    Integer actualizardti;
    Integer actualizarmultas;
    Integer actualizar303;
    Integer actualizareur;
    Integer actualizareci;
    Integer actualizaritv;
    Integer actualizarprev;
    Integer actualizardtaenr1;
    Integer actualizarccenr1;
    Integer actualizarivaenr1;
    Integer actualizarisanenr1;
    Integer actualizariepsenr1;
    Integer actualizaradvalenr1;
    Integer actualizarrecenr1;
    Integer actualizarotrosenr1;
    Integer actualizardtienr1;
    Integer actualizarmultasenr1;
    Integer actualizar303enr1;
    Integer actualizareurenr1;
    Integer actualizarecienr1;
    Integer actualizaritvenr1;
    Integer actualizarprevenr1;
    Integer dtaenr1;
    Integer escopia;
    Integer esrectificacion;
    String pedimentoqrect;
    Integer pedimentooriginal;
    String patenteoriginal;
    String adpedori;
    String pedimentoinicial;
    String claveprevia;
    String clavenueva;
    Integer r1ivadecuotafija;
    Integer r1actantesdelmes;
    Integer r1pagoderecargos;
    Integer r1calcularrecargos;
    Integer calcularrecargos;
    Integer nopagaiva0noadv0;
    Integer activadelvalorenp1;
    Integer recivaigi;
    Integer cuotasporcamion;
    Integer tieneembarques;
    Integer requierealmacen;
    String almacen;
    Integer esextraccion;
    Integer pagaitv;
    Integer pagaisan;
    String anoisan;
    String serieautomovil;
    Integer puertas;
    Integer cilindros;
    String marcaautomovil;
    Decimal valordeventa;
    Date fechapreciodeventa;
    String firmapedimento;
    String firmaconsolidado;
    String firmabanco;
    String banconooperacion;
    String bancocaja;
    Integer banconumero;
    Decimal bancomontoefectivo;
    Decimal bancootros;
    Decimal bancototal;
    Date fechadepagobanco;
    Date horadepagobanco;
    Integer requieredescargas;
    Integer permitirvcenzero;
    Integer imprimirseisdigitos;
    Integer apoderado;
    Date fecgencon;
    Date hragencon;
    Integer forma;
    Integer pagorev;
    Integer pagoaut;
    Integer imprimefvc;
    Integer pequena;
    Integer nocruces;
    String archivoval;
    String archivopag;
    Integer reviso;
    Integer pagadoxcte;
    String statusfin;
    String descripfin;
    String codprev;
    String claveprev;
    String paisorigen;
    String paisvend;
    Integer tipotran;
    String adtransito;
    Integer clavetrans;
    String statuspe;
    String curpfd;
    Integer partidas;
    Decimal totalcantcomerc;
    Decimal totalefectivo;
    Decimal totalnormal;
    Decimal descendlls;
    Integer factdlls;
    Integer revisado;
    Integer autorizado;
    Date fechaautor;
    Date horaautor;
    Integer recautomaticos;
    Integer paginas;
    Integer facturado;
    Integer consolidado;
    Integer semana;
    Integer grupo;
    Integer evento;
    Integer electronica;
    Integer generadoautomatico;
    Integer impreso;
    String gpouser;
    String usuario;
    String patenteagd;
    String clavesidefi;
    String foliocartaemitida;
    String firmadecc;
    Integer fpdta2;
    Integer mail;
    Integer contienealertas;
    String fea;
    String numeroserie;
    Integer tipomercancia;
    String marcasnumerosbultos;
    Integer rojo1;
    Date fecharojo1;
    Date horarojo1;
    Integer lineanaviera;
    String sellosfiscales;
    Integer rojo2;
    Date fecharojo2;
    Date horarojo2;
    Date fechadearribobuque;
    Date horadearribobuque;
    String representantela;
    String encargadoverif;
    Integer automovil;
    String turno;
    String observaciones;
    Integer tipotasaadvfefp;
    Integer pagonuevo;
    Integer idcuentapagoe;
    String nota;
    Integer crucesconsobrepeso;
    Integer calcularmultasaut;
    String nombrearchivopdf;
    Integer fpdiferentedtacf;
    String r1diferencias;
    String feaprevio;
    String nsprevio;
    Date fechavalidacion;
    String monedafactor;
    String monedafactorseguros;
    String monedafactordeduct;
    String monedafactorfletes;
    String monedafactorestibas;
    String monedafactorotros;
    Integer factor8digfletes;
    Integer factor8digestibas;
    Integer factor8digseguros;
    Integer factor8digotros;
    Integer amparoparaiva;
    Integer setomodelcliente;
    Integer actualizarmt;
    Integer actualizarmtenr1;
    Date fechapagootrapatente;
    String feadecb;
    String datosdecb;
    Integer pagasagarpa;
    Integer tienecopiasimple;
    Integer cagrupacion;
    Integer empresarfc;
    Integer aniopedimento;
    Date fechapedimento;
    Integer valorenaduanadif;
    Integer departamento;
    String usuariopagoelect;
    Integer autorizadopago;
    Integer verificadovalidar;
    Integer pagadoenventanilla;
    Integer pedimentodescargo;
    String claveprevpe;
    Date fechaapertura;
    Date fechapasaafacturar;
    Date horapasaafacturar;
    Integer tipoapertura;
    Integer sensible;
    Date fechasensible;
    Date fechadesbloqueosen;
    String usuariodesbloqueosen;
    Integer desbloqueosensible;
    Integer peexcepcionsensible;
    Integer art8rcgmce;
    String fielvalidacion;
    String fielvalidacionprevio;
    Decimal valordolares;
    Decimal valorpreciopagado;
    String referenciadelcliente;
    Integer empresadespacho;
    String usuarioautorizope;
    String archivoprev;
    Integer direccioncliente;
    Integer aduanaid;
    Integer generarmultas509r1;
    Integer generarrecargos509r1;
    Integer tiporfcpeca;
    String rfcpeca;
    Integer tipotasamultas;
    String lineadecaptura;
    String transaccionsat;
    Decimal montoapagarlc;
    Integer casoespecial;
    Integer tipodepago;

    public Pedimentos(Integer id, String oficina, String patente, String aduana, String pedimento, Integer proforma, Integer cliente, Integer tipo, String clave, Integer regimen, Integer clasificaciontemp, Integer zona, Integer pesos, Integer tipomovimiento, String referencia, Decimal tipodecambio, Decimal pesobruto, Integer bultos, String subdbultos, Integer cantidaddefacturas, Integer contenedores, Date fechadeentrada, Date fechadepago, Date fechadearribo, Date fechadepresentacion, Date fechadeextraccion, Date fechadepagor1, Date fechadeimpeuacan, Date fechadeentradaorig, Date fechadepagooriginal, Date fechadearriboorig, Date fechadepresentorig, Date fechadeextracorig, Date fechacambioregorig, Date fechareportes, Integer transportearribo, Integer transportesalida, Integer transporteterritorio, Integer tipodedecreto, Decimal valorcomercial, Decimal factorvalorcomercial, String paisfactor, Decimal fletes, Integer incfletes, Decimal factorfletes, String paisfactorfletes, Decimal estibas, Integer incestibas, Decimal factorestibas, String paisfactorestibas, Decimal seguros, Integer incseguros, Decimal factorseguros, String paisfactorseguros, Decimal otros, Integer incotros, Decimal factorotros, String paisfactorotros, Decimal deducibles, Decimal factordeducibles, String paisfactordeduc, Decimal vasegurado, Integer tipodtavalidacion, Integer dtaadicional, Integer tipodta, Decimal dtacompensado, Decimal tasadta, Integer fpdta, Decimal tasaderec, Integer fprec, Decimal tasaotros, Integer fpotros, Decimal tasadti, Integer fpdti, Decimal tasamultas, Integer fpmultas, Decimal tasarec303, Integer fprec303, Decimal tasaprev, Integer fpprev, Decimal tasareu, Integer fpreu, Decimal tasaeci, Integer fpeci, Integer actualizardta, Integer actualizarcc, Integer actualizariva, Integer actualizarisan, Integer actualizarieps, Integer actualizaradval, Integer actualizarrec, Integer actualizarotros, Integer actualizardti, Integer actualizarmultas, Integer actualizar303, Integer actualizareur, Integer actualizareci, Integer actualizaritv, Integer actualizarprev, Integer actualizardtaenr1, Integer actualizarccenr1, Integer actualizarivaenr1, Integer actualizarisanenr1, Integer actualizariepsenr1, Integer actualizaradvalenr1, Integer actualizarrecenr1, Integer actualizarotrosenr1, Integer actualizardtienr1, Integer actualizarmultasenr1, Integer actualizar303enr1, Integer actualizareurenr1, Integer actualizarecienr1, Integer actualizaritvenr1, Integer actualizarprevenr1, Integer dtaenr1, Integer escopia, Integer esrectificacion, String pedimentoqrect, Integer pedimentooriginal, String patenteoriginal, String adpedori, String pedimentoinicial, String claveprevia, String clavenueva, Integer r1ivadecuotafija, Integer r1actantesdelmes, Integer r1pagoderecargos, Integer r1calcularrecargos, Integer calcularrecargos, Integer nopagaiva0noadv0, Integer activadelvalorenp1, Integer recivaigi, Integer cuotasporcamion, Integer tieneembarques, Integer requierealmacen, String almacen, Integer esextraccion, Integer pagaitv, Integer pagaisan, String anoisan, String serieautomovil, Integer puertas, Integer cilindros, String marcaautomovil, Decimal valordeventa, Date fechapreciodeventa, String firmapedimento, String firmaconsolidado, String firmabanco, String banconooperacion, String bancocaja, Integer banconumero, Decimal bancomontoefectivo, Decimal bancootros, Decimal bancototal, Date fechadepagobanco, Date horadepagobanco, Integer requieredescargas, Integer permitirvcenzero, Integer imprimirseisdigitos, Integer apoderado, Date fecgencon, Date hragencon, Integer forma, Integer pagorev, Integer pagoaut, Integer imprimefvc, Integer pequena, Integer nocruces, String archivoval, String archivopag, Integer reviso, Integer pagadoxcte, String statusfin, String descripfin, String codprev, String claveprev, String paisorigen, String paisvend, Integer tipotran, String adtransito, Integer clavetrans, String statuspe, String curpfd, Integer partidas, Decimal totalcantcomerc, Decimal totalefectivo, Decimal totalnormal, Decimal descendlls, Integer factdlls, Integer revisado, Integer autorizado, Date fechaautor, Date horaautor, Integer recautomaticos, Integer paginas, Integer facturado, Integer consolidado, Integer semana, Integer grupo, Integer evento, Integer electronica, Integer generadoautomatico, Integer impreso, String gpouser, String usuario, String patenteagd, String clavesidefi, String foliocartaemitida, String firmadecc, Integer fpdta2, Integer mail, Integer contienealertas, String fea, String numeroserie, Integer tipomercancia, String marcasnumerosbultos, Integer rojo1, Date fecharojo1, Date horarojo1, Integer lineanaviera, String sellosfiscales, Integer rojo2, Date fecharojo2, Date horarojo2, Date fechadearribobuque, Date horadearribobuque, String representantela, String encargadoverif, Integer automovil, String turno, String observaciones, Integer tipotasaadvfefp, Integer pagonuevo, Integer idcuentapagoe, String nota, Integer crucesconsobrepeso, Integer calcularmultasaut, String nombrearchivopdf, Integer fpdiferentedtacf, String r1diferencias, String feaprevio, String nsprevio, Date fechavalidacion, String monedafactor, String monedafactorseguros, String monedafactordeduct, String monedafactorfletes, String monedafactorestibas, String monedafactorotros, Integer factor8digfletes, Integer factor8digestibas, Integer factor8digseguros, Integer factor8digotros, Integer amparoparaiva, Integer setomodelcliente, Integer actualizarmt, Integer actualizarmtenr1, Date fechapagootrapatente, String feadecb, String datosdecb, Integer pagasagarpa, Integer tienecopiasimple, Integer cagrupacion, Integer empresarfc, Integer aniopedimento, Date fechapedimento, Integer valorenaduanadif, Integer departamento, String usuariopagoelect, Integer autorizadopago, Integer verificadovalidar, Integer pagadoenventanilla, Integer pedimentodescargo, String claveprevpe, Date fechaapertura, Date fechapasaafacturar, Date horapasaafacturar, Integer tipoapertura, Integer sensible, Date fechasensible, Date fechadesbloqueosen, String usuariodesbloqueosen, Integer desbloqueosensible, Integer peexcepcionsensible, Integer art8rcgmce, String fielvalidacion, String fielvalidacionprevio, Decimal valordolares, Decimal valorpreciopagado, String referenciadelcliente, Integer empresadespacho, String usuarioautorizope, String archivoprev, Integer direccioncliente, Integer aduanaid, Integer generarmultas509r1, Integer generarrecargos509r1, Integer tiporfcpeca, String rfcpeca, Integer tipotasamultas, String lineadecaptura, String transaccionsat, Decimal montoapagarlc, Integer casoespecial, Integer tipodepago) {
        this.id = id;
        this.oficina = oficina;
        this.patente = patente;
        this.aduana = aduana;
        this.pedimento = pedimento;
        this.proforma = proforma;
        this.cliente = cliente;
        this.tipo = tipo;
        this.clave = clave;
        this.regimen = regimen;
        this.clasificaciontemp = clasificaciontemp;
        this.zona = zona;
        this.pesos = pesos;
        this.tipomovimiento = tipomovimiento;
        this.referencia = referencia;
        this.tipodecambio = tipodecambio;
        this.pesobruto = pesobruto;
        this.bultos = bultos;
        this.subdbultos = subdbultos;
        this.cantidaddefacturas = cantidaddefacturas;
        this.contenedores = contenedores;
        this.fechadeentrada = fechadeentrada;
        this.fechadepago = fechadepago;
        this.fechadearribo = fechadearribo;
        this.fechadepresentacion = fechadepresentacion;
        this.fechadeextraccion = fechadeextraccion;
        this.fechadepagor1 = fechadepagor1;
        this.fechadeimpeuacan = fechadeimpeuacan;
        this.fechadeentradaorig = fechadeentradaorig;
        this.fechadepagooriginal = fechadepagooriginal;
        this.fechadearriboorig = fechadearriboorig;
        this.fechadepresentorig = fechadepresentorig;
        this.fechadeextracorig = fechadeextracorig;
        this.fechacambioregorig = fechacambioregorig;
        this.fechareportes = fechareportes;
        this.transportearribo = transportearribo;
        this.transportesalida = transportesalida;
        this.transporteterritorio = transporteterritorio;
        this.tipodedecreto = tipodedecreto;
        this.valorcomercial = valorcomercial;
        this.factorvalorcomercial = factorvalorcomercial;
        this.paisfactor = paisfactor;
        this.fletes = fletes;
        this.incfletes = incfletes;
        this.factorfletes = factorfletes;
        this.paisfactorfletes = paisfactorfletes;
        this.estibas = estibas;
        this.incestibas = incestibas;
        this.factorestibas = factorestibas;
        this.paisfactorestibas = paisfactorestibas;
        this.seguros = seguros;
        this.incseguros = incseguros;
        this.factorseguros = factorseguros;
        this.paisfactorseguros = paisfactorseguros;
        this.otros = otros;
        this.incotros = incotros;
        this.factorotros = factorotros;
        this.paisfactorotros = paisfactorotros;
        this.deducibles = deducibles;
        this.factordeducibles = factordeducibles;
        this.paisfactordeduc = paisfactordeduc;
        this.vasegurado = vasegurado;
        this.tipodtavalidacion = tipodtavalidacion;
        this.dtaadicional = dtaadicional;
        this.tipodta = tipodta;
        this.dtacompensado = dtacompensado;
        this.tasadta = tasadta;
        this.fpdta = fpdta;
        this.tasaderec = tasaderec;
        this.fprec = fprec;
        this.tasaotros = tasaotros;
        this.fpotros = fpotros;
        this.tasadti = tasadti;
        this.fpdti = fpdti;
        this.tasamultas = tasamultas;
        this.fpmultas = fpmultas;
        this.tasarec303 = tasarec303;
        this.fprec303 = fprec303;
        this.tasaprev = tasaprev;
        this.fpprev = fpprev;
        this.tasareu = tasareu;
        this.fpreu = fpreu;
        this.tasaeci = tasaeci;
        this.fpeci = fpeci;
        this.actualizardta = actualizardta;
        this.actualizarcc = actualizarcc;
        this.actualizariva = actualizariva;
        this.actualizarisan = actualizarisan;
        this.actualizarieps = actualizarieps;
        this.actualizaradval = actualizaradval;
        this.actualizarrec = actualizarrec;
        this.actualizarotros = actualizarotros;
        this.actualizardti = actualizardti;
        this.actualizarmultas = actualizarmultas;
        this.actualizar303 = actualizar303;
        this.actualizareur = actualizareur;
        this.actualizareci = actualizareci;
        this.actualizaritv = actualizaritv;
        this.actualizarprev = actualizarprev;
        this.actualizardtaenr1 = actualizardtaenr1;
        this.actualizarccenr1 = actualizarccenr1;
        this.actualizarivaenr1 = actualizarivaenr1;
        this.actualizarisanenr1 = actualizarisanenr1;
        this.actualizariepsenr1 = actualizariepsenr1;
        this.actualizaradvalenr1 = actualizaradvalenr1;
        this.actualizarrecenr1 = actualizarrecenr1;
        this.actualizarotrosenr1 = actualizarotrosenr1;
        this.actualizardtienr1 = actualizardtienr1;
        this.actualizarmultasenr1 = actualizarmultasenr1;
        this.actualizar303enr1 = actualizar303enr1;
        this.actualizareurenr1 = actualizareurenr1;
        this.actualizarecienr1 = actualizarecienr1;
        this.actualizaritvenr1 = actualizaritvenr1;
        this.actualizarprevenr1 = actualizarprevenr1;
        this.dtaenr1 = dtaenr1;
        this.escopia = escopia;
        this.esrectificacion = esrectificacion;
        this.pedimentoqrect = pedimentoqrect;
        this.pedimentooriginal = pedimentooriginal;
        this.patenteoriginal = patenteoriginal;
        this.adpedori = adpedori;
        this.pedimentoinicial = pedimentoinicial;
        this.claveprevia = claveprevia;
        this.clavenueva = clavenueva;
        this.r1ivadecuotafija = r1ivadecuotafija;
        this.r1actantesdelmes = r1actantesdelmes;
        this.r1pagoderecargos = r1pagoderecargos;
        this.r1calcularrecargos = r1calcularrecargos;
        this.calcularrecargos = calcularrecargos;
        this.nopagaiva0noadv0 = nopagaiva0noadv0;
        this.activadelvalorenp1 = activadelvalorenp1;
        this.recivaigi = recivaigi;
        this.cuotasporcamion = cuotasporcamion;
        this.tieneembarques = tieneembarques;
        this.requierealmacen = requierealmacen;
        this.almacen = almacen;
        this.esextraccion = esextraccion;
        this.pagaitv = pagaitv;
        this.pagaisan = pagaisan;
        this.anoisan = anoisan;
        this.serieautomovil = serieautomovil;
        this.puertas = puertas;
        this.cilindros = cilindros;
        this.marcaautomovil = marcaautomovil;
        this.valordeventa = valordeventa;
        this.fechapreciodeventa = fechapreciodeventa;
        this.firmapedimento = firmapedimento;
        this.firmaconsolidado = firmaconsolidado;
        this.firmabanco = firmabanco;
        this.banconooperacion = banconooperacion;
        this.bancocaja = bancocaja;
        this.banconumero = banconumero;
        this.bancomontoefectivo = bancomontoefectivo;
        this.bancootros = bancootros;
        this.bancototal = bancototal;
        this.fechadepagobanco = fechadepagobanco;
        this.horadepagobanco = horadepagobanco;
        this.requieredescargas = requieredescargas;
        this.permitirvcenzero = permitirvcenzero;
        this.imprimirseisdigitos = imprimirseisdigitos;
        this.apoderado = apoderado;
        this.fecgencon = fecgencon;
        this.hragencon = hragencon;
        this.forma = forma;
        this.pagorev = pagorev;
        this.pagoaut = pagoaut;
        this.imprimefvc = imprimefvc;
        this.pequena = pequena;
        this.nocruces = nocruces;
        this.archivoval = archivoval;
        this.archivopag = archivopag;
        this.reviso = reviso;
        this.pagadoxcte = pagadoxcte;
        this.statusfin = statusfin;
        this.descripfin = descripfin;
        this.codprev = codprev;
        this.claveprev = claveprev;
        this.paisorigen = paisorigen;
        this.paisvend = paisvend;
        this.tipotran = tipotran;
        this.adtransito = adtransito;
        this.clavetrans = clavetrans;
        this.statuspe = statuspe;
        this.curpfd = curpfd;
        this.partidas = partidas;
        this.totalcantcomerc = totalcantcomerc;
        this.totalefectivo = totalefectivo;
        this.totalnormal = totalnormal;
        this.descendlls = descendlls;
        this.factdlls = factdlls;
        this.revisado = revisado;
        this.autorizado = autorizado;
        this.fechaautor = fechaautor;
        this.horaautor = horaautor;
        this.recautomaticos = recautomaticos;
        this.paginas = paginas;
        this.facturado = facturado;
        this.consolidado = consolidado;
        this.semana = semana;
        this.grupo = grupo;
        this.evento = evento;
        this.electronica = electronica;
        this.generadoautomatico = generadoautomatico;
        this.impreso = impreso;
        this.gpouser = gpouser;
        this.usuario = usuario;
        this.patenteagd = patenteagd;
        this.clavesidefi = clavesidefi;
        this.foliocartaemitida = foliocartaemitida;
        this.firmadecc = firmadecc;
        this.fpdta2 = fpdta2;
        this.mail = mail;
        this.contienealertas = contienealertas;
        this.fea = fea;
        this.numeroserie = numeroserie;
        this.tipomercancia = tipomercancia;
        this.marcasnumerosbultos = marcasnumerosbultos;
        this.rojo1 = rojo1;
        this.fecharojo1 = fecharojo1;
        this.horarojo1 = horarojo1;
        this.lineanaviera = lineanaviera;
        this.sellosfiscales = sellosfiscales;
        this.rojo2 = rojo2;
        this.fecharojo2 = fecharojo2;
        this.horarojo2 = horarojo2;
        this.fechadearribobuque = fechadearribobuque;
        this.horadearribobuque = horadearribobuque;
        this.representantela = representantela;
        this.encargadoverif = encargadoverif;
        this.automovil = automovil;
        this.turno = turno;
        this.observaciones = observaciones;
        this.tipotasaadvfefp = tipotasaadvfefp;
        this.pagonuevo = pagonuevo;
        this.idcuentapagoe = idcuentapagoe;
        this.nota = nota;
        this.crucesconsobrepeso = crucesconsobrepeso;
        this.calcularmultasaut = calcularmultasaut;
        this.nombrearchivopdf = nombrearchivopdf;
        this.fpdiferentedtacf = fpdiferentedtacf;
        this.r1diferencias = r1diferencias;
        this.feaprevio = feaprevio;
        this.nsprevio = nsprevio;
        this.fechavalidacion = fechavalidacion;
        this.monedafactor = monedafactor;
        this.monedafactorseguros = monedafactorseguros;
        this.monedafactordeduct = monedafactordeduct;
        this.monedafactorfletes = monedafactorfletes;
        this.monedafactorestibas = monedafactorestibas;
        this.monedafactorotros = monedafactorotros;
        this.factor8digfletes = factor8digfletes;
        this.factor8digestibas = factor8digestibas;
        this.factor8digseguros = factor8digseguros;
        this.factor8digotros = factor8digotros;
        this.amparoparaiva = amparoparaiva;
        this.setomodelcliente = setomodelcliente;
        this.actualizarmt = actualizarmt;
        this.actualizarmtenr1 = actualizarmtenr1;
        this.fechapagootrapatente = fechapagootrapatente;
        this.feadecb = feadecb;
        this.datosdecb = datosdecb;
        this.pagasagarpa = pagasagarpa;
        this.tienecopiasimple = tienecopiasimple;
        this.cagrupacion = cagrupacion;
        this.empresarfc = empresarfc;
        this.aniopedimento = aniopedimento;
        this.fechapedimento = fechapedimento;
        this.valorenaduanadif = valorenaduanadif;
        this.departamento = departamento;
        this.usuariopagoelect = usuariopagoelect;
        this.autorizadopago = autorizadopago;
        this.verificadovalidar = verificadovalidar;
        this.pagadoenventanilla = pagadoenventanilla;
        this.pedimentodescargo = pedimentodescargo;
        this.claveprevpe = claveprevpe;
        this.fechaapertura = fechaapertura;
        this.fechapasaafacturar = fechapasaafacturar;
        this.horapasaafacturar = horapasaafacturar;
        this.tipoapertura = tipoapertura;
        this.sensible = sensible;
        this.fechasensible = fechasensible;
        this.fechadesbloqueosen = fechadesbloqueosen;
        this.usuariodesbloqueosen = usuariodesbloqueosen;
        this.desbloqueosensible = desbloqueosensible;
        this.peexcepcionsensible = peexcepcionsensible;
        this.art8rcgmce = art8rcgmce;
        this.fielvalidacion = fielvalidacion;
        this.fielvalidacionprevio = fielvalidacionprevio;
        this.valordolares = valordolares;
        this.valorpreciopagado = valorpreciopagado;
        this.referenciadelcliente = referenciadelcliente;
        this.empresadespacho = empresadespacho;
        this.usuarioautorizope = usuarioautorizope;
        this.archivoprev = archivoprev;
        this.direccioncliente = direccioncliente;
        this.aduanaid = aduanaid;
        this.generarmultas509r1 = generarmultas509r1;
        this.generarrecargos509r1 = generarrecargos509r1;
        this.tiporfcpeca = tiporfcpeca;
        this.rfcpeca = rfcpeca;
        this.tipotasamultas = tipotasamultas;
        this.lineadecaptura = lineadecaptura;
        this.transaccionsat = transaccionsat;
        this.montoapagarlc = montoapagarlc;
        this.casoespecial = casoespecial;
        this.tipodepago = tipodepago;
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

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getAduana() {
        return aduana;
    }

    public void setAduana(String aduana) {
        this.aduana = aduana;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public Integer getProforma() {
        return proforma;
    }

    public void setProforma(Integer proforma) {
        this.proforma = proforma;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getRegimen() {
        return regimen;
    }

    public void setRegimen(Integer regimen) {
        this.regimen = regimen;
    }

    public Integer getClasificaciontemp() {
        return clasificaciontemp;
    }

    public void setClasificaciontemp(Integer clasificaciontemp) {
        this.clasificaciontemp = clasificaciontemp;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getPesos() {
        return pesos;
    }

    public void setPesos(Integer pesos) {
        this.pesos = pesos;
    }

    public Integer getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(Integer tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Decimal getTipodecambio() {
        return tipodecambio;
    }

    public void setTipodecambio(Decimal tipodecambio) {
        this.tipodecambio = tipodecambio;
    }

    public Decimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Decimal pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Integer getBultos() {
        return bultos;
    }

    public void setBultos(Integer bultos) {
        this.bultos = bultos;
    }

    public String getSubdbultos() {
        return subdbultos;
    }

    public void setSubdbultos(String subdbultos) {
        this.subdbultos = subdbultos;
    }

    public Integer getCantidaddefacturas() {
        return cantidaddefacturas;
    }

    public void setCantidaddefacturas(Integer cantidaddefacturas) {
        this.cantidaddefacturas = cantidaddefacturas;
    }

    public Integer getContenedores() {
        return contenedores;
    }

    public void setContenedores(Integer contenedores) {
        this.contenedores = contenedores;
    }

    public Date getFechadeentrada() {
        return fechadeentrada;
    }

    public void setFechadeentrada(Date fechadeentrada) {
        this.fechadeentrada = fechadeentrada;
    }

    public Date getFechadepago() {
        return fechadepago;
    }

    public void setFechadepago(Date fechadepago) {
        this.fechadepago = fechadepago;
    }

    public Date getFechadearribo() {
        return fechadearribo;
    }

    public void setFechadearribo(Date fechadearribo) {
        this.fechadearribo = fechadearribo;
    }

    public Date getFechadepresentacion() {
        return fechadepresentacion;
    }

    public void setFechadepresentacion(Date fechadepresentacion) {
        this.fechadepresentacion = fechadepresentacion;
    }

    public Date getFechadeextraccion() {
        return fechadeextraccion;
    }

    public void setFechadeextraccion(Date fechadeextraccion) {
        this.fechadeextraccion = fechadeextraccion;
    }

    public Date getFechadepagor1() {
        return fechadepagor1;
    }

    public void setFechadepagor1(Date fechadepagor1) {
        this.fechadepagor1 = fechadepagor1;
    }

    public Date getFechadeimpeuacan() {
        return fechadeimpeuacan;
    }

    public void setFechadeimpeuacan(Date fechadeimpeuacan) {
        this.fechadeimpeuacan = fechadeimpeuacan;
    }

    public Date getFechadeentradaorig() {
        return fechadeentradaorig;
    }

    public void setFechadeentradaorig(Date fechadeentradaorig) {
        this.fechadeentradaorig = fechadeentradaorig;
    }

    public Date getFechadepagooriginal() {
        return fechadepagooriginal;
    }

    public void setFechadepagooriginal(Date fechadepagooriginal) {
        this.fechadepagooriginal = fechadepagooriginal;
    }

    public Date getFechadearriboorig() {
        return fechadearriboorig;
    }

    public void setFechadearriboorig(Date fechadearriboorig) {
        this.fechadearriboorig = fechadearriboorig;
    }

    public Date getFechadepresentorig() {
        return fechadepresentorig;
    }

    public void setFechadepresentorig(Date fechadepresentorig) {
        this.fechadepresentorig = fechadepresentorig;
    }

    public Date getFechadeextracorig() {
        return fechadeextracorig;
    }

    public void setFechadeextracorig(Date fechadeextracorig) {
        this.fechadeextracorig = fechadeextracorig;
    }

    public Date getFechacambioregorig() {
        return fechacambioregorig;
    }

    public void setFechacambioregorig(Date fechacambioregorig) {
        this.fechacambioregorig = fechacambioregorig;
    }

    public Date getFechareportes() {
        return fechareportes;
    }

    public void setFechareportes(Date fechareportes) {
        this.fechareportes = fechareportes;
    }

    public Integer getTransportearribo() {
        return transportearribo;
    }

    public void setTransportearribo(Integer transportearribo) {
        this.transportearribo = transportearribo;
    }

    public Integer getTransportesalida() {
        return transportesalida;
    }

    public void setTransportesalida(Integer transportesalida) {
        this.transportesalida = transportesalida;
    }

    public Integer getTransporteterritorio() {
        return transporteterritorio;
    }

    public void setTransporteterritorio(Integer transporteterritorio) {
        this.transporteterritorio = transporteterritorio;
    }

    public Integer getTipodedecreto() {
        return tipodedecreto;
    }

    public void setTipodedecreto(Integer tipodedecreto) {
        this.tipodedecreto = tipodedecreto;
    }

    public Decimal getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(Decimal valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public Decimal getFactorvalorcomercial() {
        return factorvalorcomercial;
    }

    public void setFactorvalorcomercial(Decimal factorvalorcomercial) {
        this.factorvalorcomercial = factorvalorcomercial;
    }

    public String getPaisfactor() {
        return paisfactor;
    }

    public void setPaisfactor(String paisfactor) {
        this.paisfactor = paisfactor;
    }

    public Decimal getFletes() {
        return fletes;
    }

    public void setFletes(Decimal fletes) {
        this.fletes = fletes;
    }

    public Integer getIncfletes() {
        return incfletes;
    }

    public void setIncfletes(Integer incfletes) {
        this.incfletes = incfletes;
    }

    public Decimal getFactorfletes() {
        return factorfletes;
    }

    public void setFactorfletes(Decimal factorfletes) {
        this.factorfletes = factorfletes;
    }

    public String getPaisfactorfletes() {
        return paisfactorfletes;
    }

    public void setPaisfactorfletes(String paisfactorfletes) {
        this.paisfactorfletes = paisfactorfletes;
    }

    public Decimal getEstibas() {
        return estibas;
    }

    public void setEstibas(Decimal estibas) {
        this.estibas = estibas;
    }

    public Integer getIncestibas() {
        return incestibas;
    }

    public void setIncestibas(Integer incestibas) {
        this.incestibas = incestibas;
    }

    public Decimal getFactorestibas() {
        return factorestibas;
    }

    public void setFactorestibas(Decimal factorestibas) {
        this.factorestibas = factorestibas;
    }

    public String getPaisfactorestibas() {
        return paisfactorestibas;
    }

    public void setPaisfactorestibas(String paisfactorestibas) {
        this.paisfactorestibas = paisfactorestibas;
    }

    public Decimal getSeguros() {
        return seguros;
    }

    public void setSeguros(Decimal seguros) {
        this.seguros = seguros;
    }

    public Integer getIncseguros() {
        return incseguros;
    }

    public void setIncseguros(Integer incseguros) {
        this.incseguros = incseguros;
    }

    public Decimal getFactorseguros() {
        return factorseguros;
    }

    public void setFactorseguros(Decimal factorseguros) {
        this.factorseguros = factorseguros;
    }

    public String getPaisfactorseguros() {
        return paisfactorseguros;
    }

    public void setPaisfactorseguros(String paisfactorseguros) {
        this.paisfactorseguros = paisfactorseguros;
    }

    public Decimal getOtros() {
        return otros;
    }

    public void setOtros(Decimal otros) {
        this.otros = otros;
    }

    public Integer getIncotros() {
        return incotros;
    }

    public void setIncotros(Integer incotros) {
        this.incotros = incotros;
    }

    public Decimal getFactorotros() {
        return factorotros;
    }

    public void setFactorotros(Decimal factorotros) {
        this.factorotros = factorotros;
    }

    public String getPaisfactorotros() {
        return paisfactorotros;
    }

    public void setPaisfactorotros(String paisfactorotros) {
        this.paisfactorotros = paisfactorotros;
    }

    public Decimal getDeducibles() {
        return deducibles;
    }

    public void setDeducibles(Decimal deducibles) {
        this.deducibles = deducibles;
    }

    public Decimal getFactordeducibles() {
        return factordeducibles;
    }

    public void setFactordeducibles(Decimal factordeducibles) {
        this.factordeducibles = factordeducibles;
    }

    public String getPaisfactordeduc() {
        return paisfactordeduc;
    }

    public void setPaisfactordeduc(String paisfactordeduc) {
        this.paisfactordeduc = paisfactordeduc;
    }

    public Decimal getVasegurado() {
        return vasegurado;
    }

    public void setVasegurado(Decimal vasegurado) {
        this.vasegurado = vasegurado;
    }

    public Integer getTipodtavalidacion() {
        return tipodtavalidacion;
    }

    public void setTipodtavalidacion(Integer tipodtavalidacion) {
        this.tipodtavalidacion = tipodtavalidacion;
    }

    public Integer getDtaadicional() {
        return dtaadicional;
    }

    public void setDtaadicional(Integer dtaadicional) {
        this.dtaadicional = dtaadicional;
    }

    public Integer getTipodta() {
        return tipodta;
    }

    public void setTipodta(Integer tipodta) {
        this.tipodta = tipodta;
    }

    public Decimal getDtacompensado() {
        return dtacompensado;
    }

    public void setDtacompensado(Decimal dtacompensado) {
        this.dtacompensado = dtacompensado;
    }

    public Decimal getTasadta() {
        return tasadta;
    }

    public void setTasadta(Decimal tasadta) {
        this.tasadta = tasadta;
    }

    public Integer getFpdta() {
        return fpdta;
    }

    public void setFpdta(Integer fpdta) {
        this.fpdta = fpdta;
    }

    public Decimal getTasaderec() {
        return tasaderec;
    }

    public void setTasaderec(Decimal tasaderec) {
        this.tasaderec = tasaderec;
    }

    public Integer getFprec() {
        return fprec;
    }

    public void setFprec(Integer fprec) {
        this.fprec = fprec;
    }

    public Decimal getTasaotros() {
        return tasaotros;
    }

    public void setTasaotros(Decimal tasaotros) {
        this.tasaotros = tasaotros;
    }

    public Integer getFpotros() {
        return fpotros;
    }

    public void setFpotros(Integer fpotros) {
        this.fpotros = fpotros;
    }

    public Decimal getTasadti() {
        return tasadti;
    }

    public void setTasadti(Decimal tasadti) {
        this.tasadti = tasadti;
    }

    public Integer getFpdti() {
        return fpdti;
    }

    public void setFpdti(Integer fpdti) {
        this.fpdti = fpdti;
    }

    public Decimal getTasamultas() {
        return tasamultas;
    }

    public void setTasamultas(Decimal tasamultas) {
        this.tasamultas = tasamultas;
    }

    public Integer getFpmultas() {
        return fpmultas;
    }

    public void setFpmultas(Integer fpmultas) {
        this.fpmultas = fpmultas;
    }

    public Decimal getTasarec303() {
        return tasarec303;
    }

    public void setTasarec303(Decimal tasarec303) {
        this.tasarec303 = tasarec303;
    }

    public Integer getFprec303() {
        return fprec303;
    }

    public void setFprec303(Integer fprec303) {
        this.fprec303 = fprec303;
    }

    public Decimal getTasaprev() {
        return tasaprev;
    }

    public void setTasaprev(Decimal tasaprev) {
        this.tasaprev = tasaprev;
    }

    public Integer getFpprev() {
        return fpprev;
    }

    public void setFpprev(Integer fpprev) {
        this.fpprev = fpprev;
    }

    public Decimal getTasareu() {
        return tasareu;
    }

    public void setTasareu(Decimal tasareu) {
        this.tasareu = tasareu;
    }

    public Integer getFpreu() {
        return fpreu;
    }

    public void setFpreu(Integer fpreu) {
        this.fpreu = fpreu;
    }

    public Decimal getTasaeci() {
        return tasaeci;
    }

    public void setTasaeci(Decimal tasaeci) {
        this.tasaeci = tasaeci;
    }

    public Integer getFpeci() {
        return fpeci;
    }

    public void setFpeci(Integer fpeci) {
        this.fpeci = fpeci;
    }

    public Integer getActualizardta() {
        return actualizardta;
    }

    public void setActualizardta(Integer actualizardta) {
        this.actualizardta = actualizardta;
    }

    public Integer getActualizarcc() {
        return actualizarcc;
    }

    public void setActualizarcc(Integer actualizarcc) {
        this.actualizarcc = actualizarcc;
    }

    public Integer getActualizariva() {
        return actualizariva;
    }

    public void setActualizariva(Integer actualizariva) {
        this.actualizariva = actualizariva;
    }

    public Integer getActualizarisan() {
        return actualizarisan;
    }

    public void setActualizarisan(Integer actualizarisan) {
        this.actualizarisan = actualizarisan;
    }

    public Integer getActualizarieps() {
        return actualizarieps;
    }

    public void setActualizarieps(Integer actualizarieps) {
        this.actualizarieps = actualizarieps;
    }

    public Integer getActualizaradval() {
        return actualizaradval;
    }

    public void setActualizaradval(Integer actualizaradval) {
        this.actualizaradval = actualizaradval;
    }

    public Integer getActualizarrec() {
        return actualizarrec;
    }

    public void setActualizarrec(Integer actualizarrec) {
        this.actualizarrec = actualizarrec;
    }

    public Integer getActualizarotros() {
        return actualizarotros;
    }

    public void setActualizarotros(Integer actualizarotros) {
        this.actualizarotros = actualizarotros;
    }

    public Integer getActualizardti() {
        return actualizardti;
    }

    public void setActualizardti(Integer actualizardti) {
        this.actualizardti = actualizardti;
    }

    public Integer getActualizarmultas() {
        return actualizarmultas;
    }

    public void setActualizarmultas(Integer actualizarmultas) {
        this.actualizarmultas = actualizarmultas;
    }

    public Integer getActualizar303() {
        return actualizar303;
    }

    public void setActualizar303(Integer actualizar303) {
        this.actualizar303 = actualizar303;
    }

    public Integer getActualizareur() {
        return actualizareur;
    }

    public void setActualizareur(Integer actualizareur) {
        this.actualizareur = actualizareur;
    }

    public Integer getActualizareci() {
        return actualizareci;
    }

    public void setActualizareci(Integer actualizareci) {
        this.actualizareci = actualizareci;
    }

    public Integer getActualizaritv() {
        return actualizaritv;
    }

    public void setActualizaritv(Integer actualizaritv) {
        this.actualizaritv = actualizaritv;
    }

    public Integer getActualizarprev() {
        return actualizarprev;
    }

    public void setActualizarprev(Integer actualizarprev) {
        this.actualizarprev = actualizarprev;
    }

    public Integer getActualizardtaenr1() {
        return actualizardtaenr1;
    }

    public void setActualizardtaenr1(Integer actualizardtaenr1) {
        this.actualizardtaenr1 = actualizardtaenr1;
    }

    public Integer getActualizarccenr1() {
        return actualizarccenr1;
    }

    public void setActualizarccenr1(Integer actualizarccenr1) {
        this.actualizarccenr1 = actualizarccenr1;
    }

    public Integer getActualizarivaenr1() {
        return actualizarivaenr1;
    }

    public void setActualizarivaenr1(Integer actualizarivaenr1) {
        this.actualizarivaenr1 = actualizarivaenr1;
    }

    public Integer getActualizarisanenr1() {
        return actualizarisanenr1;
    }

    public void setActualizarisanenr1(Integer actualizarisanenr1) {
        this.actualizarisanenr1 = actualizarisanenr1;
    }

    public Integer getActualizariepsenr1() {
        return actualizariepsenr1;
    }

    public void setActualizariepsenr1(Integer actualizariepsenr1) {
        this.actualizariepsenr1 = actualizariepsenr1;
    }

    public Integer getActualizaradvalenr1() {
        return actualizaradvalenr1;
    }

    public void setActualizaradvalenr1(Integer actualizaradvalenr1) {
        this.actualizaradvalenr1 = actualizaradvalenr1;
    }

    public Integer getActualizarrecenr1() {
        return actualizarrecenr1;
    }

    public void setActualizarrecenr1(Integer actualizarrecenr1) {
        this.actualizarrecenr1 = actualizarrecenr1;
    }

    public Integer getActualizarotrosenr1() {
        return actualizarotrosenr1;
    }

    public void setActualizarotrosenr1(Integer actualizarotrosenr1) {
        this.actualizarotrosenr1 = actualizarotrosenr1;
    }

    public Integer getActualizardtienr1() {
        return actualizardtienr1;
    }

    public void setActualizardtienr1(Integer actualizardtienr1) {
        this.actualizardtienr1 = actualizardtienr1;
    }

    public Integer getActualizarmultasenr1() {
        return actualizarmultasenr1;
    }

    public void setActualizarmultasenr1(Integer actualizarmultasenr1) {
        this.actualizarmultasenr1 = actualizarmultasenr1;
    }

    public Integer getActualizar303enr1() {
        return actualizar303enr1;
    }

    public void setActualizar303enr1(Integer actualizar303enr1) {
        this.actualizar303enr1 = actualizar303enr1;
    }

    public Integer getActualizareurenr1() {
        return actualizareurenr1;
    }

    public void setActualizareurenr1(Integer actualizareurenr1) {
        this.actualizareurenr1 = actualizareurenr1;
    }

    public Integer getActualizarecienr1() {
        return actualizarecienr1;
    }

    public void setActualizarecienr1(Integer actualizarecienr1) {
        this.actualizarecienr1 = actualizarecienr1;
    }

    public Integer getActualizaritvenr1() {
        return actualizaritvenr1;
    }

    public void setActualizaritvenr1(Integer actualizaritvenr1) {
        this.actualizaritvenr1 = actualizaritvenr1;
    }

    public Integer getActualizarprevenr1() {
        return actualizarprevenr1;
    }

    public void setActualizarprevenr1(Integer actualizarprevenr1) {
        this.actualizarprevenr1 = actualizarprevenr1;
    }

    public Integer getDtaenr1() {
        return dtaenr1;
    }

    public void setDtaenr1(Integer dtaenr1) {
        this.dtaenr1 = dtaenr1;
    }

    public Integer getEscopia() {
        return escopia;
    }

    public void setEscopia(Integer escopia) {
        this.escopia = escopia;
    }

    public Integer getEsrectificacion() {
        return esrectificacion;
    }

    public void setEsrectificacion(Integer esrectificacion) {
        this.esrectificacion = esrectificacion;
    }

    public String getPedimentoqrect() {
        return pedimentoqrect;
    }

    public void setPedimentoqrect(String pedimentoqrect) {
        this.pedimentoqrect = pedimentoqrect;
    }

    public Integer getPedimentooriginal() {
        return pedimentooriginal;
    }

    public void setPedimentooriginal(Integer pedimentooriginal) {
        this.pedimentooriginal = pedimentooriginal;
    }

    public String getPatenteoriginal() {
        return patenteoriginal;
    }

    public void setPatenteoriginal(String patenteoriginal) {
        this.patenteoriginal = patenteoriginal;
    }

    public String getAdpedori() {
        return adpedori;
    }

    public void setAdpedori(String adpedori) {
        this.adpedori = adpedori;
    }

    public String getPedimentoinicial() {
        return pedimentoinicial;
    }

    public void setPedimentoinicial(String pedimentoinicial) {
        this.pedimentoinicial = pedimentoinicial;
    }

    public String getClaveprevia() {
        return claveprevia;
    }

    public void setClaveprevia(String claveprevia) {
        this.claveprevia = claveprevia;
    }

    public String getClavenueva() {
        return clavenueva;
    }

    public void setClavenueva(String clavenueva) {
        this.clavenueva = clavenueva;
    }

    public Integer getR1ivadecuotafija() {
        return r1ivadecuotafija;
    }

    public void setR1ivadecuotafija(Integer r1ivadecuotafija) {
        this.r1ivadecuotafija = r1ivadecuotafija;
    }

    public Integer getR1actantesdelmes() {
        return r1actantesdelmes;
    }

    public void setR1actantesdelmes(Integer r1actantesdelmes) {
        this.r1actantesdelmes = r1actantesdelmes;
    }

    public Integer getR1pagoderecargos() {
        return r1pagoderecargos;
    }

    public void setR1pagoderecargos(Integer r1pagoderecargos) {
        this.r1pagoderecargos = r1pagoderecargos;
    }

    public Integer getR1calcularrecargos() {
        return r1calcularrecargos;
    }

    public void setR1calcularrecargos(Integer r1calcularrecargos) {
        this.r1calcularrecargos = r1calcularrecargos;
    }

    public Integer getCalcularrecargos() {
        return calcularrecargos;
    }

    public void setCalcularrecargos(Integer calcularrecargos) {
        this.calcularrecargos = calcularrecargos;
    }

    public Integer getNopagaiva0noadv0() {
        return nopagaiva0noadv0;
    }

    public void setNopagaiva0noadv0(Integer nopagaiva0noadv0) {
        this.nopagaiva0noadv0 = nopagaiva0noadv0;
    }

    public Integer getActivadelvalorenp1() {
        return activadelvalorenp1;
    }

    public void setActivadelvalorenp1(Integer activadelvalorenp1) {
        this.activadelvalorenp1 = activadelvalorenp1;
    }

    public Integer getRecivaigi() {
        return recivaigi;
    }

    public void setRecivaigi(Integer recivaigi) {
        this.recivaigi = recivaigi;
    }

    public Integer getCuotasporcamion() {
        return cuotasporcamion;
    }

    public void setCuotasporcamion(Integer cuotasporcamion) {
        this.cuotasporcamion = cuotasporcamion;
    }

    public Integer getTieneembarques() {
        return tieneembarques;
    }

    public void setTieneembarques(Integer tieneembarques) {
        this.tieneembarques = tieneembarques;
    }

    public Integer getRequierealmacen() {
        return requierealmacen;
    }

    public void setRequierealmacen(Integer requierealmacen) {
        this.requierealmacen = requierealmacen;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public Integer getEsextraccion() {
        return esextraccion;
    }

    public void setEsextraccion(Integer esextraccion) {
        this.esextraccion = esextraccion;
    }

    public Integer getPagaitv() {
        return pagaitv;
    }

    public void setPagaitv(Integer pagaitv) {
        this.pagaitv = pagaitv;
    }

    public Integer getPagaisan() {
        return pagaisan;
    }

    public void setPagaisan(Integer pagaisan) {
        this.pagaisan = pagaisan;
    }

    public String getAnoisan() {
        return anoisan;
    }

    public void setAnoisan(String anoisan) {
        this.anoisan = anoisan;
    }

    public String getSerieautomovil() {
        return serieautomovil;
    }

    public void setSerieautomovil(String serieautomovil) {
        this.serieautomovil = serieautomovil;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public String getMarcaautomovil() {
        return marcaautomovil;
    }

    public void setMarcaautomovil(String marcaautomovil) {
        this.marcaautomovil = marcaautomovil;
    }

    public Decimal getValordeventa() {
        return valordeventa;
    }

    public void setValordeventa(Decimal valordeventa) {
        this.valordeventa = valordeventa;
    }

    public Date getFechapreciodeventa() {
        return fechapreciodeventa;
    }

    public void setFechapreciodeventa(Date fechapreciodeventa) {
        this.fechapreciodeventa = fechapreciodeventa;
    }

    public String getFirmapedimento() {
        return firmapedimento;
    }

    public void setFirmapedimento(String firmapedimento) {
        this.firmapedimento = firmapedimento;
    }

    public String getFirmaconsolidado() {
        return firmaconsolidado;
    }

    public void setFirmaconsolidado(String firmaconsolidado) {
        this.firmaconsolidado = firmaconsolidado;
    }

    public String getFirmabanco() {
        return firmabanco;
    }

    public void setFirmabanco(String firmabanco) {
        this.firmabanco = firmabanco;
    }

    public String getBanconooperacion() {
        return banconooperacion;
    }

    public void setBanconooperacion(String banconooperacion) {
        this.banconooperacion = banconooperacion;
    }

    public String getBancocaja() {
        return bancocaja;
    }

    public void setBancocaja(String bancocaja) {
        this.bancocaja = bancocaja;
    }

    public Integer getBanconumero() {
        return banconumero;
    }

    public void setBanconumero(Integer banconumero) {
        this.banconumero = banconumero;
    }

    public Decimal getBancomontoefectivo() {
        return bancomontoefectivo;
    }

    public void setBancomontoefectivo(Decimal bancomontoefectivo) {
        this.bancomontoefectivo = bancomontoefectivo;
    }

    public Decimal getBancootros() {
        return bancootros;
    }

    public void setBancootros(Decimal bancootros) {
        this.bancootros = bancootros;
    }

    public Decimal getBancototal() {
        return bancototal;
    }

    public void setBancototal(Decimal bancototal) {
        this.bancototal = bancototal;
    }

    public Date getFechadepagobanco() {
        return fechadepagobanco;
    }

    public void setFechadepagobanco(Date fechadepagobanco) {
        this.fechadepagobanco = fechadepagobanco;
    }

    public Date getHoradepagobanco() {
        return horadepagobanco;
    }

    public void setHoradepagobanco(Date horadepagobanco) {
        this.horadepagobanco = horadepagobanco;
    }

    public Integer getRequieredescargas() {
        return requieredescargas;
    }

    public void setRequieredescargas(Integer requieredescargas) {
        this.requieredescargas = requieredescargas;
    }

    public Integer getPermitirvcenzero() {
        return permitirvcenzero;
    }

    public void setPermitirvcenzero(Integer permitirvcenzero) {
        this.permitirvcenzero = permitirvcenzero;
    }

    public Integer getImprimirseisdigitos() {
        return imprimirseisdigitos;
    }

    public void setImprimirseisdigitos(Integer imprimirseisdigitos) {
        this.imprimirseisdigitos = imprimirseisdigitos;
    }

    public Integer getApoderado() {
        return apoderado;
    }

    public void setApoderado(Integer apoderado) {
        this.apoderado = apoderado;
    }

    public Date getFecgencon() {
        return fecgencon;
    }

    public void setFecgencon(Date fecgencon) {
        this.fecgencon = fecgencon;
    }

    public Date getHragencon() {
        return hragencon;
    }

    public void setHragencon(Date hragencon) {
        this.hragencon = hragencon;
    }

    public Integer getForma() {
        return forma;
    }

    public void setForma(Integer forma) {
        this.forma = forma;
    }

    public Integer getPagorev() {
        return pagorev;
    }

    public void setPagorev(Integer pagorev) {
        this.pagorev = pagorev;
    }

    public Integer getPagoaut() {
        return pagoaut;
    }

    public void setPagoaut(Integer pagoaut) {
        this.pagoaut = pagoaut;
    }

    public Integer getImprimefvc() {
        return imprimefvc;
    }

    public void setImprimefvc(Integer imprimefvc) {
        this.imprimefvc = imprimefvc;
    }

    public Integer getPequena() {
        return pequena;
    }

    public void setPequena(Integer pequena) {
        this.pequena = pequena;
    }

    public Integer getNocruces() {
        return nocruces;
    }

    public void setNocruces(Integer nocruces) {
        this.nocruces = nocruces;
    }

    public String getArchivoval() {
        return archivoval;
    }

    public void setArchivoval(String archivoval) {
        this.archivoval = archivoval;
    }

    public String getArchivopag() {
        return archivopag;
    }

    public void setArchivopag(String archivopag) {
        this.archivopag = archivopag;
    }

    public Integer getReviso() {
        return reviso;
    }

    public void setReviso(Integer reviso) {
        this.reviso = reviso;
    }

    public Integer getPagadoxcte() {
        return pagadoxcte;
    }

    public void setPagadoxcte(Integer pagadoxcte) {
        this.pagadoxcte = pagadoxcte;
    }

    public String getStatusfin() {
        return statusfin;
    }

    public void setStatusfin(String statusfin) {
        this.statusfin = statusfin;
    }

    public String getDescripfin() {
        return descripfin;
    }

    public void setDescripfin(String descripfin) {
        this.descripfin = descripfin;
    }

    public String getCodprev() {
        return codprev;
    }

    public void setCodprev(String codprev) {
        this.codprev = codprev;
    }

    public String getClaveprev() {
        return claveprev;
    }

    public void setClaveprev(String claveprev) {
        this.claveprev = claveprev;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public String getPaisvend() {
        return paisvend;
    }

    public void setPaisvend(String paisvend) {
        this.paisvend = paisvend;
    }

    public Integer getTipotran() {
        return tipotran;
    }

    public void setTipotran(Integer tipotran) {
        this.tipotran = tipotran;
    }

    public String getAdtransito() {
        return adtransito;
    }

    public void setAdtransito(String adtransito) {
        this.adtransito = adtransito;
    }

    public Integer getClavetrans() {
        return clavetrans;
    }

    public void setClavetrans(Integer clavetrans) {
        this.clavetrans = clavetrans;
    }

    public String getStatuspe() {
        return statuspe;
    }

    public void setStatuspe(String statuspe) {
        this.statuspe = statuspe;
    }

    public String getCurpfd() {
        return curpfd;
    }

    public void setCurpfd(String curpfd) {
        this.curpfd = curpfd;
    }

    public Integer getPartidas() {
        return partidas;
    }

    public void setPartidas(Integer partidas) {
        this.partidas = partidas;
    }

    public Decimal getTotalcantcomerc() {
        return totalcantcomerc;
    }

    public void setTotalcantcomerc(Decimal totalcantcomerc) {
        this.totalcantcomerc = totalcantcomerc;
    }

    public Decimal getTotalefectivo() {
        return totalefectivo;
    }

    public void setTotalefectivo(Decimal totalefectivo) {
        this.totalefectivo = totalefectivo;
    }

    public Decimal getTotalnormal() {
        return totalnormal;
    }

    public void setTotalnormal(Decimal totalnormal) {
        this.totalnormal = totalnormal;
    }

    public Decimal getDescendlls() {
        return descendlls;
    }

    public void setDescendlls(Decimal descendlls) {
        this.descendlls = descendlls;
    }

    public Integer getFactdlls() {
        return factdlls;
    }

    public void setFactdlls(Integer factdlls) {
        this.factdlls = factdlls;
    }

    public Integer getRevisado() {
        return revisado;
    }

    public void setRevisado(Integer revisado) {
        this.revisado = revisado;
    }

    public Integer getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Integer autorizado) {
        this.autorizado = autorizado;
    }

    public Date getFechaautor() {
        return fechaautor;
    }

    public void setFechaautor(Date fechaautor) {
        this.fechaautor = fechaautor;
    }

    public Date getHoraautor() {
        return horaautor;
    }

    public void setHoraautor(Date horaautor) {
        this.horaautor = horaautor;
    }

    public Integer getRecautomaticos() {
        return recautomaticos;
    }

    public void setRecautomaticos(Integer recautomaticos) {
        this.recautomaticos = recautomaticos;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getFacturado() {
        return facturado;
    }

    public void setFacturado(Integer facturado) {
        this.facturado = facturado;
    }

    public Integer getConsolidado() {
        return consolidado;
    }

    public void setConsolidado(Integer consolidado) {
        this.consolidado = consolidado;
    }

    public Integer getSemana() {
        return semana;
    }

    public void setSemana(Integer semana) {
        this.semana = semana;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
    }

    public Integer getEvento() {
        return evento;
    }

    public void setEvento(Integer evento) {
        this.evento = evento;
    }

    public Integer getElectronica() {
        return electronica;
    }

    public void setElectronica(Integer electronica) {
        this.electronica = electronica;
    }

    public Integer getGeneradoautomatico() {
        return generadoautomatico;
    }

    public void setGeneradoautomatico(Integer generadoautomatico) {
        this.generadoautomatico = generadoautomatico;
    }

    public Integer getImpreso() {
        return impreso;
    }

    public void setImpreso(Integer impreso) {
        this.impreso = impreso;
    }

    public String getGpouser() {
        return gpouser;
    }

    public void setGpouser(String gpouser) {
        this.gpouser = gpouser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPatenteagd() {
        return patenteagd;
    }

    public void setPatenteagd(String patenteagd) {
        this.patenteagd = patenteagd;
    }

    public String getClavesidefi() {
        return clavesidefi;
    }

    public void setClavesidefi(String clavesidefi) {
        this.clavesidefi = clavesidefi;
    }

    public String getFoliocartaemitida() {
        return foliocartaemitida;
    }

    public void setFoliocartaemitida(String foliocartaemitida) {
        this.foliocartaemitida = foliocartaemitida;
    }

    public String getFirmadecc() {
        return firmadecc;
    }

    public void setFirmadecc(String firmadecc) {
        this.firmadecc = firmadecc;
    }

    public Integer getFpdta2() {
        return fpdta2;
    }

    public void setFpdta2(Integer fpdta2) {
        this.fpdta2 = fpdta2;
    }

    public Integer getMail() {
        return mail;
    }

    public void setMail(Integer mail) {
        this.mail = mail;
    }

    public Integer getContienealertas() {
        return contienealertas;
    }

    public void setContienealertas(Integer contienealertas) {
        this.contienealertas = contienealertas;
    }

    public String getFea() {
        return fea;
    }

    public void setFea(String fea) {
        this.fea = fea;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public Integer getTipomercancia() {
        return tipomercancia;
    }

    public void setTipomercancia(Integer tipomercancia) {
        this.tipomercancia = tipomercancia;
    }

    public String getMarcasnumerosbultos() {
        return marcasnumerosbultos;
    }

    public void setMarcasnumerosbultos(String marcasnumerosbultos) {
        this.marcasnumerosbultos = marcasnumerosbultos;
    }

    public Integer getRojo1() {
        return rojo1;
    }

    public void setRojo1(Integer rojo1) {
        this.rojo1 = rojo1;
    }

    public Date getFecharojo1() {
        return fecharojo1;
    }

    public void setFecharojo1(Date fecharojo1) {
        this.fecharojo1 = fecharojo1;
    }

    public Date getHorarojo1() {
        return horarojo1;
    }

    public void setHorarojo1(Date horarojo1) {
        this.horarojo1 = horarojo1;
    }

    public Integer getLineanaviera() {
        return lineanaviera;
    }

    public void setLineanaviera(Integer lineanaviera) {
        this.lineanaviera = lineanaviera;
    }

    public String getSellosfiscales() {
        return sellosfiscales;
    }

    public void setSellosfiscales(String sellosfiscales) {
        this.sellosfiscales = sellosfiscales;
    }

    public Integer getRojo2() {
        return rojo2;
    }

    public void setRojo2(Integer rojo2) {
        this.rojo2 = rojo2;
    }

    public Date getFecharojo2() {
        return fecharojo2;
    }

    public void setFecharojo2(Date fecharojo2) {
        this.fecharojo2 = fecharojo2;
    }

    public Date getHorarojo2() {
        return horarojo2;
    }

    public void setHorarojo2(Date horarojo2) {
        this.horarojo2 = horarojo2;
    }

    public Date getFechadearribobuque() {
        return fechadearribobuque;
    }

    public void setFechadearribobuque(Date fechadearribobuque) {
        this.fechadearribobuque = fechadearribobuque;
    }

    public Date getHoradearribobuque() {
        return horadearribobuque;
    }

    public void setHoradearribobuque(Date horadearribobuque) {
        this.horadearribobuque = horadearribobuque;
    }

    public String getRepresentantela() {
        return representantela;
    }

    public void setRepresentantela(String representantela) {
        this.representantela = representantela;
    }

    public String getEncargadoverif() {
        return encargadoverif;
    }

    public void setEncargadoverif(String encargadoverif) {
        this.encargadoverif = encargadoverif;
    }

    public Integer getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Integer automovil) {
        this.automovil = automovil;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getTipotasaadvfefp() {
        return tipotasaadvfefp;
    }

    public void setTipotasaadvfefp(Integer tipotasaadvfefp) {
        this.tipotasaadvfefp = tipotasaadvfefp;
    }

    public Integer getPagonuevo() {
        return pagonuevo;
    }

    public void setPagonuevo(Integer pagonuevo) {
        this.pagonuevo = pagonuevo;
    }

    public Integer getIdcuentapagoe() {
        return idcuentapagoe;
    }

    public void setIdcuentapagoe(Integer idcuentapagoe) {
        this.idcuentapagoe = idcuentapagoe;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Integer getCrucesconsobrepeso() {
        return crucesconsobrepeso;
    }

    public void setCrucesconsobrepeso(Integer crucesconsobrepeso) {
        this.crucesconsobrepeso = crucesconsobrepeso;
    }

    public Integer getCalcularmultasaut() {
        return calcularmultasaut;
    }

    public void setCalcularmultasaut(Integer calcularmultasaut) {
        this.calcularmultasaut = calcularmultasaut;
    }

    public String getNombrearchivopdf() {
        return nombrearchivopdf;
    }

    public void setNombrearchivopdf(String nombrearchivopdf) {
        this.nombrearchivopdf = nombrearchivopdf;
    }

    public Integer getFpdiferentedtacf() {
        return fpdiferentedtacf;
    }

    public void setFpdiferentedtacf(Integer fpdiferentedtacf) {
        this.fpdiferentedtacf = fpdiferentedtacf;
    }

    public String getR1diferencias() {
        return r1diferencias;
    }

    public void setR1diferencias(String r1diferencias) {
        this.r1diferencias = r1diferencias;
    }

    public String getFeaprevio() {
        return feaprevio;
    }

    public void setFeaprevio(String feaprevio) {
        this.feaprevio = feaprevio;
    }

    public String getNsprevio() {
        return nsprevio;
    }

    public void setNsprevio(String nsprevio) {
        this.nsprevio = nsprevio;
    }

    public Date getFechavalidacion() {
        return fechavalidacion;
    }

    public void setFechavalidacion(Date fechavalidacion) {
        this.fechavalidacion = fechavalidacion;
    }

    public String getMonedafactor() {
        return monedafactor;
    }

    public void setMonedafactor(String monedafactor) {
        this.monedafactor = monedafactor;
    }

    public String getMonedafactorseguros() {
        return monedafactorseguros;
    }

    public void setMonedafactorseguros(String monedafactorseguros) {
        this.monedafactorseguros = monedafactorseguros;
    }

    public String getMonedafactordeduct() {
        return monedafactordeduct;
    }

    public void setMonedafactordeduct(String monedafactordeduct) {
        this.monedafactordeduct = monedafactordeduct;
    }

    public String getMonedafactorfletes() {
        return monedafactorfletes;
    }

    public void setMonedafactorfletes(String monedafactorfletes) {
        this.monedafactorfletes = monedafactorfletes;
    }

    public String getMonedafactorestibas() {
        return monedafactorestibas;
    }

    public void setMonedafactorestibas(String monedafactorestibas) {
        this.monedafactorestibas = monedafactorestibas;
    }

    public String getMonedafactorotros() {
        return monedafactorotros;
    }

    public void setMonedafactorotros(String monedafactorotros) {
        this.monedafactorotros = monedafactorotros;
    }

    public Integer getFactor8digfletes() {
        return factor8digfletes;
    }

    public void setFactor8digfletes(Integer factor8digfletes) {
        this.factor8digfletes = factor8digfletes;
    }

    public Integer getFactor8digestibas() {
        return factor8digestibas;
    }

    public void setFactor8digestibas(Integer factor8digestibas) {
        this.factor8digestibas = factor8digestibas;
    }

    public Integer getFactor8digseguros() {
        return factor8digseguros;
    }

    public void setFactor8digseguros(Integer factor8digseguros) {
        this.factor8digseguros = factor8digseguros;
    }

    public Integer getFactor8digotros() {
        return factor8digotros;
    }

    public void setFactor8digotros(Integer factor8digotros) {
        this.factor8digotros = factor8digotros;
    }

    public Integer getAmparoparaiva() {
        return amparoparaiva;
    }

    public void setAmparoparaiva(Integer amparoparaiva) {
        this.amparoparaiva = amparoparaiva;
    }

    public Integer getSetomodelcliente() {
        return setomodelcliente;
    }

    public void setSetomodelcliente(Integer setomodelcliente) {
        this.setomodelcliente = setomodelcliente;
    }

    public Integer getActualizarmt() {
        return actualizarmt;
    }

    public void setActualizarmt(Integer actualizarmt) {
        this.actualizarmt = actualizarmt;
    }

    public Integer getActualizarmtenr1() {
        return actualizarmtenr1;
    }

    public void setActualizarmtenr1(Integer actualizarmtenr1) {
        this.actualizarmtenr1 = actualizarmtenr1;
    }

    public Date getFechapagootrapatente() {
        return fechapagootrapatente;
    }

    public void setFechapagootrapatente(Date fechapagootrapatente) {
        this.fechapagootrapatente = fechapagootrapatente;
    }

    public String getFeadecb() {
        return feadecb;
    }

    public void setFeadecb(String feadecb) {
        this.feadecb = feadecb;
    }

    public String getDatosdecb() {
        return datosdecb;
    }

    public void setDatosdecb(String datosdecb) {
        this.datosdecb = datosdecb;
    }

    public Integer getPagasagarpa() {
        return pagasagarpa;
    }

    public void setPagasagarpa(Integer pagasagarpa) {
        this.pagasagarpa = pagasagarpa;
    }

    public Integer getTienecopiasimple() {
        return tienecopiasimple;
    }

    public void setTienecopiasimple(Integer tienecopiasimple) {
        this.tienecopiasimple = tienecopiasimple;
    }

    public Integer getCagrupacion() {
        return cagrupacion;
    }

    public void setCagrupacion(Integer cagrupacion) {
        this.cagrupacion = cagrupacion;
    }

    public Integer getEmpresarfc() {
        return empresarfc;
    }

    public void setEmpresarfc(Integer empresarfc) {
        this.empresarfc = empresarfc;
    }

    public Integer getAniopedimento() {
        return aniopedimento;
    }

    public void setAniopedimento(Integer aniopedimento) {
        this.aniopedimento = aniopedimento;
    }

    public Date getFechapedimento() {
        return fechapedimento;
    }

    public void setFechapedimento(Date fechapedimento) {
        this.fechapedimento = fechapedimento;
    }

    public Integer getValorenaduanadif() {
        return valorenaduanadif;
    }

    public void setValorenaduanadif(Integer valorenaduanadif) {
        this.valorenaduanadif = valorenaduanadif;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public String getUsuariopagoelect() {
        return usuariopagoelect;
    }

    public void setUsuariopagoelect(String usuariopagoelect) {
        this.usuariopagoelect = usuariopagoelect;
    }

    public Integer getAutorizadopago() {
        return autorizadopago;
    }

    public void setAutorizadopago(Integer autorizadopago) {
        this.autorizadopago = autorizadopago;
    }

    public Integer getVerificadovalidar() {
        return verificadovalidar;
    }

    public void setVerificadovalidar(Integer verificadovalidar) {
        this.verificadovalidar = verificadovalidar;
    }

    public Integer getPagadoenventanilla() {
        return pagadoenventanilla;
    }

    public void setPagadoenventanilla(Integer pagadoenventanilla) {
        this.pagadoenventanilla = pagadoenventanilla;
    }

    public Integer getPedimentodescargo() {
        return pedimentodescargo;
    }

    public void setPedimentodescargo(Integer pedimentodescargo) {
        this.pedimentodescargo = pedimentodescargo;
    }

    public String getClaveprevpe() {
        return claveprevpe;
    }

    public void setClaveprevpe(String claveprevpe) {
        this.claveprevpe = claveprevpe;
    }

    public Date getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Date getFechapasaafacturar() {
        return fechapasaafacturar;
    }

    public void setFechapasaafacturar(Date fechapasaafacturar) {
        this.fechapasaafacturar = fechapasaafacturar;
    }

    public Date getHorapasaafacturar() {
        return horapasaafacturar;
    }

    public void setHorapasaafacturar(Date horapasaafacturar) {
        this.horapasaafacturar = horapasaafacturar;
    }

    public Integer getTipoapertura() {
        return tipoapertura;
    }

    public void setTipoapertura(Integer tipoapertura) {
        this.tipoapertura = tipoapertura;
    }

    public Integer getSensible() {
        return sensible;
    }

    public void setSensible(Integer sensible) {
        this.sensible = sensible;
    }

    public Date getFechasensible() {
        return fechasensible;
    }

    public void setFechasensible(Date fechasensible) {
        this.fechasensible = fechasensible;
    }

    public Date getFechadesbloqueosen() {
        return fechadesbloqueosen;
    }

    public void setFechadesbloqueosen(Date fechadesbloqueosen) {
        this.fechadesbloqueosen = fechadesbloqueosen;
    }

    public String getUsuariodesbloqueosen() {
        return usuariodesbloqueosen;
    }

    public void setUsuariodesbloqueosen(String usuariodesbloqueosen) {
        this.usuariodesbloqueosen = usuariodesbloqueosen;
    }

    public Integer getDesbloqueosensible() {
        return desbloqueosensible;
    }

    public void setDesbloqueosensible(Integer desbloqueosensible) {
        this.desbloqueosensible = desbloqueosensible;
    }

    public Integer getPeexcepcionsensible() {
        return peexcepcionsensible;
    }

    public void setPeexcepcionsensible(Integer peexcepcionsensible) {
        this.peexcepcionsensible = peexcepcionsensible;
    }

    public Integer getArt8rcgmce() {
        return art8rcgmce;
    }

    public void setArt8rcgmce(Integer art8rcgmce) {
        this.art8rcgmce = art8rcgmce;
    }

    public String getFielvalidacion() {
        return fielvalidacion;
    }

    public void setFielvalidacion(String fielvalidacion) {
        this.fielvalidacion = fielvalidacion;
    }

    public String getFielvalidacionprevio() {
        return fielvalidacionprevio;
    }

    public void setFielvalidacionprevio(String fielvalidacionprevio) {
        this.fielvalidacionprevio = fielvalidacionprevio;
    }

    public Decimal getValordolares() {
        return valordolares;
    }

    public void setValordolares(Decimal valordolares) {
        this.valordolares = valordolares;
    }

    public Decimal getValorpreciopagado() {
        return valorpreciopagado;
    }

    public void setValorpreciopagado(Decimal valorpreciopagado) {
        this.valorpreciopagado = valorpreciopagado;
    }

    public String getReferenciadelcliente() {
        return referenciadelcliente;
    }

    public void setReferenciadelcliente(String referenciadelcliente) {
        this.referenciadelcliente = referenciadelcliente;
    }

    public Integer getEmpresadespacho() {
        return empresadespacho;
    }

    public void setEmpresadespacho(Integer empresadespacho) {
        this.empresadespacho = empresadespacho;
    }

    public String getUsuarioautorizope() {
        return usuarioautorizope;
    }

    public void setUsuarioautorizope(String usuarioautorizope) {
        this.usuarioautorizope = usuarioautorizope;
    }

    public String getArchivoprev() {
        return archivoprev;
    }

    public void setArchivoprev(String archivoprev) {
        this.archivoprev = archivoprev;
    }

    public Integer getDireccioncliente() {
        return direccioncliente;
    }

    public void setDireccioncliente(Integer direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    public Integer getAduanaid() {
        return aduanaid;
    }

    public void setAduanaid(Integer aduanaid) {
        this.aduanaid = aduanaid;
    }

    public Integer getGenerarmultas509r1() {
        return generarmultas509r1;
    }

    public void setGenerarmultas509r1(Integer generarmultas509r1) {
        this.generarmultas509r1 = generarmultas509r1;
    }

    public Integer getGenerarrecargos509r1() {
        return generarrecargos509r1;
    }

    public void setGenerarrecargos509r1(Integer generarrecargos509r1) {
        this.generarrecargos509r1 = generarrecargos509r1;
    }

    public Integer getTiporfcpeca() {
        return tiporfcpeca;
    }

    public void setTiporfcpeca(Integer tiporfcpeca) {
        this.tiporfcpeca = tiporfcpeca;
    }

    public String getRfcpeca() {
        return rfcpeca;
    }

    public void setRfcpeca(String rfcpeca) {
        this.rfcpeca = rfcpeca;
    }

    public Integer getTipotasamultas() {
        return tipotasamultas;
    }

    public void setTipotasamultas(Integer tipotasamultas) {
        this.tipotasamultas = tipotasamultas;
    }

    public String getLineadecaptura() {
        return lineadecaptura;
    }

    public void setLineadecaptura(String lineadecaptura) {
        this.lineadecaptura = lineadecaptura;
    }

    public String getTransaccionsat() {
        return transaccionsat;
    }

    public void setTransaccionsat(String transaccionsat) {
        this.transaccionsat = transaccionsat;
    }

    public Decimal getMontoapagarlc() {
        return montoapagarlc;
    }

    public void setMontoapagarlc(Decimal montoapagarlc) {
        this.montoapagarlc = montoapagarlc;
    }

    public Integer getCasoespecial() {
        return casoespecial;
    }

    public void setCasoespecial(Integer casoespecial) {
        this.casoespecial = casoespecial;
    }

    public Integer getTipodepago() {
        return tipodepago;
    }

    public void setTipodepago(Integer tipodepago) {
        this.tipodepago = tipodepago;
    }
    
    

};
