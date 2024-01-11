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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Registration number of car : ( no spaces :) )");
        this.number = sc.next();
        System.out.println("Enter brand name of the car : ");
        this.brand = sc.next();
        System.out.println("Enter model of car : Suv,Hatchback,Sedan,Off-road,Premium,Sports etc..");
        this.type = sc.next();
        System.out.println("Enter number of seats car has : ");
        this.no_of_seats = sc.nextInt();
    }

}
class Car_Rental_System
{
    public static void main(String args[])
    {
        Car_Details cd = new Car_Details();
        cd.add_car();

    }
}