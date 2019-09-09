package lj;

public class greetInEnglish {
	public static final String farewell = "Bye Bye";
	
	public void sayGoodbye(){
				System.out.println(farewell);
		}
		
	public static void main(String[] args) {
		greetInEnglish myGreet = new greetInEnglish();
		myGreet.sayGoodbye();
	}
}


/// oracle version////
//public void sayGoodbyeInEnglish() {
//    class EnglishGoodbye {
//        public static final String farewell = "Bye bye";
//        public void sayGoodbye() {
//            System.out.println(farewell);
//        }
//    }
//    EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
//    myEnglishGoodbye.sayGoodbye();
//}
