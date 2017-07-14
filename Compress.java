tpublic class Compress {
	public static void main(String[] args){
		System.out.println("Enter string:");
		String original = IO.readString();
		original = compress(original);
		System.out.println(original);
	}
	
	public static String compress (String original){	
		String newstr = "";
		int length = original.length();
		char currChar = 0;
		for (int i =0; i < length; i++) {
			int repeat = 1;
			while(i+1 < length && (original.charAt(i)) == (original.charAt(i+1))) {
				repeat++;
				i++;			
			}

			if(repeat ==1){
				currChar = original.charAt(i);
				newstr = newstr + currChar;
			}

			if (repeat > 1){
				currChar= original.charAt(i);
				newstr = newstr + repeat + currChar;
			}
		}
	
		original = newstr;
		return original;
	}
}