/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1montalvodasiva_ivan_ej040320punto2distancia;

/**
 *
 * @author user
 */
public class Coords {

    double x;
    double y;

    /*Metodo para calcular distancia de coordenadas entre dos puntos*/
    public double distancia(Coords Parametro) {
        return Math.sqrt(Math.pow((Parametro.x - x),2) + Math.pow((Parametro.y - y) , 2));
    }
}
