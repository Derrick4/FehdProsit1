public class ZooManagement {
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public ZooManagement(int nbrCages, String zooName) {
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }

    public void displayZooInfo() {
        String message = zooName + " comporte " + nbrCages + " cages";
        System.out.println(message);
    }


}
