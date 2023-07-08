package br.com.netMovie.modelos;

import br.com.netMovie.calculos.Classificavel;

public class Episodio implements Classificavel{

    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;


    public int getTotaVisualizacoes() {
        return totalVisualizacoes;
    }
    public void setTotaVisualizacoes(int totaVisualizacoes) {
        this.totalVisualizacoes = totaVisualizacoes;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100) {
            return 4;
        }else {
            return 2;
        }
    }


}

