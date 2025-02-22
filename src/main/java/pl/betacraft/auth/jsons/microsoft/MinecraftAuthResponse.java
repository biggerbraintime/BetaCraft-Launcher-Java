package pl.betacraft.auth.jsons.microsoft;

import java.util.UUID;

public class MinecraftAuthResponse extends MinecraftErrorResponse {

	public UUID username;
	public String[] roles;
	public String access_token;
	public String token_type;
	public String expires_in;
}
