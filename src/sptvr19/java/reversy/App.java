package sptvr19.java.reversy;

import java.util.Scanner;

class App {
    
    public void run() throws InterruptedException {
        
        System.out.println(" -- Reversy Game -- ");
        System.out.println(" -- by Georg Laabe -- ");
        
        System.out.println("\n This programm will return inputed string reversed");
        
        Scanner scan = new Scanner(System.in);
              
        int i;
        
        System.out.print("\nInput your string: ");
        String string = scan.nextLine();
        
        char[] array = new char[string.length()];
        char[] chara = string.toCharArray();
                
        for (i = 0; i < string.length(); i++) {
            array[i] = chara[string.length()-i-1];
        }
        
        string = new String(array);
        string = string.toLowerCase();
        string = string.substring(0, 1).toUpperCase() + string.substring(1);
        System.out.println("Reversed string: " + string);     
        
        Thread.sleep(4500);
    }
}
