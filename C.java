package Training;

public class C {

	public static void main(String[] args) {

for( int i=0; i<10; i++){
			
			System.out.println("loop begin");
			
			if(i>5) {
				
				break; // break should be the last statement of any block
			
		}
			System.out.println("loop end");

			}
		System.out.println("main end");
		}
}

/* loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
loop end
loop begin
main end
*/