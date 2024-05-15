package Comparable_e_Comparator;

public class Interfaces {
    /*
         Comparable:
            - Fornece uma unica sequencia de ordenação. Em outras palavras, podemos ordenar a coleção com base em um unico
            elemento, como id, nome e preço.
            - Afeta a classe original, ou seja, a classe atual é modificada.
            - Fonece o metodo compareTo() para ordenar elementos.
            - Esta presente no pacote java.lang
            - Podemos ordenar os elementos da lista do tipo comparable usando o metodo collections.sort(list).

          Comparator:
            - Fornece o metodo compare() para ordenar os elementos.
            - Fornece multiplas seuqencias de ordenação. Em outras palavras, podemos ordenar a coleção com base em multiplos
            elementos, como id, nome, preço, etc.
            - Não afeta a classe original, ou seja, a classe atual não é modificada
            - Esta presente no pacote java.util
            - Podemos ordenar os elementos da lista do tipo comparator usando o metodo collections.sort(list, comparator).

          Collections:
            - É uma classe utilitaria do java para operações comuns em coleções
            - Ela fornece metodos para ordenação, busca, manipulação e sicronização de coleções.
            - O metodo sort() é usado para ordenar uma lista em ordem ascendente
            - O metodo sort() em conjunto com collections.reverseOrder() permite ordener em ordem descendente.

     */
}
