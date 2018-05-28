
/**
 *
 * @author Said
 */
public class passwortSchützen {
    
   public static String sha1(final String to_hash) throws NoSuchAlgorithmException {
final MessageDigest digest = MessageDigest.getInstance("SHA1");
final byte[] result = digest.digest(to_hash.getBytes());
final StringBuffer buffer = new StringBuffer();
for (int i = 0; i < result.length; i++) {
buffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
}
return buffer.toString();
}

public static String sha256(final String to_hash) throws NoSuchAlgorithmException {
final MessageDigest digest = MessageDigest.getInstance("SHA-256");
final byte[] result = digest.digest(to_hash.getBytes());
final StringBuffer buffer = new StringBuffer();
for (int i = 0; i < result.length; i++) {
buffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
}
return buffer.toString();
}

public static String md5(final String to_hash) throws NoSuchAlgorithmException {
final MessageDigest digest = MessageDigest.getInstance("md5");
final byte[] result = digest.digest(to_hash.getBytes());
final StringBuffer buffer = new StringBuffer();
for (int i = 0; i < result.length; i++) {
buffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
}
return buffer.toString();
}
}
