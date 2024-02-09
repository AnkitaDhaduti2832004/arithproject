public class arith1{
    int square(int x){
        return x*x;
    }
    int cube(int x){
        return x*x*x;
    }
    int modulus(int x,int y){
        return x%y;
    }
    double power(float x,float y){
       return Math.pow(2,3);
    }
    public static void main(String args[]){
        arith1 a1=new arith1();
        System.out.println("square is "+a1.square(6));
        System.out.println("cube is "+a1.cube(9));
        System.out.println("modulus is "+a1.modulus(4,7));
        System.out.println("power is "+a1.power(2,6));
    }

}
    
