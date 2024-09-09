
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class oppgave01 {

		public static void main(String[] args) {
		
		   
		      
		
		for (int i= 10;i>0; i--) {
			String tallTxt = showInputDialog("Gi et tall:");
		   
	    
		int tall = parseInt(tallTxt);
			
		 if 
		    (tall < 0 || tall>100 ){
			 i=i+1;
	       System.out.println("feilmelding ");}
		 
			    if (tall >89 && tall<100){
				System.out.println("A");
		    }else if 
			 (79<tall && tall<90){
				System.out.println("B");
		    }else if 
				 (59<tall && tall<80 ) {
					System.out.println("C");
			  
				
		     }else if 
				 (49<tall&& tall <60) {
					System.out.println("D");

			 }else if 
					(39<tall&& tall <50 ) {
				    System.out.println("E");

		     }else if  
				    (0<tall && tall<40 ) {
					System.out.println("F");}
					
					
	         }
			   
	
		}
}
