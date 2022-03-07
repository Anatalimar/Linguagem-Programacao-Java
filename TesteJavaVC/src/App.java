public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        c1.modelo = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2019;
        c1.vel = 0;

        c1.acelerar(30);

        c1.status();
    }
}
