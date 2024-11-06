package com.example.demo.security;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtTokenProvider {

	@Value("${demo.app.secret}")
	private String APP_SECRET;
	
	@Value("${demo.expires.in}")
	private long EXPIRES_IN;
	 SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	
	public String generateJwtToken(Authentication auth) {
		JwtUserDetails userDetails = (JwtUserDetails) auth.getPrincipal();
		Date expireDate = new Date(new Date().getTime() + EXPIRES_IN);
		return Jwts.builder().setSubject(Long.toString(userDetails.getId()))
				.setIssuedAt(new Date()).setExpiration(expireDate)
				.signWith(SignatureAlgorithm.HS512, APP_SECRET).compact();
	}
	
	public String generateJwtTokenByUserId(Long userId) {
		Date expireDate = new Date(new Date().getTime() + EXPIRES_IN);
		return Jwts.builder().setSubject(Long.toString(userId))
				.setIssuedAt(new Date()).setExpiration(expireDate)
				.signWith(SignatureAlgorithm.HS512, APP_SECRET).compact();
	}
	
	Long getUserIdFromJwt(String token) {
		Claims claims = Jwts.parser()            
				.setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
        return Long.parseLong(claims.getSubject());
        }
	
	boolean validateToken(String token) {
		try {
		    Jws<Claims> claims = Jwts.parser()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
            return !isTokenExpired(claims);
		} catch (SignatureException e) {
            return false;
        } catch (MalformedJwtException e) {
            return false;
        } catch (ExpiredJwtException e) {
            return false;
        } catch (UnsupportedJwtException e) {
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }
	}

    private boolean isTokenExpired(Jws<Claims> claims) {
        Date expiration = claims.getBody().getExpiration();
        return expiration.before(new Date());
    }

}
