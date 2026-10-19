 abstract class Shape {                         // abstract: cannot use "new Shape()"
    abstract double area();                    // no body, subclasses must implement
    abstract double perimeter();
}

class Circle extends Shape {
    double r;                                  // radius
    Circle(double r) { this.r = r; }           // constructor stores the radius
    double area() { return Math.PI * r * r; }  // πr²
    double perimeter() { return 2 * Math.PI * r; } // 2πr
}

class Rectangle extends Shape {
    double w, h;                               // width and height

    Rectangle(double w, double h) { this.w = w; this.h = h; }
    double area() { return w * h; }
    double perimeter() { return 2 * (w + h); }
}

class Square extends Rectangle {               // a square is a rectangle with equal sides
    Square(double s) { super(s, s); }          // calls Rectangle's constructor with s, s
} 