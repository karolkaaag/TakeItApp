package mogielnicka.karolina.takeItApp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mogielnicka.karolina.takeItApp.model.Address;

@Repository
public interface AddressDAO extends CrudRepository<Address, Long> {

}
