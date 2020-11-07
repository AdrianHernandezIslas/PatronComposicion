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
public class Platillo extends Menu{

    private String nombre,descripcion;
    private double precio;
    private boolean vegetariano;

    public Platillo(String nombre, String descripcion, double precio, boolean vegetariano) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.vegetariano = vegetariano;
    }
    
           
    @Override
    public void agregarElemento(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerElemento(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarMenu() {
        System.out.println("Nombre: "+nombre+"\n"+"Descripcion: "+descripcion+"\n"+
                           "Precio: "+precio+"\n"+"Vegetariano: "+(vegetariano?"Si":"No"));
    }
    
    public double getPrecio(){
        return precio;
    }

    @Override
    public double calcularTotal() {
        return precio; //To change body of generated methods, choose Tools | Templates.
    }
    
}
