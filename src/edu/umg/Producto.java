package edu.umg;

public class Producto implements Comparador{
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean igualQue(Object par1) {
        Producto a = (Producto) par1;
        return this.precio == a.precio;
    }

    @Override
    public boolean menorQue(Object par1) {
        Producto a = (Producto) par1;
        return this.precio == a.precio;
    }

    @Override
    public boolean menorIgualQue(Object par1) {
        Producto a = (Producto) par1;
        return this.precio == a.precio;
    }

    @Override
    public boolean mayorQue(Object par1) {
        Producto a = (Producto) par1;
        return this.precio == a.precio;
    }

    @Override
    public boolean mayorIgualQue(Object par1) {
        Producto a = (Producto) par1;
        return this.precio == a.precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
