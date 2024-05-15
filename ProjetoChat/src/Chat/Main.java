package Chat;
import Classes.*;

public class Main {
	 public static void main(String[] args) {
		 
		 //Testando para ver se as classes estao funcionando
		 
	        // Criando um usuário
	        Eu eu = new Eu(123456789);
	        
	        // Criando um contato
	        Outros contato1 = new Outros("Marcos",234526748);
	        Outros contato2 = new Outros("Pedro", 956246253);
	        
	        // Criando um chats com um contatos
	        Chat chat1 = new Chat(contato1);
	        Chat chat2 = new Chat(contato2);

	        // Enviando mensagens 
	        Mensagem msg1 = new Mensagem(eu, "Olá, como você está?");
	        Mensagem msg2 = new Mensagem(chat1.getContato(), "Estou bem, obrigado!");
	        
	        // Adicionando mensagens ao chat1
	        chat1.adicionarMensagem(msg1);
	        chat1.adicionarMensagem(msg2);
	        
	        // Enviando mensagens 
	        Mensagem msg3 = new Mensagem(eu, "Você estudou para a prova de amanhã?");
	        Mensagem msg4 = new Mensagem(chat2.getContato(), "Não estudei, to lascado");
	        
	        // Adicionando mensagens ao chat1
	        chat1.adicionarMensagem(msg3);
	        chat1.adicionarMensagem(msg4);
	        
	        
	     // Exibindo as mensagens do chat1
	        for (Mensagem mensagem : chat1.getMensagens()) {
	            System.out.println(mensagem.getContato().getNome() + ": " + mensagem.getConteudo());
	        
	         // Exibindo as mensagens do chat2
		        for (Mensagem mensagem2 : chat2.getMensagens()) {
		            System.out.println(mensagem2.getContato().getNome() + ": " + mensagem2.getConteudo());
		        }
	        }
	    }
}
 .