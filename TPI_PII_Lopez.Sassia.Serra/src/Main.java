import Controlador.Controlador;
import Modelos.Resultados;
import Vista.Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args){
        Vista vista = new Vista();
        Controlador controlador = new Controlador();
        controlador.Iniciar();
        Resultados resultado = new Resultados();
        int ganador = resultado.calcResultado();

        conectarBaseDeDatos();
    }

    public static void conectarBaseDeDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/TeamTech", "root", "41442268"
            );
            System.out.println("Conexión exitosa!");
            con.close(); // cerrar la conexión al terminar
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
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