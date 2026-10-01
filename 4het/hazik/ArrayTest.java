public class ArrayTest{
    public static void main(String[] args) {
        int[] szamok = {3, 4, 7, 1};
        System.out.println(MyArrayUtils.isSorted(szamok));

        System.out.println(MyArrayUtils.getMinElem(szamok));

        System.out.println(MyArrayUtils.getMaxElem(szamok));
    }
}