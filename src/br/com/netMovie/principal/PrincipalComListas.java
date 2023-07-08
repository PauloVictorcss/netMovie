package br.com.netMovie.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.netMovie.modelos.Filme;
import br.com.netMovie.modelos.Serie;
import br.com.netMovie.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderoso Chefão", 1985);
        meuFilme.avalia(8.5);
        meuFilme.avalia(7.5);
        Filme outroFilme = new Filme("Ta chovendo amburguer", 2011);
        outroFilme.avalia(5.5);
        outroFilme.avalia(6.4);
        Filme avatar = new Filme("Avatar", 2012);
        avatar.avalia(9.7);
        avatar.avalia(5.6);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(4.4);
        lost.avalia(3.8);


        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(avatar);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme) {
                Filme filme = (Filme)item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        System.out.println();

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Paulo Victor");
        buscarPorArtistas.add("Elem Viviane");
        buscarPorArtistas.add("Marcos Gabriel");
        System.out.println(buscarPorArtistas);

        Collections.sort(buscarPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtistas);

        System.out.println("Listas de títulos ordenados por ordem alfabética");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lançamento");
        System.out.println(lista);


    }

}
