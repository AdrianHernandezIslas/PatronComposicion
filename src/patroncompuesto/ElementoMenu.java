/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncompuesto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adrian
 */
public class ElementoMenu extends Menu{
    protected String nombre;
    protected ArrayList<Menu> platillos;

    public ElementoMenu(String nombre) {
        this.nombre = nombre;
        platillos = new ArrayList<>();
    }
    
    @Override
    public void agregarElemento(Menu m) {
        platillos.add(m);
    }

    @Override
    public void removerElemento(Menu m) {
        platillos.remove(m);
    }
    
    @Override
    public double calcularTotal(){
        Iterator it = platillos.iterator();
        double total = 0;
        while (it.hasNext()) {
            Menu temp = ((Menu)it.next());
            total+= temp.calcularTotal();
        }
        return total;
    }

    @Override
    public void listarMenu() {
        Iterator it = platillos.iterator();
        System.out.println("Menu "+nombre+"\n"+"Costo: "+calcularTotal()+"\n");
        while (it.hasNext()) {
           Menu temp = ((Menu)it.next());
           temp.listarMenu();
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
    
}
