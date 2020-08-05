public class Meter{
    public static void main(String[]args){
        double meterConverter = 0.0254;
        int inches = 25;
        double inMeters = inches * meterConverter;
        System.out.println(inches + " inches is about " + inMeters + " Meters");
    }
}