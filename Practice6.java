
class OutOfStockException extends Exception{
	public OutOfStockException(){
		
	}
}
class Tickets {
	public void bookedTickets(int tickets) throws OutOfStockException {
		if(tickets<0 && tickets>100) {
			throw new OutOfStockException();
		}
			else {
				System.out.println("enjoy the show");
			}			
	}
}
public class Practice6 {
	public static void main(String[] args) {
		Tickets tik=new Tickets();
		try {
		tik.bookedTickets(110);
		}
		catch (OutOfStockException e) {
			e.printStackTrace();
		}
	}

}
