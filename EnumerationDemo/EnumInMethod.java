package EnumerationDemo;

public class EnumInMethod {


public enum Month {

	January,february,march,april,may,june,july,august,september,october,
	november,december;
	
	
}

	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			

			Month[] m=Month.values();
			for (Month m1:m)
			{
				System.out.println(m1);
			}
		
		}

	}


