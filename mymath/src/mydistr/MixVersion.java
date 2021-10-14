package mydistr;

/**
 * @author Walter Xie
 */
public class MixVersion {


    public static void main(String[] args) {
        math3.MyNormal normal3 = new math3.MyNormal(0, 1);
        System.out.println("math3 Density =  " + normal3.density(0.9));

        math2.MyNormal normal2 = new math2.MyNormal(0, 1);
        System.out.println("math2 Density = " + normal2.density(0.9));
    }

}
