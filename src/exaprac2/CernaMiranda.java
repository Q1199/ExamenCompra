/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 * Oscar Roberto Cerna Beza
 * Nohemy Betzabe Miranda Molina
 */
public class CernaMiranda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int prueba;         
               String productos[]=new String[2]; 
               int cantidad[]=new int[2];
               double precio[]=new double[2];
        int op=0;
       
        while (op!=3) {
              op= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n\n 1)Agregar Compra \n 2)Calcular Total \n 3)Salir "));
        switch (op) {
            case 1:

                for (int i = 0; i <=1; i++) {
                    
                    productos[i]=JOptionPane.showInputDialog("Ingrese el nombre del producto "+(i+1)+": ");
                    cantidad[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de producto: "));
                    precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario:"));
                    
                    
                }
                
               
                
                break;
             
            case 2:
                 double incre[]=new double[2];
                double iva=0.13;
                double stotal[]=new double[2];
                double total=0,sst;
                
                for(int j=0; j<=1; j++){
                    
                    stotal[j]=cantidad[j]*precio[j];
                    incre[j]=stotal[j]*iva;
                    sst=stotal[j]+incre[j];
                    total=total+sst;
                    
                    
                }
                
             for (int i = 0; i <=1; i++) {
                    
                    JOptionPane.showMessageDialog(null, "Nombre del Producto: \n "+productos[i]+ "\n========================\nCantidad del producto: \n "+cantidad[i]+"\n========================\nPrecio unitario: \n "+precio[i] );
                    
                }
             
                JOptionPane.showMessageDialog(null, "precio total de la compra: \n "+total);
                
                
                break;
            case 3:
                
                break;
           }   
        }    
    }
    
}
