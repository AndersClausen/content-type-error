package com.example.contenttypeerror;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class AuthenticationResponse {

	private String tokenId;
	private boolean isMultifactor;
	private String authId;

}
