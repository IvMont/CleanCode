package dam1montalvodasiva_ivan_ej040320punto2distancia;

/**
 *
 * @author IvanM
 */
public class DAM1MontalvoDaSiva_Ivan_Ej040320Punto2DDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        /*Creacion de los objetos*/
        Coords PuntoP = new Coords();
        Coords PuntoQ = new Coords();
        Coords PuntoR = new Coords();
        Coords PuntoOrigen = new Coords();
        /*Creacion de coordenadas para los puntos x e y de los objetos*/
        PuntoP.x = 1.1;
        PuntoP.y = 2.2;
        PuntoQ.x = 4.7;
        PuntoQ.y = 7.4;
        PuntoR.x = 0.5;
        PuntoR.y = 3.5;
        PuntoOrigen.x = 0;
        PuntoOrigen.y = 0;
        System.out.printf("Coordenadas Punto P: (%gx, %gy)\n", PuntoP.x, PuntoP.y);
        System.out.printf("Coordenadas Punto Q: (%gx, %gy)\n", PuntoQ.x, PuntoQ.y);
        System.out.printf("Coordenadas Punto R: (%gx, %gy)\n", PuntoR.x, PuntoR.y);
        System.out.println("Distancia desde el punto P hasta el origen de coordenadas: " + PuntoP.distancia(PuntoOrigen));
        System.out.println("Distancia del punto Q a origen de coordenadas: " + PuntoQ.distancia(PuntoOrigen));
        System.out.println("Distancia del punto R a origen de coordenadas: " + PuntoR.distancia(PuntoOrigen));
        System.out.println("Distancia de punto P a punto Q; " + PuntoP.distancia(PuntoQ));
        System.out.println("Distancia del punto P al punto R: " + PuntoP.distancia(PuntoR));
        System.out.println("Distancia del punto Q al punto R: " + PuntoQ.distancia(PuntoR));
    }

}
