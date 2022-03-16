
package clases;

import java.util.Random;

/**
 *
 * @author williamzamora
 */
public class Pasword {
    int logitud;
    String contra;
    Random rdm;

    public Pasword() {
        this.logitud = 8;
        this.contra = generarPassword();
    }

    public Pasword(int logitud) {
        this.logitud = logitud;
    }
    private String generarPassword(){
        
        String aleatorio=String.valueOf(rdm.nextInt(logitud));        
        return aleatorio;
    }
    
    boolean esFuerte(String contra){
        return true;
    }
    
}
