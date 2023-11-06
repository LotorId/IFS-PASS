package atividades.atividade03;
public final class Log {

    private static Log instance;
    public String operacao;
    private Log(String operacao) {
        this.operacao = operacao;
    }

    public static Log getInstance(String operacao) {
        if (instance == null) {
            instance = new Log(operacao);
        }
        return instance;
    }
}