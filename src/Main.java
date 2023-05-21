

public class Main {
    final static int zero = 0;
    final static int one = 1;
    final static int four = 4;
    public static void main(String[] args) {
        /*nesse exercício, realizando uma análise apenas
        sobre a primeira linha do jogo, onde temos os
        valores: 5, 3, X, X, 7, X, X, X, X, onde representamos os
        espaços vazios por X. Crie um programa que faça a
        impressão de todas as possíveis combinações de
        números que podem ser colocados nos espaços de
        modo que não se repitam. Faça a impressão no
        console dessas combinações.*/
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Main.generateCombination(numbers, Main.zero);
    }

    static void generateCombination(int[] numeros, int index) {
        if (index == numeros.length - Main.one) {
            Main.printArray(numeros);
        } else {
            for (int i = index; i < numeros.length; i++) {
                Main.changeNumbers(numeros, index, i);
                Main.generateCombination(numeros, index + Main.one);
                Main.changeNumbers(numeros, index, Main.one);
            }
        }
    }

    static void changeNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    static void printArray(int[] numbers) {
        String combination = " ";
        if (numbers [Main.zero] == 5 && numbers [Main.one] == 3 && numbers [Main.four] == 7){
            for (int number : numbers) {
                combination += number;
            }
            System.out.println(combination);
        }
    }
}