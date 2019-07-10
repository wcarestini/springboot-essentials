package br.com.carestini.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.carestini.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
