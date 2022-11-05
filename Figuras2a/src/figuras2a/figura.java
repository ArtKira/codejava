/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2a;

/**
 *
 * @author Arturo
 */
public abstract class figura {//le decimos que es abstracta 
    private String color;
    
    public figura (String c){
        this.color=c;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double calcularArea(); 
}
