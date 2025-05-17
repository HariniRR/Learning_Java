package basicConceptsOfJava;
class MyException extends Exception{
	public MyException(String a) {
		super(a);
	}
}
public class ExceptionHandling3 {

	public static void main(String[] args) throws MyException{
		// TODO Auto-generated method stub
		try{
			String[] book= {"History","Geography","Mathematics","Literature","Chemistry"};
		int[] stockNum= {8,6,9,2,5};
		System.out.println("Books \t Numbers");
		for(int i=0;i<book.length;i++) {
			System.out.println(book[i] +"\t"+ stockNum[i]);
			if(stockNum[i]<5)
			{
				System.out.println();
				throw new MyException("Book out of stock");
			}
		  }
		}
		catch(MyException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
		
	}

}
/*output
Books 	 Numbers
History		8
Geography	6
Mathematics	9
Literature	2

Caught Exception: Book out of stock
*/