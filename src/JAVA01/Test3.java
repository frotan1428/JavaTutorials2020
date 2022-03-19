package JAVA01;

class Test3
{
    public static void main(String args[])
    {

        int x = 5;// x can not be a
        for (int a = 0; a < 5; a++)//variable a is already defined in method go(int)
        {
            System.out.println(a);
        }
        int i = 20;
        System.out.println(i);
    }
}
