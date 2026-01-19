package br.com.alura.PraticandoJAVA.POO.metodos;

public class Colaboradores {
    private String nome;
    private String cargo;
    private int nivelDeAcesso;

    public Colaboradores(String nome, String cargo, int nivelDeAcesso){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o nome do colaborador.");
        }
        if(cargo == null || cargo.isBlank()){
            throw new IllegalArgumentException("Digite o cargo do colaborador.");
        }
        if(nivelDeAcesso <= 0){
            throw new IllegalArgumentException("O nivel de acesso não pode ser 0.");
        }

        this.nome = nome;
        this.cargo = cargo;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Cargo: %s
                Nível de acesso: %d""".formatted(nome, cargo, nivelDeAcesso);
    }

    public void promoverColaborador(String novoCargo, int novoNivelDeAcesso){
        setCargo(novoCargo);
        setNivelDeAcesso(novoNivelDeAcesso);
    }

    public void setCargo(String cargo) {
        if(cargo == null || cargo.isBlank()){
            throw new IllegalArgumentException("Digite o novo cargo do colaborador.");
        }
        this.cargo = cargo;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        if(nivelDeAcesso <= this.nivelDeAcesso){
            throw new IllegalArgumentException("Insira um nível acima do valor antigo.");
        }
        this.nivelDeAcesso = nivelDeAcesso;
    }
}
