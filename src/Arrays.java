
public class Arrays
{
////  [1] - àéòè ìèíèìàëüíûé ýëåìåíò ìàññèâà
//	public static int minel(int loc[])
//	{
//
//
//		int min = loc[0];
//		int res1 = 1;
//		for(int i = 0; i != loc.length; i ++)
//		{
//			if(loc[i] < min)
//			{
//				min = loc[i];
//				res1 = min;
//			}
//		}
//		return res1;
//	}
////	[2] - àéòè ìàêñèìàëüíûé ýëåìåíò ìàññèâà
//	public static int maxel(int loc[])
//	{
//		int res2 = 0;
//		int max = loc[0];
//		for(int i = 0; i !=loc.length; i++)
//		{
//			if(loc[i] > max)
//			{
//				max = loc[i];
//				res2 = max;
//			}
//		}
//		return res2;
//	}
////	[3] - àéòè èíäåêñ ìèíèìàëüíîãî ýëåìåíòà ìàññèâà
//	public static int minIndex (int loc[])
//	{
//		int res3 = 0;
//		int min = loc[0];
//		int index = 0;
//		for(int i = 0; i != loc.length; i++)
//		{
//			if(loc[i] < min){
//				min = loc[i];
//				index = i;
//				res3 = index;
//			}	
//		}
//		return res3;
//	}
//// [4] - àéòè èíäåêñ ìàêñèìàëüíîãî ýëåìåíòà ìàññèâà
//	public static int maxIndex (int loc[])
//	{
//		int res4 = 0;
//		int max = loc[0];
//		int index = 0;
//		for(int i = 0; i != loc.length; i++)
//		{
//			if(loc[i] > max){
//				max = loc[i];
//				index = i;
//				res4 = index;
//			}	
//		}
//		return res4;
//	}
////	[5] - îñ÷èòàòü ñóììó ýëåìåíòîâ ìàññèâà ñ íå÷åòíûìè èíäåêñàìè
//	public static int sumNeChetIndex(int loc[])
//	{
//		int res5 = 0; 
//		int max = loc[0];
//		int index = 1 ;
//		int sum = 0;
//		for(int i = 0; i != loc.length; i ++)
//		{
//			index = i+1;
//			if(index %2 != 0)
//			{
//				sum = sum + loc[i];
//				res5 = sum;
//			}	
//		}
//		return res5;
//	}
////	[6]äåëàòü ðåâåðñ ìàññèâà (ìàññèâ â îáðàòíîì íàïðàâëåíèè)
////	public static int reversMassArr(int loc[])
////	{
////		int res6 = 0; 
////		
////		return res6;
////		
////	}
//	
////	[7] - îñ÷èòàòü êîëè÷åñòâî íå÷åòíûõ ýëåìåíòîâ ìàññèâà
//	public static int neChetElMass(int loc[])
//	{
//		int res7 = 0;
//		int max = loc[0];
//		int index = 1 ;
//		for(int i = 0; i != loc.length; i ++)
//		{
//			index = i+1;
//			if(index %2 != 0)
//			{
//				res7 = res7 + 1;
//			}	
//		}
//		return res7;
//	}
////	[8] - îìåíßòü ìåñòàìè ïåðâóþ è âòîðóþ ïîëîâèíó ìàññèâà, íàïðèìåð, äëß ìàññèâà 1 2 3  4, ðåçóëüòàò 3 4 1 2
//	public static int rokerovkaMass(int loc[])
//	{
//		int res8 = 0;
//		
//		return res8;
//	}
////	[9] - òñîðòèðîâàòü ìàññèâ (ïóçûðüêîì (Bubble), âûáîðîì (Select), âñòàâêàìè (Insert))
//	// ñîðòèðîâêà ïóçûðüêîì 
//	
//	public static int bubbleSort(int[] arr)
//	{
//		int res91 = 0;
//	    /*íåøíèé öèêë êàæäûé ðàç ñîêðàùàåò ôðàãìåíò ìàññèâà, 
//	      òàê êàê âíóòðåííèé öèêë êàæäûé ðàç ñòàâèò â êîíåö
//	      ôðàãìåíòà ìàêñèìàëüíûé ýëåìåíò*/   
//	    for(int i = arr.length-1 ; i > 0 ; i--)
//	    {
//	        for(int j = 0 ; j < i ; j++)
//	        {
//	            /*ðàâíèâàåì ýëåìåíòû ïîïàðíî, 
//	              åñëè îíè èìåþò íåïðàâèëüíûé ïîðßäîê, 
//	              òî ìåíßåì ìåñòàìè*/
//	            if( arr[j] > arr[j+1] )
//	            {
//	                int tmp = arr[j];
//	                arr[j] = arr[j+1];
//	                arr[j+1] = tmp;
//	            }
//	        }
//	    }
//		return res91;
//	}
//	//îðòèðîâêà ûáîðîì  /// íå ïîíßë ((( 
//	public static int selectionSort(int[] arr)
//	{
//		int res92 = 0;
//		/*î î÷åðåäè áóäåì ïðîñìàòðèâàòü âñå ïîäìíîæåñòâà
//	      ýëåìåíòîâ ìàññèâà (0 - ïîñëåäíèé, 1-ïîñëåäíèé, 
//	      2-ïîñëåäíèé,...)*/
//		for (int i = 0; i < arr.length; i++) 
//		{
//			/*ðåäïîëàãàåì, ÷òî ïåðâûé ýëåìåíò (â êàæäîì
//	           ïîäìíîæåñòâå ýëåìåíòîâ) ßâëßåòñß ìèíèìàëüíûì */
//			int min = arr[i];
//			int min_i = i; 
//			/* îñòàâøåéñß ÷àñòè ïîäìíîæåñòâà èùåì ýëåìåíò,
//	           êîòîðûé ìåíüøå ïðåäïîëîæåííîãî ìèíèìóìà*/
//			for (int j = i+1; j < arr.length; j++)
//			{
//				//ñëè íàõîäèì, çàïîìèíàåì åãî èíäåêñ
//				if (arr[j] < min) {
//					min = arr[j];
//					min_i = j;
//				}
//			}
//			/*ñëè íàøåëñß ýëåìåíò, ìåíüøèé, ÷åì íà òåêóùåé ïîçèöèè,
//	          ìåíßåì èõ ìåñòàìè*/
//			if (i != min_i) 
//			{
//				int tmp = arr[i];
//				arr[i] = arr[min_i];
//				arr[min_i] = tmp;
//			}
//			res92 = arr[min_i] ;
//		}
//		return res92;
//	}
//	
//	//îðòèðîâêà ñòàâêàìè 
//// [10] - òñîðòèðîâàòü ìàññèâ (Quick, Merge, Shell, Heap)
//
//	public static int partition(int arr[], int left, int right)
//	{
//		int i = left, j = right;
//		int tmp;
//		int pivot = arr[(left + right) / 2];
//
//		while (i <= j) {
//			while (arr[i] < pivot)
//				i++;
//			while (arr[j] > pivot)
//				j--;
//			if (i <= j) {
//				tmp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = tmp;
//				i++;
//				j--;
//			}
//		};
//
//		return i;
//	}
//
//	void quickSort(int arr[], int left, int right) 
//	{
//		int index = partition(arr, left, right);
//		if (left < index - 1)
//			quickSort(arr, left, index - 1);
//		if (index < right)
//			quickSort(arr, index, right);
//	}
//
//	
	
}
