public class basic {
   public static void main(String[] args){
    String str = "nitraj";
    String str1 = "nitraj";
    System.out.println(str);
    System.out.println("char at 2 is "+str.charAt(2));
    System.out.println("length is "+str.length());
    System.out.println("index of n is "+ str.indexOf('n'));
    System.out.println("comparision is  "+ str.compareTo(str1));
   }
}



//compare to :
/*
if str1==str2 , this will return 0
if str1 > str2 , if lexographically bigger then will return +(how many difference btw. two character)
if str1 < str2 , if lexographically small then will return -(how many difference btw. two character)


 */
