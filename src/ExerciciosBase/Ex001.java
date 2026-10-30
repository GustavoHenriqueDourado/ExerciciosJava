package ExerciciosBase;

import java.util.Scanner;

public class Ex001 {

    static int[] lerNumeros() {
        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[10]; // vetor que aceita 10 valores

        for (int i = 0; i < 10; i++) { // estrutura condicional
            while(true) { //estrutura de repetição para repetir mesmo se escrever outro tipo de caractere
                System.out.println("Digite um numero : ");
                if(leia.hasNextInt()){ //  condição que lê somente numeros interios e guarda eles no vetor numero
                    numeros[i] = leia.nextInt(); // vetor
                    break;
                }
                else{ // se não for um caracter numero inteiro aparece essa mensagem e roda denovo pelo while
                        System.out.println("Digito invalida, digite novamente. ");
                        leia.next();
                }
            }
        }
        return numeros;
    }

    static int somaNumeros(int[] numeros, int somaTotal){ // coloca como parametro da função o vetor e cria uma varParametro que soma todos os numeros
        for(int numero : numeros){ // for each (para cada) com uma variavel temporaria que pega o numero da vez e
            somaTotal += numero; // vai somando dentro da variavel somaTotal
        }
        return somaTotal;
    }

    static int somaMaior18(int[] numeros, int somaMaior18){
        for(int numero : numeros){
            if(numero > 18)
                somaMaior18 += numero;
        }
        return somaMaior18;
    }

    static int contAcima18(int[] numeros, int contAcima18){
        contAcima18 = 0;
        for(int numero : numeros){
            if(numero > 18){
                contAcima18 ++;
            }
        }
        return contAcima18;
    }

    static double mediaAcima18(int somaMaior18, int contAcima18, double mediaAcima18){
        mediaAcima18 = somaMaior18 / contAcima18;
        return  mediaAcima18;
    }



    public static void main (String[] args){

        int[] numeros = lerNumeros();

        int somaT = somaNumeros(numeros, 0);
        int somaM = somaMaior18(numeros, 0);
        int contA = contAcima18(numeros, 0);

        System.out.println("Soma de todos os numeros: " + somaT);
        System.out.println("A soma dos numeros maiores de 18 : " + somaM);
        System.out.println("A quantidade de numeros maiores de 18 é : " + contA);


        if(contA > 0){
            double media = mediaAcima18(somaM, contA, 0);
            System.out.println("Media dos numeros maiores que 18: " + media);
        }
        else{
            System.out.println("Nenhum numero maior que 18 foi digitado.");
        }

    }

}
