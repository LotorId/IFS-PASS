package materiais.proxy;

public class Cliente {
    public static void main(String[] args) {

        ServiceInterface youtubeService = new Service();
        ServiceInterface youtubeProxy = new Proxy(youtubeService);

        youtubeProxy.operation();
    }
}
