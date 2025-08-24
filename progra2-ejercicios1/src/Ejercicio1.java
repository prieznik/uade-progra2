public class Ejercicio1 {

    /* EJ A
        int a = 2;
        a++;
        System.out.println(a); // 3
         */

        /* EJ B
        int a = 2;
        int b = a++;
        System.out.println(b); // el resultado es 2 ya que el incremento se realiza después de asignar el valor de a
        System.out.println(a); // ahora a pasa a valer 3, se modifica la variable original
        */

        /* EJ C
        int a = 2;
        int b = ++a;
        System.out.println(a); // 3
        System.out.println(b); // 3
         */

        /* EJ D
        int a = 2;
        int b = 1;
        b+= a;
        System.out.println(a); // 2
        System.out.println(b); // 3
         */

        /* EJ E
        int b = 1;
        b*= 5;
        System.out.println(b); // 5
         */

        /* EJ F
        int a = 2;
        int b = --a +5;
        System.out.println(a); // 1
        System.out.println(b); // 6
         */

        /* EJ G
        int b = 2;
        int a = b--;
        System.out.println(b); // 1
        System.out.println(a); // 2
         */

        /* EJ H
        int a = 2;
        int b = 3;
        int c = 5;
        a++; // a = 3
        b += a; // b = 6
        c *= b; // c = 30
        b -= 3; // b = 3
        a %= 2; // a = 1
        c /= 5; // c = 6
        System.out.println(a); // 1
        System.out.println(b); // 3
        System.out.println(c); // 6
         */

        /* EJ I
        int a = 1;
        int b = 2;
        b++; // b = 3
        b = ++a; // b = 2, a = 2
        a *= 2; // a = 4
        b += a; // b = 6
        a = ++b + 2; // a = 9, b = 7
        System.out.println(a); // 9
        System.out.println(b); // 7
         */

        /* EJ J
        int a = 1;
        int b = 4;
        a++; // a = 2
        b += a; // b = 6
        a *= 4; // a = 8
        b -= a; // b = -2
        ++b; // b = -1
        a = ++b; // a = 0, b = 0
        b = --a + b; // b = -1, a = -1
        System.out.println(a); // -1
        System.out.println(b); // -1
         */
}
