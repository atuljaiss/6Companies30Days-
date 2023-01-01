link - https://leetcode.com/problems/bulls-and-cows/submissions/869097104/

solution : 
class Solution {
    public String getHint(String secret, String guess) {
        int arr[] = new int[10];
        int nb=0,nc=0;
        for(int i=0;i<secret.length();i++){
            arr[secret.charAt(i)-'0']++;
        }
        for(int i = 0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i) ){
                nb++;
                if(arr[secret.charAt(i)-'0']<=0){
                    nc--;
                }else{
                    arr[secret.charAt(i)-'0']--;
                }
            }else{
                if(arr[guess.charAt(i)-'0']>0){
                    nc++;
                    arr[guess.charAt(i)-'0']--;
                }
            }
        }
        return (nb+"A"+nc+"B");
    }
}