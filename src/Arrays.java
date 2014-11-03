
public class Arrays
{
//  [1] - ����� ����������� ������� �������
	public static int minel(int loc[])
	{


		int min = loc[0];
		int res1 = 1;
		for(int i = 0; i != loc.length; i ++)
		{
			if(loc[i] < min)
			{
				min = loc[i];
				res1 = min;
			}
		}
		return res1;
	}
//	[2] - ����� ������������ ������� �������
	public static int maxel(int loc[])
	{
		int res2 = 0;
		int max = loc[0];
		for(int i = 0; i !=loc.length; i++)
		{
			if(loc[i] > max)
			{
				max = loc[i];
				res2 = max;
			}
		}
		return res2;
	}
//	[3] - ����� ������ ������������ �������� �������
	public static int minIndex (int loc[])
	{
		int res3 = 0;
		int min = loc[0];
		int index = 0;
		for(int i = 0; i != loc.length; i++)
		{
			if(loc[i] < min){
				min = loc[i];
				index = i;
				res3 = index;
			}	
		}
		return res3;
	}
// [4] - ����� ������ ������������� �������� �������
	public static int maxIndex (int loc[])
	{
		int res4 = 0;
		int max = loc[0];
		int index = 0;
		for(int i = 0; i != loc.length; i++)
		{
			if(loc[i] > max){
				max = loc[i];
				index = i;
				res4 = index;
			}	
		}
		return res4;
	}
//	[5] - ��������� ����� ��������� ������� � ��������� ���������
	public static int sumNeChetIndex(int loc[])
	{
		int res5 = 0; 
		int max = loc[0];
		int index = 1 ;
		int sum = 0;
		for(int i = 0; i != loc.length; i ++)
		{
			index = i+1;
			if(index %2 != 0)
			{
				sum = sum + loc[i];
				res5 = sum;
			}	
		}
		return res5;
	}
//	[6]������� ������ ������� (������ � �������� �����������)
//	public static int reversMassArr(int loc[])
//	{
//		int res6 = 0; 
//		
//		return res6;
//		
//	}
	
//	[7] - ��������� ���������� �������� ��������� �������
	public static int neChetElMass(int loc[])
	{
		int res7 = 0;
		int max = loc[0];
		int index = 1 ;
		for(int i = 0; i != loc.length; i ++)
		{
			index = i+1;
			if(index %2 != 0)
			{
				res7 = res7 + 1;
			}	
		}
		return res7;
	}
//	[8] - �������� ������� ������ � ������ �������� �������, ��������, ��� ������� 1 2 3  4, ��������� 3 4 1 2
	public static int rokerovkaMass(int loc[])
	{
		int res8 = 0;
		
		return res8;
	}
//	[9] - ������������� ������ (��������� (Bubble), ������� (Select), ��������� (Insert))
	// ���������� ��������� 
	
	public static int bubbleSort(int[] arr)
	{
		int res91 = 0;
	    /*������� ���� ������ ��� ��������� �������� �������, 
	      ��� ��� ���������� ���� ������ ��� ������ � �����
	      ��������� ������������ �������*/   
	    for(int i = arr.length-1 ; i > 0 ; i--)
	    {
	        for(int j = 0 ; j < i ; j++)
	        {
	            /*���������� �������� �������, 
	              ���� ��� ����� ������������ �������, 
	              �� ������ �������*/
	            if( arr[j] > arr[j+1] )
	            {
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	            }
	        }
	    }
		return res91;
	}
	//���������� �������  /// �� ����� ((( 
	public static int selectionSort(int[] arr)
	{
		int res92 = 0;
		/*�� ������� ����� ������������� ��� ������������
	      ��������� ������� (0 - ���������, 1-���������, 
	      2-���������,...)*/
		for (int i = 0; i < arr.length; i++) 
		{
			/*������������, ��� ������ ������� (� ������
	           ������������ ���������) �������� ����������� */
			int min = arr[i];
			int min_i = i; 
			/*� ���������� ����� ������������ ���� �������,
	           ������� ������ ��������������� ��������*/
			for (int j = i+1; j < arr.length; j++)
			{
				//���� �������, ���������� ��� ������
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			/*���� ������� �������, �������, ��� �� ������� �������,
	          ������ �� �������*/
			if (i != min_i) 
			{
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
			res92 = arr[min_i] ;
		}
		return res92;
	}
	
	//���������� ��������� 
// [10] - ������������� ������ (Quick, Merge, Shell, Heap)

	public static int partition(int arr[], int left, int right)
	{
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		};

		return i;
	}

	void quickSort(int arr[], int left, int right) 
	{
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	
	
}
