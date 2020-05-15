/*
#
#The Second version of firstDuplicate. Time Complexity is O(n)..
#
*/


int firstDuplicate1(int a[],int length){
    int index;

    for(int i=0;i<length;i++){
      
      index = fabs(a[i])-1;
      // Index that has to be checked for negative velue
      
      if (a[index]>0) a[index] = -(a[index]);
      else return fabs(a[i]);// duplicate found
    }
    return -1;// no duplicated found
}
