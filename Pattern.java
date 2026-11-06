//Aaron Amdur-Kass
//10/28/2026
//This is a collection of methods that creates various patterns using loops, primarily to practice the use of loops for the AP exam.
public class Pattern {

        public static void stars(int rows){
            String star = "*";
            //use while loops to print out rows
            while(rows>0){
                System.out.println(star);
                star += "**";
                rows-=1;
            }
        
        
        
        System.out.println();
        }
    public static void triangle(int rows){
            int number = 1;
            int numTemp = 1;
            //use while loops to print out rows
            while(rows>0){
                while (number>0){
                System.out.print(numTemp);
                number -=1;
                }
                number = numTemp + 1;
                numTemp += 1;
                System.out.println();
                rows-=1;
            }
            System.out.println();
        }
        
    public static void odds(int start){
            //use for loops to print out rows
            for(int odd = start; odd > 0; odd -= 2){
             for(int count = 0; count < odd; count++){
                System.out.print(odd);
            }
             System.out.println();
        }
System.out.println();
    }
    public static void eo(int maxE){
        int temp;
        String letter = "O";
       if(maxE%2==0){
        letter="E";
       }
        for (int count = 0; count < maxE; count++){
        for (temp = count; temp>0; temp--){
        System.out.print(letter);
      }
       if(letter.equals("O")){
        letter = "E";
       }
       else {
        letter = "O";
       }
    
       System.out.println();
       temp += 2;
        }
 for (int count = maxE; count > 0; count--){
        for (temp = count; temp>0; temp--){
        System.out.print(letter);
      }
       if(letter.equals("O")){
        letter = "E";
       }
       else {
        letter = "O";
       }
    
       System.out.println();
       temp += 2;
        }
        }

        public static void pyramid(int rows){
            




        }
    
        public static void main(String [] args){
        stars(7);
        triangle(9);
        odds(9);
        eo(6);
        pyramid(5);
    }

}
