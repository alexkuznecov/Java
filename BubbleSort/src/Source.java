import java.util.Random;


public class Source {

	public static int[] Sort(int [] mas)
	{
		for (int i=0; i<mas.length - 1; i++)
		{
			for (int j=0; j<mas.length -1 - i; j++)
			{
				if (mas[j]<mas[j+1])
				{
					int buf = mas[j+1];
					mas[j+1] = mas[j];
					mas[j] = buf;
				}
			}
		}
		return mas;
	}
	public static void main(String[] args) {
		int [] mas = new int[20];
		Random rand = new Random();
		for (int i=0; i < mas.length;i++)
		{
			mas[i] = rand.nextInt();
		}
		
		for (int i:mas)
		{
			System.out.print(i + " ");			
		}
		System.out.println();
		
		mas = Sort(mas);
		
		for (int i:mas)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

}