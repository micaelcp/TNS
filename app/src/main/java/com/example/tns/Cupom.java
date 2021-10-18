package com.example.tns;

import java.util.Date;

public class Cupom {

    Integer codigoCupom;
    Integer desconto;
    Date dt_validade;

    public Integer getCodigoCupom() {
        return codigoCupom;
    }

    public void setCodigoCupom(Integer codigoCupom) {
        this.codigoCupom = codigoCupom;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public Date getDt_validade() {
        return dt_validade;
    }

    public void setDt_validade(Date dt_validade) {
        this.dt_validade = dt_validade;
    }
}
