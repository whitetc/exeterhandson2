public class Handson {
    public static void main(String[] args) {
//        Step 1
//        You should leverage what you have learned about boolean
//        operations to create a program which prints the ticket prices for a user.
//        If the user is a senior citizen (i.e., they are 65 years of age or older),
//        they receive a discounted price of $7 per ticket. If they are 12 years of age
//        or younger, they receive a discounted price of $8 per ticket. Otherwise, they will pay $10.
//
//                Age Range	Price
//        0-12	$8
//        13-64	$10
//        65 & Above	$7
        int age=67;
        boolean isStudent = false;

// if senior citizen, pay $7
        if(age>=65){
            System.out.println("You pay $7.00");
        }
// everyone else, pay $10
        if(age>12 && age<64){
            System.out.println("You pay $10.00");
        }
// if child pay 8.00
        if(age>0 && age<13){
            System.out.println("You pay $8.00");
        }
// if isStudent pay 8
        if(isStudent){
            System.out.println("You pay $8.00");
        }
// check for valid age
        if(age<0){
            System.out.println("Invalid age");
        }
    }
}
