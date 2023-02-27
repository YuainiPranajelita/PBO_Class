/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Rectangle;
import java.util.Scanner;

public class Rectangle {
    public int height = 5;
    public int widht = 3;
    
    public int luas (){
    int area;
    area = this.height * this.widht;
    return area;
    }
    
    public int keliling(){
        int perimeter;
        perimeter = this.height * 2 + this.widht * 2;
        return perimeter;
    }
    
}

