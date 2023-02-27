/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;

public class square {
    public int Lengthofside = 10;
    
    public int Lengthofside (){
    int area;
    area = this.Lengthofside * this.Lengthofside;
    return area;
    }
    
    public int calculatePerimeter(){
        int perimeter;
        perimeter = this.Lengthofside * 4;
        return perimeter;
    }
    
    
}
