public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.anoDeLancamento = 1998;
        filme1.nome = "Revolução dos bichos";
        filme1.duracaoMinutos = 101;
        filme1.incluidoNoPlano = true;


        // chamada do método
        filme1.exibeFichaTecnica();
        filme1.avalia(7.5);
        filme1.avalia(8);
        filme1.avalia(5.6);
        System.out.println("Soma das avaliações: " + filme1.somaDasAvaliacoes);
        System.out.println("Número de avaliações: " + filme1.totalDeAvaliacoes);
        System.out.println("Média das avaliações: " + filme1.pegaMedia());

    }
}