package hgu;

import java.util.Scanner;

public class Designation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;
        double salary = 0;
        String designation = "";
        int choice;

        do 
        {
            System.out.println("\n----ATM Menu Options----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice)
            {
                case 1:
                    String answer;

                    do
                    {
                        System.out.print("Enter your name: ");
                        name = scanner.nextLine();

                        while (true) 
                        {
                            System.out.print("Enter your age (18 - 60): ");
                            age = scanner.nextInt();
                            scanner.nextLine();

                            if (age >= 18 && age <= 60) {
                                break;
                            }

                            System.out.println(
                                "Invalid age! Must be between 18 and 60."
                            );
                        }

                        while (true) 
                        {
                            System.out.print(
                                "Enter designation (Programmer/Tester/Manager): "
                            );
                            designation = scanner.nextLine();

                            if (designation.equalsIgnoreCase("Programmer")) 
                            {
                                salary = 20000;
                                break;
                            } else if (designation.equalsIgnoreCase("Tester")) 
                            {
                                salary = 25000;
                                break;
                            } else if (designation.equalsIgnoreCase("Manager")) 
                            {
                                salary = 30000;
                                break;
                            } 
                            else 
                            {
                                System.out.println(
                                    "Invalid designation! Try again."
                                );
                            }
                        }

                        System.out.print(
                            "Do you want to create another profile? (Yes/No): "
                        );
                        answer = scanner.nextLine();

                    } while (answer.equalsIgnoreCase("Yes"));
                    break;

                case 2:
                    if (name.isEmpty()) 
                    {
                        System.out.println("Please create a profile first.");
                    } else {
                        System.out.println("----Details are displayed----");
                        System.out.println("Your name is: " + name);
                        System.out.println("Your age is: " + age);
                        System.out.println("Your salary is: " + salary);
                        System.out.println("Your designation is: " + designation);
                    }
                    break;

                case 3:
                    if (name.isEmpty())
                    {
                        System.out.println("Please create a profile first.");
                    } else {
                        System.out.print("Enter salary increase amount: ");
                        double increase = scanner.nextDouble();
                        scanner.nextLine();

                        if (increase > 0)
                        {
                            salary += increase;
                            System.out.println("Salary is updated.");
                            System.out.println("Updated salary: " + salary);
                        } 
                        else 
                        {
                            System.out.println(
                                "Increase amount must be greater than zero."
                            );
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting!...");
                    break;

                default:
                    System.out.println(
                        "Invalid option. Please choose 1, 2, 3 or 4."
                    );
            }
        } while (choice != 4);

        scanner.close();
    }
}