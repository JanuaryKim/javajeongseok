package ch11.ex;

class AsciiPrint{
	public static void main(String[] args) {
		char ch = ' ';
		for(int i=0; i < 95; i++)
			System.out.print(ch++);
		System.out.println();
	}
}
