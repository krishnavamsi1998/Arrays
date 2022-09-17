//count even and odd to know the length -O(n) +
//create arrays of even length and odd length -O(1)
// sort both arrays -O(nlogn)
// push into orginal array- O(n)
// O(n)+O(n)+O(nlogn) , O(n)
class SeperateEvenOddSorted {
    void segregateEvenOdd(int arr[], int n) {
        
        int e=0;
        int o=0;
        for(int i:arr)
        {
            if(i%2==0)
            e++;
            else
            o++;
            
        }
        
        int[] earr=new int[e];
        int[] oarr=new int[o];
        int evenIndex=0;
        int oddIndex=0;
        
        for(int i:arr)
        {
            if(i%2==0)
            {
                earr[evenIndex]=i;
                evenIndex++;
            }
            else
            {
                oarr[oddIndex]=i;
                oddIndex++;
            }
        }
        
        //sort both arrays
        Arrays.sort(earr);
        Arrays.sort(oarr);
        //push into arr
        int index=0;
        for(int i:earr)
        {
            arr[index++]=i;
        }
        for(int i:oarr)
        {
            arr[index++]=i;
        }
        
        
    
    }
}
