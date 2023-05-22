package com.td.zhengkai.QuadraticEquationSolver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationSolverTest {

    @Test
    public void testSolve() {
        double[] roots = QuadraticEquationSolver.solve(1, -3, 2);
        Assertions.assertArrayEquals(new double[]{2, 1}, roots, 0.0001);
    }

    @Test
    public void testSolveWithZeroACoefficient() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationSolver.solve(0, 1, 1);
        });
    }

    @Test
    public void testSolveWithNegativeDiscriminant() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationSolver.solve(1, 1, 1);
        });
    }
}

