package javaDio;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(2.5,12.8);
        Calculadora.subtracao(40.5,20.5);
        Calculadora.multiplicacao(7.4,5.1);
        Calculadora.divicao(45.5,25.5);
        //mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(4);
        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000,Emprestimo.duasParcelas());
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,5);
    }



}
