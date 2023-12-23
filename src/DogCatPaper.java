public class DogCatPaper {
    public static void main(String[] args){
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("cat="+cat+" dog="+dog+" paper="+paper);

        dog+=4;
        cat+=4;
        paper+=4;
        System.out.println("cat="+cat+" dog="+dog+" paper="+paper);

        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println("cat="+cat+" dog="+dog+" paper="+paper);
    }
}
