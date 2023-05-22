package com.td.zhengkai.QuadraticEquationSolver;

public class QuadraticEquationSolver {

    public static double[] solve(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("The coefficient 'a' cannot be zero.");
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            throw new IllegalArgumentException("Equation has no real roots.");
        }

        double sqrtDiscriminant = Math.sqrt(discriminant);
        double[] roots = new double[2];
        roots[0] = (-b + sqrtDiscriminant) / (2 * a);
        roots[1] = (-b - sqrtDiscriminant) / (2 * a);
        return roots;
    }
}

