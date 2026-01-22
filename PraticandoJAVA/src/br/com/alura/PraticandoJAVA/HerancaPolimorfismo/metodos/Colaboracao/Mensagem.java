package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Colaboracao;

public class Mensagem {
    public void enviarMensagem(String mensagem) {
        mensagemNula(mensagem);
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        mensagemNula(mensagem);
        destinatarioNulo(destinatario);
        System.out.println("Mensagem para %s: %s".formatted(destinatario, mensagem));
    }

    public void enviarMensagem(String destinatario, String mensagem, int quantidadeDeMensagens) {
        mensagemNula(mensagem);
        destinatarioNulo(destinatario);
        if(quantidadeDeMensagens <= 0){
            throw new IllegalArgumentException("Não foi possível enviar essa mensagem.");
        }

        for (int i = 0; i < quantidadeDeMensagens; i++) {
            enviarMensagem(destinatario, mensagem);
        }
    }

    private void mensagemNula(String mensagem) {
        if (mensagem == null || mensagem.isBlank()) {
            throw new IllegalArgumentException("Digite a mensagem que deseja enviar.");
        }
    }

    private void destinatarioNulo(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("Selecione o destinatário ou escolha a opção enviar para todos.");
        }
    }
}

