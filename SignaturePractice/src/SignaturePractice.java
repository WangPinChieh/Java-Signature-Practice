/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.security.*;

/**
 *
 * @author Jay
 */
public class SignaturePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            NewJFrame _NJFrame = new NewJFrame();
            _NJFrame.setVisible(true);
            /*
            KeyPairGenerator _KeyGen = KeyPairGenerator.getInstance("RSA");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            _KeyGen.initialize(1024, random);
            KeyPair _Pair = _KeyGen.generateKeyPair();
            PrivateKey _PrivateKey = _Pair.getPrivate();
            byte[] _EncodedPrivateKey = _PrivateKey.getEncoded();
            FileOutputStream _PrivateKeyFOS = new FileOutputStream("C:/temp/Java/SignaturePractice/privateKey");
            _PrivateKeyFOS.write(_EncodedPrivateKey);
            _PrivateKeyFOS.close();
            PublicKey _PublicKey = _Pair.getPublic();
            byte[] _EncodedPublicKey = _PublicKey.getEncoded();
            FileOutputStream _PublicKeyFOS = new FileOutputStream("C:/temp/Java/SignaturePractice/publicKey");
            _PublicKeyFOS.write(_EncodedPublicKey);
            _PublicKeyFOS.close();
             
            Signature _Sig = Signature.getInstance("SHA256withRSA");
            _Sig.initSign(_PrivateKey);

            //FileOutputStream _PFO = new FileOutputStream()
            FileInputStream _FS = new FileInputStream("C:/temp/Java/SignaturePractice/MyFile.txt");
            BufferedInputStream _BIS = new BufferedInputStream(_FS);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = _BIS.read(buffer)) > 0) {
                _Sig.update(buffer, 0, len);
            }
            _BIS.close();
            _FS.close();

            byte[] _SignedDocument = _Sig.sign();
            FileOutputStream _FOS = new FileOutputStream("C:/temp/Java/SignaturePractice/MySignedFile.txt");
            _FOS.write(_SignedDocument);
            _FOS.close();
             */
        } catch (Exception exp) {
            String _ErrorInfo = exp.getMessage();
            System.out.println(_ErrorInfo);
        }
    }

}
