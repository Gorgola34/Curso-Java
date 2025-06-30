package Products;

import Enums.Category;

public class Pet extends Product{

    public Pet(String reference, int volume, int weight) {
        super(reference, volume, weight);

    }

    @Override
    public Category getCategory() {
        return Category.PETS;
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

