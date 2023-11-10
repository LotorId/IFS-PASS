package materiais.proxy;

public class Service implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("This operation was made!");
    }
}
