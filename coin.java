import java.util.Scanner;

import java.util.Random;



public class coin{

    public static void main(String[] args){



	Scanner scanner = new Scanner(System.in);

	System.out.println("Who are you?");

	String string = scanner.next();

	System.out.println("Hello, " + string + "!");

	

	System.out.println("Tossing a coin...");

        int h = 0;

	int t = 0;

	Random r = new Random();

	for(int i = 1;i <= 3; i++){

	    int coin = r.nextInt(5);

	    if(coin%2 == 0){

		System.out.println("Round " + i + ": Heads");

		h++;

	    } else if(coin%2 != 0){

		System.out.println("Round " + i + ": Tails");

		t++;

	    }

	}

	

	System.out.println("Heads: " + h + ", Tails: " + t);



	if(h > t){

	    System.out.println(string + " won!");

	}

	else {

	    System.out.println(string + " lost!");

	}

    }

}

