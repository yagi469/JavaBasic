class Circle {
    static double pi = 3.14;
    int x;
    int y;
    double r;
    
    double area() {
        return r*r*pi;
    }
}

class UseCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        c1.x = 0;
        c1.y = 0;
        c1.r = 10.0;
        
        c2.x = 50;
        c2.y = 10;
        c2.r = 30.0;
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
