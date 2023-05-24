package com.iiplabs.javapg.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiplabs.javapg.core.annotations.RestControllerAnnotation;
import com.iiplabs.javapg.core.reps.IAppUserRepository;

@RequestMapping("/api/v1")
@RestController
@RestControllerAnnotation
public class JavaPostgressRestController {

  @Autowired
  private IAppUserRepository appUserRepository;

}
