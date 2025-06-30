package Products;

public class Food extends Product {

    public Food(String reference, int volume, int weight) {
        super(reference, volume, weight);
    }

    @Override
    public Enums.Category getCategory() {
        return Enums.Category.FOOD;
    }

    @Override
    public boolean hasSpace(IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasSpace'");
    }

    @Override
    public void putInto(IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putInto'");
    }

}
    
