import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /* Variaveis do sistema ****************************/
        int count;
        int opcaoUsuario = 1;
        boolean empate;
        boolean userVitoria;        
        boolean cpuVitoria;
        
        boolean cpuPedra;
        boolean cpuPapel;
        boolean cpuTesoura;

        boolean userPedra;
        boolean userPapel;
        boolean userTesoura ;

        Random rand = new Random();
        count = 1 + rand.nextInt(3);

        opcaoUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,"       Jo-Ken-Pô! \n" + 
                                                                    "1 = PEDRA / 2 = Papel / 3 = Tesoura")) ;

        /*Verificando se deu empate**************************/
        empate = opcaoUsuario == count;
        
        /*Verificando qual opção do jogar foi verdadeira.****/
        cpuPedra = count == 1;
        cpuPapel = count == 2;
        cpuTesoura = count == 3;

        /*Verificando qual opção do NPC foi verdadeira.*******/
        userPedra = opcaoUsuario == 1;
        userPapel = opcaoUsuario == 2;
        userTesoura = opcaoUsuario == 3;

        /*Verifica as opções possiveis para determinar se Usuario fi vencedor.*/
        /*O mesmo teste é aplicado para vericar estado da vitoria do NPC.*/
        userVitoria = (userPedra && cpuTesoura) || (userTesoura && cpuPapel) || (userPapel && cpuPedra);
        cpuVitoria = (cpuPedra && userTesoura) || (cpuTesoura && userPapel) || (cpuPapel && userPedra);
       
        /*Imprime no prompt de cmmd o resumo de 1 turno do jo-ken-po*/
        System.out.println("User Victory!!! "+ userVitoria);
        System.out.println("Draw Game!. " + empate);
        System.out.println("NPC Victory!!! "+ cpuVitoria );

        JOptionPane.showMessageDialog(null, "Jogador         VS           NPC \n" +
                                            " Vitoria    :   Empate  : Vitoria \n" +
                                            "   " + userVitoria + "     -     " + empate +"    -    " + cpuVitoria
                                          , "**** Resultado Jokenpô! ****",  JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println();

        System.out.println(userPedra);
        System.out.println(userPapel);
        System.out.println(userTesoura);       

        System.out.println(cpuPedra);
        System.out.println(cpuPapel);
        System.out.println(cpuTesoura);
    }
}
