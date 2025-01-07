public class ReplaceVowelWithAtTheRate {
  
   
        public static void main(String[] args) {
            
            String str = "Diksha Chaurasia";
            char[] str1 = {'a','e','i','o','u'};
            
            char[] s = str.toCharArray();
            
            for(int i=0; i<s.length; i++) {
                for(int j=0; j<str1.length; j++) {
                    if(s[i] == str1[j]) {
                        s[i] = '@';
                    }
                }
                
            }
            String a = new String(s);
            System.out.println(a);
    
        }
    
    }
    
    
    
    // D@ksh@ Ch@@r@s@@
    