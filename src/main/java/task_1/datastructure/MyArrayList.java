package task_1.datastructure;


import task_1.StillNotReadyCoreException;

public class MyArrayList {
    private int[] baseArray;
    private final int capacity = 10;
    private int index;

    public MyArrayList() {
        baseArray = new int[capacity];
        this.index = 0;
    }

    public boolean add(int x) throws StillNotReadyCoreException {
        boolean result = false;
        if (baseArray.length <=10){
            baseArray[index] = x;
            index++;
            result = true;
        } else {
            throw new StillNotReadyCoreException();
        }
        return result;
    }

    public boolean delete(int element) {
        boolean result = false;
        for (int x = 0; x < baseArray.length; x++) {
            if (element == baseArray[x]) {
                System.arraycopy(baseArray,x+1,baseArray,x,baseArray.length-x-1);
                index--;
                result = true;
                break;
            }
        }
        return result;
    }

    public int indexOf(int index){
        int result = -1;
        if (this.index >=index){
            for (int x = 0; x < baseArray.length; x++) {
                if (x == index) {
                    return baseArray[x];
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("please check the index");
        }
        return result;
    }

    public boolean update(int index, int element) {
        boolean result = false;
        if (this.index >=index) {
            for (int x = 0; x < baseArray.length; x++) {
                if (x==index){
                    baseArray[x] = element;
                    result = true;
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("please check the index");
        }
        return result;
    }

    public int size() {
        int result = 0;
        if (index == 0) {
            return result;
        } else {
            return index;
        }
    }

    public static void main(String[] args) throws StillNotReadyCoreException {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        System.out.println(myArrayList.size());
        myArrayList.delete(6);
        System.out.println(myArrayList.size());
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        myArrayList.add(15);
        System.out.println(myArrayList.size());
        int result = myArrayList.indexOf(4);
        System.out.println(result);
        System.out.println(myArrayList.update(4,12));
        System.out.println(myArrayList.indexOf(4));
    }

}
