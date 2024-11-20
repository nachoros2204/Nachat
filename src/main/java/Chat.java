package main.java;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<ParticipanteDeChat> miembros;
    private List<Mensaje> mensajes;
  
    public Chat () {
        this.miembros = new ArrayList<>();
        this.mensajes = new ArrayList<>();
    }

    public List<ParticipanteDeChat> getMiembros() {
        return miembros;
    }

    public List<Mensaje> getMensajesChat() {
        return mensajes;
    }
    
    public void agregar(ParticipanteDeChat miembroDeChat) {
        miembros.add(miembroDeChat);
    }
    
    public void enviar(Mensaje mensajeDeChat) {
        mensajes.add(mensajeDeChat);
    }
}