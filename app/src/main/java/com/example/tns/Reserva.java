package com.example.tns;

import java.util.Date;

public class Reserva extends Usuario {

    Date dt_reserva;

    public Date getDt_reserva() {
        return dt_reserva;
    }

    public void setDt_reserva(Date dt_reserva) {
        this.dt_reserva = dt_reserva;
    }

    @Override
    public String getNomeUsuario() {
        return super.getNomeUsuario();
    }

    @Override
    public Integer getSenha() {
        return super.getSenha();
    }
}
