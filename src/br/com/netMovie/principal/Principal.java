package br.com.netMovie.principal;

import java.util.ArrayList;
import br.com.netMovie.modelos.Episodio;
import br.com.netMovie.modelos.Filme;
import br.com.netMovie.modelos.Serie;
import br.com.netMovie.calculos.CalculadoradeTempo;
import br.com.netMovie.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderoso Chefão", 1985);
        meuFilme.setDuracaoEmMinutos(80);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(7);
        meuFilme.avalia(6);
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total avaliação: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.pegaMedia());

        System.out.println();

        Filme outroFilme = new Filme("Ta chovendo amburguer", 2011);
        outroFilme.setAnoDeLancamento(2011);
        outroFilme.setDuracaoEmMinutos(120);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.exibeFichaTecnica();
        outroFilme.avalia(8.5);
        outroFilme.avalia(7.5);
        outroFilme.avalia(6.5);
        System.out.println("Duração: " + outroFilme.getDuracaoEmMinutos());
        System.out.println("Total de avaliações: " + outroFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + outroFilme.pegaMedia());
        System.out.println(outroFilme.getClassificacao()+ "*");

        Filme avatar = new Filme("Avatar", 2012);
        avatar.setAnoDeLancamento(2012);
        avatar.setDuracaoEmMinutos(130);
        avatar.setIncluidoNoPlano(true);
        avatar.exibeFichaTecnica();
        avatar.avalia(9.5);
        avatar.avalia(7.5);
        avatar.avalia(4.5);
        System.out.println("Duração: " + avatar.getDuracaoEmMinutos());
        System.out.println("Total de avaliações: " + avatar.getTotalDeAvaliacoes());
        System.out.println("Média: " + avatar.pegaMedia());
        System.out.println(avatar.getClassificacao()+ "*");


        System.out.println();

        Serie lost = new Serie("Lost", 2000);
        lost.setIncluidoNoPlano(true);
        lost.setTemporadas(15);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutoPorEpisodio(30);
        lost.setAtiva(true);
        System.out.println();

        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos()+
                " minutos");

        CalculadoradeTempo calcula = new CalculadoradeTempo();
        calcula.calculaTempo(meuFilme);
        calcula.calculaTempo(outroFilme);
        calcula.calculaTempo(lost);
        System.out.println(calcula.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setNome("Piloto");
        ep.setSerie(lost);
        ep.setTotaVisualizacoes(300);
        filtro.filtra(ep);


        ArrayList<Filme>listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(avatar);


        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
        System.out.println("Anos de lançamento: " + listaDeFilmes.get(0).getAnoDeLancamento());
        System.out.println(listaDeFilmes);

    }

}
