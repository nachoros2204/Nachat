package main.java;

public abstract class ParticipanteDeChat {
    private String nombre;

    public ParticipanteDeChat(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //metodo abstracto para recibir mensajes
    public abstract void recibirMensaje(Mensaje mensaje);
}
