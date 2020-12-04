public class SeparateChainingHashSTtest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        st.put("A", 1);
        st.put("Dechen",2);
        st.put("C",4);
        st.put("Sangay",8);
        st.put("D",3);

        System.out.println(st.get("D"));
       
        System.out.println(st.contains("Dechen"));
        st.delete("A");
        System.out.println(st.size());

        assert(st.isEmpty()==false);
        assert(st.size()==4);
        System.out.println("All the test case passed");
    }
    }