public class QuadraticEquation {
    public int a,b,c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double  getDelta() {
        return b * b - 4 * a * c;
    }

    public double getX1() {
        return (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
    }
    public  double getX2(){
        return (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
    }
    public  String display(){
        return "Phương trình "+a+"x2"+b+"x"+c+"=0 có nghiệm là:"+getX1()+"\n"+getX2();
    }
}
