package escola;

public class Escola {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Douglas");
        a1.setIdade(19);
        a1.setMatricula(4525623);
        a1.setCurso("Ciência da Computação");
        a1.fazerAniversario();
        System.out.println(a1.toString());
        System.out.println(a1.detalhes());
        System.out.println("");
        
        Professor p1 = new Professor();
        p1.setNome("Marcos");
        p1.setIdade(42);
        p1.setEspecialidade("Matemática computacional");
        p1.setSalario(8423.53f);
        System.out.println(p1.toString());
        System.out.println(p1.detalhes());
        System.out.println("");
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Ricardo");
        f1.setIdade(55);
        f1.setTrabalhando(true);
        f1.setFuncao("Diretor");
        f1.fazerAniversario();
        System.out.println(f1.toString());
        System.out.println(f1.detalhes());
        System.out.println("");
    }
    
}
