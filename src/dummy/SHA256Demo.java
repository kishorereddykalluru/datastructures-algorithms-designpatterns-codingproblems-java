package dummy;

import org.apache.commons.codec.digest.DigestUtils;

public class SHA256Demo {
    public static void main(String[] args) {
        /*String originalString = "This is a great tutorial.";
        String digest = DigestUtils.sha256Hex(originalString);
        System.out.println("759831720aa978c890b11f62ae49d2417f600f26aaa51b3291a8d21a4216582a ");
        System.out.println(digest);

*/
        String str = "kishore";

        String blockChainNo = "1";
        String nonce = "60474";
        String data = "I am here";

        String prevHash = "0000000000000000000000000000000000000000000000000000000000000000";

        String hash = DigestUtils.sha256Hex(blockChainNo + nonce + data + prevHash);

        System.out.println(hash);
        System.out.println("000020f1bbbac92e2239cc94d098bf6c8236cf869aeae8903eb8df0331f85126");

        String blockChainNo1 = "2";
        String nonce1 = "55354";
        String data1 = "you are there";

        String prevHash1 = "000020f1bbbac92e2239cc94d098bf6c8236cf869aeae8903eb8df0331f85126";

        String hash1 = DigestUtils.sha256Hex(blockChainNo1 + nonce1 + data1 + prevHash1);

        System.out.println(hash1);
        System.out.println("000078a976927ecac247c135fddf2c4745112e550d221cfc51d596176e7585d6");
        
        String subString = hash1.substring(0, 4);
        System.out.println("subString = " + subString);
        
    }
}
