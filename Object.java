class Students{
    int id;
    String name;
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id=i;
    }
    public int getid(){
        return id;
    }
    public Students(int myid,String myname){
        id=myid;
        name=myname;
    }
}
public class Object{
    public static void main(String[]args){
        Students stu1=new Students(1,"nanda");
        System.out.println(stu1.getname());
        System.out.println(stu1.getid());
	Students stu2=new Students(2,"nanda");
        System.out.println(stu2.getname());
        System.out.println(stu2.getid());
    }
}