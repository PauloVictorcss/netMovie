package br.com.netMovie.modelos;

public record TituloOmdb(String title, String year, String runtime) {

    @Override
    public String toString() {
        return "nome ='" + title + '\'' +
                ", Ano de lançamento ='" + year + '\'' +
                ", duração ='" + runtime + '\'';
    }
}
