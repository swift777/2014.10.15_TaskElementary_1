
public class Arrays
{
//  [1] - Найти минимальный элемент массива
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
//	[2] - Найти максимальный элемент массива
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
//	[3] - Найти индекс минимального элемента массива
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
// [4] - Найти индекс максимального элемента массива
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
//	[5] - Посчитать сумму элементов массива с нечетными индексами
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
//	[6]Сделать реверс массива (массив в обратном направлении)
//	public static int reversMassArr(int loc[])
//	{
//		int res6 = 0; 
//		
//		return res6;
//		
//	}
	
//	[7] - Посчитать количество нечетных элементов массива
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
//	[8] - Поменять местами первую и вторую половину массива, например, для массива 1 2 3  4, результат 3 4 1 2
	public static int rokerovkaMass(int loc[])
	{
		int res8 = 0;
		
		return res8;
	}
//	[9] - Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))
	// сортировка пузырьком 
	
	public static int bubbleSort(int[] arr)
	{
		int res91 = 0;
	    /*Внешний цикл каждый раз сокращает фрагмент массива, 
	      так как внутренний цикл каждый раз ставит в конец
	      фрагмента максимальный элемент*/   
	    for(int i = arr.length-1 ; i > 0 ; i--)
	    {
	        for(int j = 0 ; j < i ; j++)
	        {
	            /*Сравниваем элементы попарно, 
	              если они имеют неправильный порядок, 
	              то меняем местами*/
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
	//Сортировка Выбором  /// не понял ((( 
	public static int selectionSort(int[] arr)
	{
		int res92 = 0;
		/*По очереди будем просматривать все подмножества
	      элементов массива (0 - последний, 1-последний, 
	      2-последний,...)*/
		for (int i = 0; i < arr.length; i++) 
		{
			/*Предполагаем, что первый элемент (в каждом
	           подмножестве элементов) является минимальным */
			int min = arr[i];
			int min_i = i; 
			/*В оставшейся части подмножества ищем элемент,
	           который меньше предположенного минимума*/
			for (int j = i+1; j < arr.length; j++)
			{
				//Если находим, запоминаем его индекс
				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}
			/*Если нашелся элемент, меньший, чем на текущей позиции,
	          меняем их местами*/
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
	
	//Сортировка Вставками 
// [10] - Отсортировать массив (Quick, Merge, Shell, Heap)

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
