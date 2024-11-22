package main.java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mensaje {
    private String texto;
    private LocalDateTime fecha;
    private Usuario remitente;
    private List<MensajeVisto> vistos;

    public Mensaje(String texto, Usuario remitente) {
        this.texto = texto;
        this.fecha = LocalDateTime.now();
        this.remitente = remitente;
        this.vistos = new ArrayList<>();
    }

    public List<MensajeVisto> getVistos() {
        return vistos;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getUsuarioRemitente() {
        return remitente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean yaVistoPor(Usuario usuario) {
        return vistos.stream().anyMatch(v -> v.getUsuario().equals(usuario) && v.getVisto());
    }
    
}

