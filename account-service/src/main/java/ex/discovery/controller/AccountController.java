package ex.discovery.controller;

import ex.discovery.service.Account;
import ex.discovery.service.AccountMapper;
import ex.discovery.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @GetMapping("/accounts")
    public ResponseEntity<AccountResponseDto> getAccounts() {
        final Account account = accountService.getAccounts();
        final AccountResponseDto accountResponseDto = accountMapper.toAccountResponseDto(account);

        return new ResponseEntity<>(accountResponseDto, HttpStatus.OK);
    }
}
