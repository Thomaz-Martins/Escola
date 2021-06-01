package escola;

public class Funcionario extends Pessoa {
    public String funcao;
    public boolean trabalhando;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void mudarTrabalho(){
        if(this.isTrabalhando()){
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }
    }

    public String detalhes() {
        return "Funcionario{" + "funcao=" + funcao + ", trabalhando=" + trabalhando + '}';
    }
}
