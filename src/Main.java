//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Car gol = new Car("volkswagen", 1998, "gol", "black");

    gol.ligar();
    gol.acelerar("forte");
        gol.acelerar("fraco");
        gol.acelerar();
        gol.desligar();

        System.out.println(gol.ligado);
        System.out.println(gol.aceleracao);


    }
}