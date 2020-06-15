package sr.pic.test.dao;

import sr.pic.test.entities.EntitieTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class EntitieDao {

    private EntityManager entityManager;
    public EntitieDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public List<EntitieTest> all() {
        entityManager.getTransaction().begin();
        String jpql = "select e from EntitieTest e";
        TypedQuery<EntitieTest> jobTypedQuery = entityManager.createQuery(jpql, EntitieTest.class);
        List<EntitieTest> list = jobTypedQuery.getResultList();
        entityManager.getTransaction().commit();
        return list;
    }
}
