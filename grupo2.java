

package org.example;

import java.util.Scanner;

public class grupo2 {

    public int contador() {
        int cont = 0;
        String respostaUsuario = "";

        System.out.println("=========================================================================");
        questao questao1 = new questao();
        questao1.pergunta = "1) Ordem Paranormal: Enigma do Medo é um jogo de exploração, enigmas e sobrevivência com uma narrativa profunda e envolvente no universo de RPG criado por Rafael Lange (Cellbit). O jogo que arrecadou mais de 10 milhões de reais da comunidade para ser produzido, é um dos jogos mais aguardados de 2023 tanto pelos fãs quanto pela comunidade gamer. Sobre a data de lançamento do jogo, ele vai ser lançado em:";
        questao1.opcaoA = "a) Janeiro";
        questao1.opcaoB = "b) Março";
        questao1.opcaoC = "c) Dezembro";
        questao1.opcaoD = "d) Abril";
        questao1.opcaoE = "e) Agosto";
        questao1.correta = "A";
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao1.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao2 = new questao();
        questao2.pergunta = "2) Qual é a franquia de jogos mais famosa?";
        questao2.opcaoA = "A - Pokémon";
        questao2.opcaoB = "B - Mario";
        questao2.opcaoC = "C - FIFA";
        questao2.opcaoD = "D - Call Of Duty";
        questao2.opcaoE = "E - Zelda";
        questao2.correta = "B";
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao2.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao3 = new questao();
        questao3.pergunta = "3) No jogo GOD OF WAR qual o nome do irmão do personagem kratos?";
        questao3.opcaoA = "A -Cleiton";
        questao3.opcaoB = "B -Thanatos ";
        questao3.opcaoC = "C -Hermes";
        questao3.opcaoD = "D -Deimos";
        questao3.opcaoE = "E -Posseidon";
        questao3.correta = "D";
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao3.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao4 = new questao();
        questao4.pergunta = "4) Qual foi o jogo mais vendido de todos os tempos?";
        questao4.opcaoA = "A - Minecraft";
        questao4.opcaoB = "B - Tetris";
        questao4.opcaoC = "C - Super Mario World";
        questao4.opcaoD = "D - League Of Legends";
        questao4.opcaoE = "E -  Doneky Kong Country";
        questao4.correta = "C";
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao4.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao5 = new questao();
        questao5.pergunta = "5) Quаіѕ ѕãо аѕ trêѕ сіdаdеѕ рrіnсіраіѕ dо јоgо Аѕѕаѕѕіn'ѕ Сrееd ІV: Вlасk Flаg?";
        questao5.opcaoA = "A - Веrlіm, Мunіquе е Наmburgо.";
        questao5.opcaoB = "B - Rоmа, Flоrеnçа е Ѕаn Gіmіgnаnо.";
        questao5.opcaoC = "C - Vеrѕаlhеѕ, Раrіѕ е Маrѕеlhа.";
        questao5.opcaoD = "D - Flórіdа, Nоvа Іоrquе е Аlаbаmа.";
        questao5.opcaoE = "E - Наvаnа, Nаѕѕаu е Кіngѕtоn";
        questao5.correta = "E";
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



