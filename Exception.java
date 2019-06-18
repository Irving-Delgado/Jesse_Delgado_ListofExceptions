import java.util.ArrayList;

public class Exception{
	public void error(){
		ArrayList<Object> myList = new ArrayList<Object>();
			myList.add("13");
			myList.add("hello world");
			myList.add(48);
			myList.add("Goodbye World");

		for(int i = 0; i < myList.size(); i++) {
    		try{
    			Integer castedValue = (Integer) myList.get(i);
    			System.out.println("This is a good value: "+ castedValue);
    		}
    		catch(ClassCastException e) {
               	System.out.println("There happens to be an error at posistion: "+i);
         	}

		}

	}
	public void catchError(){
		ArrayList<Object> arrList= new ArrayList<Object>();
			arrList.add("fun");
			arrList.add(34);
			arrList.add("java");
			arrList.add("92");
		for(int i = 0; i < arrList.size(); i++){
			try{
				Integer myValue = (Integer) arrList.get(i);
				System.out.println("Look it worked: " + myValue);
			}
			catch(ClassCastException e){
				System.out.println("uh oh, boss... Error: "+i);
			}
		}
	}
}