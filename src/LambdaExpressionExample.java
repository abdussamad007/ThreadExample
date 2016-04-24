
public class LambdaExpressionExample {
public static void main(String[] args) {
	LambdaExpressionExample lambdaExample = new LambdaExpressionExample();
	MathOperator addition = (int a,int b)->a+b;
	MathOperator substruction = (a,b)->a-b;
	MathOperator multiaplication = (a,b) ->{return a*b;};
	MathOperator division = (int a,int b) -> a/b;
	
	System.out.println(lambdaExample.operate(1, 1, addition));
	System.out.println(lambdaExample.operate(10, 5, division));
}

interface MathOperator{
	 int operation(int a,int b);
	 
	}

	interface GreetingMessage{
		void sayHello(String message);
	}
	
	private int operate(int a,int b,MathOperator mathOperator){
		return mathOperator.operation(a, b);
	}
}

