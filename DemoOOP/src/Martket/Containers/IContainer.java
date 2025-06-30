package Containers;

import java.util.Set;

public interface IContainer {

    // Getters

	String getReference();
	//int getResistance();
	ContainerType getType();
	Set<IProduct> getProducts();
    

    // Propiedades calculadas

    int calculateSurface();
	int calculateVolume();
    
    // Lógica de negocio
	int volumeDisposable();

	boolean canInsert(IProduct product);
	boolean isResistantTo(IProduct product);
}
    

