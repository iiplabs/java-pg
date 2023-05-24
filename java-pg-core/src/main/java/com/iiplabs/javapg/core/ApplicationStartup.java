package com.iiplabs.javapg.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.iiplabs.javapg.core.reps.IAppUserRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

  @Autowired
  private IAppUserRepository appUserRepository;

  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {
    appUserRepository.findAll().stream().forEach(user -> log.info("Name: {}", user.getName()));
  }

}
