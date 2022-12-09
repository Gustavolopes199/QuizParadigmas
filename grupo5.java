

package org.example;

import java.util.Scanner;

public class grupo5 {

    public int contador() {
        int cont = 0;
        String respostaUsuario = "";

        System.out.println("=========================================================================");
        questao questao1 = new questao();
        questao1.pergunta = "1ª Questão - No anime Bleach, qual o nome da bankai de Toshiro Hitsugaya?";
        questao1.opcaoA = "A - Katen Kyokotsu";
        questao1.opcaoB = "B - Kannonbiraki benihime Aratame";
        questao1.opcaoC = "C - Tensa Zangetsu";
        questao1.opcaoD = "D - Hyorinmaru";
        questao1.opcaoE = "E - Senbonzakura Kageyoshi";
        questao1.correta = "D"; // coloca aqui a opção correta da questão
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao1.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao2 = new questao();
        questao2.pergunta = "2ª Questão - Qual é o nome da segunda espada que o Asta adquire em Black Clover?";
        questao2.opcaoA = "A - Zangetsu";
        questao2.opcaoB = "B - Shukuma";
        questao2.opcaoC = "C - Enma";
        questao2.opcaoD = "D - Lostvayne";
        questao2.opcaoE = "E - Samehada";
        questao2.correta = "B"; // coloca aqui a opção correta da questão
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao2.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao3 = new questao();
        questao3.pergunta = "3ª Questão - Qual é o arco mais longo de One Piece?";
        questao3.opcaoA = "A - Arco da Ilha Whole Cake";
        questao3.opcaoB = "B - Arco de Marineford";
        questao3.opcaoC = "C - Arco do País de Wano";
        questao3.opcaoD = "D - Arco de Dressrosa";
        questao3.opcaoE = "E - Arco de Enies Lobby";
        questao3.correta = "C"; // coloca aqui a opção correta da questão
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao3.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao4 = new questao();
        questao4.pergunta = "4ª Questão - Qual animação da Disney de 2021 que é um musical?";
        questao4.opcaoA = "A - Red: Crescer é uma fera";
        questao4.opcaoB = "B - Enrolandos";
        questao4.opcaoC = "C - Carros";
        questao4.opcaoD = "D - Raya e o último dragão";
        questao4.opcaoE = "E - Encanto";
        questao4.correta = "E"; // coloca aqui a opção correta da questão
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao4.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao5 = new questao();
        questao5.pergunta = "5ª Questão - Qual filme classico da Disney ganhou uma nova versão em 2022?";
        questao5.opcaoA = "A - Pinóquio";
        questao5.opcaoB = "B - Frozen";
        questao5.opcaoC = "C - Era do Gelo";
        questao5.opcaoD = "D - Alice no Pais das Maravilhas";
        questao5.opcaoE = "E - Kung Fu Panda";
        questao5.correta = "A"; // coloca aqui a opção correta da questão
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)){
            if (respostaUsuario.equalsIgnoreCase(questao5.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");
        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }
    public static boolean respostaValida (String resp){
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }
}



