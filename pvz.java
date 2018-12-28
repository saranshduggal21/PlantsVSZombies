
/**
 * Write a description of class pvz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pvz
{
    public static void main (String args [])
    {
        new pvz ();
}
public pvz ()
{
    String plants [] = new String [20];
    plants[0] = "Sunflower";
    plants[1] = "Pea Shooter";
    plants[2] = "Cherry Bomb";
    plants[3] = "Wall-Nut";
    plants[4] = "Potato Mine";
    plants[5] = "Snow Pea";
    plants[6] = "Chomper";
    int num = 7;
    for (int i=0; i<7; i++)
    System.out.println (plants[i]);
    System.out.println (" ");
    
    double sunlight [] = new double [20];
    sunlight[0] = 50;
    sunlight[1] = 100;
    sunlight[2] = 150;
    sunlight[3] = 50;
    sunlight[4] = 25;
    sunlight[5] = 175;
    sunlight[6] = 150;
    int num2 = 7;
    for (int i=0; i<7; i++)
    System.out.println (sunlight[i]);
    System.out.println (" ");
    
    char cont = 'a';
    while (cont != 'd')
    {
        System.out.println ("\n(a) Add a plant and sunlight");
        System.out.println ("(b) Delete a plant and sunlight");
        System.out.println ("(c) Find the average");
        System.out.println ("(d) Quit");
        cont = IBIO.inputChar ("\nPlease choose from the options above:");
        
        if (cont == 'a')
        {
            String add = IBIO.inputString ("What plant would you like to add?");
            double add2 = IBIO.inputDouble ("How much sunlight for the plant would you like to add?");
            plants [num] = add;
            num++;
            sunlight [num2] = add2;
            num2++;
            
            System.out.println ("\n Plant List:");
            for (int i = 0; i<num; i++)
            System.out.println ((i+1) + " " + plants[i]);
            
            System.out.println ("\n Sunlight List:");
            for (int i = 0; i<num2; i++)
            System.out.println ((i+1) + " " + sunlight[i]);
        }
        
        if (cont == 'b')
        {
            String delete = IBIO.inputString ("What plant would you like to delete?");
           
            int pos = -1;
            for (int i=0; i<num; i++)
            {
                if (delete.equals (plants[i]))
                {
                pos = i;
            }
            }
            if (pos == -1)
            System.out.println ("Sorry it is not in the array.");
            else 
            {
                num--;
                for (int i=pos; i<num; i++)
                {
                plants [i] = plants [i+1];
                sunlight [i] = sunlight [i+1];
            }
            System.out.println ("\n Plants and Sunlight List:");
            for (int i = 0; i<num; i++)
            System.out.println ((i+1) + " " + plants[i]);
            for (int i = 0; i<num; i++)
            System.out.println ("\n" + (i+1) + " " + sunlight[i]);
            
            
        }
}

if (cont == 'c')
{
    double sum = 0;

        for (int i = 0; i<sunlight.length; i++)
        {
            
            sum += sunlight[i];
        }
        
        double average = sum/sunlight.length;
        System.out.println ("The average of all the sunlight is:" + average);
}
}
}
}

