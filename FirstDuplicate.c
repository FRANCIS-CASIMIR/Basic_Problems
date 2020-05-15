/*

Returns the first repeating number .If no repeating number exists, returns -1;
it is a brute force version; Time complexity O(n*n);

*/
int firstDuplicate(int a[],int length){

  int minimumindex=length;

    for(int i=0;i<=length-1;i++){
      for (int j = i+1; j <length; j++) {
        if(a[i]==a[j] && j<minimumindex) minimumindex = j;
      }
    }

    if(minimumindex==length) return -1;// no repeating character found
    else return a[minimumindex];
}
