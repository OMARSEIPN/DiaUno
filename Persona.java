public class Persona 
{
    String name;
    String sex;
    int age;

    public void walk()
    {
        System.out.println("is alive!!!");
    }

    public void eat(String food)
    {
        System.out.println(name+" having a nice meal with "+food);
    }

    public void beer(String brand)
    {
        if(age >= 18)
        {
            System.out.println("cheers mate have a:"+brand);     
        }
        else
        {
            System.out.println("So sorry");     
        }
    }

}

class Curso 
{
public static void main (String[] args)
    {
        Persona juan = new Persona ();
        juan.name= "JUAN PEREZ";
        juan.sex="everyday in shufflin";
        juan.age=18;
        System.out.println("My name is  "+juan.name);     
        juan.walk();
        juan.eat("KrabBurger");
        juan.beer("NegraModelo");

         
    }

}

