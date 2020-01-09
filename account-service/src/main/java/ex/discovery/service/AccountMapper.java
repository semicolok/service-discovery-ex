package ex.discovery.service;

import ex.discovery.controller.AccountResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AccountMapper {

    AccountResponseDto toAccountResponseDto(Account account);
}
