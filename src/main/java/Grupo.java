package main.java;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends ParticipanteDeChat {
    private List<Usuario> miembros;

    public Grupo(String nombre) {
        super(nombre);
        this.miembros = new ArrayList<>();
    }

    public List<Usuario> getMiembros() {
        return miembros;
    }

    public void agregarMiembro(Usuario usuario) {
        if (!miembros.contains(usuario)) {
            miembros.add(usuario);
        }
    }

    @Override
    public void recibirMensaje(Mensaje mensaje) {
        for (Usuario miembro : miembros) {
            miembro.recibirMensaje(mensaje); //cada miembro recibe el mensaje como notificacion
        }
    }
}
