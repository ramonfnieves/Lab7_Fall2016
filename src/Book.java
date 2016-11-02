
public class Book implements GameThing, Readable, Openable {

	public boolean isOpen = false;      //Start out closed

	public String getName()
	{
		return "A dusty old book";
	}

	public String getDescription()
	{
		return "This book appears to be old and dusty. It's also quite heavy.";
	}

	@Override
	public void read() {
		System.out.println("It seems to be an unreadable magic book");		
	}

	@Override
	public void open() {
		if(!isOpen){
			System.out.println("As the book opens, it makes a chriming sound.");		
		}
		else{
			System.out.println("The book is already open!");		
		}
	}

	@Override
	public void close() {
		if(isOpen){
			System.out.println( "As the book closes, it makes a loud 'thud' sound.");		
		}
		else{
			System.out.println( "The book is already closed!");		
		}
	}
}
