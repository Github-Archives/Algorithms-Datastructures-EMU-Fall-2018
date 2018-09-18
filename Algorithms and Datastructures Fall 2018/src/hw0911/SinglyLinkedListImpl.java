//Drew Williams
//hw0911
//https://github.com/Drew-Williams/Algorithms-and-Datastructures-Fall-2018/blob/master/hw0906
//COSC 311

package hw0911;

class SinglyLinkedListImpl {

    Node start = null;
    Node end = null;
    int size = 0;

    public SinglyLinkedListImpl() {
        start = null;
        end = null;
        size = 0;
    }

    public void insertAtStart(double data) {
        Node nptr = new Node(data, null);
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
        size++;
    }
    
    public void insertAtEnd(double data) {
        Node nptr = new Node(data, null);
        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
        size++;
    }

    public void insertAtPosition(int position, int data) {
        Node nptr = new Node(data, null);
        Node ptr = start;
        position = position - 1;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                Node temp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void repleaceDataAtPosition(int position, int data) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        Node ptr = start;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                ptr.setData(data);
            }
            ptr = ptr.getLink();
        }
    }

    public void deleteAtPosition(int position) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (position == size) {
            Node startPtr = start;
            Node endPtr = start;
            while (startPtr != null) {
                endPtr = startPtr;
                startPtr = startPtr.getLink();
            }
            end = endPtr;
            end.setLink(null);
            size--;
            return;
        }

        Node ptr = start;
        position = position - 1;
        for (int i = 1; i < size; i++) {

            if (i == position) {
                Node temp = ptr.getLink();
                temp = temp.getLink();
                ptr.setLink(temp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }
    public void deleteNodeByGivenData(double data) {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (start.getData() == data && start.getLink() == null) {
            start = null;
            end = null;
            size--;
            return;
        }

        if (start.getData() == data && start.getLink() != null) {
            start = start.getLink();
            size--;
            return;
        }

        if (end.getData() == data) {
            Node startPtr = start;
            Node endPtr = start;

            startPtr = startPtr.getLink();
            while (startPtr.getLink() != null) {
                endPtr = startPtr;
                startPtr = startPtr.getLink();
            }
            end = endPtr;
            end.setLink(null);
            size--;
            return;
        }

        Node startPtr = start;
        Node prevLink = startPtr;
        startPtr = startPtr.getLink();
        while (startPtr.getData() != data && startPtr.getLink() != null) { //here
            prevLink = startPtr;
            startPtr = startPtr.getLink();
        }
        if (startPtr.getData() == data) {
            Node temp = prevLink.getLink();
            temp = temp.getLink();
            prevLink.setLink(temp);
            size--;
            return;
        }
        System.out.println(data + " not found!");
    }

    public void disply() {
        if (start == null) {
            System.out.println("Empty!");
            return;
        }

        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        Node ptr = start;
        System.out.print(ptr.getData() + "->");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + "->");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData() + "\n");
    }

    public void searchElementByPosition(int position) {
        if (position == 1) {
            System.out.println("Element at " + position + " is : " + start.getData());
            return;
        }

        if (position == size) {
            System.out.println("Element at " + position + " is : " + end.getData());
            return;
        }

        Node ptr = start;
        for (int i = 1; i < size; i++) {
            if (i == position) {
                System.out.println("Element at " + position + " is : " + ptr.getData());
                break;
            }
            ptr = ptr.getLink();
        }
    }

    public void searchElementIteratively(double data) {

        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }

        if (start.getData() == data) {
            System.out.println(data + " found at " + 1 + " position");
            return;
        }

        if (start.getLink() != null && end.getData() == data) {
            System.out.println(data + " found at " + size + " position");
            return;
        }

        Node startPtr = start;
        int position = 0;
        while (startPtr.getLink() != null) {
            ++position;
            if (startPtr.getData() == data) {
                break;
            }
            startPtr = startPtr.getLink();
        }
        if (startPtr.getData() == data) {
            System.out.println(data + " found at " + position);
            return;
        }

        System.out.println(data + " No found!");
    }

    public void searchElementRecursively(Node start, int data, int count) {

        if (isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        if (start.getData() == data) {
            System.out.println(data + " found at " + (++count));
            return;
        }
        if (start.getLink() == null) {
            System.out.println(data + " not found!");
            return;
        }
        searchElementRecursively(start.getLink(), data, ++count);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return start == null;
    }
}