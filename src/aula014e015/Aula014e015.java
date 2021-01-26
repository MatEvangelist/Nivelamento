package aula014e015;

public class Aula014e015 {

    public static void main(String[] args) {

        Video v [] = new Video[3];
        v[0] = new Video("Desce a Letra");
        v[1] = new Video("Quadro em Branco");
        v[2] = new Video("Flow Podcast");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Mathews", 21, "M", "Rakkner");
        g[1] = new Gafanhoto("Marilene", 48, "F", "Mari123");

        System.out.println("VIDEOS----------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        System.out.println("GAFANHOTOS------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0]= new Visualizacao(g[0], v[2]); // Mathews -> Flow Podcast
        vis[0].avaliar(87f);

        vis[1]= new Visualizacao(g[0], v[1]); // Mathews -> Quadro em Branco

        System.out.println(vis[0].toString());
        System.out.println("------------------");
        System.out.println(vis[1].toString());




    }
}
