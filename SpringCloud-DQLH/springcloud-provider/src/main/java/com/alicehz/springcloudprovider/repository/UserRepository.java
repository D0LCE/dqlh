package com.alicehz.springcloudprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alicehz.springcloudprovider.entity.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * <p>
 * <p>
 * Modefied  Date
 * yuantli   2018-05-16 -  Creation
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
