import cadastro.Person;

public class App
{
    public static void main(String[] args)
    {
        var male = new Person("John");
        var femele = new Person("Maria");

        male.setAge(25);

        System.out.println("Name: " + male.getName());
        System.out.println("Age: " + male.getAge());

        femele.setAge(23);

        System.out.println("Name: " + femele.getName());
        System.out.println("Age: " + femele.getAge());

    }
}
