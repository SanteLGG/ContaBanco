/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulabanco;

/**
 * @author luisg
 */
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //métodos personalizados
    public void estadoAtual(){
        
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("---------------------------------------");
  
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") { 
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
     if (this.getSaldo() > 0){
         System.out.println("Não é possível fechar a conta.");
         System.out.println("Retire todo o dinheiro antes de fechar a conta");
     } else if (this.getSaldo() < 0) {
         System.out.println("Não é possível fechar a conta");
     } else {
         this.setStatus(false);
         System.out.println("Conta fechada com sucesso!");
     }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Não foi possível depositar!");
            System.out.println("Cheque os dados novamente.");
        }
        
    }
    
    public void sacar(float v){
    if (this.getStatus()){
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque");
        }  
    } else {
        System.out.println("Impossível realizar saque!");
        System.out.println("Cheque os dados novamente.");
    }
        
    }
    
    public void pagarMens(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){ 
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensaidade paga com sucesso!");
            } else {
            System.out.println("ERRO! conta fechada.");
            System.out.println("Cheque os dados novamente!");
            }
        }
    
    //métodos construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
   
    public void setNumConta(int n){
            this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    public String getDono(){
        return this.dono;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }  
    public boolean getStatus(){
        return status;
    }

    
}
