
public class Carro {
    String modelo;
    String marca;
    int ano;
    int vel;

    void acelerar(int acelerador){
        this.vel += acelerador;
    }

    void freiar(int reduzir){
        this.vel -= reduzir;
    }

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.vel);
    }
}
