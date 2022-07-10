package com.interview.powerledger.service;

import com.interview.powerledger.dto.SuburbDto;
import com.interview.powerledger.mapper.SuburbMapper;
import com.interview.powerledger.model.Suburb;
import com.interview.powerledger.repository.SuburbRepository;
import java.util.List;
import java.util.stream.Collectors;
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
    List<Suburb> suburbs = suburbDtos.stream().map(suburbMapper::toEntity)
        .collect(Collectors.toList());
    suburbRepository.saveAll(suburbs);
  }

  public void add(SuburbDto suburbDto) {
    suburbRepository.save(suburbMapper.toEntity(suburbDto));
  }

  public List<SuburbDto> getAll() {
    List<Suburb> suburbs = suburbRepository.findAll();
    return suburbs.stream().map(suburbMapper::toDto).collect(Collectors.toList());
  }
}
