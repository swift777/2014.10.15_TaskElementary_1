
public class Basic_Job
{

	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		int x = 5;
		int y = 5;
		int c = -5;
		char z = 100;
		int mult = 0;
		int sum  = 0 ;

		//	String z = "14";
		Conditionals Cs = new Conditionals();
		System.out.println("[1] - ��� �� ��� "+Cs.chetnost(a, b));
		System.out.println("[2] - ����� �������� �� ��������� =>"+Cs.chetv(x,y));
		System.out.println("[3] -  ����� ����� ������ ������������� �� ���� ����� SUM =>"+Cs.sum(a, b, c));
		System.out.println("[4] - ��������� ��������� ���� =>"+Conditionals.expmax(a, b, c));
		System.out.println("[5] - Students Ball =>"+Cs.ball(z));


		//����� 
		int i = 1;
		int n = 12;
		int su = 3345;
		int num = 123;
		Cycles Cycles = new Cycles();
		System.out.println("<= ����� =>");
		System.out.println("[1] - sum ne chet  =>"+Cycles.sumnecet(i));
		//		System.out.println("[2] - fact = " + Cycles.fact(n));
		//		
		System.out.println("[4] - fact = " + Cycles.fact(n));
		System.out.println("[5] - suma = " + Cycles.su(su));
		System.out.println("[6] - miror number  = " + Cycles.mirrorNum(num));


		//���������� �������
		int [] loc = {12,2,3,4,5,9};
		int [] loca = {1,2,3,4};
		int arr[] ={62, 84, 32, 5, 0, 14, 52, 82, 58, 71};
		Arrays Arr = new Arrays();
		
		System.out.println("<= ������ =>");
		System.out.println("[1] - min el Mass= " + Arr.minel(loc));
		System.out.println("[2] - max el Mass= " + Arr.maxel(loc));
		System.out.println("[3] - Index min el Mass= " + Arr.minIndex(loc));
		System.out.println("[4] - Index max el Mass= " + Arr.maxIndex(loc));
		System.out.println("[5] - Index max el Mass= " + Arr.sumNeChetIndex(loc));
//		System.out.println("[6] - Index max el Mass= " + Arr.sumNeChetIndex(loc));
		System.out.println("[7] -  summ NeChetEl Mass= " + Arr.neChetElMass(loc));
		System.out.println("[8] -  revers mass = " + Arr.rokerovkaMass(loca));
		System.out.println("[91] -  ���������� ���������   = " + Arr.bubbleSort(arr));
		System.out.println("[92] -  ���������� �������  = " + Arr.selectionSort(arr));
	}

}
