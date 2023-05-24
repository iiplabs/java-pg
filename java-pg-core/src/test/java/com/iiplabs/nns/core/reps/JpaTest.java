package com.iiplabs.javapg.core.reps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.iiplabs.javapg.core.App;
import com.iiplabs.javapg.core.reps.IAppUserRepository;

@ActiveProfiles("dev")
@ContextConfiguration(classes = App.class)
@DataJpaTest
public class JpaTest {

	@Autowired
	private IAppUserRepository appUserRepository;

	@Test
	void injectedComponents() {
		assertThat(appUserRepository).isNotNull();
	}

}