class Vechile{
    void start(){
        System.out.println("Vechile Start");
    }
    void stop(){
        System.out.println("Vechile Stop");
    }
}
class Car extends Vechile{
    void cstart(){
    System.out.println("Car Starts");
    }
}
class Bike extends Vechile{
    void bstart(){
    System.out.println("Bike Start");
    }
}
class Inheritence{
    public static void main(String[]args){
        Car c=new Car();
        c.cstart();
        c.start();
        c.stop();
        
        Bike b=new Bike();
        b.bstart();
        b.start();
        b.stop();
    }
}