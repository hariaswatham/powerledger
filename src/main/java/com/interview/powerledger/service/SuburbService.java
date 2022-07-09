package com.interview.powerledger.service;

import com.interview.powerledger.dto.SuburbDto;
import com.interview.powerledger.mapper.SuburbMapper;
import com.interview.powerledger.repository.SuburbRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SuburbService {

  private final SuburbRepository suburbRepository;
  private final SuburbMapper suburbMapper;

  public SuburbService(SuburbRepository suburbRepository, SuburbMapper suburbMapper) {
    this.suburbRepository = suburbRepository;
    this.suburbMapper = suburbMapper;
  }

  public void addAll(List<SuburbDto> suburbDtos) {
    System.out.println(suburbDtos);
  }

  public void add(SuburbDto suburbDto) {
    suburbRepository.save(suburbMapper.toEntity(suburbDto));
  }
}
