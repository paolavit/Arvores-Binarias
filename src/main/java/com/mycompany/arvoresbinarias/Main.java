package com.mycompany.arvoresbinarias;


public class Main {
    public static void main(String[] args) {
        ArvoresBinarias<Integer> arvore = new ArvoresBinarias<>();
        arvore.add(20);
        arvore.add(15);
        arvore.add(17);
        arvore.add(25);
        arvore.add(14);
        arvore.add(18);
        System.out.println("Árvore criada com sucesso!");
    }
}
