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
    
    
    public static Chat selecionarChat(Contato contato) {
        for (Chat chat : chats) {
            if (chat.getContato().getNumero() == contato.getNumero()) {
                return chat;
            }
        }
        return null;
    }
}
