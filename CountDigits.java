package javaPrograms;

public class CountDigits {

	public static void main(String[] args) {
       
		int num = 1;
		int count = 0;
		
		while(num > 0)
		{
			num = num / 10;
			count = count + 1;
		}
		
		System.out.print(count);
	}

}
