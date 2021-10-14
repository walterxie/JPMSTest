package math3;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;

/**
 * @author Walter Xie
 */
public class MyNormal extends NormalDistribution {

    public MyNormal(double mean, double sd) throws NotStrictlyPositiveException {
        super(mean, sd);
        System.out.println("Using math3 ...");
    }

    @Override
    public double density(double x) {
        System.out.println("Calling math3 density(" + x + ") ...");
        return super.density(x);
    }

    public static void main(String[] args)  {
        MyNormal normal = new MyNormal(0, 1);

        System.out.println("Density = " + normal.density(0.9));
    }

}
