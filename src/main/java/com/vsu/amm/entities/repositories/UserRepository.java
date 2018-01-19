package com.vsu.amm.entities.repositories;

import com.vsu.amm.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by antiz_000 on 11/19/2017.
 */

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
