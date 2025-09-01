public class Patterns07222023
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    //pattern20(6);
	    //halfesareAlike("textbook");
	    //System.out.println(halfesareAlike("textbook"));
	    message();
	}
	
	public static void pattern6(int number){
	    for(int row = 0; row <= number ; row++){
		    for(int space = 0; space <=number - row;space++ ){
		        System.out.print(" ");
		    }
		    for(int column = 0; column <= row; column++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	
	public static void pattern26(int number){
	    for(int row = 1; row <= number ; row++){
		    for(int space = 0; space <=number - row;space++ ){
		        System.out.print(" ");
		    }
		    for(int column = 1; column >= 1; column--){
		        System.out.print(row);
		    }
		    System.out.println();
		}
	}
	
	public static void pattern(int number){
	    for(int row = 1; row <= number ; row++){
	          for(int space = 0; space <=number - row;space++ ){
		        System.out.print(" ");
		    }
		    for(int column = number; column >= 1; column--){
		        System.out.print(row);
		    }
		    System.out.println();
		}
	}
		
	public static void pattern20(int number){
	    for(int row = 1; row<=number; row++){
	        for(int column = number; column >=row ;column--){
	            System.out.print(row);
	        }
	        System.out.println();
	    }
	}
	public static void pattern33(int number){
	    for(int row = 1; row <= number; row++){
	        for(int column = 1; column <= row; column++){
	            char ch = 'a';
	            System.out.print(Character.toUpperCase(ch));
	        }
	        System.out.println();
	    }
	}
	
	public static boolean halfesareAlike(String S){
	    int countStart = 0; int countEnd = 0;
	    for(int start = 0; start < S.length()/2;start++){
	        if(S.charAt(start) == 'a'|| S.charAt(start) == 'e' || S.charAt(start) == 'i'|| S.charAt(start) == 'o' || S.charAt(start) == 'u'){
	            countStart++;
	        }
	    }
	    for(int end = S.length()/2; end < S.length(); end++){
	        if(S.charAt(end) == 'a'|| S.charAt(end) == 'e' || S.charAt(end) == 'i'|| S.charAt(end) == 'o' || S.charAt(end) == 'u'){
	            countEnd++;
	        }
	    }
	    System.out.println(countStart);
	    System.out.println(countEnd);
	    
	    if(countStart == countEnd){
	        return true;
	    }
	    return false;
	}
	
	public static void message(){
	    System.out.println("Hello World");
	    message();
	}
	
	
	
	
}
