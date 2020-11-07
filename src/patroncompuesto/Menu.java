/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncompuesto;

/**
 *
 * @author adrian
 */
public abstract class Menu {
    
    public abstract void agregarElemento(Menu m);
    
    public abstract void removerElemento(Menu m);
    
    public abstract void listarMenu();
    
    public abstract double calcularTotal();
    
    
    
    
}
