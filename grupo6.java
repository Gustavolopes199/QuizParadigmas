

package org.example;

import java.util.Scanner;

public class grupo6 {

    public int contador() {
        int cont = 0;
        String respostaUsuario = "";

        System.out.println("=========================================================================");
        questao questao1 = new questao();
        questao1.pergunta = "1 - A melhor prevenção contra os códigos maliciosos é impedir que a infecção ocorra, pois nem sempre é possível reverter as ações danosas já feitas ou recuperar totalmente seus dados. Uma das formas de impedir a infecção é fazer uso de aplicativos de segurança da informação. O aplicativo de segurança que pode ser definido como um meio de segurança, o qual pode ser tanto um hardware quanto um software, que, através de um conjunto de regras, realiza análise do tráfego de rede para bloquear os acessos indesejados é:";
        questao1.opcaoA = "A - Protetor de dados.";
        questao1.opcaoB = "B - Firewall.";
        questao1.opcaoC = "C - Antivírus.";
        questao1.opcaoD = "D - Anti-adware.";
        questao1.opcaoE = "E - Antispyware. ";
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
        questao2.pergunta = "2 - Nos programas antivírus, o recurso que tem o objetivo de impedir a ação de um malware no momento em que ele tenta se instalar no computador é denominado :";
        questao2.opcaoA = "A - real time protection (proteção ativa). ";
        questao2.opcaoB = "B - quarentena. ";
        questao2.opcaoC = "C - log. ";
        questao2.opcaoD = "D - controle de acesso. ";
        questao2.opcaoE = "E - IDS. ";
        questao2.correta = "A"; // coloca aqui a opção correta da questão
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao2.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao3 = new questao();
        questao3.pergunta = "3 - O vírus que tem como principal característica o fato de infectar o registro de inicialização e se espalhar quando um sistema é inicializado é o :";
        questao3.opcaoA = "A - ransomware. ";
        questao3.opcaoB = "B - backdoor. ";
        questao3.opcaoC = "C - boot. ";
        questao3.opcaoD = "D - keylogger. ";
        questao3.opcaoE = "E - screenlogger. ";
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
        questao4.pergunta = "4 - Um dos procedimentos de segurança da informação é realizar a criptografia dos dados. Uma das formas de criptografia, conhecida também como criptografia de chave secreta, que utiliza uma única chave tanto para encriptar quanto para decriptar os dados é o(a)";
        questao4.opcaoA = "A - assimétrica. ";
        questao4.opcaoB = "B - simétrica. ";
        questao4.opcaoC = "C - mascaramento. ";
        questao4.opcaoD = "D - hash. ";
        questao4.opcaoE = "E - AES. ";
        questao4.correta = "B"; // coloca aqui a opção correta da questão
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if(respostaValida(respostaUsuario)) {
            if (respostaUsuario.equalsIgnoreCase(questao4.correta)) {
                cont++;
            }
        }
        System.out.println("=========================================================================");

        questao questao5 = new questao();
        questao5.pergunta = "5 - Considerando os procedimentos de backup, assinale a alternativa que apresenta o termo que se refere ao período de tempo no qual os dados gravados em um backup não podem ser apagados nem pelo sistema, nem por intervenções humanas convencionais. ";
        questao5.opcaoA = "A - autenticação";
        questao5.opcaoB = "B - realização";
        questao5.opcaoC = "C - armazenagem";
        questao5.opcaoD = "D - reputação";
        questao5.opcaoE = "E - retenção";
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



