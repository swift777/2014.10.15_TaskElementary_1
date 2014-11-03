public class Conditionals
{
	public static int chetnost(int a, int b)
	{
		//[1]	Если а – четное посчитать а*б, иначе а+б
		int res1 = 0;

		if(a%2 == 0)
			res1 = a*b;
		else
			res1 = a + b;

		return res1;
	}
	//[2]  Определить какой четверти принадлежит точка с координатами (х,у)
	public static int chetv(int x, int y)
	{
		int res2 = 0;

		if(x > 0 && y > 0)
			res2 = 1;

		if(x < 0 && y > 0)
			res2 = 2;

		if(x < 0 && y < 0)
			res2 = 3;

		if(x > 0 && y < 0)
			res2 = 4;

		return res2;
	}
	//[3]    Найти суммы только положительных из трех чисел 
	public static int sum(int a, int b, int c)
	{
		int res3 = 0;

		if(a > 0 && b > 0 && c < 0 )
			res3 = a+b;  

		if(a > 0 && b < 0 && c > 0 )
			res3 = c+b; 

		if(a < 0 && b > 0 && c > 0 )
			res3 = b+c;

		return res3;
	}
	//[4] Посчитать выражение макс(а*б*с, а+б+с)+3 !!!! тут  не понял
	public static int expmax(int a, int b, int c)
	{
		int res4 = 0;

		int sum = a+b+c;
		int mult = a*b*c;

		if(sum > mult)
			res4 = sum+3;

		if(sum < mult)
			res4 = mult+3;	

		return res4;
	}
	//[5] Написать программу определения оценки 8 по его рейтингу, на основе следующих правил:
	public static char ball (char z)
	{
		char res5 = 0;

		if(z > 0 && z <= 19)
			res5 = 'E';  

		if(z < 20 && z <= 39)
			res5 ='F'; 

		if(z < 40 && z <= 59)
			res5 ='D';

		if(z > 60 && z <= 74)
			res5 = 'C';	    

		if(z > 75 && z <= 89)
			res5 = 'B';	    

		if(z > 89 && z <= 100)
			res5 = 'A';	

		return res5;
	}
}