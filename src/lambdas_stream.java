import java.util.List;

public class lambdas_stream {
    public static void main(String[] args) {

        //filter
        //map
        List<String> name= List.of("joao","antonio","maria");
        name.stream().filter(n->n.startsWith("j"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);

        //reduce
        List<Integer> numero=List.of(1,2,3,4,5);

        int soma=numero.stream()
                .reduce(0,(a,b)->(a+b));

    }
}
