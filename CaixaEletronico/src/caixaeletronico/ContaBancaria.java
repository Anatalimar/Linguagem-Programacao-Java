
package caixaeletronico;

public class ContaBancaria {

    //Atributos
    private int agencia;
    private int conta;
    private String cliente;
    private float saldo;
    
    //Metodos Getters e Setters
    int getAgencia(){
        return this.agencia;
    }
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    int getConta() {
        return this.conta;
    }
    void setConta(int conta) {
        this.conta = conta;
    }
    String getCliente() {
        return this.cliente;
    }
    void setCliente(String cliente) {
        this.cliente = cliente;
    }
    float getSaldo() {
        return this.saldo;
    }
    void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //Metodos adicionais
    void sacar(float valor){
        this.saldo -= valor;
    }
    void depositar(float valor){
        this.saldo += valor;
    }
    void transferencia(float valor){
        this.saldo -=valor;
    }
}
