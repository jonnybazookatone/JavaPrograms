public class HelloWorld {

    public static void main (String[] args) {
    
        int x = 3;
        
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                System.out.print("-");
            }
            
            if (x == 2) {
                System.out.print("b c");
                System.out.print("-");
            }
            
            if (x == 1) {
                System.out.println("d");
                x -= 1;
            }
            
            x -= 1;
            
        }
    }
    
    public static void phrase (String[] args){
        
        String[] wordListOne = {"24/7", "multi-tier", "30,000 foot"};
        String[] wordListTwo = {"empowered", "sticky", "value-added"};
        String[] wordListThree = {"process", "tipping-point", "solution"};
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " +
                wordListThree[rand3];
        
        System.out.println("What we need is a " + phrase);
        
    }
    
    public static void helloWorld (String[] args){
        
        System.out.println("Hello World!");
        
        int x = 1;
        
        while (x<3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x += 1;
        }
        
        if (x==3) {
            System.out.println("Do");
        }
        
    }
    
}