package br.com.treinaweb.estruturadados.main;

import br.com.treinaweb.estruturadados.arvorebinaria.Arvore;
import br.com.treinaweb.estruturadados.arvorebinaria.NoArvore;
import br.com.treinaweb.estruturadados.arvorebinaria.NoArvorePessoa;
import br.com.treinaweb.estruturadados.conjuntos.Conjunto;
import br.com.treinaweb.estruturadados.filas.Fila;
import br.com.treinaweb.estruturadados.listasligadas.ListaDuplamenteLigada;
import br.com.treinaweb.estruturadados.listasligadas.ListaLigada;
import br.com.treinaweb.estruturadados.mapas.Mapa;
import br.com.treinaweb.estruturadados.modelos.Pessoa;
import br.com.treinaweb.estruturadados.pilhas.Pilha;
import br.com.treinaweb.estruturadados.vetores.Vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1. Gerenciamento de memória");
        System.out.println("2. Vetores");
        System.out.println("3. Lista ligada");
        System.out.println("4. Lista duplmamente ligada");
        System.out.println("5. Pilha");
        System.out.println("6. Filha");
        System.out.println("7. Conjunto");
        System.out.println("8. Mapas");
        System.out.println("9. Árvore Binária");
        System.out.print("Digte: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch(opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
            case 3:
                fazerListaLigada();
                break;
            case 4:
                fazerListaDuplamenteLIgada();
                break;
            case 5:
                fazerPilha();
                break;
            case 6:
                fazerFila();
                break;
            case 7:
                fazerConjunto();
                break;
            case 8:
                fazerMapa();
                break;
            case 9:
                fazerArvore();
                break;
        }
        scanner.close();
    }

    private static void fazerArvore() {
        Arvore<Pessoa> arvorePessoas = new Arvore<Pessoa>();
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(5, "Treinaweb 5")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(4, "Treinaweb 4")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(6, "Treinaweb 6")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(7, "Treinaweb 7")));
        System.out.println(arvorePessoas.toString());
        System.out.println("Busca...");
        NoArvore<Pessoa> noPessoa6 = new NoArvorePessoa(new Pessoa(6, "Treinaweb 6"));
        // NoArvore<Pessoa> noPessoa4 = new NoArvorePessoa(new Pessoa(4, "Treinaweb 4"));
        System.out.println(arvorePessoas.buscar(noPessoa6));
        // System.out.println(arvorePessoas.buscar(noPessoa4));
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(1, "Treinaweb 1")));
        System.out.println("**************");
        System.out.println(arvorePessoas.toString());
        System.out.println("*** EM ORDEM ***");
        arvorePessoas.emOrdem();
        System.out.println("*** PRE ORDEM ***");
        arvorePessoas.preOrdem();
    }

    private static void fazerMapa() {
        Mapa<String, Pessoa> mapaPessoas = new Mapa<String, Pessoa>();
        System.out.println(mapaPessoas.toString());
        mapaPessoas.adicionar("legal", new Pessoa(1, "Treinaweb"));
        System.out.println(mapaPessoas.toString());
        System.out.println(mapaPessoas.contemChave("legal"));
        System.out.println(mapaPessoas.contemChave("chata"));
        mapaPessoas.adicionar("chata", new Pessoa(2, "João"));
        System.out.println(mapaPessoas.contemChave("chata"));
        mapaPessoas.adicionar("legal", new Pessoa(3, "Treinaweb Editado"));
        System.out.println(mapaPessoas.toString());
        mapaPessoas.remover("chata");
        System.out.println(mapaPessoas.toString());
        System.out.println(mapaPessoas.recuperar("legal"));
        mapaPessoas.remover("chave");
    }

    private static void fazerConjunto() {
        Conjunto<Pessoa> conjuntoPessoas = new Conjunto<Pessoa>();
        System.out.println(conjuntoPessoas.estaVazio());
        System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Treinaweb")));
        System.out.println(conjuntoPessoas.toString());
//      System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Treinaweb")));
        System.out.println(conjuntoPessoas.inserir(new Pessoa(2, "Treinaweb")));
        System.out.println(conjuntoPessoas.toString());
        System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "Treinaweb")));
        System.out.println(conjuntoPessoas.toString());
    }

    private static void fazerFila() {
        Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
        System.out.println(filaPessoas.estaVazia());
        filaPessoas.enfileirar(new Pessoa(1, "Treinaweb 1"));
        filaPessoas.enfileirar(new Pessoa(2, "Treinaweb 2"));
        System.out.println(filaPessoas.toString());
        Pessoa p = filaPessoas.desenfileirar();
        System.out.println(p.toString());
        System.out.println(filaPessoas.toString());
    }

    private static void fazerPilha() {
        Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
        System.out.println(pilhaPessoas.estaVazia());
        pilhaPessoas.empilhar(new Pessoa(1, "Treinaweb 1"));
        pilhaPessoas.empilhar(new Pessoa(2, "Treinaweb 2"));
        pilhaPessoas.empilhar(new Pessoa(3, "Treinaweb 3"));
        Pessoa p1 = pilhaPessoas.desempilhar();
        System.out.println(p1.toString());
    }

    private static void fazerListaDuplamenteLIgada() {
        ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
        listaPessoas.inserir(new Pessoa(1, "Treinaweb 1"));
        listaPessoas.inserir(new Pessoa(2, "Treinaweb 2"));
        listaPessoas.inserir(new Pessoa(3, "Treinaweb 3"));
        listaPessoas.inserirEm(1, new Pessoa(4, "Treinaweb 4"));
        System.out.println(listaPessoas.toString());
        Pessoa p = listaPessoas.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "Treinaweb 100");
        System.out.println(listaPessoas.contem(p));
        System.out.println(listaPessoas.contem(pessoaErrada));
        System.out.println(listaPessoas.indice(p));
        System.out.println(listaPessoas.indice(pessoaErrada));
        listaPessoas.remover(p);
        System.out.println(listaPessoas.toString());
        listaPessoas.remover(0);
        System.out.println(listaPessoas.toString());
        System.out.println("Lista de pessoas");
        for (int i = 0; i < listaPessoas.tamanho(); i++) {
            System.out.println(listaPessoas.recuperar(i).toString());
        }
    }

    private static void fazerListaLigada() {
        ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
        listaPessoas.inserir(new Pessoa(1, "Treinaweb 1"));
        listaPessoas.inserir(new Pessoa(2, "Treinaweb 2"));
        listaPessoas.inserir(new Pessoa(3, "Treinaweb 3"));
        listaPessoas.inserirEm(1, new Pessoa(4, "Treinaweb 4"));
        System.out.println(listaPessoas.toString());
        Pessoa p = listaPessoas.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "Treinaweb 100");
        System.out.println(listaPessoas.contem(p));
        System.out.println(listaPessoas.contem(pessoaErrada));
        System.out.println(listaPessoas.indice(p));
        System.out.println(listaPessoas.indice(pessoaErrada));
        listaPessoas.remover(p);
        System.out.println(listaPessoas.toString());
        listaPessoas.remover(0);
        System.out.println(listaPessoas.toString());
        System.out.println("Lista de pessoas");
        for (int i = 0; i < listaPessoas.tamanho(); i++) {
            System.out.println(listaPessoas.recuperar(i).toString());
        }
    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println("------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        System.out.println("********************");
        Pessoa p1 = new Pessoa(1, "Treinaweb");
        System.out.println(p1.toString());
        Pessoa p2 = new Pessoa(1, "Treinaweb");
        System.out.println(p2.toString());
        System.out.println("---------------------");
        // p2.setNome("Treinaweb Modificado");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }

    private static void fazerVetor() {
        Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
        vetorPessoas.inserir(new Pessoa(1, "Treinaweb1"));
        vetorPessoas.inserir(new Pessoa(2, "Treinaweb2"));
        vetorPessoas.inserir(new Pessoa(3, "Treinaweb3"));
        vetorPessoas.inserir(new Pessoa(4, "Treinaweb4"));
        vetorPessoas.inserirEm(1, new Pessoa(5, "Treinaweb5"));
        System.out.println(vetorPessoas);
        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < vetorPessoas.tamanho(); i++) {
            System.out.println(vetorPessoas.recuperar(i).getNome());
        }
        Pessoa p = vetorPessoas.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "Treinaweb 100");
        System.out.println(vetorPessoas.contem(p));
        System.out.println(vetorPessoas.contem(pessoaErrada));
        System.out.println(vetorPessoas.indice(p));
        System.out.println(vetorPessoas.indice(pessoaErrada));
        vetorPessoas.remover(2);
        System.out.println(vetorPessoas.toString());
        vetorPessoas.remover(p);
        System.out.println(vetorPessoas.toString());
    }

}