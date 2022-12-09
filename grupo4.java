

package org.example;

import java.util.Scanner;

public class grupo4 {

    public int contador() {
        int cont = 0;
        String respostaUsuario = "";

        System.out.println("=========================================================================");
        questao questao1 = new questao();
        questao1.pergunta = "1 - Em 1932, o governo estadunidense de Franklin Roosevelt empreendeu um plano\n econômico para controlar a crise econômica iniciada com a quebra da bolsa de valores\n em 1929. Como esse plano ficou conhecido e qual sua principal característica?";
        questao1.opcaoA = "A - New Deal, propôs a intervenção do Estado na economia.";
        questao1.opcaoB = "B - Plano Marshall, desenvolveu a economia investindo na recuperação europeia\n pós-Primeira Guerra.";
        questao1.opcaoC = "C -  Doutrina Monroe, expandiu o mercado para a América Latina";
        questao1.opcaoD = "D - Doutrina Truman, evitou a expansão do comunismo.";
        questao1.opcaoE = "E - Macartismo, promoveu uma reforma política no país";
        questao1.correta = "A"; // coloca aqui a opção correta da questão
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao1.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao2 = new questao();
        questao2.pergunta = "2 - O período de euforia que marcou os Estados Unidos no começo da década de 1920\n ficou conhecido como:";
        questao2.opcaoA = "A - Loucos Anos Vinte";
        questao2.opcaoB = "B - Anos Dourados";
        questao2.opcaoC = "C - Belle Époque";
        questao2.opcaoD = "D - Década Americana";
        questao2.opcaoE = "E - Nenhuma das alternativas acima";
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
        questao3.pergunta = "Qual dos fatores seguintes não é considerado um dos motivos para o estouro da crise\n de 1929:";
        questao3.opcaoA = "A - a especulação mobiliária";
        questao3.opcaoB = "B - o embargo econômico imposto pelos russos";
        questao3.opcaoC = "C - A concorrência econômica da Europa";
        questao3.opcaoD = "D - Os baixos salários dos trabalhadores";
        questao3.opcaoE = "E - A superprodução";
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao3.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao4 = new questao();
        questao4.pergunta = "-Sobre a crise de 1929, analise as afirmativas abaixo:\n I - A Crise de 1929, também conhecida como A Grande Depressão, foi a maior crise do\n capitalismo financeiro.\n II - O colapso econômico teve início em meados de 1929, nos Estados Unidos, e se\n espalhou por todo o mundo capitalista. Seus efeitos duraram por uma década e tiveram\n desdobramentos sociais e políticos.\n III - A Crise de 1929, no Brasil, enfraqueceu as oligarquias rurais que dominavam o\n cenário político e abriu caminho para a chegada de Getúlio Vargas ao poder, em 1930.\n Assinale a alternativa CORRETA.";
        questao4.opcaoA = "A - Apenas II e III";
        questao4.opcaoB = "B - Apenas III";
        questao4.opcaoC = "C - I, II e II";
        questao4.opcaoD = "D - Apenas I";
        questao4.opcaoE = "E - Nenhuma das alternativas";
        questao4.correta = "C"; // coloca aqui a opção correta da questão
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao4.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao5 = new questao();
        questao5.pergunta = "Selecione a alternativa que traz uma ação do governo brasileiro em resposta à Crise de 1929:";
        questao5.opcaoA = "A - criação de uma bolsa para o grande número de desempregados.";
        questao5.opcaoB = "B - promoveu grandes reformas no Rio de Janeiro para garantir emprego à população.";
        questao5.opcaoC = "C - comprou dólar, aproveitando-se do câmbio favorável.";
        questao5.opcaoD = "D - retirou o lastro da moeda nacional do dólar.";
        questao5.opcaoE = "E - promoveu a compra de sacas de café para evitar a queda do produto.";
        questao5.correta = "E"; // coloca aqui a opção correta da questão
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



