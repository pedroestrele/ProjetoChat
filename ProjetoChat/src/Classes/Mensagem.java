package Classes;
import java.time.LocalDateTime;

public class Mensagem {
	    private Contato contato;
	    private LocalDateTime hora;
	    private String conteudo;

	    public Mensagem(Contato contato, String conteudo) {
	        this.contato = contato;
	        this.hora = LocalDateTime.now();
	        this.conteudo = conteudo;
	    }

	    public Contato getContato() {
	        return contato;
	    }

	    public void setContato(Contato contato) {
	        this.contato = contato;
	    }

	    public LocalDateTime getHora() {
	        return hora;
	    }

	    public String getConteudo() {
	        return conteudo;
	    }

	    public void setConteudo(String conteudo) {
	        this.conteudo = conteudo;
	    }
	}

