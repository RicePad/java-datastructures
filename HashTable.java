//create a hash data structure
public class HashTable{
    String[] hashArray;
    int arraySize;
    int size = 0; //counter for number of elements in the hash table



    public HashTable(int nOfSlots){
        hashArray = new String[nOfSlots];
        arraySize = nOfSlots;
        
    }


    private boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++)
            if(num % i == 0){
                return false;
            }
        return true;
    }

    private int getNextPrime(int minNumber){
        for(int i = minNumber, true, i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    //Defines the index position 
    private int hashFunc1(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal < 0 ){
            hashVal += arraySize;
        }
        return hashVal;

    }

    //Defines Step Size in the array
    private int hashFunc2(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        if(hashVal < 0) {
            hashVal += arraySize;
        }

        return 3 - hashVal % 3;
    }

    public void insert(){

    }

    public String find(String word) {
        
    }

}