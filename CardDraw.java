
public class CardDraw {
        public static void main(String[] args)
        {		
        	CardDraw Draw;
        	Draw = new CardDraw();
        	int inputNum = 0;
        	int showCount[];
        	showCount = new int[4];
        	int b = 0;
        	if (args.length == 1) {
        		if (Draw.isNumeric(args[0]))
        				{
        				inputNum = Integer.parseInt(args[0]);
        				System.out.println("Drawing " + inputNum + " times");
        				}
            	else {
            		System.out.println("usage: CardDraw [integer]");
            		System.exit(0);
            	}
        	}
        	else {
        		System.out.println("usage: CardDraw [integer]");
        		System.exit(0);
        	}
        	
        	for (int i=inputNum; i>0; --i) {
        	b = Draw.drawingCard();
        	showCount[b]++;
        	}
        	
        	System.out.print("Rare = " + showCount[0] + "\nRare+ = "+showCount[1]+"\nSuper Rare = "+showCount[2]+"\nSuper Rare+ = "+showCount[3]);
        	// Show result
        	
        }
        
        public int drawingCard() {
        	int drawnum;
        	String grade;
        	int a = 0;
        	drawnum = (int)(Math.random() * 1000) + 1; // Draw the Card!
        	System.out.println("Your number is " + drawnum);
        	if (drawnum < 550) {	// Judge the Card grade
        		grade = "Rare";
        		a = 0;
        	}
        	else if (drawnum < 900) {
        		grade = "Rare+";
        		a = 1;
        	}
        	else if (drawnum < 970){
        		grade = "Super Rare";
        		a = 2;
        	}
        	else {
        		grade = "Super Rare+";
        		a = 3;
        	}
        	
        	System.out.println("You have drawn the " + grade + " Card!");
        	// This is your card!
        	return a;
        	
        }
        public boolean isNumeric(String s) { 
            return s.replaceAll("[+-]?\\d+", "").equals("") ? true : false; 
        } 
}
