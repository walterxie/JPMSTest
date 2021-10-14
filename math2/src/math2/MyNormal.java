package math2;

import org.apache.commons.math.MathException;
import org.apache.commons.math.distribution.NormalDistributionImpl;

/**
 * @author Walter Xie
 */
public class MyNormal extends NormalDistributionImpl {

    public MyNormal(double mean, double sd) {
        super(mean, sd);
        System.out.println("Using math2 ...");
    }

    @Override
    public double density(double x) {
        System.out.println("Calling math2 density(" + x + ") ...");
        return super.density(x);
    }

    public static void main(String[] args) throws MathException {
        MyNormal normal = new MyNormal(0, 1);

        System.out.println("Density = " + normal.density(0.9));
    }
}
