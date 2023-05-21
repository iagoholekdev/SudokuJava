

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

    static void generateCombination(int[] numbers, int index) {
        if (index == numbers.length - Main.one) {
            Main.printArray(numbers);
        } else {
            for (int i = index; i < numbers.length; i++) {
                Main.changeNumbers(numbers, index, i);
                Main.generateCombination(numbers, index + Main.one);
                Main.changeNumbers(numbers, index, i);
            }
        }
    }

    static void changeNumbers(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    static void printArray(int[] numbers) {
        StringBuilder combination = new StringBuilder(" ");
        if (numbers [Main.zero] == 5 && numbers [Main.one] == 3 && numbers [Main.four] == 7){
            for (int number : numbers) {
                combination.append(number);
            }
            System.out.println(combination);
        }
    }
}