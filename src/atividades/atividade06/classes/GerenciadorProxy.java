package atividades.atividade06.classes;

public class GerenciadorProxy extends GerenciadorUsuario {

    private String usuario;
    private int senha;
    public GerenciadorProxy(String usuario, int senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    private boolean temPermissaoDeAcesso() {
        return this.usuario == "admin" && this.senha == 123;
    }

    @Override
    public void criarArquivo(String titulo, String conteudo) {
        if (!temPermissaoDeAcesso()) {
            System.out.println("Sem permissao");
            return;
        };

        super.criarArquivo(titulo, conteudo);
    }

    @Override
    public void lerArquivo(String titulo) {
        if (!temPermissaoDeAcesso()) {
            System.out.println("Sem permissao");
            return;
        };

        super.lerArquivo(titulo);
    }

    @Override
    public void atualizarArquivo(String titulo, String conteudo) {
        if (!temPermissaoDeAcesso()) {
            System.out.println("Sem permissao");
            return;
        };

        super.atualizarArquivo(titulo, conteudo);
    }

    @Override
    public void excluirArquivo(String titulo, String conteudo) {
        if (!temPermissaoDeAcesso()) {
            System.out.println("Sem permissao");
            return;
        };

        super.excluirArquivo(titulo, conteudo);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
