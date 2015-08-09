public class FizzBuzz{
	public static void main(String[] args){
		int i = 55;
		int a = 3;
		int b = 5;
		int c = a*b;
		if(i % c == 0){
			System.out.println("FizzBuzz"); //3かつ5の倍数の時FizzBuzzを出力
		}
		else if(i % b == 0){
			System.out.println("Buzz"); //5の倍数の時Buzzを出力
		}
		else if(i % a == 0){
			System.out.println("Fizz"); //3の倍数の時Fizzを出力
		}
		else{
			System.out.println(i);
		}
	}
}
