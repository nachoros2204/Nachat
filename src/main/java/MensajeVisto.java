package main.java;

import java.time.LocalDateTime;

public class MensajeVisto implements IMensajeVisto {
    private Mensaje mensaje;
    private Usuario usuario;
    private LocalDateTime fecha;

    public MensajeVisto(Mensaje mensaje, Usuario usuario) {
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
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
    public LocalDateTime getFecha() {
        return fecha;
    }
}
