package com.mycompany.clases_abstractas;

import java.util.Scanner;

public class series extends Media {

    @Override
    public void play() {
        System.out.println("Que episodio quieres reproducir");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
        printSomething("playin episode "+ episodeIndex + super.getTitulo());
        
    }

    private int totalEpisodios;
    private int totalTemporadas;
    private int duracionEpisodos;

    public series(String titulo, String genero, int duracion, int totalEpisodios, int totalTemporadas) {
        super(titulo, genero, duracion);
        this.totalEpisodios = totalEpisodios;
        this.totalTemporadas = totalTemporadas;
        duracionEpisodos = duracion;
    }

    public series() {
        super("", "", 0);
        totalEpisodios = 0;
        totalTemporadas = 0;
        duracionEpisodos = 0;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    @Override
    public int getDuracion() {
        return duracionEpisodos * totalEpisodios * totalTemporadas;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public int getDuracionEpisodos() {
        return duracionEpisodos;
    }

    public void setDuracionEpisodos(int duracionEpisodos) {
        this.duracionEpisodos = duracionEpisodos;
    }

    public void moveForward() {
        System.out.println("Quieres avanzar muchos minutos");
        Scanner scanner = new Scanner(System.in);
        int minutos = scanner.nextInt();
        super.moveForward(minutos);
    }
}
