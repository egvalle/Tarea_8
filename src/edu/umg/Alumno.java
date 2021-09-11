package edu.umg;

public class Alumno implements Comparador {
    private String carne;
    private String nombre;
    private int edad;

    public Alumno(){
    }

    public Alumno(String carne, String nombre, int edad) {
        this.carne = carne;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean igualQue(Object par1) {
        Alumno a = (Alumno) par1;
        return this.edad == a.edad;
    }

    @Override
    public boolean menorQue(Object par1) {
        Alumno a = (Alumno) par1;
        return this.edad == a.edad;
    }

    @Override
    public boolean menorIgualQue(Object par1) {
        Alumno a = (Alumno) par1;
        return this.edad == a.edad;
    }

    @Override
    public boolean mayorQue(Object par1) {
        Alumno a = (Alumno) par1;
        return this.edad == a.edad;
    }

    @Override
    public boolean mayorIgualQue(Object par1) {
        Alumno a = (Alumno) par1;
        return this.edad == a.edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carne='" + carne + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
