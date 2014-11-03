
public class Cycles
{
	//[1]Найти сумму четных чисел и их количество в диапазоне от 1 до 99
	public static int sumnecet (int i)
	{
		int sumi = 0;
		int res1 = 0;
		while (i<=99)
		{
			if( i%2 ==0 )
				sumi= sumi+i;
			if (i == 99 )
				res1 = sumi;
			++i;
		}
		return res1;
	}

	//[2]Проверить простое ли число? 
	//(число называется простым, если оно делится только
	//само на себя и на 1)	

//	public static int primenumber( int a )
//	{
//		while ()			    
//		{
//			boolean b = true;
//
//			for(int i=1; i<21; i++)
//			{
//				if (i==1)
//				{
//					System.out.println("Число 1 - простоe число.");
//				}
//				if(i==2)
//				{
//					System.out.println("Число 2 - простое число.");
//				}
//				else
//				{
//					for(int j=2; j<i; j++)
//					{
//						if(i%j==0)
//							b=false;
//					}
//					if(b=false)
//						System.out.println("Число "+i+" - непростое число.");
//					else
//						System.out.println("Число "+i+" - простое число.");               
//				}
//
//			}
//		}
//	}

	//[4]Вычислить факториал числа n. n! = 1*2*...*n-1*n;	
	public static int fact (int n)
	{
		int res3 = 0;
		while (n == 1)
			return 1;
		res3 = fact(n - 1) * n;
		return res3;
	}
	
	//[5]Посчитать сумму цифр заданного числа// чёт туплю ( 
	public static int su(int num) 
	{
	    int res5 = 0;
	    while (num != 0) 
	    {
	        res5 += num % 10;
	        num = num / 10;
	    }
	    return res5;
	}


	//[6]!!!!!!!!!!!!!!!Вывести число, которое является зеркальным 
			//отображением последовательности цифр заданного
			//числа, например, задано число 123, вывести 321.
				public static int mirrorNum(int num) 
				{
					int res6 = 0;
					while (num != 0) 
					{
						res6 = res6 * 10 + (num % 10);
						num = num / 10;
					}
					return res6;
				}


}

//}
