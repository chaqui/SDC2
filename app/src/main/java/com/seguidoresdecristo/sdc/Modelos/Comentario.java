package com.seguidoresdecristo.sdc.Modelos;

/**
 * Created by josueChaqui on 27/06/2016.
 * Clase modelo para los comentarios
 */

public class Comentario {


    private int id;
    private String texto;
    private int tipo;
    private int idUsuario;



    /**
     * @param texto texto del comentario
     * @param tipo tipo del comentario (1 para directiva, 2 para general)
     */

    public Comentario(String texto, int tipo, int idUsuario) {
        this.texto = texto;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
    }

    public Comentario(int id, String texto, int tipo, int idUsuario) {
        this.id = id;
        this.texto = texto;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
