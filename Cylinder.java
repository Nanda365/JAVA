class Cylinder1{
    double radius;
    int height;
    public void setradius(double r){
         radius=r;
    }
    public void setheight(int n){
         height=n;
    }
    public double getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }
}
public class Cylinder{
public static void main(String[]args){
    Cylinder1 cy=new Cylinder1();
    cy.setradius(6.5);
    cy.setheight(25);
    System.out.println("Radius: "+cy.getradius());
    System.out.println("Height: "+cy.getheight());
    }
}