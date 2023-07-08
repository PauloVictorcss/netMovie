package br.com.netMovie.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int minutoPorEpisodio;



    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }
    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }
    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }
    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutoPorEpisodio;
    }



}
