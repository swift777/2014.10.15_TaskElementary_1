
public class Cycles
{
	//[1]����� ����� ������ ����� � �� ���������� � ��������� �� 1 �� 99
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

	//[2]��������� ������� �� �����? 
	//(����� ���������� �������, ���� ��� ������� ������
	//���� �� ���� � �� 1)	

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
//					System.out.println("����� 1 - ������e �����.");
//				}
//				if(i==2)
//				{
//					System.out.println("����� 2 - ������� �����.");
//				}
//				else
//				{
//					for(int j=2; j<i; j++)
//					{
//						if(i%j==0)
//							b=false;
//					}
//					if(b=false)
//						System.out.println("����� "+i+" - ��������� �����.");
//					else
//						System.out.println("����� "+i+" - ������� �����.");               
//				}
//
//			}
//		}
//	}

	//[4]��������� ��������� ����� n. n! = 1*2*...*n-1*n;	
	public static int fact (int n)
	{
		int res3 = 0;
		while (n == 1)
			return 1;
		res3 = fact(n - 1) * n;
		return res3;
	}
	
	//[5]��������� ����� ���� ��������� �����// ��� ����� ( 
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


	//[6]!!!!!!!!!!!!!!!������� �����, ������� �������� ���������� 
			//������������ ������������������ ���� ���������
			//�����, ��������, ������ ����� 123, ������� 321.
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
