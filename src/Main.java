import Controlador.Controlador;
import Modelos.Resultados;
import Vista.Vista;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Vista vista = new Vista();
        Controlador controlador = new Controlador();
        controlador.Iniciar();
        Resultados resultado = new Resultados();
        int ganador = resultado.calcResultado();


    }
    public void registrarResultados(){

        Scanner res = new Scanner(System.in);


        System.out.print("Ingresa el número de partido: ");
        int nroPartido = res.nextInt();
        while(nroPartido!=0) {
            System.out.print("Ingresa los Sets del equipo A: ");
            int setsEquipoA = res.nextInt();
            System.out.print("Ingresa los Sets del equipo B: ");
            int setsEquipoB = res.nextInt();


        }

    }
}