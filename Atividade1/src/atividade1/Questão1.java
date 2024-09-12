/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import javax.swing.JOptionPane;

/**
 *
 * @author Thamires
 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
        // Informa a quantidade de nomes cadastrados (tamanho da Matriz)
        
        int quantnome = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de nomes que serão cadastrados"));
        String[] matriz = new String[quantnome];
        
        // Loop para cadastrar os nomes
        
        for (int i = 0; i < quantnome; i++) {
            boolean nomeRepetido;
            String nome;
            do {
                nomeRepetido = false;
                nome = JOptionPane.showInputDialog("Digite o " + (1 + i) + "° nome ");
                
                // Se o usuário não adicionar um nome
                
                if(nome == null){
                    break;
                }
                
                // Verifica se o nome já foi cadastrado
                
                for (int j = 0; j < i; j++) {
                    if (nome.equalsIgnoreCase(matriz[j])) {
                        nomeRepetido = true;
                        JOptionPane.showMessageDialog(null, "Nome já cadastrado, insira outro nome");
                        break;
                    }
                }
            } while (nomeRepetido);

            if (nome == null) {
                break;
            }
            matriz[i] = nome;
        }
        
        // Loop para encontrar o nome cadastrado anteriormente
        
        int num;
        for(;;) {
            String entrada = JOptionPane.showInputDialog("Digite número da posição a ser procurada:");
            
            // Se o usuário não digitar nada o programa encerra
            
            if(entrada == null){
                break;
            }
            else{
               num = Integer.parseInt(entrada);
            }
             if (num > 0 && num <= quantnome) {
                    JOptionPane.showMessageDialog(null, "O nome encontrado na posição " + num + " foi: " + matriz[num - 1]);
                    break;
                } 
             else {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
        }
    }
}
