package br.com.netMovie.calculos;

import br.com.netMovie.modelos.Titulo;

public class CalculadoradeTempo {
    private int  tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;

    }

    public void calculaTempo(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
