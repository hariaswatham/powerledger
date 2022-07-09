package com.interview.powerledger.controller;

import com.interview.powerledger.dto.Suburb;
import com.interview.powerledger.service.SuburbService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuburbController {

  private final SuburbService suburbService;

  public SuburbController(SuburbService suburbService) {
    this.suburbService = suburbService;
  }

  @PostMapping("/suburbs")
  public void add(List<Suburb> suburbs){
    suburbService.addAll(suburbs);
  }

}
