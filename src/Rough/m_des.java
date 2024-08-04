package Rough;


    import java.util.function.Function;

    public class m_des {

        public static String reverseBits(String bits) {
            return new StringBuilder(bits).reverse().toString();
        }

        public static String[] splitBits(String bits) {
            int mid = bits.length() / 2;
            return new String[]{bits.substring(0, mid), bits.substring(mid)};
        }

        public static String xor(String bits1, String bits2) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < bits1.length(); i++) {
                result.append(bits1.charAt(i) == bits2.charAt(i) ? '0' : '1');
            }
            return result.toString();
        }

        public static String applySBox(String bits, String[][] sbox) {
            int row = Integer.parseInt(bits.substring(0, 2), 2);
            int col = Integer.parseInt(bits.substring(2, 4), 2);
            return sbox[row][col];
        }

        public static String permute(String bits, int[] permutation) {
            StringBuilder result = new StringBuilder();
            for (int i : permutation) {
                result.append(bits.charAt(i));
            }
            return result.toString();
        }

        public static String mdesEncrypt(String plainText, String key) {
            // Convert plaintext to binary
            StringBuilder binaryPlain = new StringBuilder();
            for (char c : plainText.toCharArray()) {
                binaryPlain.append(String.format("%8s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
            }

            // Reverse initial permutation
            String permuted = reverseBits(binaryPlain.toString());

            // Split into LPT and RPT
            String[] split = splitBits(permuted);
            String lpt = split[0];
            String rpt = split[1];

            // Convert 16-bit key into 12-bit key by discarding last 4 bits of each block
            key = key.substring(0, 6) + key.substring(8, 14);

            String[][] sbox = {
                    {"1010", "0110", "1001", "0011", "0100", "1011", "0111", "1110"},
                    {"0000", "0001", "1111", "1100", "1101", "0110", "1000", "0110"},
                    {"1010", "0110", "1001", "0011", "0100", "1011", "0111", "1110"},
                    {"0000", "0001", "1111", "1100", "1101", "0110", "1000", "0110"}
            };

            int[] permutation = {1, 0, 3, 2, 5, 4, 7, 6};

            for (int i = 0; i < 4; i++) {
                // Extend RPT to 12 bits
                String extendedRpt = rpt + "0000";

                // XOR operation between RPT and the key
                String xorResult = xor(extendedRpt, key);

                // Apply S-Box substitutions
                StringBuilder substituted = new StringBuilder();
                for (int j = 0; j < xorResult.length(); j += 4) {
                    substituted.append(applySBox(xorResult.substring(j, j + 4), sbox));
                }

                // P-Box permutation
                permuted = permute(substituted.toString(), permutation);

                // XOR operation between RPT and LPT
                String xorLptRpt = xor(permuted, lpt);

                // Swap LPT and RPT
                lpt = rpt;
                rpt = xorLptRpt;
            }

            // Join LPT and RPT
            String joined = lpt + rpt;

            // Final permutation
            String finalResult = reverseBits(joined);

            return finalResult;
        }

        public static int hashFunction(int x) {
            return x >> 2;
        }

        public static int digitalSignature(int message, Function<Integer, Integer> privateKey) {
            int hashed = hashFunction(message);
            return privateKey.apply(hashed);
        }

        public static void main(String[] args) {
            String plainText = "Hi";
            String key = "1010101010101010";

            String cipherText = mdesEncrypt(plainText, key);
            System.out.println("Encrypted message: " + cipherText);

            // Example hash and digital signature generation
            int messageToSign = 123456;  // Example numerical message
            Function<Integer, Integer> privateKey = (x) -> x >> 3;

            int signature = digitalSignature(messageToSign, privateKey);
            System.out.println("Digital signature: " + signature);
        }
    }


