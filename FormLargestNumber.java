//https://www.programcreek.com/2014/02/leetcode-largest-number-java/

class Solution {
    String printLargest(String[] arr) {
        
        Arrays.sort(arr,(a,b)->{return (b+a).compareTo(a+b);});
        
        StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
    // op: 0000-> 0
    
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();
    
     
    }
}
