package local.Repositories;

import java.util.List;
import java.util.Optional;



import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import local.connections.EntityManagerProvider;
import local.entities.Meeting;

public abstract class AbstractDAO<E> implements DAO<E> {


    EntityManager entityManager;
    Class<E> entityClass;

    public AbstractDAO(Class<E> entityClass, EntityManager entityManager){
        entityManager=EntityManagerProvider.getEntityManager();
        this.entityClass=entityClass;
        this.entityManager=entityManager;

    }

    public AbstractDAO(EntityManager entityManager){
        this.entityManager=entityManager;

    }

    public AbstractDAO(Class<Meeting> class1) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public List<E> findAll() {
        String finalSQL="FROM" + entityClass.getCanonicalName();
        Query q= entityManager.createQuery(finalSQL);
        return entityManager.createQuery(finalSQL,entityClass).getResultList();
    }

    @Override
    public <ID> Optional<E> findById(ID id) {


        return Optional.ofNullable(entityManager.find(entityClass, id));
    }

    @Override
    public E save(E entity) {
        entityManager.persist(entity);
        return entity;

    }
    @Override
    public void update(E entity) {
        
        entityManager.merge(entity);
    }

    @Override
    public void delete(E entity) {
        entityManager.remove(entity);


    }

}
