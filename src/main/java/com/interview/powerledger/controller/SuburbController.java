package com.interview.powerledger.controller;

import com.interview.powerledger.dto.SuburbDto;
import com.interview.powerledger.service.SuburbService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuburbController {

  private final SuburbService suburbService;

  public SuburbController(SuburbService suburbService) {
    this.suburbService = suburbService;
  }

  @PostMapping("/suburbs")
  public void addAll(@RequestBody List<SuburbDto> suburbs){
    suburbService.addAll(suburbs);
  }

  @PostMapping("/suburb")
  public void add(@RequestBody SuburbDto suburb){
    suburbService.add(suburb);
  }

}
