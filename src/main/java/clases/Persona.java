package clases;

import java.util.Random;

/**
 *
 * @author williamzamora
 */
public class Persona {
    //encapsular scope(alcance)
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    private int dui;
    Random aleatorio = new Random();

    //constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'h';
        this.peso = 0;
        this.altura = 0;
        this.dui = generaDUI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.dui = generaDUI();
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dui = generaDUI();
    }

    public int calcularIMC(float peso, float altura) {
        float IMC;
        IMC = peso / (altura * altura);
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(int edad){
        if (edad>=18){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean comprobarSexo(char sexo){
        if(sexo=='h' || sexo=='m'){
            return true;
        }else{
            return false;
        }
    }

    public int getDui() {
        return dui;
    }
    
    private int generaDUI(){
        int duiGen=aleatorio.nextInt(90000)+100000;
//        duiGen=aleatorio.
        return duiGen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", dui=" + dui + ", aleatorio=" + aleatorio + '}';
    }

    
    
}
