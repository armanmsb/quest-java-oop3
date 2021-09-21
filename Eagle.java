public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("Took off");
        this.flying = true;
    }

    @Override
    public int ascend(int meters) {

        if(isFlying()){
            this.altitude = this.altitude + meters;
            System.out.println(getName() + " is ascending to " + this.altitude + " meters");
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {

        if(isFlying()){
            this.altitude = this.altitude - meters;
            System.out.println(getName() + " is descending to " + this.altitude + " meters");
        }
        return this.altitude;

    }

    @Override
    public void land() {
        System.out.println(getName() + " is landing");
    }

    @Override
    public void glide() {
        Fly.super.glide();
    }
}
