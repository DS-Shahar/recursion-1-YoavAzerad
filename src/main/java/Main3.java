public class Main {
    public static void main(String[] args)  {
        int factorial = f(6);
        int sum = s(5);
        int excer3 = ex3(7);
        int excer4 = ex4(20);
        int excer5 = ex5(24, 4);
        int excer6 = ex6(15, 4);
        boolean excer7 = ex7(20, 4);
        boolean excer8 = ex8(6, 7);
        boolean excer9 = ex9(824);
        System.out.println("sum: " + sum);
        System.out.println("factorial: " + factorial);
        System.out.println("ex3:" + excer3);
        System.out.println("ex4:" + excer4);
        System.out.println("ex5:" + excer5);
        System.out.println("ex6:" + excer6);
        System.out.println("ex7:" + excer7);
        System.out.println("ex8:" + excer8);
        System.out.println("ex9:" + excer9);
    }

    public static int s(int n) {
        if (n==0) {
            return 0;
        }
        return n+s(n-1);
    }

    public static int f(int n) {
        if (n==0) {
            return 1;
        }
        return n*f(n-1);
    }

    public static int ex3(int n) {
        if (n==0) {
            return 1;
        }
        if (n%2==0) {
            return ex3(n-1);
        }

        return n*ex3(n-1);
    }

    public static int ex4(int n) {
        if (n<10) {
            return 1;
        }
        return 1+ex4(n/10);
    }

    //שני מספרים שלמים מחזירה את המנה שלהם ע"י פעולות חיבור וחיסור בלבד

    public static int ex5(int n1, int n2) {
        if (n1<n2) {
            return 0;
        }
        if (n1==0) {
            return 0;
        }

        return 1+ex5(n1-n2, n2);
    }

    //הפעולה תחזיר את השארית במקום מנה %

    public static int ex6(int n1, int n2) {
        if (n1<n2) {
            return n1;
        }
        if (n1==0) {
            return 0;
        }

        return ex6(n1-n2, n2);
    }

    public static boolean ex7(int x, int y) {
        if (x==0) {
            return true;
        }
        if (x<y) {
            return false;
        }

        return ex7(x-y, y);

    }

    public static boolean ex8(int n_minus_one, int n) {
        if (n==1) {
            return false;
        }
        if (n_minus_one==1) {
            return true;
        }
        if (n%(n_minus_one)==0) {
            return false;
        }

        return ex8(n_minus_one-1, n);
    }

    public static boolean ex9(int n) {
        if (n==0) {
            return true;
        }
        if (n%2!=0) {
            return false;
        }
        return ex9(n/10);
    }

    





}
