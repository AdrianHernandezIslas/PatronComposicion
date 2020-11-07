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
public class PatronCompuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Menu menuDeMenu = new  ElementoMenu("Menus Disponibles");
       
       Menu postres = new ElementoMenu("Postres");
       postres.agregarElemento(new Platillo("Arroz con leche", "una tasa de arroz con leche",10.0, true));
       postres.agregarElemento(new Platillo("Flan","Flan napolitano",20.0, true));
       
       Menu desayuno = new ElementoMenu("Desayuno");
       desayuno.agregarElemento(new Platillo("Sopa Caldosa","Sopa de pasta de letras",20.5, true));
       desayuno.agregarElemento(new Platillo("Huevos con Jamon","tres huevos acompañados de frijol",30, false));
       desayuno.agregarElemento(postres);
       
       //System.out.println("___________________________________________________________________________________");
       Menu comida = new ElementoMenu("Comida");
       comida.agregarElemento(new Platillo("Salsa de Chicharron","Acompañado de tortillas",50.5, false));
       //comida.agregarElemento(new Platillo("Pozole de Puerco","acompañado de lechuga",40, false));
       comida.agregarElemento(new Platillo("Costilla en salsa morita","acompañada de ensalada",45.5, false));
       //comida.listarMenu();
       
       menuDeMenu.agregarElemento(comida);
       menuDeMenu.agregarElemento(desayuno);
       menuDeMenu.listarMenu();
      
    }
    
}
