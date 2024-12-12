package abstractinterface;

interface Grandparent {
    void address();
}

class Parent implements Grandparent {
    public void address()
    {
        System.out.println("Delhi");
    }

    public static void main(String args) {
        Parent a1 = new Parent();
        a1.address();
    }
}