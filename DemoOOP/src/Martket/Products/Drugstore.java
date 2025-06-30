package Products;

import Enums.Category;

public class Drugstore extends Product{

    public Drugstore(String reference, int volume, int weight) {
        super(reference, volume, weight);
    }

    @Override
    public Category getCategory() {
        return Category.DRUGSTORE;
    }

    @Override
    public boolean hasSpace(Products.IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasSpace'");
    }

    @Override
    public void putInto(Products.IContainer container) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putInto'");
    }

}
    

