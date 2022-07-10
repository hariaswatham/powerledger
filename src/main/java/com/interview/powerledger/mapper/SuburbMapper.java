package com.interview.powerledger.mapper;

import com.interview.powerledger.dto.SuburbDto;
import com.interview.powerledger.model.Suburb;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SuburbMapper {
  Suburb toEntity(SuburbDto suburbDto);
  SuburbDto toDto(Suburb suburb);
}
