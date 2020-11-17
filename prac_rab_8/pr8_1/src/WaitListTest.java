public class WaitListTest {
    public static void main(String[] args) {
        System.out.println("WaitList");
        WaitList<Integer> list1 = new WaitList<>();
        System.out.println("List: " + list1);
        System.out.println("isEmpty: " + list1.isEmpty());
        for (int i = 0; i < 5; i++) {
            list1.add(i);
            System.out.println(i + " was added to the list");
        }
        System.out.println("List: " + list1);
        System.out.println("isEmpty: " + list1.isEmpty());
        for (int i = 0; i < 2; i++) {
            list1.remove();
            System.out.println("The first element was deleted");
        }
        System.out.println("List: " + list1);
        System.out.println("isEmpty: " + list1.isEmpty());

        System.out.println();

        System.out.println("BoundedWaitList");
        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);
        System.out.println("List: " + list2);
        System.out.println("isEmpty: " + list2.isEmpty());
        for (int i = 5; i < 10; i++) {
            list2.add(i);
            System.out.println(i + " was added to the list");
        }
        System.out.println("List: " + list2);
        System.out.println("isEmpty: " + list2.isEmpty());
        for (int i = 0; i < 3; i++) {
            list2.remove();
            System.out.println("The first element was deleted");
        }
        System.out.println("List: " + list2);
        System.out.println("isEmpty: " + list2.isEmpty());

        System.out.println();

        System.out.println("UnfairWaitList");
        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();
        System.out.println("List: " + list3);
        System.out.println("isEmpty: " + list3.isEmpty());
        for (int i = 10; i < 19; i++) {
            list3.add(i);
            System.out.println(i + " was added to the list");
        }
        System.out.println("List: " + list3);
        System.out.println("isEmpty: " + list3.isEmpty());
        for (int i = 10; i < 14; i++) {
            list3.remove(i);
            System.out.println(i + " was deleted");
        }
        System.out.println("List: " + list3);
        System.out.println("isEmpty: " + list3.isEmpty());
        list3.moveToBack(16);
        System.out.println(16 + " was moved to back");
        System.out.println("List: " + list3);
        System.out.println("isEmpty: " + list3.isEmpty());
    }
}
