

package org.example;

import java.util.Scanner;

public class grupo3 {

    public int contador() {
        int cont = 0;
        String respostaUsuario = "";

        System.out.println("=========================================================================");
        questao questao1 = new questao();
        questao1.pergunta = "No Filme, Liga Da Justica (2017) ; O Flash pergunta ao Batman,qual é seu super poder? Qual foi a resposta do batman?";
        questao1.opcaoA = "A - Sou inteligente e rico";
        questao1.opcaoB = "B - Sou rico";
        questao1.opcaoC = "C - Sou milionário";
        questao1.opcaoD = "D - Sou bilionário";
        questao1.opcaoE = "E - Sou rico e inteligente";
        questao1.correta = "B"; // coloca aqui a opção correta da questão
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao1.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao2 = new questao();
        questao2.pergunta = "Qual o filme de maior bilheteria nos cinemas?";
        questao2.opcaoA = "A - Vingadores: Guerra Infinita (2018)";
        questao2.opcaoB = "B - Titanic (1997)";
        questao2.opcaoC = "C - Vingadores Ultimato (2019)";
        questao2.opcaoD = "D - Avatar (2009)";
        questao2.opcaoE = "E - Homem-Aranha: Sem volta para Casa (2021)";
        questao2.correta = "D"; // coloca aqui a opção correta da questão
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao2.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao3 = new questao();
        questao3.pergunta = "Na famosa franquia de filmes de harry Potter, ele está acompanhado a quase todo momento por??";
        questao3.opcaoA = "A -  Ronie Wysley e Hermiome";
        questao3.opcaoB = "B - Draco Malfoi e Gina Wysley";
        questao3.opcaoC = "C -  Os gêmeos Wysley";
        questao3.opcaoD = "D -  Severo Snape e Sirus Black ";
        questao3.opcaoE = "E - Danbowdor e Tom Ridler";
        questao3.correta = "A"; // coloca aqui a opção correta da questão
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao3.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao4 = new questao();
        questao4.pergunta = "Série de TV e cinema onde o personagem principal é um repórter fotográfico que trabalha para um dos dos Jornais mais importantes de sua cidade.";
        questao4.opcaoA = "A -  Atividade Paranormal";
        questao4.opcaoB = "B - CSI - Investigação Criminal";
        questao4.opcaoC = "C -  Batman";
        questao4.opcaoD = "D -  Homem Aranha";
        questao4.opcaoE = "E - Super Homem";
        questao4.correta = "D"; // coloca aqui a opção correta da questão
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao4.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao5 = new questao();
        questao5.pergunta = "Personagem do seriado Chaves que mora numa casa de Número 71.";
        questao5.opcaoA = "A - Dona Florinda";
        questao5.opcaoB = "B - Professor Girafales";
        questao5.opcaoC = "C - Seu Barriga";
        questao5.opcaoD = "D - Dona Clotilde";
        questao5.opcaoE = "E - Seu Madruga";
        questao5.correta = "D"; // coloca aqui a opção correta da questão
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



