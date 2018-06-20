import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

public class Misc {

    public static class FrozenPosBean {
        private int i;
        public FrozenPosBean(int i) {
            this.i = i;
        }
        public String toString() {
            return "Bean " + i;
        }
    }
    
    private static void hashCodeCollision() {
        String a = "Aa";
         String b = "BB";
         System.out.println(a.hashCode());
         System.out.println(b.hashCode());
         System.out.println(31 * ('C' - 'D') == ('B' - 'a'));
         System.out.println(31 * ('B' - 'A') == ('a' - 'B'));
         System.out.println("common_prefixDB".hashCode());
         System.out.println("common_prefixCa".hashCode());

    }
	public static void main(String[] args) {

	    Set<Object> set = new HashMap<>().keySet();
	    
	    if (set == null) {
	        System.out.println("Set is null");
	    }
	    else {
	        System.out.println("Set is not null");
	    }
	    
        System.exit(0);

	    hashCodeCollision();
	    System.exit(0);
	    
	    Collection<FrozenPosBean> fpBeans = Arrays.asList(new FrozenPosBean(1), new FrozenPosBean(2), new FrozenPosBean(3));
	    
        StringBuffer sb = new StringBuffer();
        fpBeans.stream().forEach(fp->sb.append(fp.toString() + "; "));
        System.out.println(sb.toString());
        System.exit(-1);
	    
	    String abc = "abc";
	    String other = null;
	    String other2 = null;
	    System.out.println(abc.equals(other));
        System.out.println(other == other2);
        System.exit(-1);
	    
	    
	    List<Long> runIds = Arrays.asList(1l,2l,3l);

	    System.out.println(String.join(",", runIds.stream().map(e->e.toString()).collect(Collectors.toList())));
        System.exit(-1);

	    Long[] arr = new Long[] {1l,2l,3l};
	    String strLong = arr.toString();
	    System.out.println(strLong);
        System.exit(-1);
	    
	    methodWithNotNullArgs(null);
	    System.exit(-1);
	    
	    List<String> l = Arrays.asList("a", "b");
	    
	    String[] startWithC = l.stream().filter(e -> e.startsWith("c")).toArray(String[]::new);
	    
	    System.out.println(startWithC);
	    
	    for (String c : startWithC) {
	        System.out.println(c);
	    }
	    
	    ZonedDateTime now = ZonedDateTime.now();
	    
	    now = now.truncatedTo(ChronoUnit.DAYS).plusDays(1).minusSeconds(1);
	    
	    System.out.println(now);
	    


	    System.exit(0);
	    
	    System.out.println(System.getProperty("user.dir"));
	    
	    
	    List<String> list = new ArrayList<>();
	    
	    String str = list.stream().collect(Collectors.joining(", "));
	    
	    System.out.println(str);
//	    
//
//		Collection<String> strColl = Arrays.asList("1", "2", "3");
//		
//		String str = strColl.stream().collect(Collectors.joining(": "));
//		
//		System.out.println(str);
//		
//		String str1 = Arrays.stream(new String[] {"1", "2", "3"}).collect(Collectors.joining(": "));
//
//		System.out.println(str1);
	}
	
	private static void methodWithNotNullArgs(@NotNull String arg) {
	    
	}
}
