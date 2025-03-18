package revision;

public class LightSpeedDistance {
    public static void main(String[] args) {
        int lightspeed ;
        long days ;
        long second ;
        long distance ;
        lightspeed = 186000 ;
        days = 1000 ;
        second = days * 24 * 60 * 60 ;
        distance = lightspeed * second ;
        System.out.println("in "+ days + " days light will travel about "+ distance +" miles");
    }
}
