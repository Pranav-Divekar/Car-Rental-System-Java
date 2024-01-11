import java.util.*;
class Car_Details
{
    String number;
    String brand;
    String model_name;
    String type;
    //sux,hatchback,sedan,off-road,premium,sports
    int no_of_seats;

    public void add_car()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Registration number of car : ( no spaces :) )");
        this.number = sc.next();
         System.out.println("Enter brand name of the car : ");
        this.brand = sc.next();
        System.out.println("Enter model name of the car : ");
        this.model_name = sc.next();
        System.out.println("Enter type of car : Suv,Hatchback,Sedan,Off-road,Premium,Sports etc..");
        this.type = sc.next();
        System.out.println("Enter number of seats car has : ");
        this.no_of_seats = sc.nextInt();

    }

}
class car_rental_system
{
    public static void main(String args[])
    {
        int n;
         Scanner sc=new Scanner(System.in);
          
        do
        {
            System.out.println("Enter the choice");
            System.out.println("1.Add a new car to database.");
            System.out.println("2.Search for a car in database.");
            System.out.println("3.Rent a car from database.");
            System.out.println("4.Exit");
          
            n=sc.nextInt();
            switch(n)
            {
                case 1:

        Car_Details cd = new Car_Details();
        cd.add_car();
        break;
            }
        }
        while(n!=4);

        sc.close();

    }
}