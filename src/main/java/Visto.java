package main.java;

import java.time.LocalDateTime;

public class Visto implements IVisto {
    private Usuario destinatarioDelVisto;
    private boolean visto;
    private LocalDateTime fechaVisto;

    
    public Visto(Usuario destinatarioDelVisto, boolean visto, LocalDateTime fechaVisto) {
        this.destinatarioDelVisto = destinatarioDelVisto;
        this.visto = visto;
        this.fechaVisto = LocalDateTime.now();
    }

    public Usuario getDestinatarioDelVisto() {
        return destinatarioDelVisto;
    }

    @Override
    public boolean getVisto() {
        return visto;
    }

    @Override
    public LocalDateTime getFechaVisto() {
        return fechaVisto;
    }
}
