/*
Write a Program To validate a EmailID's?
Rules: 
1.First Character Should Be Alpha Numeric Symbol.
Regular Expressions for Any MailId's
1.t.satyanarayanareddy1@gmail.com  = [a-zA-Z0-9][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+
RE for Only Gmail
[a-zA-Z0-9][a-zA-Z0-9._]*@gmail[.]com
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateAEmailId {
public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    String str=s.next();
    Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
    Matcher m=p.matcher(str);
    int flag=0;
    while(m.find()) {
        flag=1;
    }
    if(flag==1)
        System.out.println("Valid");
    else 
        System.out.println("Not Valid");
}    
}

