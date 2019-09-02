import java.util.Arrays;

class ArrayList{
    private int size = 0; //몇개의 데이터가 list에 들어있는가
    private int arrLen = 10;
    private Object[] elementData = new Object[arrLen]; //list가 수용할수있는 최대 data 수


    public boolean addLast(Object element){
        if(size == arrLen){
            checkArr();
    }   elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int index , Object element){

        for(int i = size -1; i >= index; i--){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public boolean addFirst( Object element){
        return add(0,element);
    }
//객체를 문자로 출력할때 toString 메소드가 출력되도록 약속되어있다.
    public String toString(){
        String str = "[";
        for(int i = 0; i < size ; i++){
                str += elementData[i];
                if(i < size-1){
                    str += ",";
                }
            }

        return str + "]";
    }

    public Object remove(int index){
        Object removed = elementData[index];
        for(int i = index+1; i <= size-1; i ++){
            elementData[i-1] = elementData[i];
        }
       size --;
        elementData[size] = null;
        return removed;
    }

    public int size() {
        return size;
    }

    //배열이 꽉차면 2배로 늘림
   public void checkArr() {
        Object[] newArr = new Object[arrLen];
        for(int i = 0; i < elementData.length; i++){
            newArr[i] = elementData[i]; }

        arrLen = arrLen*2;
        elementData = new Object[arrLen];
        elementData = Arrays.copyOf(newArr,arrLen);
    }

}
