package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fakeMain {

    selecionarQuiz sc = new selecionarQuiz();
    grupo2 execGrupo2 = new grupo2();
    grupo6 execGrupo6 = new grupo6();
    grupo4 execGrupo4 = new grupo4();
    grupo5 execGrupo5 = new grupo5();
    grupo3 execGrupo3 = new grupo3();

    public void fazoFake() {

        sc.mostrarOpcoes();
        Scanner id = new Scanner(System.in);
        int x = 0;
               try {
                   x = id.nextInt();
                   switch (x) {
                       case 2:
                           System.out.print(execGrupo2.contador() * 20 + "% de acertos");
                           break;
                       case 3:
                           System.out.print(execGrupo3.contador() * 20 + "% de acertos");
                           break;
                       case 4:
                           System.out.println(execGrupo4.contador() * 20 + "% de acertos");
                           break;
                       case 5:
                           System.out.println(execGrupo5.contador() * 20 + "% de acertos");
                       case 6:
                           System.out.println(execGrupo6.contador() * 20 + "% de acertos");
                           break;
                       default:
                           System.out.println("opção errada! Digite numeros entre 2 e 6 de acordo com qual deseja escolher");
                   }
               } catch (InputMismatchException e) {
                   System.out.println("Insira apenas numeros de 2 a 6!");
               }
         }
    }
