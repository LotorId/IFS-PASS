package nivelamento.exceptions;

public class LivroJaEmprestado extends Exception {
    public LivroJaEmprestado() {
        super("Livro já emprestado a este usuario!");
    }
}
