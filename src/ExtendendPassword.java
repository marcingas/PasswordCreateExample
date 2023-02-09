public class ExtendendPassword extends Password {
    private int decryptedPassword;

    public ExtendendPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("saving password as " + this.decryptedPassword);
    }
}
