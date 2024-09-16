public class numberthree {
    public static void main(String[]args){
        double radius=1731;
        double area;
        double volume;
        double density;
        area = 4*Math.pow(radius, 2)*3.14;
        volume = area*0.001;
        
        density = volume*3;

        System.out.println(density/4);
    }
}
