package Java2.Furniture;

public class Chair extends Furniture {
    public Chair(String type) {
        this.type=type;
    }

    @Override
    public boolean getStressTestStatus() {
        return (type.equals("metal"));
    }

    @Override
    public boolean getFireTestStatus() {
        return (type.equals("metal"));
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public void result() {
        if (getStressTestStatus()) {
            System.out.println(this+" passed stress test");
        } else {
            System.out.println(this+" failed stress test");
        }
        if(getFireTestStatus()){
            System.out.println(this+" passed fire test");
        }
        else {
            System.out.println(this+" failed fire test");
        }
    }
}
