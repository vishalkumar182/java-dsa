package OOPS.Inheritance;

public class Constructor {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.play();
    }
    
}

class Baby {
    // baccha paida hote hi rona hai 
  Baby(){
      System.out.println("Baccha ro raha hai");
    }

    void play() {
        System.out.println("baby is playing");
}

}