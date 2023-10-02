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

        //laço for
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }

        //outra fora de percorrer com o foreach;
        //lista.forEach(itens -> System.out.println(itens));
        // laço forEach, para cada variável item que está dentro de lista, imprimir
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //Casting item para filme, pq o objeto é um filme, ou seja: trate ele como um filme, por minha conta em risco
            Filme filme = (Filme)item;
                System.out.println("Classificação do filme: " + filme.getClassificacao());
        }

    }
}
