class Triangle {
    // Private class variables corresponding to the lengths of the triangle sides
    private final double a, b, c;
    
    Triangle(double side1, double side2, double side3) throws TriangleException {
        // Invalid Triangle Case: Sides must have a non-negative & non-zero length. 
        if ( (side1<=0)||(side2<=0)||(side3<=0) ) {
            throw new TriangleException();
        }
        // Invalid Triangle Case: Sides must not violate the Triangle Inequality.
        // http://mathworld.wolfram.com/TriangleInequality.html
        if ( ( side1>(side2+side3) )||( side2>(side1+side3) )||( side3>(side1+side2) ) ) {
            throw new TriangleException();
        }
        // Valid Triangle Case: Set the private class variables to the input lengths.
        this.a = side1;
        this.b = side2;
        this.c = side3;
    }
    
    // Equilateral Triangle: All sides have equal lengths.
    boolean isEquilateral() {
        return ( (a==b)&&(a==c) );
    }
    
    // Isosceles Triangle: At least two sides have equal lengths.
    // NOTE: Equilateral Triangles are considered to be Isosceles Triangles.
    boolean isIsosceles() {
        return (( (a==b)&&(a!=c) )||( (a==c)&&(a!=b) )||( (b==c)&&(b!=a) )|| isEquilateral() );
    }
    
    // Scalene Triangle: All sides have unequal lengths.
    boolean isScalene() {
        return ( (a!=b)&&(a!=c) );
    }
}
