package main.java;

import java.time.LocalDateTime;

public class MensajeVisto implements IMensajeVisto {
    private Mensaje mensaje;
    private ParticipanteDeChat usuario;
    private LocalDateTime fechaVisto;

    public MensajeVisto(Mensaje mensaje, ParticipanteDeChat usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fechaVisto = LocalDateTime.now();
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public ParticipanteDeChat getUsuario() {
        return usuario;
    }

    @Override
    public boolean getVisto() {
        return true;
    }

    @Override
    public LocalDateTime getFechaVisto() {
        return fechaVisto;
    }
}
