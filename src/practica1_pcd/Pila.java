/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_pcd;

/**
 *
 * @author usuario
 */
public class Pila implements IPila {

    private int cima;
    private int capacidad;
    private int numelementos;
    private Object[] datos;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new Object[this.capacidad];
        this.cima = 0;
        this.numelementos = 0;
    }

    @Override
    public int GetNum() {
        return numelementos;
    }

    /**
     *
     * @param elemento
     * @throws Exception
     */
    @Override
    public void Apila(Object elemento) throws java.lang.Exception {
        if (!this.pilallena()) {
            this.datos[this.cima] = elemento;
            this.cima++;
            this.numelementos++;
        } else {
            throw new java.lang.Exception("Pila llena");
        }

    }

    /**
     *
     * @return @throws java.lang.Exception
     */
    @Override
    public Object Desapila() throws java.lang.Exception {

        if (!this.pilavacia()) {
            this.numelementos--;
            this.cima--;
            return this.datos[this.cima];
        } else {
            throw new java.lang.Exception("La pila esta vacia");
        }

    }

    @Override
    public Object Primero() throws java.lang.Exception {
        if (!this.pilavacia()) {
            return this.datos[0];
        } else {
            throw new java.lang.Exception("La pila esta vacia");
        }
    }

    private boolean pilavacia() {
        return this.numelementos == 0;
    }

    private boolean pilallena() {
        return this.numelementos == this.capacidad;
    }

}
