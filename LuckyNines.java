public class LuckyNines {
	public static int countLuckyNines(int lowerEnd, int upperEnd) 
	{
		int c=0;
		while (lowerEnd > upperEnd) 
		{
			return -1;
		}

		for (int i = lowerEnd; i <= upperEnd; i++) {
			int j = Math.abs(i);
			while (j > 0) {
				if (j % 10 == 9) {
					c++;
				}

				j = j / 10;

			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int lower = IO.readInt();
		int upper = IO.readInt();
		IO.outputIntAnswer(countLuckyNines(lower,upper));
		
}
}