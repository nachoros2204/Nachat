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
//para agregar participantes al chat
    public void agregar(ParticipanteDeChat miembroDeChat) {
        miembros.add(miembroDeChat);
    }
//para agregar mensajes al chat
    public void enviar(Mensaje mensajeDeChat) {
        mensajes.add(mensajeDeChat);
    }

//verificamos si el mensaje no ha sido visto por el usuario y lo marcamos como visto
    public void visualizar(Usuario usuario) {
        for (Mensaje mensaje : mensajes) { 
            if (!mensaje.yaVistoPor(usuario)) {  
                visto(mensaje, usuario);
            }
        }
    }

    //creamos el objeto "visto" y lo agregamos a la lista de vistos
    public void visto(Mensaje mensaje, Usuario usuario) {
        MensajeVisto mensajeVisto = new MensajeVisto(mensaje, usuario);
        mensaje.getVistos().add(mensajeVisto);
    }
    
    
}