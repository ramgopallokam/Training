
public class Str {
public static void main(String[] args) {

String str=new String("Hello");
str.concat("World");
System.out.println(str);

//Thread safe
StringBuffer sb=new StringBuffer("Hello");
sb.append("World");
System.out.println(sb);

//1.5 Thread unsafe
StringBuilder sb1=new StringBuilder("Hello");
sb1.append("World");
System.out.println(sb1);


}
}
