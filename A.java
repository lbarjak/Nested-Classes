class A {
 
    private int AA = 1;

    public static void main(String[] a) {

        new A();

    }

    A() { 
        new B(); 
    }
 
    class B {
     
        private int BB = 2;
 
        B() { 
            new C(); 
        }
 
        class C {
 
            private int CC = 3;
 
            C() { 
                System.out.println(AA + BB + CC); 
            } 
        } 
    } 
}
