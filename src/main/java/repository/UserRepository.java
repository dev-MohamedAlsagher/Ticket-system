package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import domein.MyUser;

@Component
public interface UserRepository extends CrudRepository<MyUser, Long> {

	MyUser findByUsername(String username);
}

