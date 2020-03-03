import java.util.ArrayList;
import java.util.Scanner;

class DemoArrayList{
    ArrayList<Integer> ar = new ArrayList<Integer>();

    void add(int element) {
        ar.add(element);
    }

    int get(int position) {
        return ar.get(position);
    }

    int position(int element) {
        return ar.indexOf(element);
    }

    void remove(int position) {
        ar.remove(ar.get(position));
    }

    void removelast() {
        ar.remove(ar.get(ar.size() - 1));
    }

    void print() {
        System.out.print(ar);
        System.out.println();
    }

}
public class List {

    public static void main(String args[])
    {
        DemoArrayList demoList=new DemoArrayList();
        Scanner sc=new Scanner(System.in);
        int ch;
        while (sc.hasNext())
        {
            ch=sc.nextInt();
            if(ch==1)
            {
                demoList.add(sc.nextInt());
            }
            else if(ch==2)
            {
                System.out.println("Element is: "+demoList.get(sc.nextInt()));
            }
            else if(ch==3)
            {
                System.out.println("Position is :"+demoList.position(sc.nextInt()));
            }
            else if(ch==4)
            {
                demoList.remove(sc.nextInt());
            }
            else if(ch==5)
            {
                demoList.removelast();
            }
            else
            {
                demoList.print();
            }
        }
    }
}
