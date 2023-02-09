public class Password {
    private static final int key = 745745;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

        private int encryptDecrypt(int password){
            return password ^ key;
        }
        public void storePassword() {
            System.out.println("saving password as " + this.encryptedPassword);

        }
        public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;

        } else {
            System.out.println("WRONG PASSWORD");
            return false;
        }

        }
    }

