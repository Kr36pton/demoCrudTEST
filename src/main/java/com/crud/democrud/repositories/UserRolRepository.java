package com.crud.democrud.repositories;

import com.crud.democrud.models.UserRolModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRolRepository extends CrudRepository<UserRolModel, Long> {
}