package materiais.abstractFactory;

// Interfaces dos produtos abstratos
interface Bicicleta {
    String getNome();
}

interface Motocicleta {
    String getNome();
}

interface Carro {
    String getNome();
}

// Classes dos produtos concretos

    // FAMILIA NORMAL
class BicicletaNormal implements Bicicleta {
    @Override
    public String getNome() {
        return "Bicicleta normal";
    }
}
class MotocicletaNormal implements Motocicleta {

    @Override
    public String getNome() {
        return "Motocicleta normal";
    }
}
class CarroNormal implements Carro {

    @Override
    public String getNome() {
        return "Carro normal";
    }
}

    // FAMILIA SPORT
class BicicletaSport implements Bicicleta {

    @Override
    public String getNome() {
        return "Bicicleta sport";
    }
}
class MotocicletaSport implements Motocicleta {

    @Override
    public String getNome() {
        return "Motocicleta sport";
    }
}
class CarroSport implements Carro {

    @Override
    public String getNome() {
        return "Carro sport";
    }
}

//  Interface da fabrica abstrata

interface FabricaVeiculo {
    Bicicleta getBicicleta(String bicicleta);
    Motocicleta getMotocicleta(String motocicleta);
    Carro getCarro(String carro);
}

//  Classes concretas das fabricas abstratas
class FabricaHonda implements FabricaVeiculo {

    @Override
    public Bicicleta getBicicleta(String bicicleta) {
        switch (bicicleta) {
            case "sport" -> {
                return new BicicletaSport();
            } case "normal" -> {
                return new BicicletaNormal();
            } default -> throw new RuntimeException("Veiculo: " + bicicleta + " nao pode ser criado!");
        }
    }

    @Override
    public Motocicleta getMotocicleta(String motocicleta) {
        switch (motocicleta) {
            case "sport" -> {
                return new MotocicletaSport();
            } case "normal" -> {
                return new MotocicletaNormal();
            } default -> throw new RuntimeException("Veiculo: " + motocicleta + " nao pode ser criado!");
        }
    }

    @Override
    public Carro getCarro(String carro) {
        switch (carro) {
            case "sport" -> {
                return new CarroSport();
            } case "normal" -> {
                return new CarroNormal();
            } default -> throw new RuntimeException("Veiculo: " + carro + " nao pode ser criado!");
        }
    }
}

//  Classe do veiculo do cliente

class VeiculoCliente {
    Bicicleta bicicleta;
    Motocicleta motocicleta;
    Carro carro;

    public VeiculoCliente(FabricaVeiculo fabricaVeiculo, String tipo) {
        this.bicicleta = fabricaVeiculo.getBicicleta(tipo);
        this.carro = fabricaVeiculo.getCarro(tipo);
        this.motocicleta = fabricaVeiculo.getMotocicleta(tipo);
    }

    public String getNomeBicicleta() {
        return this.bicicleta.getNome();
    }

    public String getNomeMotocicleta() {
        return this.motocicleta.getNome();
    }

    public String getNomeCarro() {
        return this.carro.getNome();
    }
}
public class Main {
    public static void main(String[] args) {

        FabricaVeiculo fabricaHonda = new FabricaHonda();
        VeiculoCliente veiculoCliente = new VeiculoCliente(fabricaHonda, "sport");

        System.out.println(veiculoCliente.getNomeBicicleta());
        System.out.println(veiculoCliente.getNomeMotocicleta());
        System.out.println(veiculoCliente.getNomeCarro());

    }
}
