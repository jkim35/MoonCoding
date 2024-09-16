public class numberone{
    public static void main(String[]args){
        int distance = 380000;
        int hours;
        int minutes;
        int rate = 10;
        minutes = rate*60;
        hours = minutes*60;
        System.out.println("It will take "+(distance/hours)+" hours to get to the moon at this rate.");
    }
}