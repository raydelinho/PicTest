package sr.pic.test.service;

import sr.pic.test.dao.EntitieDao;
import sr.pic.test.entities.EntitieTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EntitieService {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");

    EntityManager entityManager = entityManagerFactory.createEntityManager();

    EntitieDao entitieDao = new EntitieDao(entityManager);

    public List<EntitieTest> all(){
        return entitieDao.all();
    }
}
