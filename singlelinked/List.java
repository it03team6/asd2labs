package ua.kpi.fict.acts.it03.asdlabs.lab1.singlelinked;

public class List {
    private ListElement head;
    private ListElement tail;

    // ###################### ADDING #######################

    void addFront(int data)
    {
        ListElement a = new ListElement();
        a.data = data;
        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void addBack(int data) {          //добавление в конец списка
        ListElement a = new ListElement();  //создаём новый элемент
        a.data = data;
        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        } else {
            tail.next = a;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = a;               //а в указатель на последний элемент записываем адрес нового элемента
        }

    }

    public void addAt(int position, int data){
        ListElement node = new ListElement();
        node.data = data;
        node.next = null;

        if (this.head == null) {
            if (position != 0) {
                return;
            } else {
                this.head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }

        ListElement current = this.head;
        ListElement previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        node.next = current;
        previous.next = node;
    }


    void printList()
    {
        ListElement t = this.head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    // ###################### DELETING ##########################

    void delFirst()
    {
        head = head.next;
    }


    void delLast()
    {
        ListElement tmp = this.head;
        ListElement prev = null;
        while (tmp.next != null)
        {
            prev = tmp;
            tmp = tmp.next;
        }
        prev.next = null;
    }

    void delEl(int data)
    {
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        ListElement t = head;
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data == data) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                return;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
    }

    // ##################### REPLACE #####################

    void replaceFirst(int obj)
    {
        head.data = obj;
    }

    void replaceLast(int obj)
        {
           ListElement a = new ListElement();
           a.data = obj;
           tail.data = a.data;
        }


    public void replaceAt(int position, int data){
        ListElement node = new ListElement();
        node.data = data;
        node.next = null;

        if (this.head == null) {
            if (position != 0) {
                return;
            } else {
                this.head = node;
            }
        }

        if (head != null && position == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }

        ListElement current = this.head;
        ListElement previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        current.data = node.data;
        previous.next.data = current.data;
    }

    // ### INDEX OF ###
    public int indexOf(int obj) {
        int index = 0;
        ListElement current = this.head;
        while (current != null) {
            if (current.data == obj) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;
    }

    // ### SUM ###

    int sumOfList()
    {
        int result = this.head.data;
        ListElement t = this.head;
        while (t != null)
        {
            if (t.next == null)
                break;
            else
            result = result + t.next.data;
            t = t.next;
        }
        return result;
    }
}
