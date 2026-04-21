// public class string {
//     public static void main(String[] args) {
//         String email = "me@vishadjain.in";

//         String username = email.substring(0,2);
//         String at = email.substring(2,3);
//         String domain = email.substring(3,16);


//         System.out.println("Username: " + username);
//         System.out.println("At: " + at);
//         System.out.println("Domain: " + domain);

//         System.out.println("Mail: " + email);

//     }
// }


//to make it flexible

public class string {
    public static void main(String[] args) {
        String email = "Bro@vishadjain.in";

        String username = email.substring(0, email.indexOf("@"));
        String at = email.substring(email.indexOf("@") , email.indexOf("@") + 1);
        String domain = email.substring(email.indexOf("@") + 1);


        System.out.println("Username: " + username);
        System.out.println("At: " + at);
        System.out.println("Domain: " + domain);

        System.out.println("Mail: " + email);

    }
}