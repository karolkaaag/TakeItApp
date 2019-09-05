package mogielnicka.karolina.takeItApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mogielnicka.karolina.takeItApp.model.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {

}
