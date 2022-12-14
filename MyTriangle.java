public class MyTriangle {
    Mypoint v1;
    Mypoint v2 ;
    Mypoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new Mypoint(x1, y1);
        this.v2 = new Mypoint(x2, y2);
        this.v3 = new Mypoint(x3, y3);
    }
    public MyTriangle(Mypoint v1, Mypoint v2, Mypoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }
    public String printType()
    {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (d1 == d2 && d2 == d3) {
            return "equilateral";
        }
        else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "isosceles";
        }
        return "scalene";
    }
    public String getTyp(){
        if (v1==v2&&v1==v3){
        return  "equilateral";
        } else if
        (v1==v2||v1==v3){
          return "isosceles";
        }else {
            return "scalene";
        }
    }
    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }
}
