package nyc.c4q.lighterletter.com.company;

public class whatIf {

    public static void main(String[] args) {

        int people = 20;
        int cats = 30;
        int dogs = 15;

        if ( people < cats);
        {
            System.out.println("Too many cats, the world is doomed!");
        }
        if ( people > cats );
        {
            System.out.println("Not many cats, the world is saved!");
        }
        if (people < dogs);
        {
            System.out.println("The world is drooled on!");
        }
        if (people > dogs);
        {
            System.out.println("The world is dry!");
        }
        dogs +=5;
        if ( people >= dogs);
        {
            System.out.println("People are greater than or equal to dogs!");
        }
        if (people <= dogs);
        {
            System.out.println("people are less than or equal to dogs!");
        }
        if (people == dogs);
        {
            System.out.println("people are dogs!");

        }
	// write your code here
    }
}
