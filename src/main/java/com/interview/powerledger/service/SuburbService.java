package com.interview.powerledger.service;

import com.interview.powerledger.dto.Suburb;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SuburbService {

  public void addAll(List<Suburb> suburbs) {
    System.out.println("Suburbs added");
  }
}
