# QuadraticEquationSolver

Used Spring Boot Framework implement a Quadratic Equation Solver service. This service solves quadratic equations in the form ax^2 + bx + c = 0.

1. Main function to solve equation: [QuadraticEquationSolver.java](https://github.com/chenzhengkai/QuadraticEquationSolver/blob/main/src/main/java/com/td/zhengkai/QuadraticEquationSolver/QuadraticEquationSolver.java)

2. HTTP POST END Point API: [QuadraticEquationSolverApplication.java](https://github.com/chenzhengkai/QuadraticEquationSolver/blob/main/src/main/java/com/td/zhengkai/QuadraticEquationSolver/QuadraticEquationSolverApplication.java)

3. Test case for EquationSolver : [QuadraticEquationSolverTest.java](https://github.com/chenzhengkai/QuadraticEquationSolver/blob/main/src/test/java/com/td/zhengkai/QuadraticEquationSolver/QuadraticEquationSolverTest.java), Test case for HTTP REST call: [QuadraticEquationSolverControllerTest.java](https://github.com/chenzhengkai/QuadraticEquationSolver/blob/main/src/test/java/com/td/zhengkai/QuadraticEquationSolver/QuadraticEquationSolverControllerTest.java)


4. Use Maven command `mvn clean package` to build the whole application, and then run application as `java -jar target/quadratic-equation-solver-0.0.1-SNAPSHOT.jar`, the default port to listen the application is 8080.

5. Use the following HTTP POST Call the service:

`curl -X POST -H "Content-Type: text/plain" -d "1,-3,2" http://localhost:8080/solve`

`2.0,1.0`

