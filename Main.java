package com.mycompany.arvoresbinarias;


public class Main {
    public static void main(String[] args) {
        ArvoresBinarias<Integer> arvore = new ArvoresBinarias<>();
        arvore.add(15);
        arvore.add(8);
        arvore.add(2);
        arvore.add(12);
        arvore.add(23);
        arvore.add(20);
        arvore.add(30);
        System.out.println("Árvore criada com sucesso!");
        ArvoresBinarias.busca(12,arvore);
    }
}
