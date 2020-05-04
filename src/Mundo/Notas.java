package Mundo;
import java.sql.*;
import javax.swing.*;

/**
 * @author Ing. Alejandro Erazo 
 */
public class Notas {
    
    // ----------------------------------
    // Atributos
    // ----------------------------------
    
    /**
    * Notas de los cortes
    */
    double Nota1;
    double Nota2;
    double Nota3;
    double Porcentaje1;
    double Porcentaje2;
    double Porcentaje3;
    int Nota_Aprobar;
    
    // ----------------------------------
    // Constructor
    // ----------------------------------
    
    public Notas ( ) {
        Nota1 = 0;
        Nota2 = 0;
        Nota3 = 0;
        Porcentaje1 = 0;
        Porcentaje2 = 0;
        Porcentaje3 = 0;
        Nota_Aprobar = 3;
    }
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    
    public double dividir (double porcentaje)
    {
        double P1 = porcentaje / 100;
        return P1;
    }
    
    public double NotaFinal (double n1, double n2, double n3, double p1, double p2, double p3){
        Nota1 = n1 * p1;
        Nota2 = n2 * p2;
        Nota3 = n3 * p3;
        double Resultado = Nota1+Nota2+Nota3;
        
        return Resultado;
    }
    
    public double AveriguarNota (double n1, double n2, double p1, double p2, double p3)
    {
        double Resultado = 0;
        int Numero100 = 100;
        
        double Suma = n1 * p1 + n2 * p2;
        double Operacion = Nota_Aprobar - Suma;
        double Res = Operacion / p3;
        
        int A = (int)(Res * 1);
	double B = (Res - A);
	double C = (B * Numero100);
	double D = Math.round(C);
	double E = (A + D / Numero100);
        
        if ( E > 5 ){
            Resultado = 5.0;
        }
        else{
            Resultado = E;
        }
        return Resultado;
    }
}