import java.security.SecureRandom;

public class RandomBytesGenerator {
  public static byte[] generateRandomBytes512() {
    SecureRandom random = new SecureRandom();
    byte[] bytes = new byte[512];
    random.nextBytes(bytes);
    return bytes;
  }

  public static void main(String[] args) {
    byte[] randomBytes = generateRandomBytes512();
    // Handle or use the random bytes as needed
  }
}
