package com.functional.map.filter.sorted.practice;

import lombok.Setter;
import lombok.Getter;

//@Getter
//@Setter
public class Pelicula {

    private String titulo;
    private String director;
    private int estreno;
    private boolean chord;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int estreno) {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }

    public Pelicula(String titulo, String director, int estreno, boolean chord) {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
        this.chord = chord;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public boolean isChord() {
        return chord;
    }

    public void setChord(boolean chord) {
        this.chord = chord;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", estreno=" + estreno +
                ", chord=" + chord +
                '}';
    }
}
