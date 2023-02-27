/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elips;
import java.util.Scanner;

public class Elips {
    public int SemiMinorAxis = 20;
    public int SemiMajorAxis = 25;
    
    public double Luas (){
        double area;
        area = 0.5 * 3.14 * ((2 * SemiMinorAxis) * (2 * SemiMajorAxis));
        return area;
    }
    
    public double Keliling (){
        double perimeter;
        perimeter = 0.5 * 3.14 * ((2 * SemiMinorAxis) + (2 * SemiMajorAxis));
        return perimeter;
    }

    
}
