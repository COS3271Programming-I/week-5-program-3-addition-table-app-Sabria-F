import java.util.Scanner;
public class AdditionTableApp {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        //Define string make table.
        String maketable = "";


        //Create a while loop that will run as long as the user wants to create an addition table.
        while(!maketable.equalsIgnoreCase("x")){

            //Prompt user for the number of columns and rows they want in their table
            System.out.print("\nEnter an integer between 3 and 20 to determine how many rows and columns you want your addition table to have --> ");
            int tablesize = userinput.nextInt();
            userinput.nextLine();

            //Test if number is less that three.
            if (tablesize<3) {
                //Tell the user to enter a number greater than or equal to 3.
                System.out.println("\nThe number you entered was less than 3. Please enter a number greater than or equal to 3.\n");
            }

            //Test if the number is between 3 and 20.
            else if (tablesize>=3 && tablesize<=20) {

                //Define an integer i.
                int i;

                //Define and integer j.
                int j;

                //Create the first for loop that will make the values for the columns.
                for(i=0;i<=tablesize;i++) {

                    //Create the second for loop to print the values.
                    for(j=i;j<=i+tablesize;j++){

                        //if j is not equal to zero print the value of j with a space.
                        if(j!=0){
                            System.out.print(" "+(j));
                        }

                        //If j is equal to zero. print a plus sign instead.
                        else{
                            System.out.print(" +");
                        }
                    }

                    //Add an enter after each line of the addition table.
                    System.out.println();
                }
            }

            //Test if the number entered by the user is greater than 20.
            else if(tablesize>20) {

                //Tell the user to enter a number less than or equal to 20.
                System.out.println("\nThe number you entered was greater than 20. Please enter a number less than or equal to 20.\n");
            }

            //Ask user if they are ready to exit the program.
            System.out.print("\nDo you want to to exit the program? Enter x to exit, or enter anything else to continue --> ");
            maketable = userinput.nextLine();

        }

        //Add some space for formatting purposes.
        System.out.println("\n");

        //Tell the user that the program is ending.
        System.out.println("Program ending...");

        //More space for formatting.
        System.out.println("\n");


    }

}
