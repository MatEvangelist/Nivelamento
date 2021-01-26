package fundamentos.operadores;

public class DesafioAritmetico {

    public static void main(String[] args) {

        // int a = 3 * 4 - 10;
        // int b = (int) Math.pow(a, 3);
        // double c = Math.pow(a, 3);

        // System.out.println(b);
        // System.out.println(c);

        int a = 3 + 2;
        int b = 1 - 5;
        int c = 2 - 7;

        var d = 6 * a;
        var e = b * c;

        var f = Math.pow(d, 2);
        var g = e / 2;
        int h = 3 * 2;

        var i = f / h;
        var j = Math.pow(g, 2);

        var k = i - j;

        var l = Math.pow(k, 3);
        var m = Math.pow(10, 3);

        var n = l / m;

        System.out.println(n);

    }
}
