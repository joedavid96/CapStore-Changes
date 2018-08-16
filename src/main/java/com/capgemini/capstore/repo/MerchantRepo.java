package com.capgemini.capstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Merchant;

public interface MerchantRepo extends JpaRepository<Merchant, Integer> {

}
