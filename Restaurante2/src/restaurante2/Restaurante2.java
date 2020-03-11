package restaurante2;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author gparramieses
 */
public class Restaurante2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada=new Scanner(System.in);


    System.out.println("Elige un plato:\n1:sopa de pescado \n2:paella familiar con bebida incluida \n3:camarones al ajillo \n4:pulpo a feira \n5:pasta en salsa de boloñesa \n6:salmon asado con salsa de trufa");
   System.out.println("Elige una bebida:\n1:vino blanco \n2:vino tinto \n3:vino teso la monja \n4:vino petrus");

   int menu=entrada.nextInt();
    
   int bebida=entrada.nextInt();
   switch(bebida){
       case 1:
           int precio=Integer.parseInt(JOptionPane.showInputDialog("intrudusca la bebida"));
           System.out.println("El precio de la bebida es "+Math.pow(3, menu));
           break;
       case 2:
                int precio2=Integer.parseInt(JOptionPane.showInputDialog("intrudusca la bebida"));   
              System.out.println("El precio de la bebida es "+Math.pow(2, menu));
              break;
  
   
    case 3:
           int precio3=Integer.parseInt(JOptionPane.showInputDialog("intrudusca la bebida"));  
           System.out.println("El precio de la bebida es "+Math.pow(2, menu));
           break;
   
   
   
     case 4:
           int precio4=Integer.parseInt(JOptionPane.showInputDialog("intrudusca la bebida"));
           System.out.println("El precio de la bebida es "+Math.pow(3, menu));
           break;
   
         
   }
     switch(menu){
        
         case 1:
          int precio=Integer.parseInt(JOptionPane.showInputDialog("intrudusca el plato"));
          
          System.out.println("El precio del plato es "+ Math.pow(30, menu));
          break;
      
     
         case 2: 
          int precio2=Integer.parseInt(JOptionPane.showInputDialog("intrudusca el plato")); 
          
          System.out.println("El precio del plato es"+ Math.pow(7, menu));
   break;
          
          
         case 3:
          
             int precio3=Integer.parseInt(JOptionPane.showInputDialog("intrudusca el plato"));   
          
          System.out.println("El precio del plato "+ Math.pow(3, menu));
          break;
          
         
         case 4:
            int precio4=Integer.parseInt(JOptionPane.showInputDialog("intrudusca el plato"));  
            
          System.out.println("El precio del plato es "+ Math.pow(2, menu));
         break;
         case 5:
        
          
             int precio5=Integer.parseInt(JOptionPane.showInputDialog("intrudusca el plato"));
             
            System.out.println("El precio del plato es "+ Math.pow(2, menu));
         break;
            
         case 6:
          
            int precio6=Integer.parseInt(JOptionPane.showInputDialog("intrudusca la plato")); 
            
             System.out.println("El precio de platos "+ Math.pow(2, menu));
          break;
     }
    }

    private static Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

