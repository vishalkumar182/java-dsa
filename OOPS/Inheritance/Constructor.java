package OOPS.Inheritance;

public class Constructor {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.play();
    }
    
}

class Baby {
    // constructor
  Baby(){
      System.out.println("Baccha ro raha hai");
    }
    // function

    void play() {
        System.out.println("baby is playing");
}

}