package main.java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mensaje {
    private String texto;
    private LocalDateTime fecha;
    private List<Visto> vistos; //lista de usuarios que ven el mensaje

    public Mensaje(String texto, LocalDateTime fecha) {
        this.texto = texto;
        this.fecha = fecha;
        this.vistos = new ArrayList<>();
    }

    public List<Visto> getVistos() {
        return vistos;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean esVistoPor(Usuario usuario) {
        for (Visto visto : vistos) {
            if (visto.getDestinatarioDelVisto().equals(usuario)) {
                return true;
            }
        }
        return false; //si el usuario no vio el mensaje
    }

    public void marcarComoVisto(Usuario usuario) {
        for (Visto visto : vistos) {
            if (visto.getDestinatarioDelVisto().equals(usuario)) {
                return; //si ya está marcado como visto, no lo agrega de nuevo a la lista
            }
        }
        vistos.add(new Visto(usuario, true, LocalDateTime.now()));
    }

    public LocalDateTime getFechaVisto(Usuario usuario) {
        for (Visto visto : vistos) {
            if (visto.getDestinatarioDelVisto().equals(usuario)) {
                return visto.getFechaVisto();
            }
        }
        return null; //si el usuario no vio el mensaje
    }
}
