package materiais.proxy;

public class Proxy implements ServiceInterface {

    private ServiceInterface realService;

    public Proxy(ServiceInterface service) {
        this.realService = service;
    }

    public void proxy(ServiceInterface service) {
        this.realService = service;
    }

    @Override
    public void operation() {
        this.realService.operation();
    }
}
