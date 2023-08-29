package nivelamento.exceptions;

public class LivroNaoEmprestado extends Exception {
    public LivroNaoEmprestado() {
        super("Este usuario nao pegou este livro emprestado");
    }
}
