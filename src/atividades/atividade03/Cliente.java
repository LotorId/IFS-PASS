package atividades.atividade03;

public class Cliente {
    public static void main(String[] args) {

        System.out.println("Se voce ver o mesmo valor, entao o Singleton foi reusado!");

        Log singleton = Log.getInstance("FOO");
        Log anotherSingleton = Log.getInstance("BAR");

        System.out.println(Log.getInstance("FOO"));
        System.out.println(Log.getInstance("BAR"));

        System.out.println(singleton.operacao);
        System.out.println(anotherSingleton.operacao);

    }
}
