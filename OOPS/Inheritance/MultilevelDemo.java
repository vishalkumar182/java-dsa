package OOPS.Inheritance;

public class MultilevelDemo {
    public static void main(String[] vkis) {
        Me vk = new Me();
        vk.bike();
        vk.gold();
        vk.house();
    }
}

class Grandfather {
    void gold() {
        System.out.println("Dada ji ke pass 1kg Gold hai");
    }
}

class Father  extends Grandfather {
    void house() {
        System.out.println("Papa ka 3BHK house hai");

    }

}

class Me extends Father {
    void bike() {
        System.out.println("Mere pass sports bike hai ");
    }
}

class Mom  extends Me{
    void Silver() {
        System.out.println("Mummy ke pass 3 kg siver hai");
  }
}