public class Child extends Parent{

    public int attribute4;

    public Child() {     // Which are legal?
        attribute4 = 0;        // _________
        attribute1++;      	// _________
        attribute2++;      	// _________
        attribute3++;      	// _________
        attribute5++;      	// _________

        super.method1();     // _________
        method2();         	// _________

        setAttribute1(attribute4); // _____
    }

}
