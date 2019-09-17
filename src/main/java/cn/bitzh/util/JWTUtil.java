package cn.bitzh.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {
	public static final String jwtId = UUID.randomUUID().toString();

	public static String createJWT(String userId, String name, int access, String status) {
		System.out.println("**********************这是jwt" + jwtId);

		SignatureAlgorithm signAlm = SignatureAlgorithm.HS256;
		long nowMillis = System.currentTimeMillis();
		Date nowDate = new Date(nowMillis);
		Map<String, Object> claims = new HashMap<String, Object>();
		claims.put("Name", name);
		claims.put("userId", userId);
		claims.put("status", status);
		claims.put("access", access);
		SecretKey key = generalKey();
		JwtBuilder builder = Jwts.builder().setClaims(claims).setId(UUID.randomUUID().toString()).setIssuedAt(nowDate)
				.signWith(signAlm, key);
		Calendar calen = Calendar.getInstance();
		calen.setTime(nowDate);
		calen.add(Calendar.MINUTE, 30);
		long expMillis = nowMillis + calen.getTimeInMillis();
		Date exp = new Date(expMillis);
		builder.setExpiration(exp);
		return builder.compact();
	}

	public static SecretKey generalKey() {
		String stringKey = jwtId;
		byte[] encodedKey = Base64.decodeBase64(stringKey.getBytes());
		SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
		return key;
	}

	public static Claims parseJWT(String jwt) {
		SecretKey key = generalKey();
		Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(jwt).getBody();
		return claims;
	}
}
