import java.util.HashMap;

public class UniqueEmail {
    public static void main(String[] args) {
        UniqueEmail emailUnique = new UniqueEmail();

        String emails[] = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int uniqueEmails = emailUnique.findUniqueEmail(emails);

        System.out.println(uniqueEmails);
    }

    public int findUniqueEmail(String[] emails)
    {
        int unique = 0;
        HashMap<Integer, String> map = new HashMap<>();

        for (String email : emails) 
        {
            String id = "";
            for (int i = 0; i < email.length(); i++) 
            {
                if()                
            }
        }
        return unique;
    }
}
