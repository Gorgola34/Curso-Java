package Containers;

import java.util.Set;

public abstract class Container implements IContainer {

    private String reference;
    protected int resistance;
    protected int height; 

    private Set<IProduct> products;

    public Container(String reference) {
        this.reference = reference;
    }

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public Set<IProduct> getProducts() {
        return products;
    }

    
    @Override
    public int calculateVolume() {
        return calculateSurface() * height; 
    }


    @Override
    public boolean canInsert(IProduct product) {
        // TODO Auto-generated method stub
        return false;
    }

    
    @Override
    public boolean isResistantTo(IProduct product) {
        // TODO Auto-generated method stub
        // resistance 
        return false;
    }
}
