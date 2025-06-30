package Containers;

public class Bag extends Container {

    private int length;
    // private int width;
   

    public Bag(String reference, int length, int height, int resistance) {
        super(reference);
        this.length = length;
        this.height = height;
        this.resistance = resistance;
    }

    @Override
    public ContainerType getType() {
        return ContainerType.BAG;
    }

    private int calculateDiameter() {
        return (int) ((2 * length) / Math.PI);
    }

    @Override
    public int calculateSurface() {
        int radio = calculateDiameter() / 2;
        return (int) (Math.PI * radio * radio);
    }



    @Override
    public boolean isResistantTo(IProduct product) {
        return false;
    }

    @Override
    public int volumeDisposable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volumeDisposable'");
    }
    



}
    

