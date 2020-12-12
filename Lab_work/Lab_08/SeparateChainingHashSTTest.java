public class SeparateChainingHashSTTest {
    public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        st.put("A",8);
        st.put("C",4);
        st.put("E",12);
        st.put("H",5);
        st.put("L",11);
        st.put("M",9);
        st.put("P",10);
        st.put("R",3);
        st.put("S",0);
        st.put("X",7);
        st.delete("M");

        System.out.println(st.get("A"));
        System.out.println(st.get("C"));
        System.out.println(st.get("M"));
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.contains("A"));

        assert(st.isEmpty() == false);
        assert(st.size() == 9);
        System.out.println("All Test Cases Passed.");
    }

}
