import java.util.Scanner;

public class A1OOP 
{
     public static void main(String[] args) 
    {
        Scanner inputInt = new Scanner(System.in);
        //public static 
        
        
        int selection; int ans; double price; double costAdult; double costChildren; double costMembership; double total;
        int adult = 0;
        int children = 0;
        int membership = 0;
        int days; double totalsalary; int totalpeople;
        
        do
        {
            System.out.println("1. Customer");
            System.out.println("2. Staff");
            System.out.println("3. Exit");
            
            System.out.print("Enter your selection: ");
            selection = inputInt.nextInt(); 
            
            
        
                switch(selection)
                {
                    
                    case 1:
                        System.out.println("");
                        System.out.println("Hello customer!");
                        System.out.println("");
                        
                        do
                        {
                            System.out.println("Please pick a movie:");
                            System.out.println("1. Malignant");
                            System.out.println("2. Fate/Grand Order The Movie");
                            System.out.println("3. Chinese Doctors");
                            System.out.println("4. Black Widow");
                            System.out.println("5. Jungle Cruise");
                            System.out.println("6. Exit");
                            System.out.print("");
                            
                            System.out.print("Enter your selection: ");
                            selection = inputInt.nextInt();
                            switch(selection)
                            {
                                case 1: 
                                    System.out.println("The ticket price for adult is RM25.00");
                                    System.out.println("The ticket price for children is RM12.00");
                                    System.out.println("The ticket price for membership is RM9.99");
                                    System.out.print("Adult: ");
                                    adult = inputInt.nextInt();
                                    
                                    costAdult = 25 * adult;
                                    
                                    System.out.print("Children: ");
                                    children = inputInt.nextInt();
                                    
                                    costChildren = 12 * children;
                                    
                                    System.out.print("Membership: ");
                                    membership = inputInt.nextInt();
                                    
                                    costMembership = 9.99 * membership;
                                    
                                    total = costAdult + costChildren + costMembership;
                                    
                                    System.out.println("Total is RM" + total);
                                    break;
                                    
                                case 2:
                                    System.out.println("The ticket price for adult is RM29.99");
                                    System.out.println("The ticket price for children is RM18.80");
                                    System.out.println("The ticket price for membership is RM13.90");
                                    System.out.print("Adult: ");
                                    adult = inputInt.nextInt();
                                    
                                    costAdult = 29.99 * adult;
                                    
                                    System.out.print("Children: ");
                                    children = inputInt.nextInt();
                                    
                                    costChildren = 18.80 * children;
                                    
                                    System.out.print("Membership: ");
                                    membership = inputInt.nextInt();
                                    
                                    costMembership = 13.90 * membership;
                                    
                                    total = costAdult + costChildren + costMembership;
                                    
                                    System.out.println("Total is RM" + total);
                                    break;
                                        
                                case 3:
                                    System.out.println("The ticket price for adult is RM18.20");
                                    System.out.println("The ticket price for children is RM10.60");
                                    System.out.println("The ticket price for membership is RM6.30");
                                    System.out.print("Adult: ");
                                    adult = inputInt.nextInt();
                                    
                                    costAdult = 18.20 * adult;
                                    
                                    System.out.print("Children: ");
                                    children = inputInt.nextInt();
                                    
                                    costChildren = 10.60 * children;
                                    
                                    System.out.print("Membership: ");
                                    membership = inputInt.nextInt();
                                    
                                    costMembership = 6.30 * membership;
                                    
                                    total = costAdult + costChildren + costMembership;
                                    
                                    System.out.println("Total is RM" + total);
                                    break;
                                    
                                case 4:
                                    System.out.println("The ticket price for adult is RM12.20");
                                    System.out.println("The ticket price for children is RM9.90");
                                    System.out.println("The ticket price for membership is RM5.99");
                                    System.out.print("Adult: ");
                                    adult = inputInt.nextInt();
                                    
                                    costAdult = 12.20 * adult;
                                    
                                    System.out.print("Children: ");
                                    children = inputInt.nextInt();
                                    
                                    costChildren = 9.90 * children;
                                    
                                    System.out.print("Membership: ");
                                    membership = inputInt.nextInt();
                                    
                                    costMembership = 5.99 * membership;
                                    
                                    total = costAdult + costChildren + costMembership;
                                    
                                    System.out.println("Total is RM" + total);
                                    break;
                                    
                                case 5:
                                    System.out.println("The ticket price for adult is RM27.70");
                                    System.out.println("The ticket price for children is RM18.80");
                                    System.out.println("The ticket price for membership is RM15.50");
                                    System.out.print("Adult: ");
                                    adult = inputInt.nextInt();
                                    
                                    costAdult = 27.70 * adult;
                                    
                                    System.out.print("Children: ");
                                    children = inputInt.nextInt();
                                    
                                    costChildren = 18.80 * children;
                                    
                                    System.out.print("Membership: ");
                                    membership = inputInt.nextInt();
                                    
                                    costMembership = 15.50 * membership;
                                    
                                    total = costAdult + costChildren + costMembership;
                                    
                                    System.out.println("Total is RM" + total);
                                    break;
                            }          
                        }while (selection != 6);
                        break;
                    default:
                        System.exit(0);
                        
                    case 2:
                        System.out.println("");
                        System.out.println("Hello staff!");
                        System.out.println("");
                        
                        do
                        {
                            System.out.println("What do you want to do? ");
                            System.out.println("1. Check weekly salary");
                            System.out.println("2. Check amount of people watching a movie");
                            System.out.println("3. Exit");
                            System.out.println("");
                            
                            System.out.print("Enter your selection: ");
                            selection = inputInt.nextInt();
                            switch(selection)
                            {
                                case 1:
                                   //do
                                   // {
                                    System.out.println("1 day = RM48.00");
                                    System.out.print("Number of days worked (Only number 1-7): ");
                                    days = inputInt.nextInt();
                                    
                                    totalsalary = 48.00 * days;
                                    
                                   System.out.println("Your weekly salary: " + totalsalary);
                                   break;
                                   //}while (days != 7);
                                   // break;
                                
                                case 2:
                                    do
                                    {
                                        System.out.println("Which movie do you want to check? ");
                                        System.out.println("1. Malignant");
                                        System.out.println("2. Fate/Grand Order The Movie");
                                        System.out.println("3. Chinese Doctors");
                                        System.out.println("4. Black Widow");
                                        System.out.println("5. Jungle Cruise");
                                        System.out.println("6. Exit");
                                        System.out.print("");
                                        
                                        System.out.print("Enter your selection: ");
                                        selection = inputInt.nextInt();
                                        switch(selection)
                                        {
                                            case 1:
                                                
                                                System.out.println("Number of adults: " + adult);
                                                System.out.println("Number of children: " + children);
                                                System.out.println("Number of members: " + membership);
                                                
                                                totalpeople = adult + children + membership;
                                                
                                                System.out.println("Total viewers of Malignant: " + totalpeople);
                                                break;
                                                
                                            case 2:
                                                System.out.println("Number of adults: " + adult);
                                                System.out.println("Number of children: " + children);
                                                System.out.println("Number of members: " + membership);
                                                
                                                totalpeople = adult + children + membership;
                                                
                                                System.out.println("Total viewers of Fate/Grand Order The Movie: " + totalpeople);
                                                break;
                                                
                                            case 3:
                                                System.out.println("Number of adults: " + adult);
                                                System.out.println("Number of children: " + children);
                                                System.out.println("Number of members: " + membership);
                                                
                                                totalpeople = adult + children + membership;
                                                
                                                System.out.println("Total viewers of Chinese Doctors: " + totalpeople);
                                                break;
                                                
                                            case 4:
                                                System.out.println("Number of adults: " + adult);
                                                System.out.println("Number of children: " + children);
                                                System.out.println("Number of members: " + membership);
                                                
                                                totalpeople = adult + children + membership;
                                                
                                                System.out.println("Total viewers of Black Widow: " + totalpeople);
                                                break;
                                                
                                            case 5:
                                                System.out.println("Number of adults: " + adult);
                                                System.out.println("Number of children: " + children);
                                                System.out.println("Number of members: " + membership);
                                                
                                                totalpeople = adult + children + membership;
                                                
                                                System.out.println("Total viewers of Jungle Cruise: " + totalpeople);
                                                break;
                                        }
                                    }while (selection != 6);
                                    break;
                                default:
                                    System.exit(0);
                            }
                        }while (selection != 3);
                             
                }  
        }
        while (selection != 3);
    }
}