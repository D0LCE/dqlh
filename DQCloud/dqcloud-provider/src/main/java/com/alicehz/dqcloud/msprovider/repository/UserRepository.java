package com.alicehz.dqcloud.msprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alicehz.dqcloud.msprovider.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>
{

}
