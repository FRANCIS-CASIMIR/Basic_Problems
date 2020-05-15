/*
===============================================================================================================================
------------------
problem statement:
------------------
    Given an array of integers 'a' of length 'n',find out the first repeating integer. Return -1 if no duplicate is found.

------------
Constraints:
------------
  The values of 'a' should be between 1 and n.
  
  
------------
Examples:
------------

1)if a = {1,3,4,3,2,1} the output is 3
2)if a = {1,2,3,4} the output is -1
===============================================================================================================================


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
