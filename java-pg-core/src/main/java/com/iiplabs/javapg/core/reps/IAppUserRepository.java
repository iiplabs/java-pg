package com.iiplabs.javapg.core.reps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.iiplabs.javapg.core.model.AppUser;

public interface IAppUserRepository
		extends JpaRepository<AppUser, Long>, JpaSpecificationExecutor<AppUser> {
}
