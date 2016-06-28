package com.seguidoresdecristo.sdc.Modelos;

import java.sql.Time;
import java.util.Date;

/**
 * Created by josueChaqui on 27/06/2016.
 *  Clase modelo para las actividades de la Sociedad
 */
public class Actividad {
    private int id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Time hora;
    private String lugar;
    /**
     *
     * @param nombre   (nombre de la actividad)
     * @param descripcion (descripcion de la actividad)
     * @param fecha (fecha de la actividad)
     * @param hora (hora de la actividad)
     *lugar (lugar de la actividad)
     */

    //constructor de Escritura
    public Actividad(String nombre, String descripcion, Date fecha, Time hora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    //constructor de lectura
    public Actividad(int id, String nombre, String descripcion, Date fecha, Time hora, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }
    //insersores y lectores de la clase
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
