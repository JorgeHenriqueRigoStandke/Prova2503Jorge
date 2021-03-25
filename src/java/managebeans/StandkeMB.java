package managebeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "standkeMB")
@RequestScoped
public class StandkeMB {

    public StandkeMB() {
    }
    private String nome;
    private String dataNascimento;

    public String getPaginaJorge() {
        return "jorge";
    }
    public String getPaginaInicial(){
        return "index";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
