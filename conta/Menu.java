package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	 
    public static void main(String[] args) {
    	
    	 Scanner leia = new Scanner(System.in);
    	int opcao;		
    	
    			
    	//Teste da Classe Conta Corrente
    			ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
    			cc1.visualizar();
    			cc1.sacar(12000.0f);
    			cc1.visualizar();
    			cc1.depositar(5000.0f);
    			cc1.visualizar();
    			
    	//Teste da Classe Conta Poupança
    			ContaPoupanca cp1 = new ContaPoupanca(3, 123, 1, "Victor", 100000.0f, 15);
    			cp1.visualizar();
    			cp1.sacar(1000.0f);
    			cp1.visualizar();
    			cp1.depositar(5000.0f);
    			cp1.visualizar();
	
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("                                                     ");
			System.out.println("                  BANCO DO GABRIEL                   ");
			System.out.println("                                                     ");
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
				
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if (opcao == 9) {
				System.out.println(Cores.TEXT_BLUE_BRIGHT + "\nBanco do Gabriel - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
					KeyPress();
                    		break;
				case 2:
					System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
					KeyPress();
                    		break;
				case 3:
					System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");
					KeyPress();
                    		break;
				case 4:
					System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");
					KeyPress();
                    		break;
				case 5:
					System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");
					KeyPress();
                   	 	break;
				case 6:
					System.out.println(Cores.TEXT_WHITE + "Saque\n\n");
					KeyPress();
                   	 	break;
				case 7:
					System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");
					KeyPress();
                    		break;
				case 8:
					System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
					KeyPress();
                    		break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					KeyPress();
                    		break;
			}
		}	
    }

    public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: ");
	System.out.println("Generation Brasil - generation@generation.org");
	System.out.println("github.com/conteudoGeneration");
	System.out.println("*********************************************************");
   }

    public static void KeyPress() {
	
	try {
		System.out.println(Cores.TEXT_RESET +"\n\n Pressione Enter para Continuar...");
		System.in.read();
		}catch(IOException e) {
			System.out.println("você pressionou uma tecla diferente de enter!");
		}
    }
}