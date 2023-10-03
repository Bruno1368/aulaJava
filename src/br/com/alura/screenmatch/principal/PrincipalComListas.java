package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme silencioDosInocentes = new Filme("Silencio dos inocentes", 1978);
        silencioDosInocentes.avalia(9);
        Filme belezaAmericana = new Filme("Beleza Americana", 1996);
        belezaAmericana.avalia(7);
        Filme brunoFilme = new Filme("O poderoso chefão", 1972);
        brunoFilme.avalia(6);
        Serie breakingBad = new Serie("Breaking bad", 2008);


        //mudnado array do tipo Filme, para o tipo Titulo, pois filme e série são Titulos
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(brunoFilme);
        lista.add(belezaAmericana);
        lista.add(silencioDosInocentes);
        lista.add(breakingBad);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            //chamando instanceof para ver se item é um filme *Não é muito usado, mas aparece, principalmente em código legado*
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação do filme: " + filme.getClassificacao());
            }

        }
        //entre os <> é o tipo de dado, depois o nome da variavel;
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println("Busca por artistas: " + buscaPorArtista);
        //collection.sort() para ordenar a lista por ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println("Busca por artista com collections: " + buscaPorArtista);



        Collections.sort(lista);
        System.out.println("Filmes em ordem alfabética:" + lista);
        //fazendo comparação com comparator agora, pelo ano de lançamento//comparable você implementa para usar o seu metodo e definir o metodo universal de comparação enquanto comparator define outros metodos de comparação
        // eu poderia usar por exmeplo lista.sort(Comparator.comparing(Titulo::getNome));
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Filme ordenado por ano ode lançamento: ");
        System.out.println(lista);



    }

}
