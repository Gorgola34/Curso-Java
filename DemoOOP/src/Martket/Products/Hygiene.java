package Products;

public class Hygiene extends Product{

    public Hygiene(String reference, int volume, int weight) {
        super(reference, volume, weight);
    }

    @Override
    public Enums.Category getCategory() {
        return Enums.Category.HYGIENE;
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
    
