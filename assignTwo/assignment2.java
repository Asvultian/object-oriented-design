package assignTwo;

/**
 * assignment2
 */
public class assignment2 {

    public static void main(String[] args) {
        MyDateClass obj = new MyDateClass();
        //set date values
        obj.setDate(5,25,00);
        // display date
        System.out.println(obj.getDate());
        // display name
        System.out.println("Steven and Jake");
    }
}
class MyDateClass{
    static int month, day, year;
    public static void setDate(int x, int y, int z){
        month=x;
        day = y;
        //converting to full year
        if (z>24)
            year = 1900+z;
        else
            year = 2000+z; 
    }
    public static String getDate(){
        
        
        String giveBack =  month + "/"+ day + "/" + year;
        return giveBack;
    }
}
