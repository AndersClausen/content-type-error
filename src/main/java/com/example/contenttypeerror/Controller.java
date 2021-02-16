package com.example.contenttypeerror;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/authentication")
@RequiredArgsConstructor
@Slf4j
public class Controller {

    @PostMapping(path = "/external", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<AuthenticationResponse> login(
            @ModelAttribute ExternalAuthenticationRequest externalAuthenticationRequest,
            @RequestParam(defaultValue = "false") Boolean secure
    ) {
        return Mono.just(AuthenticationResponse.builder().tokenId("token-id").authId("auth-id").isMultifactor(true).build());
    }

}
