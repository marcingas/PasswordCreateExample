public class Main {
    public static void main(String[] args) {


        int pw = 674312;
        Password password = new ExtendendPassword(pw);

        password.storePassword();
        password.letMeIn(674312);




    }
}