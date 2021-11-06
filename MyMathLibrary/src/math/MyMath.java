
package math;


public class MyMath {
    
    public static double calcGeron(double a, double b, double c)
    {
        double p = (a + b + c ) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
    
    public static double calcGipotenuza(double a, double b)
    {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );
        return c;
    }
    
    public static double calcDistance(double x1, double x2, double y1, double y2)
    {
        double s = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) );
        return s;
    }
}
