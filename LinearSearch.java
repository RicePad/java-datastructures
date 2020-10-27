public static int linearSearch(int [] a, int x){
    int answer =  -1;

    for(i=0; i<a.length; i++){
        if(a[i] == x){
            answer = i
        }
    }
    return answer
}