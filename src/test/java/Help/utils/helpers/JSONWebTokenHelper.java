package Help.utils.helpers;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JSONWebTokenHelper {
    public String generateAccessToken(String sharedSecret, Date issuedAtDate, Date expirationDate, String issuer, SignatureAlgorithm signatureAlgorithm) {
        final String compactJwt = Jwts.builder()
                .setIssuer(issuer)
                .setIssuedAt(issuedAtDate)
                .setExpiration(expirationDate)
                .signWith(signatureAlgorithm, sharedSecret.getBytes())
                .compact();

        return compactJwt;
    }
}
