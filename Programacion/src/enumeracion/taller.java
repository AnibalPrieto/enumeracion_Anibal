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
public enum taller {
    CajaCambios(12,"toyota"),
    Motor(2,"Grupo VAG"),
    Embrague(35,"Disco"),
    Ruedas(120,"Michellin"),
    Amortiguadores(23,"Bremmo");
    
    private int num;
    private String marca;
    private taller(int num,String marca){
        this.num = num;
        this.marca = marca;
        
    }

    public int getNum() {
        return num;
    }

    public String getMarca() {
        return marca;
    }
    
    
}
