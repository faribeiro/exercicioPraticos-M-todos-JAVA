package one.dio.metodosJava;

import one.dio.metodosJava.Criacao.Calculadora;
import one.dio.metodosJava.Criacao.Emprestimo;
import one.dio.metodosJava.Criacao.Mensagem;
import one.dio.metodosJava.Return.Quadrilatero;
import one.dio.metodosJava.SobreCarga.quadrilatero;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular( 1000, 5);

        //Quadrilátero
        System.out.println("Exercício Quadrilátero");
        quadrilatero.area(3);
        quadrilatero.area(5d,5d);
        quadrilatero.area(7,8,9);
        quadrilatero.area(5f,5f);

        //Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}

