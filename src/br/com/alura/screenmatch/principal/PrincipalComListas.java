package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

    }

}
