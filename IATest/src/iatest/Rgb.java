/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iatest;

/**
 *
 * @author cryst
 */
public class Rgb {
    private int r,g,b,classe;
private double distancia;    
    public Rgb(){
        
    }
    
     public Rgb(int r,int g,int b,int classe){
        this.r = r;
        this.g = g;
        this.b = b;
        this.classe = classe;
    }
     
       public Rgb(int r,int g,int b){
        this.r = r;
        this.g = g;
        this.b = b;
        
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
