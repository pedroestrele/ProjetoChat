package Classes;
import java.util.ArrayList;
import java.util.List;

public class Chat {
	private Contato contato;
    private List<Mensagem> mensagens;
    private static List<Chat> chats = new ArrayList<>();

    public Chat(Contato contato) {
        this.contato = contato;
        this.mensagens = new ArrayList<>();
        chats.add(this);
        
    }

    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }
    
    //metodo para encontrar um chat dado um contato
    public static Chat selecionarChat(Contato contato) {
        for (Chat chat : chats) {
            if (chat.getContato() == contato) {
                return chat;
            }
        }
        return null;
    }
    
    // metodo para mostrar as mensagens de um chat
    public void showMensagens() {
    	System.out.println(this.getContato().getNome()+"");
        	for (Mensagem mensagem : this.getMensagens()) {
        		System.out.println(mensagem.mensagemModelo());
        }
    }
    
    
}
