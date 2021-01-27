public class Phone {
    private String phoneNumber;
    private boolean connected;
    private long seconds;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.connected =  true;
        this.seconds = 777;
    }

    public boolean makeCall(Phone personToCall) {
        if (!personToCall.connected && !this.connected) {
            personToCall.connected = this.connected = true;
            seconds = System.currentTimeMillis();
            /*** NOTE: System.currentTimeMillis() returns the number of milliseconds
             since midnight, January 1, 1970 ***/
            return true;
        }
        return false;
    }

    public String toString() {
        /*** implementation not shown ***/
    /*return "phone is " + phoneNumber + ", connected is "
            + connected + ", seconds are " + seconds;*/
        return "The number " + this.phoneNumber + " is " + (this.connected?"":"not") + " currently connected";

    }
    public static void main (String[] args){
        Phone myPhone = new Phone("8035088025");
        System.out.println("myPhone seconds are " + myPhone.seconds);
        System.out.println(myPhone);
    }
}
