package jeongseok.practice;

import java.util.*;

public class MyVector implements List {

    Object[] data;
    int size = 0;
    int capacity = 0;

    MyVector(){
        this(10);
    }

    MyVector(int capacity){

        if(capacity < 0)
            throw new WrongInitSize("올바르지 않은 초기화 값입니다");


        this.data = new Object[capacity];
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return this.size;
    }

    public int capacity(){
        return this.capacity;
    }


    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }


    //구현
    @Override
    public boolean add(Object o) {

        int newSize = this.size+1;
        ensureCapacity(newSize);

        data[this.size] = o;
        this.size=newSize;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    //구현
    @Override
    public Object set(int index, Object element) {

        if(checkValidIndex(index)){
            throw new IndexOutOfBoundsException();
        }

        Object outElement = data[index];
        data[index] = element;
        return outElement;
    }

    private boolean checkValidIndex(int index){

        if(index < 0 || index >= this.size){
            return false;
        }

        return true;
    }


    //구현
    @Override
    public void add(int index, Object element) {

        if(!checkValidIndex(index)){
            throw new IndexOutOfBoundsException();
        }

        int newSize = this.size+1;
        ensureCapacity(newSize);

        int copyLength = newSize - (index+1);

        System.arraycopy(data,index,data,index+1, copyLength);
        data[index] = element;
        this.size = newSize;
    }

    //구현
    @Override
    public Object remove(int index) {

        Object rmObj = this.data[index];
        this.data[index] = null;

        if(index >= 0 && index < (this.size - 1))
        {
            int copyLength = this.size - (index + 1);
            System.arraycopy(this.data, index + 1, this.data, index, copyLength);
        }

        size--;

        return rmObj;
    }


    //구현
    @Override
    public int indexOf(Object o) {
        return 0;
    }


    //구현
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    //구현
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    //구현
    private void setCapacity(int capacity){

        Object[] newElement = new Object[capacity];

        System.arraycopy(data, 0, newElement, 0, this.size);

        this.data = newElement;
        this.capacity = capacity;
    }

    //구현
    public void setSize(int needSize){

        if(needSize > this.size)
        {
            ensureCapacity(needSize);
        }

        this.size = needSize;
    }

    //구현
    public void ensureCapacity(int needCapacity)
    {
        if(needCapacity > this.capacity)
        {
            setCapacity(needCapacity);
        }
    }

    //구현
    public String toString() {
        String str = "[";

        for(int i = 0; i < this.size; i++)
        {
            str += data[i];

            if(i != (this.size-1))
                str += ", ";
        }

        str += "]";
        return str;
    };


    public class WrongInitSize extends RuntimeException{

        WrongInitSize(String msg){
            super(msg);
        }
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);

        return result;
    }


    public boolean equals(Object o){ return false; }



}
