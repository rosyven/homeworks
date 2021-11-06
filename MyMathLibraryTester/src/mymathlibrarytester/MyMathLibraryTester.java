/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymathlibrarytester;

import math.MyMath;


public class MyMathLibraryTester {

    
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double S = MyMath.calcGeron(a, b, c);
        System.out.println("Площадь треугольника = " + S);
        double s = MyMath.calcGipotenuza(a, b);
        System.out.println("Гипотенуза = " + s);
        double x1 = 1;
        double x2 = 1;
        double y1 = 3;
        double y2 = 1;
        double s2 = MyMath.calcDistance(x1, x2, y1, y2);
        System.out.println("Расстояние между точками = " + s2);
        
    }
    
}
