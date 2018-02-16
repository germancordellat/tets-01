/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author aaparicio
 */
public class MainDudas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, apellidos;
        boolean error;
        error=false;
        int opcion=-1;
        Object[] menu = {"Inbtroducir datos","Baja Vehiculo","Listados","Alquilar","Devolver Coche","Salir"};
        /*
        do {
            opcion = JOptionPane.showOptionDialog(null, "Menu", "Flota v1.0", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (opcion) {
                case 0:
                    do {
                        nombre = JOptionPane.showInputDialog("Introduce Nombre");
                        if (nombre==null) {
                            error=true;
                            break;
                        }
                    } while (nombre.equals(""));
                    if (error) break;
                    apellidos = JOptionPane.showInputDialog("Introduce Apellidos");
                    
                    break;
                    
            }
        } while (opcion!=5);
          */
        /*int[] numeros = new int[10];
        for (int i = 0; i <= numeros.length-1; i++) {
            numeros[i]=(int)(Math.random()*100);
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i <= numeros.length-2; i++) {
            for (int j = i+1; j < 10; j++) {
                if (numeros[j]>numeros[i]) {
                    int aux=numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i]=aux;
                }
                
            }
            
        }
        for (int i = 0; i <= numeros.length-1; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
        */
        /*
        char[][] cine = new char[8][20];
        int fila, columna;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce Fila:");
            fila=teclado.nextInt();
            if (fila<0 || fila >7) continue;
            System.out.println("Introduce Columna:");
            columna=teclado.nextInt();
            if (columna <0 || columna >19) continue;
            if (cine[fila][columna] == '*') {
                System.out.println("Error Asiento Ocupada!");
                continue;
            } else {
                cine[fila][columna]='*';
                System.out.println("Asiento Reservado!");
            }
            for (int i = 0; i <= cine.length-1; i++) {
                System.out.print("F"+i+" ");
                for (int j = 0; j <= cine[i].length-1; j++) {
                    if (cine[i][j] != '*') {
                        System.out.print(" ");
                        continue;
                    } 
                    System.out.print(cine[i][j]);
                }
                System.out.println(" F"+i);
            }
            System.out.println("  01234567890123456789");
        } while (true);
        */
        /*
        ArrayList numeros = new ArrayList();
        numeros.add("tres");
        numeros.add("ocho");
        numeros.add("diez");
        numeros.add("treinta");
        
        String numero = JOptionPane.showInputDialog("Introduce cadena:");
        int pos=-1;
        for (int i = 0; i <= numeros.size()-1; i++) {
            if (numeros.get(i).equals(numero)) {
                pos=i;
                break;
            }
        }
        if (pos==-1) {
            JOptionPane.showMessageDialog(null,"Error no se encuentra el objeto");
        } else {
            numeros.remove(pos);
            JOptionPane.showMessageDialog(null, "Elemento Eliminado!");
        }
        */
        HashMap<Integer,String> elementos = new HashMap<Integer,String>();
        elementos.put(1, "uno");
        elementos.put(2, "dos");
        elementos.put(3, "uno");
        elementos.put(1,"tres");
        System.out.println(elementos.get(1));
        System.out.println(elementos.get(2));
        System.out.println(elementos.get(3));
        Iterator it = elementos.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(elementos.get(it.next()));
        }
        System.out.println(elementos.remove(8));
        
        
        
        
        
        
        
        
        
        
                
    }
    
}
