public class FrequencyOfCharacters {
    public static void main(String[] args){

        String str = "ddiiiikksssshhhaaa";
    
        char[] s = str.toCharArray();
        int n = s.length;
        boolean[] visited = new boolean[n];
    
        for(int i=0; i<n; i++){
    
            if(visited[i]){
                continue;
            }
    
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(s[i] == s[j]){
                    count++;
                    visited[j] =true;
                }
            }
            System.out.println(s[i] + " occurs " + count + " times.");
        }    
    
        
    }
    }
    

//  d occurs 2 times.
// i occurs 4 times.
// k occurs 2 times.
// s occurs 4 times.
// h occurs 3 times.
// a occurs 3 times.