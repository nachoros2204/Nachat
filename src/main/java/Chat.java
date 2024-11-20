package main.java;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Mensaje> mensajesChat;

    public Chat() {
        this.mensajesChat = new ArrayList<>();
    }

    public void enviarMensaje(Mensaje mensaje, Usuario remitente, ParticipanteDeChat destinatario) {
        mensajesChat.add(mensaje);
        destinatario.recibirMensaje(mensaje); //uso polimorfico de Chats
    }

    public List<Mensaje> getMensajesChat() {
        return mensajesChat;
    }
}