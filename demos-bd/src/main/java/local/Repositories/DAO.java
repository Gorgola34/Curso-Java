package local.Repositories;
import java.util.*;
public interface DAO<E> {

   public List<E> findAll();
    <ID> Optional<E> findById(ID id);
    public E save(E entity);
    public  void update(E entity);
     public void delete (E entity);
    //<ID> void delete(ID id);
    }


