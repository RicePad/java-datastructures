// understanding recursion 


public static void reduceByOne( int n){
    if( n >= 0){
        reduceByOne(n-1);
    }
    
    System.out.println("Completed Call: " + n);
}

public static int recursiveLinearSearch(int [] a, int i, int x){
    if( i > a.length -1 ){ // if evaluates to true, x was not found in the array
        return -1;
    } else if(a[i] == x){
        return i;
    } else{
        System.out.println("index at: " + i);
        return recursiveLinearSearch(a, i+1, x);
    }
}