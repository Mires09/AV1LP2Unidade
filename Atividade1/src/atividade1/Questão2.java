/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Thamires
 */
public class Questão2 {
    
    public static void main(String[] args) {
        
        int quantpessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas a ser cadastradas: "));
        String[][] matriz = new String[quantpessoa][2];
        
        int j=0;
        for (int i = 0; i < quantpessoa; i++) {
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome: ");
            j++;
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º telefone: ");
            j = 0;
        }
        
        String nome = JOptionPane.showInputDialog("Informe um nome para consulta:");
        boolean encontrado = false;
        for (int i = 0; i< quantpessoa; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + matriz[i][0] + "\nTelefone: " + matriz[i][1]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado");
        }
    }
}