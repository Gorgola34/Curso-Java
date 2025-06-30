package Products;

public interface IProduct {

    // Getters

    String getReference();
    int getWeight();
    int getVolume();
    Enums.Category getCategory();
    
    // Lógica de negocio

    boolean isCompatible(IProduct p);
    boolean hasSpace(IContainer container);
    void putInto(IContainer container);
}
    
