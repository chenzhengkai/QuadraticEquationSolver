package com.td.zhengkai.QuadraticEquationSolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class QuadraticEquationSolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuadraticEquationSolverApplication.class, args);
	}

	@RestController
	public static class QuadraticEquationSolverController {
		private final QuadraticEquationSolver solver = new QuadraticEquationSolver();

		@PostMapping("/solve")
		public ResponseEntity<String> solve(@RequestBody String coefficients) {
			try {
				// Parse the coefficients from the input string.
				String[] parts = coefficients.split(",");
				if (parts.length != 3) {
					return ResponseEntity.badRequest().body("Invalid input: Expected 3 coefficients but got " + parts.length);
				}
				double a = Double.parseDouble(parts[0]);
				double b = Double.parseDouble(parts[1]);
				double c = Double.parseDouble(parts[2]);

				// Solve the equation and format the solutions as a string.
				double[] solutions = solver.solve(a, b, c);
				if (Double.isNaN(solutions[0]) || Double.isNaN(solutions[1])) {
					return ResponseEntity.ok("No real solutions");
				} else {
					return ResponseEntity.ok(solutions[0] + "," + solutions[1]);
				}
			} catch (NumberFormatException e) {
				return ResponseEntity.badRequest().body("Invalid input: Expected numbers but got \"" + coefficients + "\"");
			}
		}

		@GetMapping("/info")
		public String info() {
			return "Quadratic Equation Solver v1.0. This service solves quadratic equations in the form ax^2 + bx + c = 0.";
		}
	}
}
