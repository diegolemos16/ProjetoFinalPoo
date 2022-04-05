public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private long idFuncional;

    public abstract void receberSalario();
    public abstract void trabalhar();
    public abstract void registrarPonto();

}
