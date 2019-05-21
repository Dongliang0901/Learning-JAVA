
public class LessThanZeroException extends Exception{
	
	private int value;
	
	
	
	public LessThanZeroException(){
		super("number cannot small than 50");
	}
	
	public LessThanZeroException(int value){
		super("the inout number is "+value+" , cannot small than 50.");
	}
}
