/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author aniba
 */
public enum continentes {
    Asia(53,56),
    África(46,11),
    Europa(44,89),
    América(34,23),
    Oceanía(14,40);
    
    //propiedad numero de paises de cada continente
    private int cont;
    private int superficie;
    private continentes(int cont,int superficie){
        this.cont = cont;
        this.superficie = superficie;
        
    }

    public int getCont() {
        return cont;
    }

    public int getSuperficie() {
        return superficie;
    }
    
    
    
}
