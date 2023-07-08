package br.com.netMovie.modelos;

import br.com.netMovie.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private boolean incluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int anoDeLancamento;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    public Titulo(TituloOmdb tituloOmdb){
        this.nome = tituloOmdb.title();

        if(tituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano porque tem " +
                    "mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 2));
    }
    

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        if(this.incluidoNoPlano ==  true) {
            System.out.println("Incluido no plano");
        }else {
            System.out.println("Não está incluído no plano");
        }
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    public void avalia(double nota) {
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return SomaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", ano de lançamento = " + anoDeLancamento +
                ", duração em minutos = " + duracaoEmMinutos + ")";
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }


}
