/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulabanco;

/**
 *
 * @author luisg
 */
public class AulaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(0001);
        p1.setDono("dominic toretto");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(0002);
        p2.setDono("brian o'connor");
        p2.abrirConta("CP");
        
        p1.depositar(133);
        p2.depositar(300);
        p2.sacar(450);
        
        p2.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
