import java.util.function.Predicate;
import java.util.function.Function;
public class T10 {
    public static void main(String[] args){
            Predicate <String> length=length1->length1.length()>=5;
            System.out.println(length.test("hello"));
            System.out.println(length.test("h"));
            Predicate <Integer> num=number->number>0;
            System.out.println(num.test(5));
            System.out.println(num.test(-1));
            Function <Integer,Integer> sq=sqrt->sqrt*sqrt;
            System.out.println(sq.apply(5));
            System.out.println(sq.apply(100));

    }
}
