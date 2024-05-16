package Chat;

import Classes.*;
import java.util.Scanner;
import java.io.IOException;


public class Main{
	
	public static void clear() throws IOException, InterruptedException {
		if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
	}
	 public static void main(String[] args) throws IOException, InterruptedException {
		 
		 //Testando para ver se as classes estao funcionando
		 
	        // Criando um usuário
	        
	        // Criando um contato
//	        Outros contato1 = new Outros("Marcos",234526748);
//	        Outros contato2 = new Outros("Pedro", 956246253);
//	        
//	        // Criando um chats com um contatos
//	        Chat chat1 = new Chat(contato1);
//	        Chat chat2 = new Chat(contato2);
//
//	        // Enviando mensagens 
//	        Mensagem msg1 = new Mensagem(Eu.getEu(), "Olá, como você está?");
//	        Mensagem msg2 = new Mensagem(chat1.getContato(), "Estou bem, obrigado!");
//	        
//	        // Adicionando mensagens ao chat1
//	        chat1.adicionarMensagem(msg1);
//	        chat1.adicionarMensagem(msg2);
//	        
//	        // Enviando mensagens 
//	        Mensagem msg3 = new Mensagem(Eu.getEu(), "Você estudou para a prova de amanhã?");
//	        Mensagem msg4 = new Mensagem(chat2.getContato(), "Não estudei, to lascado");
//	        
//	        // Adicionando mensagens ao chat1
//	        chat2.adicionarMensagem(msg3);
//	        chat2.adicionarMensagem(msg4);
//	        
	        
//	        // Exibindo as mensagens do chat1
//	        chat1.showMensagens();
//	        // Exibindo as mensagens do chat2
//	        chat2.showMensagens();
		 
		 Scanner scanner = new Scanner(System.in);

         System.out.println("MENU DE OPÇÕES: (1)Salvar novo contato (2) Abrir conversa ");
         int opcao = scanner.nextInt();
             scanner.nextLine();

         switch(opcao) {
         case 1:
             System.out.println("Nome: ");
             String nome = scanner.nextLine();
             //clear();
             
             System.out.println("Numero: ");
             int numero = scanner.nextInt();
             //clear();
             Outros Contato1 = new Outros(nome,numero);
             
             
           break;
           
         case 2: 
        	 System.out.println("Digite o numero do contato que quer conversar : ");
             numero = scanner.nextInt();
             //clear();
             Chat chatnow = Chat.selecionarChat(Contato.acharContato(numero));
             if(chatnow == null){                                                //verifica se o contato existe para poder iniciar a conversa
            	 System.out.println("Esse contato nao existe: ");
            	 //clear();
            	 break;
             }
             chatnow.showMensagens();
             scanner.nextLine();
             while(true) { // pensar em uma forma de receber uma mensagem !!!!!!!!!!!!!
            	 
            	 System.out.println("Digite a mensagem ou close para retornar ao menu: ");
            	 String mensagem = scanner.nextLine();
            	 int x = scanner.nextInt();
            	 //clear();
            	 Mensagem newmensagem;
            	 if(!mensagem.equals("close")) {
            	 if(x==1) {
            	 newmensagem = new Mensagem(chatnow.getContato(), mensagem);
            	 }else {
            	 newmensagem = new Mensagem(Eu.getEu(), mensagem);	 
            	 }
            	 chatnow.adicionarMensagem(newmensagem);
            	 System.out.println(newmensagem.mensagemModelo());
            	 //clear();
            	 }else {
            		break;
            	 }
            	 scanner.nextLine();
            	 
             }

           break;
        	 

         }
         
         main(args);

       scanner.close();
	 }
}


 