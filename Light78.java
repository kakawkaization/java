class Light78 {
    public static void main(String args[]) {
        int lightspeed;
        long days, seconds, distance;

        lightspeed = 186000;
        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.println("For " + days + " days light will pass about " + distance + " miles."); 
    }
}
