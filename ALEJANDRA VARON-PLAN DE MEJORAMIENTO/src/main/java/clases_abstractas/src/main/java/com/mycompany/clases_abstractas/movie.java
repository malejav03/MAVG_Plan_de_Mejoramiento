
package com.mycompany.clases_abstractas;


public class movie extends Media {

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private boolean premioOscar;
    
    public movie(String titulo,String genero, int duracion){
        super(titulo,genero,duracion);
    }
    
    @Override
    public int getDuracion(){
        return super.getDuracion();
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }
    
}
