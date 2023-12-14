class Shape {
    public void area(){
        System.out.println("Area is: ");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

    //Multi lel inheritance
class EqilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

    //Harachicak Inheritance
class Circle extends Shape{
    public void area( int r ){

        System.out.println( (3.14) * r * r );
    }
    }
class Inheritance{
    public static void main(String args[]){
        Circle c = new Circle();
        c.area(2);
    }
}