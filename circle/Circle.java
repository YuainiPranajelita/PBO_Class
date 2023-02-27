/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;
import java.util.Scanner;

public class Circle {
    public int radius = 5;
    
    public double luas (){
    double area;
    area = this.radius * this.radius * 3.14;
    return area;
    }
    
    public double keliling(){
        double perimeter;
        perimeter = 2 * this.radius * 3.14;
        return perimeter;
    }
    
}
