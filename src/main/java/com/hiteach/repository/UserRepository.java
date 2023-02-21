package com.hiteach.repository;

import com.hiteach.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "select u.* from user u",nativeQuery = true)
    Page<User> findAll(Pageable pageable);

    @Query(value = "select u.* from user u where u.username = ?1 and u.password = ?2 and actived = 1", nativeQuery = true)
    Optional<User> findByUsernameAndPassword(String username, String password);

    @Query(value = "select u.* from user u where u.username = ?1", nativeQuery = true)
    Optional<User> findByUsername(String username);

    @Query(value = "select u.* from user u where u.id = ?1", nativeQuery = true)
    Optional<User> findById(Long id);

    @Query(value = "select count(id) from user WHERE email =?1", nativeQuery = true)
    Long countUserByEmail(String email);

    @Query(value = "select * from user WHERE activation_key =?1", nativeQuery = true)
    Optional<User> getUserByActivationKey(String activationkey);

    @Query(value = "select * from user WHERE email =?1", nativeQuery = true)
    Optional<User> getUserByEmail(String email);

    @Query(value = "select * from user WHERE remember_key =?1", nativeQuery = true)
    Optional<User> getUserByRememberKey(String key);

    @Query(value = "select * from user WHERE username =?1", nativeQuery = true)
    Optional<User> getUserByUserName(String username);

}
