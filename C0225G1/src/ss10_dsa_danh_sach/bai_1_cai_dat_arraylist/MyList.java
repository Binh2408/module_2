package ss10_dsa_danh_sach.bai_1_cai_dat_arraylist;

public class MyList<E> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    Object[] elements;

    //Sức chứa mặc định khi khởi tạo bằng constructor ko có tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Sức chứa mặc định khi khởi tạo bằng constructor có tham số
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("Error Capacity");
        }
    }

    // thêm phần tử vào vị trí mình chọn
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (size == elements.length) {
            this.ensureCapacity(size*2);
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    //xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        E removedElement = (E) elements[index]; // Lưu phần tử bị xóa
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size] = null;
        size--;
        return removedElement;
    }

    //lấy số lượng phần tử
    public int size() {
        return this.size;
    }

    //Sao chép danh sách hiện tại
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>();
        newList.ensureCapacity(this.size);
        newList.size = this.size;
        for (int i = 0; i < size; i++) {
            newList.elements[i] = this.elements[i];
        }
        return newList;
    }

    //kiểm tra có chứa ko
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == null && o == null) {
                return true;
            }
            if (elements[i] != null && elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    //kiểm tra nằm ở vị trí nào
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == null && elements[i] == null) {
                return i;
            }
            if (o != null && o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    //thêm phần tử vào
    public boolean add(E o) {
        if (elements.length == size) {
            this.ensureCapacity(size*2);
        }
        elements[size] = o;
        size++;
        return true;
    }

    //tăng kích thước
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = this.elements.length*2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        }
    }

    //Lấy phần tử ở vị trí index
    //nếu chắc chắn nó đúng
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];


    }

    //xóa tất cả
    public void clear() {
        this.size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
