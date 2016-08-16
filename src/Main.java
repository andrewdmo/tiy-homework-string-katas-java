/**
 * Created by andrewdmo on 8/15/16.
 */

public class Main {

    public static void main(String[] args) {


        //Explode
        System.out.println("Explode!:\n");
        //Create instance:
        Kata expl = new Kata();
        //Print/input:
        System.out.println("Kata.explode(\"example\") => \"" + expl.explode("example") + "\"");
        System.out.println("Kata.explode(\"cat\") => \"" + expl.explode("cat") + "\"");
        System.out.println("Kata.explode(\"\") => \"" + expl.explode("") + "\"");
        System.out.println("Kata.explode(\"c\") => \"" + expl.explode("c") + "\"");
        System.out.println("Kata.explode(\"IndiaPaleAle\") => \"" + expl.explode("IndiaPaleAle") + "\"");
        System.out.println("Kata.explode(\"Panthers\") => \"" + expl.explode("Panthers") + "\"");
        System.out.println("Kata.explode(\"skyscraper\") => \"" + expl.explode("skyscraper") + "\"");


        //notString
        System.out.println("\n\nnotString:\n");
        Kata not = new Kata();
        System.out.println("Kata.notString(\"candy\") => \"" + not.notString("candy") + "\"");
        System.out.println("Kata.notString(\"not x\") => \"" + not.notString("not x") + "\"");
        System.out.println("Kata.notString(\"not bad\") => \"" + not.notString("not bad") + "\"");
        System.out.println("Kata.notString(\"no way, Jose!\") => \"" + not.notString("no way, Jose") + "\"");
        System.out.println("Kata.notString(\"no t even close\") = \"" + not.notString("no t even close") + "\"");
        System.out.println("Kata.notString(\"finished!\") = \"" + not.notString("finished!") + "\"");


        //missingCharacter
        System.out.println("\n\nmissingCharacter:\n");
        Kata word = new Kata();
        System.out.println("Kata.missingCharacter(\"kitten, 1\") = \"" + word.missingCharacter("kitten", 1) + "\"");
        System.out.println("Kata.missingCharacter(\"kitten, 0\") = \"" + word.missingCharacter("kitten", 0) + "\"");
        System.out.println("Kata.missingCharacter(\"kitten, 4\") = \"" + word.missingCharacter("kitten", 4) + "\"");
        System.out.println("Kata.missingCharacter(\"one, 2\") => \"" + word.missingCharacter("one", 2) + "\"");
        System.out.println("Kata.missingCharacter(\"loneliest, 0\") => \"" + word.missingCharacter("loneliest", 0) + "\"");
        System.out.println("Kata.missingCharacter(\"number, 4\") => \"" + word.missingCharacter("number", 4) + "\"");


        //frontBack
        System.out.println("\n\nfrontBack:\n");
        Kata fb = new Kata();
        System.out.println("Kata.frontBack(\"code\") => \"" + fb.frontBack("code") + "\"");
        System.out.println("Kata.frontBack(\"a\") => \"" + fb.frontBack("a") + "\"");
        System.out.println("Kata.frontBack(\"ab\") => \"" + fb.frontBack("ab") + "\"");
        System.out.println("Kata.frontBack(\"soccer\") => \"" + fb.frontBack("soccer") + "\"");
        System.out.println("Kata.frontBack(\"tennis\") => \"" + fb.frontBack("tennis") + "\"");
        System.out.println("Kata.frontBack(\"golf\") => \"" + fb.frontBack("golf") + "\"");


        //frontThree
        System.out.println("\n\nfrontThree:\n");
        Kata ft = new Kata();
        System.out.println("Kata.frontThree(\"Java\") => \"" + ft.frontThree("Java") + "\"");
        System.out.println("Kata.frontThree(\"chocolate\") => \"" + ft.frontThree("chocolate") + "\"");
        System.out.println("Kata.frontThree(\"abc\") => \"" + ft.frontThree("abc") + "\"");
        System.out.println("Kata.frontThree(\"USA!\") => \"" + ft.frontThree("USA!") + "\"");
        System.out.println("Kata.frontThree(\"encyclopedia\") => \"==" + ft.frontThree("encyclopedia") + "\"");
        System.out.println("Kata.frontThree(\"voodoo\") => \"" + ft.frontThree("bo") + "\"");


        //backAround
        System.out.println("\n\nbackAround:\n");
        Kata ba = new Kata();
        System.out.println("Kata.backAround(\"cat\") => \"" + ba.backAround("cat") + "\"");
        System.out.println("Kata.backAround(\"Hello\") => \"" + ba.backAround("Hello") + "\"");
        System.out.println("Kata.backAround(\"a\") => \"" + ba.backAround("a") + "\"");
        System.out.println("Kata.backAround(\"bogey\") => \"" + ba.backAround("bogey") + "\"");
        System.out.println("Kata.backAround(\"Maverick\") => \"" + ba.backAround("Maverick") + "\"");
        System.out.println("Kata.backAround(\"Goose!\") => \"" + ba.backAround("Goose!") + "\"");

        //front22
        System.out.println("\n\nfront22:\n");
        Kata f2 = new Kata();
        System.out.println("Kata.front22(\"kitten\") => \"" + ba.front22("kitten") + "\"");
        System.out.println("Kata.front22(\"Ha\") => \"" + ba.front22("Ha") + "\"");
        System.out.println("Kata.front22(\"abc\") => \"" + ba.front22("abc") + "\"");
        System.out.println("Kata.front22(\"Surfing...\") => \"" + ba.front22("Surfing") + "..." + "\"");
        System.out.println("Kata.front22(\"...offshore...\") => \"" + "..." + ba.front22("offshore") + "..." +"\"");
        System.out.println("Kata.front22(\"...rocks!!\") => \"" + "..." + ba.front22("rocks") + "!!" + "\"");


        //startOz
        System.out.println("\n\nstartOz:\n");
        Kata so = new Kata();
        System.out.println("Kata.startOz(\"ozymandias\") => \"" + so.startOz("ozymandias") + "\"");
        System.out.println("Kata.startOz(\"bzoo\") => \"" + so.startOz("bzoo") + "\"");
        System.out.println("Kata.startOz(\"oxx\") => \"" + so.startOz("oxx") + "\"");
        System.out.println("Kata.startOz(\"kitten\") => \"" + so.startOz("kitten") + "\"");
        System.out.println("Kata.startOz(\"zoo\") => \"" + so.startOz("zoo") + "\"");
        System.out.println("Kata.startOz(\"oy\") => \"" + so.startOz("oy") + "\"");
        System.out.println("Kata.startOz(\"Oy!\") => \"" + so.startOz("Oy!") + "\"");

        //endUp
        System.out.println("\n\nendUp:\n");
        Kata eu = new Kata ();
        System.out.println("Kata.endUp(\"Hello\") => \"" + eu.endUp("Hello") + "\"");
        System.out.println("Kata.endUp(\"hi there\") => \"" + eu.endUp("hi there") + "\"");
        System.out.println("Kata.endUp(\"hi\") => \"" + eu.endUp("hi") + "\"");
        System.out.println("Kata.endUp(\"bumblebee\") => \"" + eu.endUp("bumblebee") + "\"");
        System.out.println("Kata.endUp(\"h2o\") => \"" + eu.endUp("h2o") + "\"");
        System.out.println("Kata.endUp(\"D'oh!\") => \"" + eu.endUp("D'oh!") + "\"");
//
//        endUp("Hello") -> "HeLLO"
//        endUp("hi there") -> "hi thERE"
//        endUp("hi") -> "HI"


    System.out.println("\n-+-La fin!-+-");
    }
}