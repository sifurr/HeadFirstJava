public class MathMethods 
{

    // Math.abs()
    int x = Math.abs(-240); // returns 240
    double d = Math.abs(240.45); // returns 240.45

    //Math.random()
    double r1 = Math.random();
    int r2 = (int) (Math.random() * 5);

    //Math.round() to the nearest number
    int a = Math.round(-24.8f);
    int b = Math.round(24.45f);
    long c = Math.round(24.45);

    //Math.min()
    int m1 = Math.min(24,240);
    double m2 = Math.min(90876.5, 90876.49); // returns 90876.49

    
    // Math.mix()
    int x1 = Math.max(24,240);
    // returns 240
    double x2 = Math.max(90876.5, 90876.49); // returns 90876.5

    
    // Math.sqrt()
    double y1 = Math.sqrt(9);
    double y2 = Math.sqrt(42.0); // returns 6.48074069840786
}
