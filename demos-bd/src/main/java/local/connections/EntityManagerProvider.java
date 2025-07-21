package local.connections;

import java.util.*;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerProvider {

    private final static String PERSISTENCE_UNIT="demos-bd";

    private static EntityManagerFactory entityManagerFactory;

 static {

     entityManagerFactory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

}

public static EntityManager getEntityManager(){
    return entityManagerFactory.createEntityManager();
}
public static Map<String,String> getProps(){
    Map<String,String> props= new HashMap<>();
    Dotenv dotEnv=Dotenv.load();
    props.put("jakarta.persistence.jdbc.url", dotEnv.get("URL"));
    props.put("jakarta.persistence.jdbc.user",dotEnv.get("USER"));
    props.put("jakarta.persistence.jdbc.password",dotEnv.get("PASSWORD"));
    dotEnv.get("URL");
    dotEnv.get("USER");
    dotEnv.get("PASSWORD");
    return props;
}

static {
    entityManagerFactory=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT,getProps());
}

public static void main(String[] args) {
    getEntityManager();
}



}
