package main.java;

import java.time.LocalDateTime;

public interface IVisto {
    boolean getVisto(); //muestra si el mensaje fue visto
    LocalDateTime getFechaVisto(); //fecha en la que se vio el mensaje
}
